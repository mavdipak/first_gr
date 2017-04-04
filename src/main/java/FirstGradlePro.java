import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by dipakk on 3/29/2017.
 */
public class FirstGradlePro {
    public static void main(String args[]){
        System.out.println("hey dude wassup\n");
        CollectionsDemo cd1 = new CollectionsDemo();
        CollectionsDemo cd2 = new CollectionsDemo();
        cd1.printSize();
        for(int i=100;i>=1;i--){
            cd1.addItem(i);
        }
        System.out.print("Added Items \n");

        System.out.print("After reduction \n");
        cd1.removeItem(2);

        cd1.getItem(2);
        cd1.contains(1);
        cd2.isEmpty();


    }
}
