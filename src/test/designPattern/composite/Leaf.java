package test.designPattern.composite;

import java.util.List;

public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("leaf is called");
    }

    @Override
    public void add(Component c) {
        // do noting
    }

    @Override
    public void remove() {
        // do noting
    }

    @Override
    public List<Component> getChild() {
        return null;
    }

}
