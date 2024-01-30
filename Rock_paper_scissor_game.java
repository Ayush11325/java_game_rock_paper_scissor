package com.company.com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor_game {
    public static void main(String[] args) {
                // Array to hold the options
                String[] options = {"rock", "paper", "scissors"};

                // Scanner for user input
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                while (true) {
                    // Prompt the user to enter their choice
                    System.out.println("Enter your choice (rock, paper, scissors) or 'quit' to exit: ");
                    String userChoice = scanner.nextLine().toLowerCase();

                    // Check if the user wants to quit
                    if (userChoice.equals("quit")) {
                        System.out.println("Thanks for playing!");
                        break;
                    }

                    // Check if the user's choice is valid
                    if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                        System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
                        continue;
                    }

                    // Generate random computer choice
                    int computerIndex = random.nextInt(3);
                    String computerChoice = options[computerIndex];

                    // Display computer's choice
                    System.out.println("Computer chose: " + computerChoice);

                    // Determine the winner
                    if (userChoice.equals(computerChoice)) {
                        System.out.println("It's a tie!");
                    } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("Computer wins!");
                    }
                }

                // Close the scanner
                scanner.close();
            }
        }



