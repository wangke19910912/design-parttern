package test.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();
   
    public abstract void attach(Observer o);
    public abstract void detach();
    public abstract void call();
       

   }

   