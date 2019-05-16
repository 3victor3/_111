package Chapter_fourteen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            System.out.println(str);
        }
    }
}
