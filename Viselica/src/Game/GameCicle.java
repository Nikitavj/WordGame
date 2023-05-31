package Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameCicle {
	 String word;
	 
GameCicle(String word) {
		this.word = word;
	}
	
	public boolean resultGame() {
		
		int sostVisel = 0;
		StringBuilder error = new StringBuilder("");
		
		char[] tablo = new char[word.length()]; // заполнил табло подчеркиваниями
		Arrays.fill(tablo, '_');
		
		char[] masSlov = word.toCharArray(); // заполнил массив слова буквами
		
		int ranInd = new Random().nextInt(word.length());
		for ( int i = 0; i < word.length(); i++) {
			if ( masSlov[i] == masSlov[ranInd]) {
				tablo[i] = masSlov[i];
			}
		}
		
		boolean result = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
				
			System.out.println();
			for ( int simv: tablo) {              // выводим актуальное значение табло
				System.out.print((char)simv + " ");
			}
			
			boolean flagProverki = false;
			for ( int simv: tablo) {   			//проверяем есть ли незаполненные позиции в табло
				if ( simv == '_') {
					flagProverki = true;
				}
			}
			
			if ( flagProverki == false) {		// если табло заполнено, завершаем игру
				break;
			}
			
			System.out.println();
			System.out.print("Введи букву: ");
			System.out.println();
			char sim = scan.next().charAt(0);   // принимаем первый символ введенной строки

			boolean flagZacheta = false;
			for ( int i = 0; i < word.length(); i++) {  // проверяем входит ли символ в слово
				if ( sim == masSlov[i]) {
					tablo[i] = sim;
					flagZacheta = true;
				}
			}
			
			if ( flagZacheta == false) {  // если ошибка то добавляем букву к строке ошибки
				error.append(sim).append(", ");
			}
			System.out.println("Ошибки: " + error);
			
			if (flagZacheta == false) {         // если ошибка, то выводится предупреждение
				System.out.println("Неверно!");
			    sostVisel++;
			}
			System.out.println();
			
			new ImagViselica().ImagViselStatus(sostVisel); // выводим актуальное состояние виселицы
			if ( sostVisel == 6) {
				result = false;
				break;
			}
		}
		scan.close();
		return result;
	}
}
