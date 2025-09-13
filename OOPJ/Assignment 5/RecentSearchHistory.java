import java.util.*;
class RecentSearchHistory{
	public static void main(String args[]){
		Queue<String> Searches = new LinkedList<>();
		int MaxSize = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of searches: ");
        int n = sc.nextInt();
        sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter search term: ");
            String search = sc.nextLine();
			
			if(Searches.size() == MaxSize){
				System.out.println("Limit Exceed removing the oldes Search");
				Searches.poll();
			}
			
			Searches.offer(search);
		}
		
		 System.out.println("Recent searches: " + Searches);
		
	}
}