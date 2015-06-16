package test.designPattern.memento;

public class Originator {

    private String status = "";

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public Memento createMemento() {

        return new Memento(this.status);
    }

    public void restoreMemento(Memento memento) {
       
        setStatus(memento.getStatus());
    }
    public void outputStatus() {

        System.out.println(this.status);
    }
        
}
