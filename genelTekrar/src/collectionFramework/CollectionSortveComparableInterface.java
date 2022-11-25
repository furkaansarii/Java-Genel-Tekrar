package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortveComparableInterface {
	
	public static void main(String[] args) {
		
        List<String> list_string = new ArrayList<String>();
        
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for (String s : list_string) {
            System.out.println(s);
        }
        
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player(5, "Murat"));
        list_player.add(new Player(1, "Emre"));
        list_player.add(new Player(10, "Oğuz"));
        list_player.add(new Player(4, "Yusuf"));
       
        Collections.sort(list_player);
        
        /*
        Player p = new Player(1, "Murat");
        Player p1 = new Player(2, "Murat");
        
        System.out.println(p.compareTo(p1));
        */
		
		
	}

}
