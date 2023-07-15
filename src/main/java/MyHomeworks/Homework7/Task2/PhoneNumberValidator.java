package MyHomeworks.Homework7.Task2;

public class PhoneNumberValidator {

    public static boolean numberValidation(String number) {
        String pattern = "^\\+380\\d{9}$";
        return number.matches(pattern);
    }

    public static void main(String[] args) {
        String number1 = "+38095ABC3385";
        String number2 = "+380956663982";
        String number3 = "+380961231";
        String number4 = "+390956663982";

        System.out.println(number1 + " is valid: " + numberValidation(number1));
        System.out.println(number2 + " is valid: " + numberValidation(number2));
        System.out.println(number3 + " is valid: " + numberValidation(number3));
        System.out.println(number4 + " is valid: " + numberValidation(number4));
    }
}