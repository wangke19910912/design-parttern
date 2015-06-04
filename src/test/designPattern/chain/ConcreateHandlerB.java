package test.designPattern.chain;

public class ConcreateHandlerB implements HandlerRequest{

    private HandlerRequest nextChan;

    @Override
    public void handleRequest() {
        
        System.out.println("Handler B");
    }

    public void setNextChan(HandlerRequest chan) {

        this.nextChan = chan;

    }

}
