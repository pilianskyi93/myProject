package API;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.*;

public class APITest extends BaseAPITest {

    String API_key = "110f3f93c8fd84c1da503d938aed8eeb";

    Map<String, Object> requestBody = new HashMap<>();

    @BeforeEach
    public void setRequestBody() {

        Map<String, String> methodProperties = new HashMap<>();
        methodProperties.put("Limit", "10");

        requestBody.put("apiKey", API_key);
        requestBody.put("modelName", "Address");
        requestBody.put("calledMethod", "getSettlements");
        requestBody.put("methodProperties", methodProperties);

    }

    @Test
    public void basicFieldsContentCheck() {

        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("success", equalTo(true))
                .body("data.AreaDescription", hasItems("Закарпатська область", "Київська"))
                .body("info.totalCount", equalTo(26860));
    }

    @Test
    public void jsonSchemaCheck() {

        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") +
                        "\\src\\main\\resources\\validators\\np_address_schema.json")));

    }

    @Test
    public void DescriptionFieldIsNotEmptyCheckWithPojo() {

        List<Addresses> DescriptionList = given()

                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data.Description", Addresses.class);

        System.out.println(DescriptionList);
        DescriptionList.forEach(x -> Assertions.assertTrue(x.getPresent().contains("Абазівка")));

    }

}