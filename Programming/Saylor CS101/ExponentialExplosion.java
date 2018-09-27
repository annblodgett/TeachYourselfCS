/* Exercise 3 — Exponential Explosion

The following program also primitive data type double. This program computes and writes out the value of exp( 32 ). This is the number "e" raised to the power 32. ("e" is the base of natural logarithms. Don't worry much about this. The point of the program is not the math but the floating point numbers.)
*/
class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 32;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

/*Compile and run the program. Does it compile and run correctly? Now change the 32 to larger and larger numbers until something goes wrong. 
*/

/*class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 35;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

TERMINAL OUTPUT:
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java ExponentialExplosion 
e to the power value: 7.896296018268069E13


class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 40;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}
TERMINAL OUTPUT:
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java ExponentialExplosion 
e to the power value: 7.896296018268069E13



class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 200;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

TERMINAL OUTPUT:
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java ExponentialExplosion 
e to the power value: 7.225973768125749E86



class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 1000;
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}

TERMINAL OUTPUT: 
annblodgett@annblodgett-NE56R:~/Documents/CS101$ java ExponentialExplosion 
e to the power value: Infinity



*/