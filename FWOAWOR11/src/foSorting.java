import java.util.Scanner;

public class foSorting {
public static void main(String[] args) {
	Sort();
}
static void Sort() {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	System.out.println("Enter values");
	int i;
	int j;
	int v[]=new int[L];
			for(i=0;i<L;i++)
			{
				v[i]=S.nextInt();
			}
			int temp;
			for(i=0;i<L-1;i++)
			{
				for(j=i+1;j<L;j++)
				{
					if(v[i]>v[j])
					{
						temp=v[i];
						v[i]=v[j];
						v[j]=temp;
					}
				}
			}
			System.out.println("Sorted values are \n");
			for(i=0;i<L;i++)
			{
	
				System.out.println(v[i]);
			}
}

}
