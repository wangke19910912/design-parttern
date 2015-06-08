package test.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {


    private List<Component> childs = new ArrayList<Component>();
    @Override
    public void operation() {

        System.out.println("parent has been called");
        // 先顺遍历
        for (Component c : childs) {
            c.operation();
        }
    }

    @Override
    public void add(Component c) {

        childs.add(c);
    }

    @Override
    public void remove() {
        // remove last
        int num = childs.size();
        childs.remove(num);
    }

    @Override
    public List<Component> getChild() {

        return childs;
    }


}
