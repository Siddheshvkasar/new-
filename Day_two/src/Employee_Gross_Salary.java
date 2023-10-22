
public class Employee_Gross_Salary {

	public static void main(String[] args) {
		
		String name="Ram";
		int gross_sal,Basic_sal,D_A,T_A,H_R_A;
		
		Basic_sal=10000;
		D_A=(Basic_sal*2)/100;
		T_A=(Basic_sal*1)/100;
		H_R_A=(Basic_sal*5)/100;
		
		gross_sal=Basic_sal+D_A+T_A+H_R_A;
		
		System.out.println("\n Employee Details---------------------"
							+"\n Employee Name = "+name
							+"\n Basic Salary = "+Basic_sal
							+"\n D_A = "+D_A
							+"\n Travel Allowance = "+T_A
							+"\n H R A = "+H_R_A
							+"\n Total Gross Salary = "+gross_sal);
		
		

	}

}
