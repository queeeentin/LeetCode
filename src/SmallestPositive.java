
public class SmallestPositive {
	
	
	public int solution(int[] nums) {
//		if (nums.length == 0){
//			return 1;
//		}
//		int res = 1;
//		
//		int[] numbers = new int[nums.length+2];
//		for(int i = 0; i< numbers.length; i++){
//			numbers[i] = 0;
//		}
//		
//		for(int i = 0; i< nums.length; i++){
//			int curindex = nums[i];
//			if (curindex <= numbers.length-1 ){
//				if ( curindex > 0)
////					int curindex = nums[i];
//					numbers[curindex] = 1;
//			}
//		}
//		
//		for(int j = 1; j <  numbers.length; j++){
//			int val = numbers[j];
//			if (val == 0){
//				res = j; 
//				break;
//			}
//		}
//		
//		return res;
		
		
		int res = 1;
        int[] nums = new int[A.length+2];
        
        for(int i = 0; i< A.length;i++){
            int curIndex = A[i];
            if (curIndex <=  nums.length-1 && curIndex > 0 ){
                nums[curIndex] = 1;
            }
        }
        
        for (int j = 1; j < nums.length ; j++){
            int val = nums[j];
            //System.out.println(val);
            if (val ==0){
                res = j;
                break;
            }
        }
        
        return res;
		
		
        
        
        // write your code in Java SE 8
    }

	public static void main(String[] args) {
		// TODO numsuto-generated method stub
		int[] list1 = new int[]{1,2,4,5,6};
		int[] list2 = new int[]{-1,5,4,-2,6};
		int[] list3 = new int[]{1,5,4,22,6};
		int[] list4 = new int[]{-1,-3,0,55};
		int[] list5 = new int[]{0};
		int[] list6 = new int[]{1};
		
		SmallestPositive sp = new SmallestPositive();
		System.out.println(sp.solution(list1));
		System.out.println(sp.solution(list2));
		System.out.println(sp.solution(list3));
		System.out.println(sp.solution(list4));
		System.out.println(sp.solution(list5));
		System.out.println(sp.solution(list6));
	}

}
