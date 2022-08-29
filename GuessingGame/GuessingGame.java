package guessinggame;

import javax.swing.*;
 
public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*200 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Geben Sie eine Schätzung zwischen 1 und 200 ein", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JFrame frame = new JFrame(); 
            JOptionPane.showMessageDialog(frame, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >200) {
            return "Ungültige Nummer";
        }
        else if (userAnswer == computerNumber ){
            return "Richtig!\nInsgesamte Schätzungen: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Deine  Schätzung ist zu Hoch, versuche es nochmal.\nVersuche: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Deine Schätzung ist zu klein, versuche es nochmal.\nVersuche: " + count;
        }
        else {
            return "Deine Schätzung ist falsch\nVersuche: " + count;
        }
    }
}