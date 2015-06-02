package test.designPattern.Mediator;
/*
 * 中介者模式：
 * 中介者模式又称为调停者模式，从类图中看，共分为3部分：
 抽象中介者：定义好同事类对象到中介者对象的接口，用于各个同事类之间的通信。一般包括一个或几个抽象的事件方法，并由子类去实现。
 中介者实现类：从抽象中介者继承而来，实现抽象中介者中定义的事件方法。从一个同事类接收消息，然后通过消息影响其他同时类。
 同事类：如果一个对象会影响其他的对象，同时也会被其他对象影响，那么这两个对象称为同事类。在类图中，同事类只有一个，这
 其实是现实的省略，在实际应用中，同事类一般由多个组成，他们之间相互影响，相互依赖。同事类越多，关系越复杂。并且，同事类
 也可以表现为继承了同一个抽象类的一组实现组成。在中介者模式中，同事类之间必须通过中介者才能进行消息传递。
 */
public class RunClass {

    
    public static void main(String[] args) {
        
        Colleague a = new ConcreteColleagueA();
        a.mediator = new Mediator();

        a.contractOthers();

    }
    
}
