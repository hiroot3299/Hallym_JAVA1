
public class CostPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cost;
		
		cost = 172.53;
		
		//System.out.println("The sales total is: $" + cost);
		System.out.printf("The sales total is: $ %10.6f " , cost);
		//10(소수점포함자릿수).6(소수여섯째자리까지)
	}

}
