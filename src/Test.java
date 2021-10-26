
import java.util.ArrayList;



/**
 *
 * @author Thiwanka
 */
public class Test {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
abstract class AbstractComposite{
    
    public abstract void method1();
    
}
class Leaf extends AbstractComposite{

    @Override
    public void method1() {
        
    }
    
}
class Composite extends AbstractComposite{
   
    ArrayList<AbstractComposite> compositeList = new ArrayList<>();

    @Override
    public void method1() {
        
    }
    
}
