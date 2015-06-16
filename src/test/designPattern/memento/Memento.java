package test.designPattern.memento;

public class Memento {

    private String status = "";

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {

        return this.status;
    }

    public void setStatus(String status) {

        this.status = status;
    }


}
