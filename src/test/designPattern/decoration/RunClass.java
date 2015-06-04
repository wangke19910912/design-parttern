package test.designPattern.decoration;

public class RunClass {

    public static void main(String[] args) {
        
        Decorator decorator = new Decorator(new ConcreateCompnent());

        decorator.method();
    }

}
