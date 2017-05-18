import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

public class PascalTriangle {
	

	
	
	public List<Integer> getRow(int rowIndex) {
        List<Integer> returnList = new ArrayList<Integer>();
        int value = 1;
        returnList.add(value);
        
        for(int i=1; i<=rowIndex;i++){
        	int k=  (rowIndex+1-i)/i;
        	value = value *(rowIndex+1-i)/i;
        	returnList.add(value);
        	System.out.println(returnList);
          
          
        }
        
        return returnList;
    }
    
    
    

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		List<Integer> list = pt.getRow(30);
		System.out.println(list);

	}
	
	

}
