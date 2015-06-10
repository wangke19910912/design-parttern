package test.designPattern.facade;

public class NewSystem {

    public OldSystem oldSystem = new OldSystem();

    public void function() {
        oldSystem.function();
    }
}
