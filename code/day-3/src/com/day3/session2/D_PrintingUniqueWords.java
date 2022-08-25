package com.day3.session2;
import java.io.*;
import java.util.*;
public class D_PrintingUniqueWords {
	public static void main(String[] args) {
		//i want to get only unique words
		Set<String> words=new TreeSet<String>();
		//logic : open the file
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			
			//read line by line till file is not finished
			String line=null;
			while((line=br.readLine())!=null) {
				//i want to make token of each line
				
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					words.add(token.toLowerCase());
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//print them
		words.forEach(w-> System.out.println(w));
	}

}
