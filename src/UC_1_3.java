import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface numberList {
	void printList();
}

public class UC_1_3 {
	public void numberList() {
		//creating Anonymous function
		numberList data = () -> {
			List<Number> list = new ArrayList<Number>();
			list.add(12);
			list.add(1.32);
			list.add(1456);
			list.add(852);
			list.add(8.6);
			list.add(789.12);
			list.add(52);
			list.add(7850);
			list.add(125);

			list.forEach(show -> System.out.print(show + " "));
		};
		
		data.printList();
	}
}
