package test.designPattern.FactoryMethod;

public interface Creator<T> {

    public T creater(Class<? extends T> clazz);

}
