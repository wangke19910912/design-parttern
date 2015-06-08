package test.designPattern.composite;

public class RunClass {

    public static void main(String args[]) {

        Component root = new Composite();
        Component child1 = new Composite();
        root.add(child1);
        root.add(new Leaf());
        child1.add(new Leaf());

        root.operation();

    }
}
