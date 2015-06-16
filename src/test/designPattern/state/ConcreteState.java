package test.designPattern.state;

public class ConcreteState implements State {

    @Override
    public void handle(String param) {

        // 根据不同的状态来选择不同的任务
        if (param.equals("abc"))
            System.out.println(param + "ConcreateState1 called");
        if (param.equals("def"))
            System.out.println(param + "ConcreateState2 called");

    }

}
