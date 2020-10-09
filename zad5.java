package greativity;
import java.util.Scanner;
public class zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Write two words");
		 Scanner Kalata= new Scanner(System.in);
		 char[] result = Kalata.nextLine().toCharArray();
		 char[] result1 = Kalata.nextLine().toCharArray();
		 int points=0;
		 if(result.length!=result1.length) {
			 System.out.println("No anagrams");
	
		 }else {
		 for(int i=0;i<result.length;i++) {
			 for(int j=0;j<result.length;j++) {
			if(result[i]==result[j]) {
				points+=1;
			}	 
			 }
			 }
		 if(points==result.length*2) {
			 System.out.println("An anagram here");
		 }else {
			 System.out.println("No anagrams");
		 }
		 }
		 }
	}


