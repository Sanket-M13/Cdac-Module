class Book{
	private int copiesAvailable;
	
	void addCopies(int n){
		this.copiesAvailable += n;
		System.out.println(n +" Copies Added");
	}
	
	void removeCopies(int n){
		if(n > copiesAvailable){
			System.out.println("Not enough Copies to remove");
		}else{
			this.copiesAvailable -= n;
			System.out.println(n+" Copies removed successfully");
		}
	}
	
	int getCopiesAvailable(){
		return copiesAvailable;
	}
	
	public static void main(String args[]){
		
		Book b1 = new Book();
		
		b1.addCopies(3);
		b1.removeCopies(2);
		System.out.println("Copies Available: "+b1.getCopiesAvailable());
		
		
	}
}
	