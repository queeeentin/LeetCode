
public class mySqrt {
	
	    public int mySqrt(int x) {
	        
//	        for ( long a = 0 ; a * a <= x ; a++){
//	            
//	            long b = a+1;
//	            if (a*a <= x && b*b > x){
//	            	System.out.println(a);
//	                return (int) a;
//	            }
//	            // System.out.println(a);
//	        }
//	        return 0;
	    	
	    	
	    	 if (x<=2){
	             return 1;
	         }
	         
	         int left = 1;
	         int right = x;
	         
	         
	         while (true){
	         int mid = (right + left) /2;
	            if (mid*mid >x){
	              right = mid - 1;
	             }else{
	               if( (mid+1) * (mid+1) >= x){
	                   return mid;
	               }else{
	                   left = mid +1;
	               }
	            } 
	         }
	         
	    }
	

	
	    public static void main(String[] args)  {
	       
	            
	            int ret = new mySqrt().mySqrt(2147395600);
	            
	            String out = String.valueOf(ret);
	            
	            System.out.print(out);
	        }
	    
	
}
