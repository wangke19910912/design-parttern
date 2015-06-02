package test.designPattern.protoType;

public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
       
        try {
            prototype = (Prototype) super.clone();
           
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
        
    }

}
