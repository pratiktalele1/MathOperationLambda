
public class OperationMain {
	public static void main(String[] args) {
		System.out.println("from uc1 class");
		// creating object for uc_1_1
		UC_1_1 uc_1_1 = new UC_1_1();
		uc_1_1.operation();

		System.out.println("");

		System.out.println("from uc2 class");
		// creating object for uc_1_2
		UC_1_2 uc_1_2 = new UC_1_2();
		uc_1_2.operation();

		System.out.println("");
		
		System.out.println("from uc3 class");
		//creating object for uc_1_3
		UC_1_3 uc_1_3 = new UC_1_3();
		uc_1_3.numberList();
	}
}
