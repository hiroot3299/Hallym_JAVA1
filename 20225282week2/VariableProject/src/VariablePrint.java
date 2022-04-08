
public class VariablePrint {

	public static void main(String[] args) {
		
		int age = 128;
		long salary = 2500000000L;
		//double pi = 3.14;
		float pi = 3.14F;
		//byte grade = 2;
		short grade = 2;
		char credit = 'A';
		/* Ãâ·Â¹® */
		//System.out.println("age : " + age);
		System.out.printf("age : %d\n" , age);
		System.out.println("salary : " + salary);
		//System.out.println("pi : " + pi);
		System.out.printf("pi : %f\n" , pi);
		System.out.println("grade : " + grade);
		//System.out.println("credit : " + credit);
		System.out.printf("credit : %c\n" , credit);
		
	}

}
