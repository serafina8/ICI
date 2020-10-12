package Tch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

public class tch_01_IOStreamEx {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		try {
			//FileInputStream fi = new FileInputStream("FilePool\\words.txt");
			FileReader fi = new FileReader("words.txt");
			BufferedReader br = new BufferedReader(fi);
			String word;
			while((word=br.readLine())!=null) {
				vec.add(word);
				//System.out.println(word);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Vector.......");
		//for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(5));
		//}
		

	}

}
