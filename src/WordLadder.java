import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
//
//Only one letter can be changed at a time.
//Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
//For example,
//
//Given:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log","cog"]
//As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//return its length 5.
//
//Note:
//Return 0 if there is no such transformation sequence.
//All words have the same length.
//All words contain only lowercase alphabetic characters.
//You may assume no duplicates in the word list.
//You may assume beginWord and endWord are non-empty and are not the same.


public class WordLadder {
	int numTrans = 0;

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if(!wordList.contains(endWord)){
			return 0;
		}
		

		wordList.sort(null);
		List<String> beginList = Arrays.asList(beginWord.split(""));
		List<String> newList = new ArrayList<String>(wordList);


		for (String word : wordList){
			int numDiff = 0;
			for (String wordChar : word.split("")){
				if(!beginList.contains(wordChar)){
					numDiff++;
				}
			}
			if (numDiff==1){
				if(word == endWord){
					numTrans++;
					return numTrans;
				}else{
					newList.remove(word);
					numTrans++;
					ladderLength(word, endWord, newList);
				}
			}
		}

		return numTrans;

	}


	public static void main(String[] args) {
		WordLadder wl = new WordLadder();
		List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
		System.out.println(wl.ladderLength("hit","cog",list));
		// TODO Auto-generated method stub

	}

}
