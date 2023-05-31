package Game;

import java.io.IOException;

public class ImagViselica {
	public static void ImagViselStatus (int count) {
		
		switch (count) {
		case 0:
			System.out.println(" _____ \n |   |\n |\n |\n | \n_|_");
			break;
		case 1:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |"
	       		+ "\n | "
	       		+ "\n_|_");
			break;
		case 2:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |   |"
	       		+ "\n | "
	       		+ "\n_|_");
			break;
		case 3:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |  /|"
	       		+ "\n | "
	       		+ "\n_|_");
			break;
		case 4:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |  /|\\"
	       		+ "\n | "
	       		+ "\n_|_");
			break;
		case 5:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |  /|\\"
	       		+ "\n |  /"
	       		+ "\n_|_");
			break;
		case 6:
			System.out.println(
	    		    " _____ "
	    		+ "\n |   |"
	       		+ "\n |   O"
	       		+ "\n |  /|\\"
	       		+ "\n |  / \\"
	       		+ "\n_|_");
			break;
		}
	}
}
