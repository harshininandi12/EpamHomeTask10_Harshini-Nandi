package assignmentOnLambdas;
import java.util.*;
import java.util.function.Consumer;
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		//System.out.println(str);
		String str1[] = str.split(" ");
		List<String> al = Arrays.asList(str1);
		forEach(al, (String ret)-> System.out.print(ret+" "));
		
	}
	public static void forEach(List<String> lis, Consumer<String> con) {
		for(String i : lis) {
			if(i.charAt(0) == 'a' && i.length()==3) {
				con.accept(i);
			}
		}

	}

}
