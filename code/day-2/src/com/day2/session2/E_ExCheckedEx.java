package com.day2.session2;
import java.io.*;
public class E_ExCheckedEx {
	// throws FileNotFoundException 
	public static void main(String[] args){
		// i want to read a file a print it 
		BufferedReader br=null;
		try {
			 br=new BufferedReader(new FileReader("data.txt"));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();	
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
