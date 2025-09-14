import java.util.*;
class BatchMergerSystem{
	public static void main(String args[]){
		List<String> MorningBatch = Arrays.asList("Amit","Priya");
		List<String> EveningBatch = Arrays.asList("Rohan","Priya");
		
		Set<String> Combined = new TreeSet<>();
		
		Combined.addAll(MorningBatch);
		Combined.addAll(EveningBatch);
		
		System.out.println("Combined batches: "+Combined);
 	}
}