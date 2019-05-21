package com.tom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IO {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis =new FileInputStream("data.txt");
			
			Reader r =new InputStreamReader(fis);
			int i =r.read();
			while(i !=-1) {
				System.out.print((char)i);
				 i =r.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
