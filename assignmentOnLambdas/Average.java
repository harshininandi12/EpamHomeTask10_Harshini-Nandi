package assignmentOnLambdas;
import java.util.*;
import java.util.function.Consumer;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of List Elements");
		int num = sc.nextInt();
		System.out.println("Enter List elements separated by space, ending with a character");
		List<Integer> al = new ArrayList<Integer>();
		try {
		while(true) {
			al.add(sc.nextInt());
		}
		} catch(Exception e) {
			
		}
		
		findAvg(al, (Integer n) -> System.out.println("The Average of given Integers is "+ (n / (float)num)));
	}
	
	public static void  findAvg(List<Integer> lis, Consumer<Integer> con) {
		int s= 0;
		for(int i : lis) {
			s+=i;
		}
		con.accept(s);
	}

}
