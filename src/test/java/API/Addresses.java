package API;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openjdk.nashorn.internal.objects.annotations.Getter;
import org.openjdk.nashorn.internal.objects.annotations.Setter;

import java.util.Collection;


@JsonDeserialize(as = Addresses.class)
public class Addresses {

    @JsonProperty("Ref")
    public String Ref;
    @JsonProperty("SettlementType")
    public String SettlementType;
    @JsonProperty("Latitude")
    public String Latitude;
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Description")
    public String Description;
    @JsonProperty("DescriptionRu")
    public String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String Region;
    @JsonProperty("RegionsDescription")
    public String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    public String Area;
    @JsonProperty("AreaDescription")
    public String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    public String Index1;
    @JsonProperty("Index2")
    public String Index2;
    @JsonProperty("IndexCOATSU1")
    public String IndexCOATSU1;
    @JsonProperty("Delivery1")
    public String Delivery1;
    @JsonProperty("Delivery2")
    public String Delivery2;
    @JsonProperty("Delivery3")
    public String Delivery3;
    @JsonProperty("Delivery4")
    public String Delivery4;
    @JsonProperty("Delivery5")
    public String Delivery5;
    @JsonProperty("Delivery6")
    public String Delivery6;
    @JsonProperty("Delivery7")
    public String Delivery7;
    @JsonProperty("SpecialCashCheck")
    public int SpecialCashCheck;
    @JsonProperty("Warehouse")
    public String Warehouse;


    @JsonCreator
    public Addresses(@JsonProperty("Ref") String Ref, @JsonProperty("SettlementType") String SettlementType, @JsonProperty("Latitude") String Latitude, @JsonProperty("Longitude") String Longitude, @JsonProperty("Description") String Description, @JsonProperty("DescriptionRu") String DescriptionRu, @JsonProperty("DescriptionTranslit") String DescriptionTranslit, @JsonProperty("SettlementTypeDescription") String SettlementTypeDescription, @JsonProperty("SettlementTypeDescriptionRu") String SettlementTypeDescriptionRu, @JsonProperty("SettlementTypeDescriptionTranslit") String SettlementTypeDescriptionTranslit, @JsonProperty("Region") String Region, @JsonProperty("RegionsDescription") String RegionsDescription, @JsonProperty("RegionsDescriptionRu") String RegionsDescriptionRu, @JsonProperty("RegionsDescriptionTranslit") String RegionsDescriptionTranslit, @JsonProperty("Area") String Area, @JsonProperty("AreaDescription") String AreaDescription, @JsonProperty("AreaDescriptionRu") String AreaDescriptionRu, @JsonProperty("AreaDescriptionTranslit") String AreaDescriptionTranslit, @JsonProperty("Index1") String Index1, @JsonProperty("Index2") String Index2, @JsonProperty("IndexCOATSU1") String IndexCOATSU1, @JsonProperty("Delivery1") String Delivery1, @JsonProperty("Delivery2") String Delivery2, @JsonProperty("Delivery3") String Delivery3, @JsonProperty("Delivery4") String Delivery4, @JsonProperty("Delivery5") String Delivery5, @JsonProperty("Delivery6") String Delivery6, @JsonProperty("Delivery7") String Delivery7, @JsonProperty("SpecialCashCheck") int SpecialCashCheck, @JsonProperty("Warehouse") String Warehouse) {
        this.Ref = Ref;
        this.SettlementType = SettlementType;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Description = Description;
        this.DescriptionRu = DescriptionRu;
        this.DescriptionTranslit = DescriptionTranslit;
        this.SettlementTypeDescription = SettlementTypeDescription;
        this.SettlementTypeDescriptionRu = SettlementTypeDescriptionRu;
        this.SettlementTypeDescriptionTranslit = SettlementTypeDescriptionTranslit;
        this.Region = Region;
        this.RegionsDescription = RegionsDescription;
        this.RegionsDescriptionRu = RegionsDescriptionRu;
        this.RegionsDescriptionTranslit = RegionsDescriptionTranslit;
        this.Area = Area;
        this.AreaDescription = AreaDescription;
        this.AreaDescriptionRu = AreaDescriptionRu;
        this.AreaDescriptionTranslit = AreaDescriptionTranslit;
        this.Index1 = Index1;
        this.Index2 = Index2;
        this.IndexCOATSU1 = IndexCOATSU1;
        this.Delivery1 = Delivery1;
        this.Delivery2 = Delivery2;
        this.Delivery3 = Delivery3;
        this.Delivery4 = Delivery4;
        this.Delivery5 = Delivery5;
        this.Delivery6 = Delivery6;
        this.Delivery7 = Delivery7;
        this.SpecialCashCheck = SpecialCashCheck;
        this.Warehouse = Warehouse;
    }

