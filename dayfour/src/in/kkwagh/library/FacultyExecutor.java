//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.*;
public class FacultyExecutor {

	public static void main(String[] args) {
		Library l= new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		
		/*userId and diplayPrivate() is private so we can't access into another package or class, 
		*only we can access inside a same class*/
		//l.userID=1234L;
		//l.displayPrivate();
		
		/*booksName and displayDefault() is default, we can't access into
		 * another package, only we can access with in a same package.
		 */
		//l.booksName;
		//l.displayDefault();
	}

}
