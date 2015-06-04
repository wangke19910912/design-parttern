package test.designPattern.decoration;

public class Decorator implements Component {
    
    private Component component;

    Decorator(Component component) {

        this.component = component;
    }
    @Override
    public void method() {

        System.out.println("decorator  method !");

        component.method();
    }

}
