package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {


        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");  // when we remove Cyborg, Flash become the item at index 2
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("superHeros = " + superHeros);

        // remove any heros that does not have man in the String
        for (int x = 0; x < superHeros.size() ; x++) {

            String currentHero = superHeros.get(x) ;
            if ( ! currentHero.contains("man") ) {
                superHeros.remove(currentHero) ;
                // one's hero is removed , this index will be filled by next item,
                // so we need to decrease the index by 1 so stay at same index
                --x ; // once item is removed, it will be decrease the index to stay at same index in next iteration
            }
        }
        System.out.println("superHeros = " + superHeros);

        // take away from here :
        // while removing item during the for loop
        // when you remove 1 item, you will have one less item in the list
        // everything after the removed item will move to one index to the left
        // so in order to miss the item right after the removed item
        // we need to decrease the index by one to stay at same index after removing



//
//        // Do we have superman in the list ?
//        System.out.println("superHeros.contains(\"Superman\") = "
//                + superHeros.contains("Superman") ) ;
//
//        // does this contains an item with exact value of man
//        System.out.println("superHeros.contains(\"man\") = " + superHeros.contains("man") ) ;



        List<String > superHeroCopy = new ArrayList<>(superHeros) ;

        System.out.println("superHeroCopy = " + superHeroCopy);

        // THIS WILL BE CREATED A UNMODIFIABLE LIST !!
        List<String > topics = Arrays.asList("Java", "Selenium", "Database","API") ;
        System.out.println("topics = " + topics);

        // HERE COPYING EVERYTHING INSIDE TOPICCopy
        // And its just regular arrayList, we can do anything with it!!!
        List<String> topicsCopy = new ArrayList<>() ;
        System.out.println("topicsCopy = " + topicsCopy);








    }
}
