import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	/* String s = "java";
	 *  UseCases ..... s = null - return;
	 * s - isEmpty = return;
	 * s.length() == 1 - return;	
	 */
	public static void main(String[] args) {
		
		System.out.println("Print (Total no of repetative count) Duplicate character in a string");
	
		printDuplicateCharacterString("A");
		printDuplicateCharacterString("");
		printDuplicateCharacterString(null);
		printDuplicateCharacterString("Ashvinya");  //no repetation here
		printDuplicateCharacterString("Besstie");
		printDuplicateCharacterString("1000 nane voltz");
		printDuplicateCharacterString(" ");
		
		
		String s = "Hello World";
		s = s.toLowerCase();
		for(char ch = 'a'; ch <= 'z'; ch++)
		{
			int c = 0;
			for(int i = 0; i < s.length(); i++) {

			if(ch == s.charAt(i)) {
				c++;
			}
		}
			if(c!=0)
			{
				System.out.println(ch+"\t"+c);
			}
		}
	
	
	}
	
	
	public static void printDuplicateCharacterString(String str)
	{ 
		//3 negative cases :
		if(str == null) {
			System.out.println("Null String");
			return;
		}
		
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		
		if(str.length() == 1) {
			System.out.println("Single Character String");
			return;
			
		}
		
		char words[] = str.toCharArray();   //Java
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character ch : words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+ 1);
			}
			else 
			{
				charMap.put(ch,1);
			}
		}
		//print the map:
		Set<Map.Entry<Character,Integer>> entrySet1 = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry1 : entrySet1)
		{
			if(entry1.getValue() > 1) 
			{
				System.out.println(entry1.getKey() + " : " + entry1.getValue());
			}
		}
		
		
	}

}
