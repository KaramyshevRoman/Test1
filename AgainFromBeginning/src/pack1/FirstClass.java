package pack1;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FirstClass {
	
	public static void  main (String [] args) {
	
		
		
		
		
	Scanner Sc = new Scanner(System.in);
	int X =Sc.nextInt(); // - array length will be there
	double Min; 
	double Max = 0;
	double average = 0;
	
	double [] massiv1 = new double[X];
	int j=1;
	for (int i = 0; i < massiv1.length; i++) {
		massiv1[i] = Math.random();
		//System.out.print(massiv1[i]+" ");	
		//if (j%10==0) {
		//System.out.println();
		//}	
		//j++;
	}
	int mayak = 1; // пузырькоывая перестановка. эта часть не работаетyshev
	while (mayak==0) {
		mayak=0;
	for (int i = 0; i < massiv1.length-1; i++) {
		
		if (massiv1[i]>massiv1[i+1]){
			double drawer = massiv1[i];
			massiv1[i]= massiv1[i+1];
			massiv1[i=1] = drawer;
			mayak++;
			System.out.println("perestanovka");
		
		
		}
	}
	
	}
	
	for (int i = 0; i < massiv1.length; i++) {
		System.out.print(massiv1[i]+"   ");	
		if (j%10==0) {
		System.out.println();
		}	
		j++;
	}
	
	
	/* - max, min and average
	Min = massiv1[0];
	for (int i = 0; i < massiv1.length; i++) {
		if (Min>massiv1[i]) {
			Min = massiv1[i];
		}
		if (Max<massiv1[i]) {
			Max = massiv1[i];
		}			
	average += massiv1[i];
		}
	System.out.println();
	System.out.println("Min = "+Min);
	System.out.println("Max = "+Max);
	System.out.println("ave = "+ average / X);
	*/
	
	
	
	
	
	}
	
}
	


