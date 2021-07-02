public class ChildClassOne extends BaseClass {

    public ChildClassOne(String arg) {
        super(arg);
    }

    String childClassOneMethod() {
        System.out.println("childClassOneMethod");
        return "childClassOneMethod";
    }

}