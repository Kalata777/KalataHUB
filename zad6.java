package greativity;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		 Scanner Kalata= new Scanner(System.in);
		
		 System.out.println("Write a number between 1 and 15");
		 int kalata=Kalata.nextInt();
		 for(int i=0;i<kalata;i++) {
			 for(int j=kalata-i;j>0;j--) {
				 System.out.print(j);
			 }
			 for(int k=2;k<=kalata-i;k++) {
				 System.out.print(k);
			 }
			 System.out.println();
			 }
		 }

	}

