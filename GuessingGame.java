import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int attempts = 0;
        boolean looping = true;
        System.out.println("WLCOME TO OUT GAME ");
        System.out.println("I'M THINKING OF NUMBER BETWEEN 0 - 100 CAN YOU GUESS IT :");
        Random r = new Random();
        int target = r.nextInt(100);
        do{
        int guess = s.nextInt();
        if (guess < target ){
            System.out.println("GUESS HIGHER :( ");
            attempts+=1;
        }else if (guess > target){
            System.out.println("GUESS LOWER :( ");
             attempts+=1;
        }else {
             attempts+=1;
             System.out.println(String.format("YESS YOU FOUND IT IN %d ATTEMPTS :) ",attempts));
             System.out.println(" DO YOU WANT TO PLAY AGAIN ? , ENTER YES TO CONTINUE PLAING");
            String decision = s.next();
            String yes = "yes";
            if (!(decision.equals(yes.strip()))){
            looping = false;
                System.out.println("THANKS FOR PLAYIN GOOD BYE ! ");
            }else{
            target = r.nextInt(100);
            attempts = 0;
            System.out.println("I'M THINKING OF NUMBER BETWEEN 0 - 100 CAN YOU GUESS IT :");
            }
        }
        }while(looping);
        
      
    }
}
