class BK1 {
    static void display(String str, String res) {
        // Base condition
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // pick one character
            String ros = str.substring(0, i) + str.substring(i + 1); 
            display(ros, res + ch); // recursive call
        }
    }

    public static void main(String[] args) {
        String s = "ABCDE";
        display(s, "");
    }
}
