package test.designPattern.templatMethod;

public class ConcreteClass extends AbstractClass {

    private boolean isPrint = true;

    @Override
    public void method1() {
        System.out.println("run method1");
    }

    @Override
    public void method2() {
        System.out.println("run method2");
    }

    @Override
    public boolean hook() {
        return isPrint;

    }

}
