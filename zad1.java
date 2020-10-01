package kkk;
import java.util.Scanner;
public class zad1 {
	static void kalata(double i) {
		if(i<380.00){
			System.out.println("The entered wavelength is not a part of the visible spectrum");

			}else if(i<=450.00||i==380.00){
				System.out.println("The color is violet");
			}else if(i<=495.00){
				System.out.println("The color is blue");
			}else if(i<=570.00){
				System.out.println("The color is green");
			}else if(i<=590.00){
				System.out.println("The color is yellow");
			}else if(i<=620.00){
				System.out.println("The color is orange");
			}else if(i<=750.00){
				System.out.println("The color is red");
			}else{
				System.out.println("The entered wavelength is not a part of the visible spectrum");
			}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter wavelength");
double n = sc.nextDouble();
kalata(n);

}
}
