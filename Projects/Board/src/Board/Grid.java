/**
 * 
 */
package Board;

/**
 * @author Jim Doyle
 *
 */
public class Grid {
	
	public Grid() {
	int x=2;
	int y=2;
	String corner="+";
	String hEdge="-";
	String vEdge="|";
	String space=" ";
	
	System.out.print(corner);
	for (int i=1; i<=x;i++)
	{
		System.out.print(hEdge);
		for (int j=1; j<=y; j++) {
			System.out.print(vEdge+space);
		}
		System.out.print("\n");
	}
 }

}