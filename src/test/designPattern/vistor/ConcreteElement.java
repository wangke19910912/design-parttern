package test.designPattern.vistor;

public class ConcreteElement implements Element {

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }


}
