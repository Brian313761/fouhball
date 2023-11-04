package fouhball;

public class football {
	
	/*public static int convert (int minutes) {
		return(minutes*60);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int minute=60;
int second= convert(minute);

System.out.println (minute +" minutes in seconds is: "+ second);*/
	
	public static int Sum(int num1, int num2) {
		return num1+num2;	
	}
	
	public static int Sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		football CalculatedSum= new football();
		
		int result= CalculatedSum.Sum(1,1);
		
		System.out.println("the sum for sum1 is " + result);
				
		
			
		}
	}


