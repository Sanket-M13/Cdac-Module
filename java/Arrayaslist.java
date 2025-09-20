import java.util.*;

class Arrayaslist {
    public static void main(String[] args) {
		    int a = 10;
			int b = a++;
			
			System.out.println(b +" "+ a);
			
			Deque<Integer> stack = new ArrayDeque<>();
			stack.push(1);
			stack.push(2);
			System.out.println(stack.pop()); // 2
			System.out.println(stack);

			
			// System.out.println(Arrays.asList(1,2,3).getClass().getSimpleName());
			// System.out.println(Arrays.asList(1, 2, 3).getClass().getSimpleName()); 
			int[] arr = {1, 2, 3};
			// System.out.println(Arrays.asList(arr).getClass().getSimpleName());
// Works in modern Java if autoboxed as Integer

	}
	}