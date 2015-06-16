package test.designPattern.memento;

public class RunClass {

    public static void main(String[] args) {
        //初始状态1 
        Originator originator = new Originator();
        originator.setStatus("status 1");
        originator.outputStatus();

        // 保存状态
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        
        
       //改变状态2 
        originator.setStatus("status 2");
        originator.outputStatus();
        
       //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        originator.outputStatus();
    }

}
