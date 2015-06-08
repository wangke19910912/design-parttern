package test.designPattern.observer;

public class RunClass {

    public static void main(String[] args) {

        Subject sub = new ConcreateSubject();
        sub.attach(new ConcreteObserver());

        sub.call();

    }
}
