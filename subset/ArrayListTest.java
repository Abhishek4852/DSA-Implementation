import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();

		System.out.println("Empty ArrayList : "+al);
		al.add(new Integer(1));
		al.add(2);
		al.add(3);
		al.add("Hyyyy");
		System.out.println("ArrayList : "+al);

        
        
		//Shellow Cloning...........
		ArrayList shallowAl = (ArrayList) al.clone();
		System.out.println("ArrayList : "+shallowAl);
		System.out.println(al==shallowAl);
		
		//Deep coding......
		ArrayList newAl = al;
		System.out.println("ArrayList : "+newAl);
		System.out.println(al==newAl);

		/*for(Object elm : al) {
			System.out.println(elm);
		}`5\6-\
		
		al.forEach( elm ->
		
		
		System.out.println(elm));
	*/
	}
	

}