package Pack1;

class MyClass {

    public static int myMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = myMethod(a, b);
        System.out.println(c);
    }
}