package testassignment.com;

public class MainClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[500];
	    System.out.println("The random numbers generated are: ");
	    for (int count = 0; count < number.length; count++)
	    {
	        number[count] = (int) (Math.random() * 500 + 1);
	        System.out.println(number[count]);
	     
	    }
	    RandomNumbers.printSmallest(number);
	}

}
