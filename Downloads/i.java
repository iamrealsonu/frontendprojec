import java.util.*;
import java.util.Hashtable;
import javax.imageio.plugins.jpeg;

public class i{
    public static void main(String[] args) {
        Hashtable<String,Integer> contacts=new Hashtable<String,Integer> ();
        contacts.put("ross", 24434);
        contacts.put("rachel", 242244);
        contacts.put("chandler", 12444);
        contacts.put("monica",13144);
        System.out.println(contacts.containsKey("chandler"));
        System.out.println(contacts.get("chandler"));
        Set<String> keys =contacts.keySet();
        for(String key: keys){
            System.out.println("number of"+" "+ key+" " +"is"+ " "+contacts.get(key));
           
        }
         contacts.remove("chandler");
            System.out.println(contacts.containsKey("chandler"));
            contacts.clear();
            System.out.println(contacts.containsKey("ross"));
    }
}