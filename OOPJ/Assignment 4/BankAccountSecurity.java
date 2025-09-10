import java.util.Scanner;
class BankAccountSecurity{
	final int Id;
	BankAccountSecurity(int id){
		this.Id = id;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Account ID: ");
		int ID = sc.nextInt();
		
		BankAccountSecurity bs = new BankAccountSecurity(ID);
		
		try{
			// bs.Id = 102;
			throw new UnsupportedOperationException("Account ID cannot be changed");
		}catch(UnsupportedOperationException e){
			System.out.println("Account ID = "+ bs.Id + " (Cannot be change)");
		}
	}
}