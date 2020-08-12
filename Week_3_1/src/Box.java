//-----------------------------------------------------------------------
//Lab 3 exercise 4 - CPSC-50100-002
//Kip Brower 08-11-20
// Box.java - prints a box composed of * characters.
//-----------------------------------------------------------------------

public class Box {

	int size = 0;

	public static void main(String[] args) {
		Box square = new Box();
		square.setSize();
		square.printBox();
	}

	public void setSize() { //method to set the size variable in the printBox method
		size = 5;
	}

	public void printBox() { //method that prints the box of star characters of specified size.

		for (int num = 1; num <= size; num++) {  //loop for size rows.
			{
				for (int i = 1; i <= size; i++) //loop for size columns.
					System.out.print("*");
				System.out.println();
			}

		}

	}

}
