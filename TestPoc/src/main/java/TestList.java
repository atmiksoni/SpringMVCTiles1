import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(0,3);
		list.add(4);

		for(int i:list){
		     System.out.println(i);
		}
	}

}
