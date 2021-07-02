public class HelloWorld {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass("arg");
        ChildClassOne childClassOne = new ChildClassOne("arg");
        baseClass = childClassOne;
//        childClassOne = (ChildClassOne) baseClass;

        baseClass.baseClassMethod();
        childClassOne.baseClassMethod();
        childClassOne.childClassOneMethod();
    }

}