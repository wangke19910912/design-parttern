package test.designPattern.vistor;

public class RunClass {

    public static void main(String[] args) {

        Element element = new ConcreteElement();

        element.accept(new ConcreteVistor("wangke"));

    }

}
