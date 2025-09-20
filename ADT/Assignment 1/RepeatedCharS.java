class RepeatedCharS {
    public static void main(String args[]) {
        String str = "Programming";
        str = str.toLowerCase(); 

        System.out.print("Repeated characters are: [");

        boolean first = true; 

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) continue;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(str.charAt(i));
                first = false;
            }
        }

        System.out.println("]");
    }
}
