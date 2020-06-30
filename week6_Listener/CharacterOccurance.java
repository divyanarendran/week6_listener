package week6_Listener;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import gherkin.deps.com.google.gson.internal.LinkedHashTreeMap;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="dhanalakshmi";
		 char[] charArray = name.toCharArray();
		 //Character unique so key 
		 //int not unique so value
		 Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		 
		for (char eachChar : charArray) {
			if(map.containsKey(eachChar))
			{
			map.put(eachChar, map.get(eachChar)+1);	
			}
			
			else
			{
				map.put(eachChar, 1);
			}
		}

		//to print the key and value together
		Set<Entry<Character, Integer>> setValues = map.entrySet();
		for (Entry<Character, Integer> eachEntry : setValues) {
			
			System.out.println(eachEntry.getKey()+"-->"+eachEntry.getValue());
		}
	}

}
