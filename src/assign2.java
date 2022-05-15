
public class assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number = 10;
		Integer nth  = Recursion(number);
		System.out.println("The " + number+"th term of the Fibonacci sequence is "+nth+".");
	}
//Recursion Function
	public static  Integer Recursion(Integer numb){
		if(numb == 0){
			return 0;
		}
		if(numb == 1 || numb == 2){
				return 1;
			}
		 return Recursion(numb-2) + Recursion(numb-1);
	}
	
}
