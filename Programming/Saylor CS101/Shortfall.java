
/*
 Create a file called Shortfall.java that contains the following  program. (Copy and paste will greatly speed this up.) 
 TERMINAL OUTPUT: annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac Shortfall.java   */
 
/class Shortfall{
  public static void main ( String[] args )
  {
    short value = 32;
    System.out.println("A short: " +  value);
  }
} 


/*
 
 Compile and run the program. Check what it writes onto the screen.
TERMINAL OUTPUT: annblodgett@annblodgett-NE56R:~/Documents/CS101$ java Shortfall 
A short: 32

 Now edit the program so that the 32 is changed to some other small number, say 356.
 Compile and run the program. Everything should be fine.  
 
TERMINAL OUTPUT: annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac Shortfall.java 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java Shortfall 
A short: 356


*/

/*
class Shortfall
{
  public static void main ( String[] args )
  {
    short value = 356;
    System.out.println("A short: " +  value);
  }
}
*/


/*Next change the number to 35000 and try to compile and run the program. 
This number is too large to work with the data type short (in other words, it cannot be represented in 16 bits using data type short.) What happens?

TERMINAL OUTPUT:
annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac Shortfall.java 
Shortfall.java:53: error: incompatible types: possible lossy conversion from int to short
    short value = 35000;
                  ^
1 error
 
*/

/* class Shortfall
{
  public static void main ( String[] args )
  {
    short value = 35000;
    System.out.println("A short: " +  value);
  }
}
*/
/*Now edit the program (don't change the 35000) so that the data type is int. Compile and run the program. Is there a difference? 

TERMINAL OUTPUT: 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java Shortfall 
An int: 35000
*/ 

/*class Shortfall
{
  public static void main ( String[] args )
  {
    int value = 35000;
    System.out.println("An int: " +  value);
  }
}
*/
