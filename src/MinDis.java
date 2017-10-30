import java.util.Arrays;

public class MinDis {
	
	public int solution(int[] A) {
        int curMinDist  = 100000001; 
        if (A.length ==1){
        	return -2;
        }
        
        Arrays.sort(A);
        int i = 0;
        while(i < A.length-1){
        	int dis = Math.abs(A[i+1] - A[i]);
        	if(dis < curMinDist ){
        		curMinDist = dis;
        	}
        	i++;
        }
        
        if (curMinDist > 100000000){
        	return -1;
        }
        return curMinDist;
    }

	public static void main(String[] args) {
		int[] samp1 = new int[]{1,2,3};
		int[] samp2 = new int[]{0,3,3,7,5,1,11};
		int[] samp3 = new int[]{-2,19,8,5,1,11};
		int[] samp4 = new int[]{-2147483628,34565537};
		
		MinDis md = new MinDis();
//		System.out.println(md.solution(samp1));
//		System.out.println(md.solution(samp2));
		System.out.println(md.solution(samp4));
	}
	

}
