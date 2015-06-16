package test.designPattern.state;

public class RunClass {

    public static void main(String[] args) {

        State state = new ConcreteState();
        Context context = new Context();
        context.setState(state);
        context.request("wangke");

    }
}
