package test.designPattern.state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String param) {

        state.handle(param);
    }
}
