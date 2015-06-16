package test.designPattern.flyweight;

public class RunClass {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.getFlyweight("hello world");

        // 从缓存中取实例
        Flyweight fly2 = factory.getFlyweight("hello world");
        System.out.println(fly1 == fly2);
    }
}
