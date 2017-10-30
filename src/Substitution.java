
import java.util.ArrayList;
import java.util.Hashtable;

public class Substitution {
	Hashtable<String, String> ruleHt = new Hashtable<String, String>();
	
	public String solution(String S) {
		ruleHt.put("AB", "AA");
		ruleHt.put("BA", "AA");
		ruleHt.put("CB", "CC");
		ruleHt.put("AA", "A");
		ruleHt.put("CC", "C");
		
		if (S.length() == 0 || S.length() ==1){
			return S;
		}
		return checkSubStr(S);
    }
	
	public String checkSubStr (String str){
		
		if (!(str.contains("AB") || str.contains("BA") ||  str.contains("CB") 
				||  str.contains("BC") || str.contains("AA") || str.contains("CC"))){
			return str;
		}
		
		String resStr = "";
		if(str.contains("AB")){
			resStr = str.replaceFirst("AB", this.ruleHt.get("AB"));
		}else if(str.contains("BA")){
			resStr = str.replaceFirst("BA", this.ruleHt.get("BA"));
		}else if(str.contains("CB")){
			resStr = str.replaceFirst("CB", this.ruleHt.get("CB"));
		}else if(str.contains("BC")){
			resStr = str.replaceFirst("BC", this.ruleHt.get("BC"));
		}else if(str.contains("AA")){
			resStr = str.replaceFirst("AA", this.ruleHt.get("AA"));
		}else if(str.contains("CC")){
			resStr = str.replaceFirst("CC", this.ruleHt.get("CC"));
		}
		return checkSubStr(resStr);
	}
	

	public static void main(String[] args) {
		Substitution sb = new Substitution();
		System.out.println(sb.solution("ABBCC"));
		System.out.println(sb.solution(""));
		System.out.println(sb.solution("A"));
		System.out.println(sb.solution("AAAAAAA"));
		System.out.println(sb.solution("ABABABABABABAB"));
		System.out.println(sb.solution("ACACACACACACAC"));
		System.out.println(sb.solution("ABABCBABCBACACBAAACBBBCA"));
		System.out.println(sb.solution("ABBABB"));

	}

}
