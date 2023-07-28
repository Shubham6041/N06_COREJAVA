// program to deomonstrate on access specifier

package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.*;

public class Faculty {

	public static void main(String[] args) {
		Library l = new Library();
		l.libraryName = "MET librarry";
		l.displayPublic();
		
		/*we can't access private variable or method into the another package or class
		 * only we can access in the same class
	    */
		// l.userId = 111;
		// l.displayPrivate();
		
		
		/*we can't access default variable and methods into another package or class,
		 * only we can access in the same class
		*/
		// l.booksName = "CPP";
		// l.displayDefault();

	}

}
