package test.designPattern.vistor;

public abstract class Vistor {

    protected String name = "";

    public abstract void visit(Element e);

}
