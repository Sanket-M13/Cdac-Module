class Question15 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.err.print(i);
                if (j < i) {   
                    System.out.print("*");
                }
            }
            System.err.println();
        }

        for (int m = 5; m > 0 ; m--) {
            for (int n = 0; n<m;  n++) {
                System.out.print(m);
               if (n < m) {   
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }    
}
