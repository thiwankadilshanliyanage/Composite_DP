
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class DPDay2Prac {
    
    public static void main(String[] args) {
        TopOrder TOM = new TopOrder("Manager","Kevin",180000);
        TopOrder TOPL1 = new TopOrder("Project Leader","Hennry",100000);
        TopOrder TOPL2 = new TopOrder("Project Leader","Matthew",90000);
        TopOrder TOPL3 = new TopOrder("Project Leader","Levi",100000);
        worker D1 = new worker("Developer", "Rayan", 80000);
        worker D2 = new worker("Developer", "Jason", 60000);
        worker D3 = new worker("Developer", "Kevin", 60000);
        worker D4 = new worker("Developer", "Alex", 70000);
        
        TOM.addWorker(TOPL1);
        TOM.addWorker(TOPL2);
        TOM.addWorker(TOPL3);
        TOPL1.addWorker(D1);
        TOPL2.addWorker(D2);
        TOPL3.addWorker(D3);
        TOPL3.addWorker(D4);
        
         System.out.println(TOM.getSallary());
         System.out.println(TOPL3.getSallary());
    }
    
}
abstract class AbstractTop{
    String Post;
    String name;
    int sallary;
    public AbstractTop(String Post, String name, int sallary) {
        this.Post = Post;
        this.name = name;
        this.sallary = sallary;
    }
     public String getName(){
        return name;
    } public String getPost(){
        return Post;
    } public  abstract  int getSallary();
    
}

class worker extends AbstractTop{
    
    public worker(String Post, String name, int sallary) {
        super(Post, name, sallary);
    }

    @Override
    public int getSallary() {
       return sallary;
    }
    
}

class TopOrder extends AbstractTop{
    
    public TopOrder(String Post, String name, int sallary) {
        super(Post, name, sallary);   
    }
    ArrayList<AbstractTop> abstractTopList = new ArrayList<>();
    
     public void addWorker(AbstractTop abstractTop){
        abstractTopList.add(abstractTop);
    }

    @Override
    public int getSallary() {
        int v = this.sallary;
        for(AbstractTop abstractTop : abstractTopList){
            v+=abstractTop.getSallary();
        }
        return v;
    }
    }
    
