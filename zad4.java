import java.util.Scanner;

public class zad4 {
public static int kalata(int i, int j, int h){
	return 2*(i*j+i*h+j*h);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int a = sc.nextInt();
		System.out.println("Enter weight");
		int b = sc.nextInt();
		System.out.println("Enter width");
		int c = sc.nextInt();
		int kalata1=0;
		int kalata2=0;
		int ultimateKalata=0;
		if(kalata(a,b,c)>=140){
			kalata1=kalata(a,b,c)%140;
			ultimateKalata+=kalata1*15;
			if(kalata(a,b,c)-kalata1*140>=0){
			kalata2=(kalata(a,b,c)-kalata1*140)%30;
			ultimateKalata=kalata2*5;
			if(!(kalata(a,b,c)-(kalata1*140+kalata2*30)<=0)){
				ultimateKalata+=5;
				kalata2+=1;
			}
			}
			System.out.println(ultimateKalata);
			System.out.println(kalata1);
			System.out.println(kalata2);
			
		}
	}

}
