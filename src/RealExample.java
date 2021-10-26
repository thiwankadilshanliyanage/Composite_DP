
import java.util.ArrayList;



/**
 *
 * @author Thiwanka
 */
public class RealExample {
    
    public static void main(String[] args) {
        
        Parent p1 = new Parent("A", 5);
        Child c1 = new Child("X", 2);
        Parent p2 = new Parent("B", 3);
        Parent p3 = new Parent("C", 8);
        Child c2 = new Child("Y", 1);
        Child c3 = new Child("Z", 6);
        
        p1.addChild(c1);
        p1.addChild(p2);
        p2.addChild(p3);
        p2.addChild(c2);
        p2.addChild(c3);
    }
    
}
abstract class AbstractChild{
    String name;
    int value;

    public AbstractChild(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    
    
    public String getName(){
        return name;
    }
    public  abstract  int getValue();
    
}
class Child extends AbstractChild{
    
     public Child(String name, int value) {
        super(name, value);
    }
    

    @Override
    public int getValue() {
    }
    
}
class Parent extends AbstractChild{
    
     public Parent(String name, int value) {
        super(name, value);
    }
    
    
    ArrayList<AbstractChild> abstractChildList = new ArrayList<>();
    
    public void addChild(AbstractChild abstractChild){
        abstractChildList.add(abstractChild);
    }

    @Override
    public int getValue() {
        int v = 0;
        for(AbstractChild abstractChild : abstractChildList){
            v+=abstractChild.value;
        }
        return v;
    }
}
