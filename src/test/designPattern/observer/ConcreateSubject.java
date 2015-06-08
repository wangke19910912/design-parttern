package test.designPattern.observer;

public class ConcreateSubject extends Subject {

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach() {
    }

    @Override
    public void call() {
        for (Observer o : observers) {
            o.update();
        }

    }

}
