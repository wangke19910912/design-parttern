package test.designPattern.Mediator;

public class ConcreteColleagueB extends Colleague {

    @Override
    public void doThings() {
        System.out.println("do concrete B");
    }

    @Override
    public void contractOthers() {
        mediator.contractWithColleagueA();
    }
}