
public class Root {
	
	
public int solution(int A, int B) {
	 	if (A <= 0){
	 		A = 1;
	 	}
        
        int rootA = (int) Math.ceil(Math.sqrt((double )A));
        int resInt  = 0;
        while ((int)Math.pow((double) rootA, 2) <= B){
        	rootA +=1;
        	resInt ++;
        }
        
        return resInt;
        
    }

	public static void main(String[] args) {
		Root root = new Root();
		System.out.println(root.solution(4, 17));
		System.out.println(root.solution(-2, 17));
		System.out.println(root.solution(-2, 200));

	}

}
