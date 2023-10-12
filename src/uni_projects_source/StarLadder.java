package uni_projects_source;

public class StarLadder {

	public static void main(String[] args) {

		int i,j,k=5;

		for (j=2; j<=k*2; j+=2)
		{
			for (i=k; i>j/2; --i)
			{
				System.out.print(" ");
			}
			for (i=1; i<j; ++i)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
