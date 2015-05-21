package test.designPattern.FactoryMethod;

public class ConcreteCreator implements Creator<Product> {

    @Override
    public Product creater(Class<? extends Product> clazz) {

        Product p = null;
        try {
            p = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return p;
    }

}
