import java.util.*;
class ElectronicVotingSystem{
	public static void main(String args[]){
		Set<String> VoterID = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Voters");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the ID: ");
			String Id = sc.nextLine();
			VoterID.add(Id);
		}
		
		System.out.println("Total unique attendes: "+ VoterID.size());
		
	}
	
}