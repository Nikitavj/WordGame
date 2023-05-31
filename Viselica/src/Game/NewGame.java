package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NewGame {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Привет, отгадай слово по буквам!");	// поприветствовать игрока
		// загодать слово	
		String word;
		do {
			RandomIndex indexWord = new RandomIndex(); // сгенерировать случайное число от 0 до 945 случайное число
			int index = indexWord.ranIndex();
			NewWord Nword = new NewWord(); // получить слово из словаря
			word = Nword.WordFromList(index);
		} while ( word.length() < 5 || word.length() > 6);
		// System.out.println(word);
		int sostVisel = 0;                			// виселица в консоли
		new ImagViselica().ImagViselStatus(sostVisel);
		boolean result = new GameCicle(word).resultGame(); // процесс игры, идет пока виселица нарисована не вся 
		if ( result == true) {		// поздравить игрока или посочувствовать и начать новую игру
			System.out.println();
			System.out.println("Поздравляю, ты победитель!)");
		} else {
			System.out.println();
			System.out.println("Увы. Ты проиграл(");
		}	
	}
}




