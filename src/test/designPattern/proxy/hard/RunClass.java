package test.designPattern.proxy.hard;
/*
 * 强制代理:强制代理使用真实的角色返回代理角色，避免了用户直接访问真实角色的方法
 */
public class RunClass {

    public static void main(String[] args) {

        IOfficer player = new Officer("张局长");
        IOfficer proxy = player.getProxy();
        proxy.receiveMoney();
        proxy.sendMoney();

    }

}
