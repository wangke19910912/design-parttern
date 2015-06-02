package test.designPattern.builder;

public class ConcreteBuilder implements Builder {

    @Override
    public void buildPartA() {
        System.out.println("build A");
    }

    @Override
    public void buildPartB() {
        System.out.println("build B");
    }

    @Override
    public void buildPartC() {
        System.out.println("build C");
    }

    @Override
    public Product build() {
        buildPartA();
        buildPartB();
        buildPartC();
        return new ConcreteProduct();
    }

}
