package test.designPattern.chain;

public interface HandlerRequest {

    void handleRequest();

    public void setNextChan(HandlerRequest chan);

}
