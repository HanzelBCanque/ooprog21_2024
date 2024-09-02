import java.util.Scanner;

public class CarlysEventPrice {


    public static void displayMotto() {
        System.out.println("******************************");
        System.out.println("*Carly's makes the food that*");
        System.out.println("*        it a party.         *");                 
        System.out.println("******************************\n");
    }
    
    
    
    public static void main(String[] args) {
        final int PRICE_PER_GUEST = 35;
               
        Scanner input = new Scanner(System.in);

         displayMotto();


             System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();
        int totalPrice = numberOfGuests * PRICE_PER_GUEST;

                

        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("Price per Guest: $" + PRICE_PER_GUEST);
        System.out.println("Total Price: $" + totalPrice);         
        
         if (numberOfGuests >= 50){
            System.out.println("Is this a large event? True");
        }else{
         
        System.out.println("Is this a large event? false");
        }
    }
}