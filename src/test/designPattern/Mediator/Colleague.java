package test.designPattern.Mediator;

public abstract class Colleague {

    public Mediator mediator = null;

    public abstract void contractOthers();

    public abstract void doThings();

}
