package test.designPattern.flyweight;

public abstract class Flyweight {

    // 内部状态
    private String intrinsic;

    // 外部状态
    private String extrinsic;

    //
    public abstract void operation();

    Flyweight(String intrinsic) {
        this.intrinsic = intrinsic;
    }
    public void setIntrinisc(String intrinsic) {

        this.intrinsic = intrinsic;
    }

    public void setExtrinsic(String extrinsic) {

        this.extrinsic = extrinsic;
    }

}
