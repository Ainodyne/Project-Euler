/**
 * 
 */
package problems;

/**
 * Problem045.java
 * @author Ainodyne
 *
 * @version 1.00
 * @since Mar 12, 2015
 */
public class Problem045
{
	private static int penta = 0, hexa = 0, addp = 1, addh = 1;
	
	public static void run()
	{
		loopThrough(); // return 1
		loopThrough(); // return 40755
		loopThrough(); // return the next triangle number
		
		System.out.println(penta);

	}
	
	public static void loopThrough()
	{
		penta += addp; addp += 3;
		hexa += addh; addh += 4;
		
		do
		{
			while (penta < hexa)
			{
				penta += addp;
				addp += 3;
			}
			while (hexa < penta)
			{
				hexa += addh;
				addh += 4;
			}
		} while (penta != hexa);
	}
}

Answer is 1533776805
Execution time is 2.158004 ms

