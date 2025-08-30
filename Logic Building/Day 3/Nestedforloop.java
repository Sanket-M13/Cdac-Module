class Nestedforloop {
    public static void main(String[] args) {
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                System.out.print("Hi I am " + i + " Hi I am " + j + "  ");
            }
            System.out.println(); // New line after each outer loop iteration
        }
    }
}
