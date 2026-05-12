private static void returnBook(){
	System.out.println("You have selected: Return a book");
	boolean flag = false;
	Scanner input = new Scanner(System.in);

	while(flag==false){

	System.out.print("Enter shelf number: ");
	int shelfNumber = input.nextInt();
	System.out.print("Enter book number: ");	
	int bookNumber = input.nextInt();
	
	int shelfIndex = shelfNumber - 1;	
	int bookIndex = bookNumber - 1;

	if(shelfIndex >= 0 && shelfIndex < shelves.length){
		if(bookIndex >=0 && bookIndex < shelves[shelfIndex].length){
			if(shelves[shelfIndex][bookIndex]==1){
				shelves[shelfIndex][bookIndex] = 0;
				System.out.println("Return successful.");
				flag = true;
			}else{
				System.out.println("Error - This book is already in the library.");
			}

		}else{System.out.println("Invalid book number. Try again.");}
	}else{System.out.println("Invalid shelf number. Try again.");}

	}
}