package test.designPattern.proxy.hard;

public interface IOfficer {  
    
    /** 
     *当官的必须收钱才做事 
    */  
    public void receiveMoney();  
      
    /** 
     *当官的也要送钱，为了升官发财 
     * @param userName 行贿人名 
     * @param amount   行贿数量 
     */  
    public void sendMoney();  
      
    /** 
     * 返回替身代理，这里是局长返回他的秘书；如果秘书权势也大，仍然可以找自己的代理替身去做 
     * @return 
     */  
    public IOfficer getProxy();  
}   