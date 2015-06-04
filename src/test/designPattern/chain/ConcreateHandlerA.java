package test.designPattern.chain;

public class ConcreateHandlerA implements HandlerRequest {

    public HandlerRequest  nextChan;
    @Override
    public void handleRequest() {

        if (nextChan != null)
            nextChan.handleRequest();
       System.out.println("Handler A"); 
       
    }
    
    public void setNextChan(HandlerRequest nextChan) {

        this.nextChan = nextChan;

    }

}