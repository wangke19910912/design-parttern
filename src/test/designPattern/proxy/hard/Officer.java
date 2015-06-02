package test.designPattern.proxy.hard;

public class Officer implements IOfficer {
    private String name = "";
    // 默认为空不会造成死循环
    private IOfficer proxy = null;
    public Officer(String _name) {
        this.name = _name;
    }
    @Override
    public IOfficer getProxy() {
        this.proxy = new OfficerProxy(this);
        return this.proxy;
    }
    @Override
    public void receiveMoney() {
        if (this.isProxy()) {
            System.out.println(name + " are starting to receiveMoney");
        } else {
            System.out.println("please user pointed proxy access");
        }
    }
    @Override
    public void sendMoney() {
        if (this.isProxy()) {
            System.out.println(name + " are starting to sendMoney");
        } else {
            System.out.println("please user pointed proxy sendMoney");
        }
    }
    /**
     * 检查是否是通过代理访问
     * 
     * @return
     */
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}


