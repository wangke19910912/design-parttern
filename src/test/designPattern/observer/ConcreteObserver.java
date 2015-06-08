package test.designPattern.observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.print("observers listene !");
    }


}
