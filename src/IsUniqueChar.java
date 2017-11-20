/*	Determine if a string has all unique characters. 
	what if you cannot use additional data structure
*/


public class IsUniqueChar {
	
	//
	public boolean isUnique(String str){
		if (str.length() >128) return false;
		
		boolean[] charBool = new boolean[128];
		
		for (int i = 0; i<str.length();i++){
			 // Get the numerical (ascii) value of the character in the `str` at position `i`.
			int val = str.charAt(i);
			if (charBool[val]) return false;
			charBool[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle", " 89jg "};
		for (String word : words) {
			System.out.println(word + ": " + new IsUniqueChar().isUnique(word));
		}

	}

}
