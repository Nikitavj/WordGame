package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class  NewWord {
	
	public static String  WordFromList(int index) throws IOException {
	
		FileReader slovar = new FileReader("slovar.txt");
		String[] masSlov = new String[950];
		BufferedReader reader = new BufferedReader(slovar);
		for ( int i = 0; i < masSlov.length; i++) {
			masSlov[i] = reader.readLine();
		}
		
		return masSlov[index].toUpperCase();
	}
}