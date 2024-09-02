import java.util.Scanner;

public class SammysRentalPrice {

    public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun!               S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
    }

    public static void main(String[] args) {
        final int HOURLY_RATE = 40;
        final int ADDITIONAL_MINUTE_RATE = 1;
        int totalMinutes,hours,minutes,additionalMinutes;
   
       
        Scanner input = new Scanner(System.in);
        
        displayMotto();
     
        System.out.print("Enter the number of minutes rented: ");
        totalMinutes = input.nextInt();
        
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
        additionalMinutes = totalMinutes % 60;
        
        int totalPrice;
        
        if (totalMinutes < 60 ){
            totalPrice= HOURLY_RATE ;
        }else{
          totalPrice = (hours * HOURLY_RATE) + (minutes * ADDITIONAL_MINUTE_RATE);
        }
        System.out.println("Hours: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total Price: $" + totalPrice);
          
                  
    }
}