    @Getter
    public String getRef() {
        return Ref;
    }

    @Setter
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    @Getter
    public String getSettlementType() {
        return SettlementType;
    }

    @Setter
    public void setSettlementType(String SettlementType) {
        this.SettlementType = SettlementType;
    }

    @Getter
    public String getLatitude() {
        return Latitude;
    }

    @Setter
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    @Getter
    public String getLongitude() {
        return Longitude;
    }

    @Setter
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    @Getter
    public String getDescription() {
        return Description;
    }

    @Setter
    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Getter
    public String getDescriptionRu() {
        return DescriptionRu;
    }

    @Setter
    public void setDescriptionRu(String DescriptionRu) {
        this.DescriptionRu = DescriptionRu;
    }

    @Getter
    public String getDescriptionTranslit() {
        return DescriptionTranslit;
    }

    @Setter
    public void setDescriptionTranslit(String DescriptionTranslit) {
        this.DescriptionTranslit = DescriptionTranslit;
    }

    @Getter
    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }

    @Setter
    public void setSettlementTypeDescription(String SettlementTypeDescription) {
        this.SettlementTypeDescription = SettlementTypeDescription;
    }

    @Getter
    public String getSettlementTypeDescriptionRu() {
        return SettlementTypeDescriptionRu;
    }

    @Setter
    public void setSettlementTypeDescriptionRu(String SettlementTypeDescriptionRu) {
        this.SettlementTypeDescriptionRu = SettlementTypeDescriptionRu;
    }

    @Getter
    public String getSettlementTypeDescriptionTranslit() {
        return SettlementTypeDescriptionTranslit;
    }

    @Setter
    public void setSettlementTypeDescriptionTranslit(String SettlementTypeDescriptionTranslit) {
        this.SettlementTypeDescriptionTranslit = SettlementTypeDescriptionTranslit;
    }

    @Getter
    public String getRegion() {
        return Region;
    }

    @Setter
    public void setRegion(String Region) {
        this.Region = Region;
    }

    @Getter
    public String getRegionsDescription() {
        return RegionsDescription;
    }

    @Setter
    public void setRegionsDescription(String RegionsDescription) {
        this.RegionsDescription = RegionsDescription;
    }

    @Getter
    public String getRegionsDescriptionRu() {
        return RegionsDescriptionRu;
    }

    @Setter
    public void setRegionsDescriptionRu(String RegionsDescriptionRu) {
        this.RegionsDescriptionRu = RegionsDescriptionRu;
    }

    @Getter
    public String getRegionsDescriptionTranslit() {
        return RegionsDescriptionTranslit;
    }

    @Setter
    public void setRegionsDescriptionTranslit(String RegionsDescriptionTranslit) {
        this.RegionsDescriptionTranslit = RegionsDescriptionTranslit;
    }

    @Getter
    public String getArea() {
        return Area;
    }

    @Setter
    public void setArea(String Area) {
        this.Area = Area;
    }

    @Getter
    public String getAreaDescription() {
        return AreaDescription;
    }

    @Setter
    public void setAreaDescription(String AreaDescription) {
        this.AreaDescription = AreaDescription;
    }

    @Getter
    public String getAreaDescriptionRu() {
        return AreaDescriptionRu;
    }

    @Setter
    public void setAreaDescriptionRu(String AreaDescriptionRu) {
        this.AreaDescriptionRu = AreaDescriptionRu;
    }

    @Getter
    public String getAreaDescriptionTranslit() {
        return AreaDescriptionTranslit;
    }

    @Setter
    public void setAreaDescriptionTranslit(String AreaDescriptionTranslit) {
        this.AreaDescriptionTranslit = AreaDescriptionTranslit;
    }

    @Getter
    public String getIndex1() {
        return Index1;
    }

    @Setter
    public void setIndex1(String Index1) {
        this.Index1 = Index1;
    }

    @Getter
    public String getIndex2() {
        return Index2;
    }

    @Setter
    public void setIndex2(String Index2) {
        this.Index2 = Index2;
    }

    @Getter
    public String getIndexCOATSU1() {
        return IndexCOATSU1;
    }

    @Setter
    public void setIndexCOATSU1(String IndexCOATSU1) {
        this.IndexCOATSU1 = IndexCOATSU1;
    }

    @Getter
    public String getDelivery1() {
        return Delivery1;
    }

    @Setter
    public void setDelivery1(String Delivery1) {
        this.Delivery1 = Delivery1;
    }

    @Getter
    public String getDelivery2() {
        return Delivery2;
    }

    @Setter
    public void setDelivery2(String Delivery2) {
        this.Delivery2 = Delivery2;
    }

    @Getter
    public String getDelivery3() {
        return Delivery3;
    }

    @Setter
    public void setDelivery3(String Delivery3) {
        this.Delivery3 = Delivery3;
    }

    @Getter
    public String getDelivery4() {
        return Delivery4;
    }

    @Setter
    public void setDelivery4(String Delivery4) {
        this.Delivery4 = Delivery4;
    }

    @Getter
    public String getDelivery5() {
        return Delivery5;
    }

    @Setter
    public void setDelivery5(String Delivery5) {
        this.Delivery5 = Delivery5;
    }

    @Getter
    public String getDelivery6() {
        return Delivery6;
    }

    @Setter
    public void setDelivery6(String Delivery6) {
        this.Delivery6 = Delivery6;
    }

    @Getter
    public String getDelivery7() {
        return Delivery7;
    }

    @Setter
    public void setDelivery7(String Delivery7) {
        this.Delivery7 = Delivery7;
    }

    @Getter
    public int getSpecialCashCheck() {
        return SpecialCashCheck;
    }

    @Setter
    public void setSpecialCashCheck(int SpecialCashCheck) {
        this.SpecialCashCheck = SpecialCashCheck;
    }

    @Getter
    public String getWarehouse() {
        return Warehouse;
    }

    @Setter
    public void setWarehouse(String Warehouse) {
        this.Warehouse = Warehouse;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "Ref='" + Ref + '\'' +
                ", SettlementType='" + SettlementType + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Description='" + Description + '\'' +
                ", DescriptionRu='" + DescriptionRu + '\'' +
                ", DescriptionTranslit='" + DescriptionTranslit + '\'' +
                ", SettlementTypeDescription='" + SettlementTypeDescription + '\'' +
                ", SettlementTypeDescriptionRu='" + SettlementTypeDescriptionRu + '\'' +
                ", SettlementTypeDescriptionTranslit='" + SettlementTypeDescriptionTranslit + '\'' +
                ", Region='" + Region + '\'' +
                ", RegionsDescription='" + RegionsDescription + '\'' +
                ", RegionsDescriptionRu='" + RegionsDescriptionRu + '\'' +
                ", RegionsDescriptionTranslit='" + RegionsDescriptionTranslit + '\'' +
                ", Area='" + Area + '\'' +
                ", AreaDescription='" + AreaDescription + '\'' +
                ", AreaDescriptionRu='" + AreaDescriptionRu + '\'' +
                ", AreaDescriptionTranslit='" + AreaDescriptionTranslit + '\'' +
                ", Index1='" + Index1 + '\'' +
                ", Index2='" + Index2 + '\'' +
                ", IndexCOATSU1='" + IndexCOATSU1 + '\'' +
                ", Delivery1='" + Delivery1 + '\'' +
                ", Delivery2='" + Delivery2 + '\'' +
                ", Delivery3='" + Delivery3 + '\'' +
                ", Delivery4='" + Delivery4 + '\'' +
                ", Delivery5='" + Delivery5 + '\'' +
                ", Delivery6='" + Delivery6 + '\'' +
                ", Delivery7='" + Delivery7 + '\'' +
                ", SpecialCashCheck=" + SpecialCashCheck +
                ", Warehouse='" + Warehouse + '\'' +
                '}';
    }

}