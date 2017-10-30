//For an integer n find number of trailing zeroes in n! . 
//
//Given an integer n, return the number of trailing zeroes in n!.
//
//Note: Your solution should be in logarithmic time complexity.

//Since multiple of 2 is more than multiple of 5, the number of zeros is dominant by the number of 5.
//
//Here we expand
//
//  2147483647!
//=2 * 3 * ...* 5 ... *10 ... 15* ... * 25 ... * 50 ... * 125 ... * 250...
//=2 * 3 * ...* 5 ... * (5^1*2)...(5^1*3)...*(5^2*1)...*(5^2*2)...*(5^3*1)...*(5^3*2)... (Equation 1)
//We just count the number of 5 in Equation 1.
//
//Multiple of 5 provides one 5, multiple of 25 provides two 5 and so on.
//
//Note the duplication: multiple of 25 is also multiple of 5, so multiple of 25 only provides one extra 5.

//A trailing zero is always produced by prime factors 2 and 5. If we can count the number of 5s and 2s, our task is done. Consider the following examples.

//Trailing 0s in n! = Count of 5s in prime factors of n!
//                  = floor(n/5) + floor(n/25) + floor(n/125) + ....


//example:
//	Okay, how many multiples of 5 are there in the numbers from 1 to 101? There's 5, 10, 15, 20, 25,...
//
//			Oh, heck; let's do this the short way: 100 is the closest multiple of 5 below 101, and 100 ÷ 5 = 20, so there are twenty multiples of 5 between 1 and 101.
//			Okay, how many multiples of 5 are there in the numbers from 1 to 101? There's 5, 10, 15, 20, 25,...
//
//			Oh, heck; let's do this the short way: 100 is the closest multiple of 5 below 101, and 100 ÷ 5 = 20, so there are twenty multiples of 5 between 1 and 101.
//


//How many trailing zeroes would be found in 4617!, upon expansion?
//I'll apply the procedure from above:
//
//51 :  4617 ÷ 5 = 923.4, so I get 923 factors of 5
//52 :  4617 ÷ 25 = 184.68, so I get 184 additional factors of 5
//53 :  4617 ÷ 125 = 36.936, so I get 36 additional factors of 5
//54 :  4617 ÷ 625 = 7.3872, so I get 7 additional factors of 5
//55 :  4617 ÷ 3125 = 1.47744, so I get 1 more factor of 5
//56 :  4617 ÷ 15625 = 0.295488, which is less than 1, so I stop here.
//Then 4617! has 923 + 184 + 36 + 7 + 1 = 1151 trailing zeroes.
//
//By the way, you can get the same result, if you keep track as you go, by just dividing repeatedly in your calculator by 5's: 
//4617 ÷ 5 = 923.4 (write down 923), 923.4 ÷ 5 = 184.68 (write down 184), 184.68 ÷ 5 = 36.936 (write down 36),
//36.936 ÷ 5 = 7.3827 (write down 7), 7.3827 ÷ 5 = 1.47744 (write down 1), and 1.47744 ÷ 5 is 
//goint to be less than 1, so you're done. Turn to your scratch paper were you've written down the whole numbers, and sum them to get 1151.



public class TraillingZeros {
	int i = 1;
	

	public static void main(String[] args) {
		TraillingZeros tZ= new TraillingZeros();
		
		System.out.println(tZ.trailingZeroes(100));

	}
	
	//runtime = 1 solution
    public int trailingZeroes(int n) {
		
		int result = 0;
		while(n>=5){
			n = n/5;
			result += n;
		}
		
		return result;
		
	}
	
//	public int trailingZeroes(int n) {
//		
//		int num5 = 0;
//		while(Math.pow(5,i) <= n){
//			
//			int j = (int)Math.pow(5,i);
//			num5 += trailingZeroes(n, (int)Math.pow(5,i) );
//		}
//		
//		return num5;
//		
//	}
//
    //dividing n with the power of 5, is to see if there are extra 5 in hidden in the power of 5, like 25, 125 but only diving the n to the power of 5 upto to n
//	private int trailingZeroes(int n, int denorminator) {
//		++i;
//	  return (int)Math.floor((int) n/denorminator);
//		
//	}

	

}
