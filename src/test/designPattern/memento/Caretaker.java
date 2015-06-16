package test.designPattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementos = new ArrayList<Memento>();

    public Memento getMemento() {
        int size = mementos.size() - 1;
        Memento memento = mementos.get(size);

        mementos.remove(size);
        return memento;
    }

    public void setMemento(Memento memento ){
        mementos.add(memento);
    }

}
