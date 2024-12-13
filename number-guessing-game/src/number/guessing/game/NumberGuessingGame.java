package number.guessing.game;

import java.util.Scanner;
import java.util.Random; 

public class NumberGuessingGame {

    public static void main(String[] args) throws InterruptedException {
       
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        
        printWithDelay("Greetings, challenger. Dive into the unknown.",50);
        printWithDelay("Guess the number between 1 and 100.Goodluck",50);
        
        int tryCount = 0;
        while(true) {
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                printWithDelay("Correct! ", 50);
                printWithDelay("Within the veil of shadows and numbers, \nit took you " + tryCount + " tries to grasp the elusive secrets. \nContinue the dance of guessing, as the enigma lingers. \nFortune favors the persistent. Goodluck on this mysterious path. ",50);
                break;
            }   
            else if(randomNumber > playerGuess) {
                printWithDelay("Higher", 50);
            }
            else {
                printWithDelay("Lower", 50);
            }
        }
        scanner.close();
    }
    private static void printWithDelay(String text, int delay) throws InterruptedException {
        
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }
        System.out.println();
    }    
    }

