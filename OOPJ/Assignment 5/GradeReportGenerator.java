import java.util.*;
class GradeReportGenerator{
	public static void main(String args[]){
		Map<String,Integer> Student = new LinkedHashMap<>();
		
		Student.put("Amit",85);
		Student.put("Priya",92);
		
		Iterator<Map.Entry<String,Integer>> it = Student.entrySet().iterator();
		
		
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}
		
	}
}