package Tch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class tch_01_IOStreamEx_2 {

	public static void main(String[] args) {
		Vector<String> vecName = new Vector<>();
		Vector<Integer> vecJumsu = new Vector<>();
		try {
			//FileReader fi = new FileReader("FilePool\\Data.dat");
			FileInputStream fi = new FileInputStream("Data.dat");
			Scanner sc = new Scanner(fi);
			String word;
			int jumsu;
			while((jumsu=sc.nextInt())!=999) {
				vecJumsu.add(jumsu);
				word=sc.next();
				vecName.add(word);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Vector.......");
		//for(int i=0; i<vec.size(); i++) {
			//System.out.println(vec.get(5));
			System.out.println(vecName.get(2));
			System.out.println(vecJumsu.get(2));
		//}
		

	}

}
