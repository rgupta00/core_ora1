package com.day2.session2;
import java.util.*;
import java.io.*;

public class F_ExCheckedExAutomaticResouceMgt {
	// throws FileNotFoundException
	public static void main(String[] args) {
		// i want to read a file a print it

//		try {
//			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		Set<String> words= new TreeSet<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				//i will make token of the line
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					words.add(token);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		//print the tokens
		for(String token: words) {
			System.out.println(token);
		}
	}

}
