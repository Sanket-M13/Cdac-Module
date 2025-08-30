class Question16 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.err.print(j);
                if (j < i) {   
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }    
}
