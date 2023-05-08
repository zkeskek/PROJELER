import java.util.Collection;
import java.util.Iterator;

public class MyCollectionUtil {
	 public static void doSomething(Collection collection) {
		    
		    Iterator iterator = collection.iterator();
		    while(iterator.hasNext()){
		      Object object = iterator.next();
		      System.out.println(object);

		      //do something to object here...
		    }
		  }
}
