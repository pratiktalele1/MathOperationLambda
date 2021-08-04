import java.util.ArrayList;
import java.util.List;


@FunctionalInterface 
interface DoubleList{
	void printDouble();
}
public class UC_1_4 {
	public void printDoubleList() {
		DoubleList doubleList=()->{
			List<Integer> integers=new ArrayList<Integer>();
			integers.add(1);
			integers.add(2);
			integers.add(3);
			integers.add(4);
			integers.add(5);
			integers.add(6);
			integers.add(7);
			
			for(int i=0;i<integers.size();i++) {
				System.out.print((double)integers.get(i)+"  ");
			}
		};
		doubleList.printDouble();
	}
}
