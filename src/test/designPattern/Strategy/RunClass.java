package test.designPattern.Strategy;

public class RunClass {

    public static void main(String[] args) {

        Context context = new Context();
        context.setStrategy(new ConcreateStrategy());
        context.doSomething();
    }
}
