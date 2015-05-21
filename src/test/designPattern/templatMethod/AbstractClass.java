package test.designPattern.templatMethod;

abstract class AbstractClass {

    public abstract void method1();

    public abstract void method2();

    public void run() {

        method1();
        if (hook())
        method2();
    }

    public boolean hook() {
        return true;
    }

}
