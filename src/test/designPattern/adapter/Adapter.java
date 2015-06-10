package test.designPattern.adapter;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // 调用老系统的方法
        specificRequest();
    }

}
