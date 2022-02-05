import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> temp = new ArrayList<>(Arrays.asList( "React", "Excel" )); 
//		List <String> temp = new ArrayList<String>();
		
		System.out.println(temp);
		temp.remove(0);
		System.out.println(temp);

	}

}
