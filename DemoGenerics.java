import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {

	public static void main(String[] args) {
		
		//this will add or store only int values
		List<Integer> list = new ArrayList<>();
		list.add(123);
		
		//this is generics and it will store all type of values
		List anotherList = new ArrayList();
		anotherList.add("LCWD");
		anotherList.add(11);
		anotherList.add(11.11);
	}

}
