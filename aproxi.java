import java.util.Scanner;
public class aproxi
{
	double convert(double a)
	{
		float s=(float)a*100;
		int x=(int)s;
		double z=x/100.0;
		return z;
	}
	public void approximate()
	{
		int sem;
		double c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,cgp,cgpa,expect,last,las1;
		double d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0;
		double e1=0,e2=0,e3=0,e4=0,e5=0,e6=0,e7=0,e8=0;
		double f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0;
		double g1=0,g2=0,g3=0,g4=0,g5=0,g6=0,g7=0,g8=0;
		double h1=0,h2=0,h3=0,h4=0,h5=0,h6=0,h7=0,h8=0;
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the cgpa ");
		cgp=s2.nextDouble();
		cgpa=cgp*100; /*getting the value as decimal and making it as integer*/
				/* the cgpa must less than 10*/
		System.out.println("enter which sem r u studying ");
		Scanner s3=new Scanner(System.in);
		sem=s3.nextInt();
		switch(sem)
		{
			case 1:cgp=cgp;
			case 2:cgp=cgp;
				break;
			case 3:c2=d1=e1=f1=g1=h1=cgp;
				break;
			case 4:c3=d2=e2=f2=g2=h2=cgp;
				break;
			case 5:c4=d3=e3=f3=g3=h3=cgp;
				break;
			case 6:c5=d4=e4=f4=g4=h4=cgp;
				break;
			case 7:c6=d5=e5=f5=g5=h5=cgp;
				break;
			case 8:c7=d6=e6=f6=g6=h6=cgp;
				break;
		}/* end of first switch*/
		System.out.println("this program will give only approximate value \n");
		System.out.println("if he gets 9 cgp in other sem ");
		if((cgp<10)&&(sem<8))
		{
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:c2=(cgp+9)/2;
				System.out.print("9 cgpa in second sem = ");
				System.out.printf("%.2f",c2);
			case 3:c3=(c2+9)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",c3);
			case 4:c4=(c3+9)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",c4);
			case 5:c5=(c4+9)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",c5);
			case 6:c6=(c5+9)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",c6);
			case 7:c7=(c6+9)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",c7);
			case 8:c8=(c7+9)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f\n\n",c8);
			}/*end of second switch*/
			System.out.println("if he gets 9.2 in all other sem");
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:d1=(cgp+9.2)/2;
				System.out.print("9.2 cgpa in second sem = ");
				System.out.printf("%.2f",d1);
			case 3:d2=(d1+9.2)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",d2);
			case 4:d3=(d2+9.2)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",d3);
			case 5:d4=(d3+9.2)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",d4);
			case 6:d5=(d4+9.2)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",d5);
			case 7:d6=(d5+9.2)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",d6);
			case 8:d7=(d6+9.2)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f\n\n",d7);
			}/* end of third switch*/
			System.out.println("if he gets 9.4 in all other sem");
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:e1=(cgp+9.4)/2;
				System.out.print("9.4 cgpa in second sem = ");
				System.out.printf("%.2f",e1);
			case 3:e2=(e1+9.4)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",e2);
			case 4:e3=(e2+9.4)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",e3);
			case 5:e4=(e3+9.4)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",e4);
			case 6:e5=(e4+9.4)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",e5);
			case 7:e6=(e5+9.4)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",e6);
			case 8:e7=(e6+9.4)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f\n\n",e7);
			}/* end of fourth switch*/
			System.out.println("if he gets 9.6 in all other sem");
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:f1=(cgp+9.6)/2;
				System.out.print("9.6 cgpa in second sem = ");
				System.out.printf("%.2f",f1);
			case 3:f2=(f1+9.6)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",f2);
			case 4:f3=(f2+9.6)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",f3);
			case 5:f4=(f3+9.6)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",f4);
			case 6:f5=(f4+9.6)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",f5);
			case 7:f6=(f5+9.6)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",f6);
			case 8:f7=(f6+9.6)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f\n\n",f7);
			}/* end of fifth switch*/
			System.out.println("if he gets 9.8 in all other sem");
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:g1=(cgp+9.8)/2;
				System.out.print("9.8 cgpa in second sem = ");
				System.out.printf("%.2f",g1);
			case 3:g2=(g1+9.8)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",g2);
			case 4:g3=(g2+9.8)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",g3);
			case 5:g4=(g3+9.8)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",g4);
			case 6:g5=(g4+9.8)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",g5);
			case 7:g6=(g5+9.8)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",g6);
			case 8:g7=(g6+9.8)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f\n\n",g7);
			}/*end of sixth switch*/
			System.out.println("if he gets 10 in all other sem");
			switch(sem)
			{
			case 1:System.out.print(" your cgp in first is "+cgp);
			case 2:h1=(cgp+10)/2;
				System.out.print("10 cgpa in second sem = ");
				System.out.printf("%.2f",h1);
			case 3:h2=(h1+10)/2;
				System.out.print("\nthird sem = ");
				System.out.printf("%.2f",h2);
			case 4:h3=(h2+10)/2;
				System.out.print("\nfourth sem = ");
				System.out.printf("%.2f",h3);
			case 5:h4=(h3+10)/2;
				System.out.print("\nfifth sem = ");
				System.out.printf("%.2f",h4);
			case 6:h5=(h4+10)/2;
				System.out.print("\nsixth sem = ");
				System.out.printf("%.2f",h5);
			case 7:h6=(h5+10)/2;
				System.out.print("\nseventh sem = ");
				System.out.printf("%.2f",h6);
			case 8:h7=(h6+10)/2;
				System.out.print("\neighth sem = ");
				System.out.printf("%.2f",h7);
			}
		}/*end of if statement*/
		else
		{
			System.out.println(" the cgpa must less than 10 \n");
			System.out.println(" the sem ust be less than ");
		}/* end of else statement*/
		System.out.println(" \n enter the expected cgpa");
		Scanner s4=new Scanner(System.in);
		expect=s4.nextDouble();
		if((expect==c8)!=(expect<=h7))
		{
			System.out.println(" you will get the expected cgpa ");
		}
		else
		{
			System.out.println(" you wont get the expected cgpa");
		}
		/* converting the values into arrays and */
		double a[]={convert(c2),convert(c3),convert(c4),convert(c5),convert(c6),convert(c7),convert(c8)};
		double b[]={convert(d1),convert(d2),convert(d3),convert(d4),convert(d5),convert(d6),convert(d7),convert(d8)};
		double c[]={convert(e1),convert(e2),convert(e3),convert(e4),convert(e5),convert(e6),convert(e7),convert(e8)};
		double f[]={convert(f1),convert(f2),convert(f3),convert(f4),convert(f5),convert(f6),convert(f7),convert(f8)};
		double e[]={convert(g1),convert(g2),convert(g3),convert(g4),convert(g5),convert(g6),convert(g7),convert(g8)};
		double g[]={convert(h1),convert(h2),convert(h3),convert(h4),convert(h5),convert(h6),convert(h7),convert(h8)};
		System.out.println(" if u get 9 cgp ");
		for(int z1=0;z1<7;z1++)
		{
			if(a[z1]>expect)
			{
				System.out.println(a[z1]);
			}/*end of 1 if*/
		}/* end of for 1 loop*/
		System.out.println(" if u get 9.2 cgp ");
		for(int z2=0;z2<7;z2++)
		{
			if(b[z2]>expect)
			{
				System.out.println(b[z2]);
			}/*end of 2 if*/
		}/* end of for 2 loop*/
		System.out.println(" if u get 9.4 cgp ");
		for(int z3=0;z3<7;z3++)
		{
			if(c[z3]>expect)
			{
				System.out.println(c[z3]);
			}/*end of 3 if*/
		}/* end of for 3 loop*/
		System.out.println(" if u get 9.6 cgp ");
		for(int z4=0;z4<7;z4++)
		{
			if(f[z4]>expect)
			{
				System.out.println(f[z4]);
			}/*end of 2 if*/
		}/* end of for 2 loop*/
		System.out.println(" if u get 9.8 cgp ");
		for(int z5=0;z5<7;z5++)
		{
			if(e[z5]>expect)
			{
				System.out.println(e[z5]);
			}/*end of 2 if*/
		}/* end of for 2 loop*/
		System.out.println(" if u get 10 cgp ");
		for(int z6=0;z6<7;z6++)
		{
			if(g[z6]>expect)
			{
				System.out.println(g[z6]);
			}/*end of 2 if*/
		}/* end of for 2 loop*/
	}/* end of approximate*/
}/*end of class*/
