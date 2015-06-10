package test.designPattern.adapter;

public class RunClass {

    public static void main(String[] args) {
        Target tar = new Adapter();
        tar.request();
    }

}
