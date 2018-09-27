 //The following program uses primitive data type double:

class DoubleJeopardy
{
  public static void main ( String[] args )
  {
    double value = 32;
    System.out.println("A double: " +  value);
  }
}

/*In this program, value is the name for a variable that uses the double data type to represent floating point numbers. Recall that this data type uses 64 bits.

It is perfectly OK to use the name value in this and in the previous program. A variable name helps describe what you want the program to do. 
It does not permanently reserve part of computer memory for any particular use.*/

/*Compile and run the program. Does its output (what it puts on the screen) differ from the output of the the previous exercise?

TERMINAL OUTPUT:

annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac DoubleJeopardy.java 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java DoubleJeopardy 
A double: 32.0


*/

/*Change the 32 to 32.0 and see if that makes a difference when you compile and run the program.

TERMINAL OUTPUT:
 annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac DoubleJeopardy.java 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java DoubleJeopardy 
A double: 32.0
*/

/*
class DoubleJeopardy
{
  public static void main ( String[] args )
  {
    double value = 32.0;
    System.out.println("A double: " +  value);
  }
}
*/

/*Now try to "break" the program. Look back in this chapter at the chart of primitive data types and the range of values they can hold.
CHART:

Integer Primitive Data Types
Type	Size	Range
byte	8 bits	-128 to +127
short	16 bits	-32,768 to +32,767
int	32 bits	-2 billion to +2 billion (approximately)
long	64 bits	-9E18 to +9E18 (approximately)
Floating Point Primitive Data Types
Type	Size	Range
float	32 bits	-3.4E38 to +3.4E38
double	64 bits	-1.7E308 to 1.7E308


 Change the "32" to a value that is too big for double. You may wish to use scientific notation for this.
 
 TERMINAL OUTPUT:
annblodgett@annblodgett-NE56R:~/Documents/CS101$ javac DoubleJeopardy.java 
DoubleJeopardy.java:74: error: floating point number too large
    double value =  1.7e309;
                    ^
1 error

 */
 
 
 /*class DoubleJeopardy
{
  public static void main ( String[] args )
  {
    double value =  1.7e309;
    System.out.println("A double: " +  value);
  }
}
 */