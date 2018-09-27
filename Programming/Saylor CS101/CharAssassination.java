
/*Exercise 4 — Character Assassination

The following program uses primitive data type char:*/

class CharAssassination
{
  public static void main ( String[] args )
  {
    char ch = 'A' ;
    System.out.println("A char: " +  ch );
  }
}

/*The variable ch is 16 bits of main memory that uses the char data type to represent characters. The a bit pattern that represents 'A' is placed in it. The program writes:

A char: A

Do the following:

    Change the 'A' into 'Z' and compile and run.
	>>
	annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac CharAssassination.java 
	annblodgett@annblodgett-NE56R:~/Documents/CS101$ java CharAssassination 
	A char: Z

	
    Change the 'A' into 'AA' and try to compile the program.
	>>
    annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac CharAssassination.java 
CharAssassination.java:10: error: unclosed character literal
    char ch = 'AA' ;
              ^
CharAssassination.java:10: error: unclosed character literal
    char ch = 'AA' ;
                 ^
CharAssassination.java:10: error: not a statement
    char ch = 'AA' ;
                ^
3 errors

	
	Change the 'A' into ' ' and compile and run the program.
        Notice carefully: there is a single space between the two ' marks.
	>>
	annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac CharAssassination.java 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java CharAssassination 
A char:  

	
    Change the 'A' into '' and try to compile.
        Notice carefully: there is no character between the two ' marks.
	>>
annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac CharAssassination.java 
	CharAssassination.java:10: error: empty character literal
    char ch = '' ;
              ^
1 error

    Change the 'A' into "A" and try to compile the program.
        (The double quotes " signify a String, which is something different from a char).
	>>
	annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac CharAssassination.java 
CharAssassination.java:10: error: incompatible types: String cannot be converted to char
    char ch = "A" ;
              ^
1 error


Observe and explain what works and what does not work in the above. 
*/