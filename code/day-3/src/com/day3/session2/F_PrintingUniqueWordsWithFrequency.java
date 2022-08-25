package com.day3.session2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
public class F_PrintingUniqueWordsWithFrequency {
	public static void main(String[] args) {
		
		//i want to keep track of which word apper how many time
		// word--> freq
		Map<String, Integer> words=new TreeMap<>();
	
		//logic : open the file
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			
			//read line by line till file is not finished
			String line=null;
			while((line=br.readLine())!=null) {
				//i want to make token of each line
				
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					token= token.toLowerCase();
					if(words.containsKey(token)) {
						Integer freq=words.get(token);
						words.put(token, ++freq);
					}else {
						words.put(token, 1);
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		words.forEach((k, v)-> System.out.println(k+" : "+ v));
		
	}

}
