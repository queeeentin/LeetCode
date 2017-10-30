public class AlternateCapitalization {

	public static void altCap (String line){
		boolean curCap = true;
		int index = 0;
		String returnStr = "";
		
		while(index < line.length()){
			char curChar = line.charAt(index);
			if (Character.isLetterOrDigit(curChar)){
				if(curCap){
					returnStr += Character.toString(curChar).toUpperCase();
					curCap = false;
				}else{
					returnStr += Character.toString(curChar).toLowerCase();
					curCap = true;
				}
			}else{
				returnStr += Character.toString(curChar);
			}
			index++;	
		}
		System.out.println(returnStr);
	}

	public static void main(String[] args) {
		AlternateCapitalization ac = new AlternateCapitalization();
		ac.altCap("General Motors creates future!");
	}

}
