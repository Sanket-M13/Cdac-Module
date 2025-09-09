import java.util.Scanner;

class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder Invoice = new StringBuilder("INV2025");

        Invoice.reverse();
		
        System.out.print(Invoice);
	}	
}