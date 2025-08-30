class ArmstrongRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int original = num;
            int sum = 0;
            int temp = num;
			
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
			
            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
