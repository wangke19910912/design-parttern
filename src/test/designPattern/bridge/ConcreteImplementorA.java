package test.designPattern.bridge;

public class ConcreteImplementorA implements Implementor {

    @Override
    public void OperationImp() {
        System.out.println("implementor a has called");
    }

}