import java.util.Scanner;

public class sortingThreeNumber{

   public static void main (String[]a){
   Scanner scanner = new Scanner (System.in);
   
      System.out.print("Enter The First Number:");
      int num1 = scanner.nextInt();
      System.out.print("Enter The Second Number:");
      int num2 = scanner.nextInt();
      System.out.print("Enter the third number:");
      int num3 = scanner.nextInt();
      //Ascending
      if(num1 <= num2 && num2 <= num3){
              System.out.println("Ascending Order: "+ num1 +" "+ num2 +" " + num3 );
               }else{
               
               //Descending 
               if(num1 >= num2 && num1 >= num3){
                  if ( num2 >= num3){
                     System.out.println("Descending Order: "+ num1 +" "+ num2 +" "+ num3 );
                  }else{
                     System.out.println("Descending Order: "+ num1 +" "+ num3 +" "+ num2 );
                     }
                  }else if ( num2 >= num1 && num2 >= num3){
                     if( num1 >= num3){
                        System.out.println("Descending Order: "+ num2+" "+ num1 +" " + num3 );
                     }else{
                        System.out.println("Descending Order: "+ num2 +" "+ num3 +" "+ num1 );                     
                     }
                     } else{
       if (num1 >=2){
                           System.out.println("Descending Order: "+ num3 +" "+ num1 +" "+ num2);
           } else {
              System.out.println("Descending Order: "+num3+" "+ num2 +" "+ num1);
                     
                     }
                     
                  
                  }
               }
               
               }
               }

