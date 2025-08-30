class Question31 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        boolean sameObject = (str1 == str2) && (str2 == str3);

        System.out.println("All strings point to the same object: " + sameObject);
    }    
}
