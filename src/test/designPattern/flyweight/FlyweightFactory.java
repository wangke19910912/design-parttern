package test.designPattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String extrinsic) {

        if (pool.containsKey(extrinsic))
            return pool.get(extrinsic);
        else {
           
            Flyweight fw = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic, fw);
            return fw;

        }
    }
}
