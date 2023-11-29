Task 1

Q1)

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a new Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}



q2)

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a new Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("A random number between " + min + " and " + max + " has been generated.");

        // Prompt the user to enter their guess
        System.out.println("Please enter your guess: ");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the user's guess
        int userGuess = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Check if the guess is correct
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, your guess is incorrect. The correct number was: " + randomNumber);
        }
    }
}


Q3)


import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a new Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("A random number between " + min + " and " + max + " has been generated.");

        // Prompt the user to enter their guess
        System.out.println("Please enter your guess: ");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the user's guess
        int userGuess = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Compare the user's guess with the generated number
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct.");
        } else if (userGuess < randomNumber) {
            System.out.println("Sorry, your guess is too low. The correct number was: " + randomNumber);
        } else {
            System.out.println("Sorry, your guess is too high. The correct number was: " + randomNumber);
        }
    }
}

Q4)

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a new Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("A random number between " + min + " and " + max + " has been generated.");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the number of attempts
        int attempts = 0;

        // Loop until the user guesses the correct number
        while (true) {
            // Prompt the user to enter their guess
            System.out.println("Please enter your guess: ");

            // Read the user's guess
            int userGuess = scanner.nextInt();

            // Increment the number of attempts
            attempts++;

            // Compare the user's guess with the generated number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Sorry, your guess is too low. Try again.");
            } else {
                System.out.println("Sorry, your guess is too high. Try again.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}


Q5)

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a new Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("A random number between " + min + " and " + max + " has been generated.");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the number of attempts and set the maximum number of attempts
        int attempts = 0;
        int maxAttempts = 5;

        // Loop until the user guesses the correct number or runs out of attempts
        while (attempts < maxAttempts) {
            // Prompt the user to enter their guess
            System.out.println("Please enter your guess: ");

            // Read the user's guess
            int userGuess = scanner.nextInt();

            // Increment the number of attempts
            attempts++;

            // Compare the user's guess with the generated number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (attempts == maxAttempts) {
                System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was: " + randomNumber);
            } else if (userGuess < randomNumber) {
                System.out.println("Sorry, your guess is too low. Try again.");
            } else {
                System.out.println("Sorry, your guess is too high. Try again.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}


Q6)

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the range
        int min = 1;
        int max = 100;

        // Game loop for multiple rounds
        boolean playAgain = true;
        while (playAgain) {
            // Create a new Random object
            Random random = new Random();

            // Generate a random number within the specified range
            int randomNumber = random.nextInt(max - min + 1) + min;

            // Print the random number
            System.out.println("A random number between " + min + " and " + max + " has been generated.");

            // Initialize the number of attempts and set the maximum number of attempts
            int attempts = 0;
            int maxAttempts = 5;

            // Round loop
            while (attempts < maxAttempts) {
                // Prompt the user to enter their guess
                System.out.println("Please enter your guess: ");

                // Read the user's guess
                int userGuess = scanner.nextInt();

                // Increment the number of attempts
                attempts++;

                // Compare the user's guess with the generated number
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    System.out.println("Number of attempts: " + attempts);
                    break;
                } else if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was: " + randomNumber);
                } else if (userGuess < randomNumber) {
                    System.out.println("Sorry, your guess is too low. Try again.");
                } else {
                    System.out.println("Sorry, your guess is too high. Try again.");
                }
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next();

            // Check if the user wants to play again
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Close the Scanner
        scanner.close();
    }
}




Q7)

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the range
        int min = 1;
        int max = 100;

        // Initialize the user's score
        int score = 0;

        // Game loop for multiple rounds
        boolean playAgain = true;
        while (playAgain) {
            // Create a new Random object
            Random random = new Random();

            // Generate a random number within the specified range
            int randomNumber = random.nextInt(max - min + 1) + min;

            // Print the random number
            System.out.println("A random number between " + min + " and " + max + " has been generated.");

            // Initialize the number of attempts and set the maximum number of attempts
            int attempts = 0;
            int maxAttempts = 5;

            // Round loop
            while (attempts < maxAttempts) {
                // Prompt the user to enter their guess
                System.out.println("Please enter your guess: ");

                // Read the user's guess
                int userGuess = scanner.nextInt();

                // Increment the number of attempts
                attempts++;

                // Compare the user's guess with the generated number
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    System.out.println("Number of attempts: " + attempts);
                    score++;
                    break;
                } else if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was: " + randomNumber);
                } else if (userGuess < randomNumber) {
                    System.out.println("Sorry, your guess is too low. Try again.");
                } else {
                    System.out.println("Sorry, your guess is too high. Try again.");
                }
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next();

            // Check if the user wants to play again
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Display the user's score
        System.out.println("Your score: " + score);

        // Close the Scanner
        scanner.close();
    }
}




