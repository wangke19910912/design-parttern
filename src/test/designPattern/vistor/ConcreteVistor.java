package test.designPattern.vistor;

public class ConcreteVistor extends Vistor {

    ConcreteVistor(String name) {
        this.name = name;
    }
    @Override
    public void visit(Element e) {

        System.out.println(name + " comming visit ");

    }

}
