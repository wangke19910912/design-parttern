package test.designPattern.proxy.hard;

public class OfficerProxy implements IOfficer {
    private IOfficer officer;
    public OfficerProxy(IOfficer _officer) {
        this.officer = _officer;
    }

    // 该代理为官员的秘书，这里秘书只能返回自己了；
    @Override
    public IOfficer getProxy() {
        return this;
    }
    @Override
    public void receiveMoney() {
        officer.receiveMoney();
    }
    @Override  
        public void sendMoney() {  
        officer.sendMoney();
    }
    
}