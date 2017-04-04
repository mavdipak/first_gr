import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by dipakk on 3/31/2017.
 */
public class CollectionsDemo {

    private ArrayList list1 = new ArrayList();
    public CollectionsDemo(ArrayList l1){
        this.list1 = l1;
    }

    public CollectionsDemo(){

    }

    public void printList(){
        for(int i=0;i<=this.list1.size()-1;i++){
            System.out.println(list1.get(i));
        }
    }

    public void addItem(int j){
        this.list1.add(j);
    }

    public void removeItem(int j){
        this.list1.remove(j);
    }

    public void printSize(){
        System.out.println(this.list1.size());
    }

    public void isEmpty(){
        System.out.println(this.list1.isEmpty());
    }

    public void contains(int i){
        System.out.println(this.list1.contains(i));
    }

    public void getItem(int i){
        System.out.println(this.list1.get(i));
    }

}
