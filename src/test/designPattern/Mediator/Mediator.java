package test.designPattern.Mediator;

public class Mediator {

    private Colleague colA = new ConcreteColleagueA();
    private Colleague colB = new ConcreteColleagueB();

    public void contractWithColleagueA() {
        colA.doThings();
    }
    public void contractWithColleagueB() {
        colB.doThings();
    }
}