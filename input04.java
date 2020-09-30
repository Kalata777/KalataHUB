package kAlATa;



import java.util.Scanner;

public class input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();

       // sc.nextLine();
        
        //Does this line contain "BlueBumper"?
        sc.findInLine("BlueBumper");
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
     
        System.out.println("X:"+sc.nextInt());
        System.out.println("Y:"+sc.nextInt());
        sc.close();
    }    
}