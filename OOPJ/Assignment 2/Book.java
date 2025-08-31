class Book{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks;
	
	Book(){
		
	}
	
	void Setter(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		
		if (issued) {
            totalIssuedBooks++;
        }
}

	
	String getTitle() {
        return title;
    }
    boolean isIssued() {
        return issued;
    }
	
	public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
	
	public static void main(String args[]){
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.Setter("Harry Potter","J.K. Rowling",true);
		b2.Setter("Five Point Someone", "Chetan Bhagat",false);
		b3.Setter("Rich Dad Poor Dad", "Robert Kiyosaki", true);
		
		System.out.println(b1.getTitle() + " issued? " + b1.isIssued());
        System.out.println(b2.getTitle() + " issued? " + b2.isIssued());
        System.out.println(b3.getTitle() + " issued? " + b3.isIssued());
		showTotalIssued();
	}
	
}