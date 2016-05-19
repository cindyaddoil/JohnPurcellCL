import java.util.ArrayList;
 
class Machine {
 
    @Override
    public String toString() {
        return "I am a machine";
    }
     
    public void start() {
        System.out.println("Machine starting.");
    }
 
}
 
class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a happy camera";
    }
     
    public void snap() {
        System.out.println("snap!");
    }
}
 
public class App {
 
    public static void main(String[] args) {
 
        ArrayList<Machine> list1 = new ArrayList<Machine>();
 
        list1.add(new Machine());
        list1.add(new Machine());
 
        ArrayList<Camera> list2 = new ArrayList<Camera>();
 
        list2.add(new Camera());
        list2.add(new Camera());
 
        showList(list2);
        showList2(list1);
        showList3(list2);
    }
 
    //upper bound of wild card
    
    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
       
        }
 
    }
     
    //lower bound of wild card
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
     
    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
 
 
}