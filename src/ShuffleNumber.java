import java.util.ArrayList;

public class ShuffleNumber {
	
	 public int solution(int A) {
		 if (A >= 0 && A <= 99){
			 return A;
		 }
		 
		 int sum = 0;
		 ArrayList<Integer> aList  = new ArrayList<Integer>();
		 
		 while(A > 0){
			int curTail  = A % 10; 
			aList.add(curTail);
			A /= 10; 
		 }
		 
		int i = 0; 
		int j= aList.size()-1;
		 
		while (j > i){
			 int digitFront = aList.get(j);
			 int digitBack = aList.get(i);
			 int curVal = digitFront *10 + digitBack;
			 sum = sum*100 + curVal;
			 i ++;
			 j--;
		 }
		
		if (aList.size() % 2 != 0){
			sum = sum*10 + aList.get(i);
		}

		 
		 return sum;
	    }

	public static void main(String[] args) {
		ShuffleNumber sf  = new ShuffleNumber ();
		System.out.println(sf.solution(123456));
		System.out.println(sf.solution(1234567));
		System.out.println(sf.solution(0));
		System.out.println(sf.solution(12));
		System.out.println(sf.solution(89));
		System.out.println(sf.solution(100000000));
		System.out.println(sf.solution(26475686));

	}

}
