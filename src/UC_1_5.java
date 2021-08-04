import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Predicate{
	void showElement();
}
public class UC_1_5 {
	public void printElement() {
		Predicate predicate=()->{
			List<Integer> integers=new ArrayList<Integer>();
			integers.add(1);
			integers.add(2);
			integers.add(3);
			integers.add(4);
			integers.add(5);
			integers.add(6);
			integers.add(7);
			integers.add(8);
			integers.add(9);
			integers.add(10);
			
			for(Integer num:integers) {
				if(num%2==0) {
					System.out.println("even ->"+num);
				}
			}
		};
		
		predicate.showElement();
	}
}
