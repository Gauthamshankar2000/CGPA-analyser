import java.util.Scanner;
public class Main
{
	public static void main(String args[])
    	{
        	System.out.println("enter which ype of engineering course you study ");
	        System.out.println(" enter 1 for four year engineering course ");
        	System.out.println(" enter 2 for five year integreated engineering course");
        	int a;
	        Scanner s1= new Scanner(System.in);
        	a=s1.nextInt();
	        switch(a)
        	{
            	case 1:System.out.println("four year engineering course");
                	aproxi hp=new aproxi();
			hp.approximate();
			break;
		case 2:System.out .println("five year engineering course");
			fiveyear fy=new fiveyear();
			fy.engineering();
			break;
		default:System.out.println("enter 1 r 2 ");
		}/* end of switch*/
	}/*end of main */
}
