package test.designPattern.chain;

public class RunClass {

    public static void main(String[] args) {
        
        HandlerRequest request = new ConcreateHandlerA();
        request.setNextChan(new ConcreateHandlerB());
        request.handleRequest();
    }
}
