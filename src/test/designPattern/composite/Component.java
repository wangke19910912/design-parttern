package test.designPattern.composite;

import java.util.List;

public interface Component {

    public void operation();
    public void add(Component c);
    public void remove();
    public List<Component> getChild();

}
