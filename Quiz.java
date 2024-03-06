import java.util.Scanner;

public class Quiz {
    private static final int NUM_QUESTIONS = 3; // Number of questions in the quiz
    private static final int TIME_PER_QUESTION = 10; // Time limit per question in seconds
    private static final String[] questions = {
        "What is the capital of India?",
        "What is the largest planet in our solar system?",
        "Who wrote 'The Wings of Fire'?"
    };
    private static final String[][] options = {
        {"A. Delhi", "B. Paris", "C. Rome", "D. Berlin"},
        {"A. Earth", "B. Jupiter", "C. Mars", "D. Saturn"},
        {"A. Abdul Kalam", "B. Rabindranath Tagore", "C. William shakesphere", "D. Mark Twain"}
    };
    private static final char[] answers = {'A', 'B', 'A'}; // Correct answers
    
    private static int score = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz!");
        System.out.println("You have " + TIME_PER_QUESTION + " seconds to answer each question.");
        
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();
            
            // Start timer
            long startTime = System.currentTimeMillis();
            while ((System.currentTimeMillis() - startTime) / 1000 < TIME_PER_QUESTION) {
                // Wait for the time to elapse
            }
            
            // Check answer
            if (userAnswer.charAt(0) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }
        
        System.out.println("Quiz ended!");
        System.out.println("Your final score: " + score + "/" + NUM_QUESTIONS);
        scanner.close();
    }
}