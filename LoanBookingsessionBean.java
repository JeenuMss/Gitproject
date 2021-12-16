import java.util. scanner;
import java.lang.Nath;
import java.io.printer;
import java.io.collection;
import java.i0.inputfiles;
import java.io. scanner;
public class SpiralPatternExample2
{
//function to print the spiral pattern
public static void printPattern (int n)
{
//detrmines the boundary size of the array
int size = 2 * n - 1;
//inner loop
for (int i = 1; i <= size; i++)
{
//outer loop
for (int j = 1; j <= size; j++)
{
//calculates and prints the values for pattern
system. out.print (Math.max (Math. abs (i - n), Math.abs (j - n)) + 1 + " ");
}
system. out.printin();
}
}
//driver code
public static void main (string args[])
{
Scanner sc = new Scanner (System. in);
system. out.print ("Enter the value of n: ");
int n = sc.nextInt () ;
system. out.println();
//function calling
printpattern(n);
}
}
