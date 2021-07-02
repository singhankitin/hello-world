public class BaseClass {

    private BaseClass() {
        System.out.println("private BaseClass()");
    }

    // Can't have a private no arg constructor and a public no arg constructor
    public BaseClass(String arg) {
        System.out.println(String.format("public BaseClass():%s", arg));
    }

    String baseClassMethod() {
        System.out.println("baseClassMethod");
        return "baseClassMethod";
    }
}
