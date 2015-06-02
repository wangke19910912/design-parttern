package test.designPattern.Mediator;

public class ConcreteColleagueA extends Colleague {

    @Override
    public void doThings() {
        System.out.println("do concrete A");
    }

    @Override
    public void contractOthers() {
        mediator.contractWithColleagueB();
    }

}
