package testassignment.com;

public class RandomNumbers {


		
		public static void printSmallest(int[] number){
			
			int min = 501;
	

		    for (int i = 0; i < number.length; i++)
		    {
		        if (number[i] < min)
		        {
		            min = number[i];
		        }
		        
		    }

		    System.out.println("Smallest number out the random is:" + min);
		}
			
		}




