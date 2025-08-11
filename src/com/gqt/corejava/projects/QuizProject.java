

package com.gqt.corejava.projects;
import java.util.*;

public class QuizProject  {
    static Scanner scanner = new Scanner(System.in);

    static class Question {
        String question;
        String[] options;
        int correctIndex;

        public Question(String question, String[] options, int correctIndex) {
            this.question = question;
            this.options = options;
            this.correctIndex = correctIndex;
        }
    }

    static List<Question> questions = new ArrayList<>();
    static boolean audienceUsed = false;
    static boolean fiftyFiftyUsed = false;
    static int currentPrize = 0;
    static final int[] prizeMoney = {10000, 20000, 30000, 40000, 50000, 100000, 200000, 500000, 1000000, 2000000};

    public static void main(String[] args) {
        loadQuestions();

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((char) ('A' + j) + ". " + q.options[j]);
            }

            boolean validInput = false;
            while (!validInput) {
                System.out.println("\nChoose an option: A/B/C/D");
                if (!audienceUsed || !fiftyFiftyUsed) {
                    System.out.println("Or type 'L' for lifeline or 'Q' to quit");
                } else {
                    System.out.println("Or type 'Q' to quit");
                }

                String input = scanner.nextLine().toUpperCase();

                if (input.equals("L")) {
                    if (audienceUsed && fiftyFiftyUsed) {
                        System.out.println("No lifelines left. Choose an option.");
                    } else {
                        validInput = useLifeline(q);
                    }
                } else if (input.equals("Q")) {
                    printPurple("You chose to quit! 🎉 You won: ₹" + currentPrize);
                    return;
                } else if ("ABCD".contains(input)) {
                    int chosenIndex = input.charAt(0) - 'A';
                    if (chosenIndex == q.correctIndex) {
                        currentPrize = prizeMoney[i];
                        printGreen("Correct! ✔️ You won ₹" + currentPrize);
                    } else {
                        System.out.println();
                        printRed("Wrong Answer! ❌");
                        if (i < 4) {
                            currentPrize = 0;
                        } else if (i >= 4 && i < 7) {
                            currentPrize = prizeMoney[4];
                        } else if (i >= 7) {
                            currentPrize = prizeMoney[6];
                        }
                        printRed("Game Over! You take home ₹" + currentPrize);
                        return;
                    }
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }
        }

        printPurple("Congratulations! 🎊 You completed the game and won ₹" + currentPrize);
    }

    static boolean useLifeline(Question q) {
        System.out.println("Available Lifelines:");
        if (!audienceUsed) System.out.println("1. Audience Poll");
        if (!fiftyFiftyUsed) System.out.println("2. 50-50");
        System.out.println("3. Cancel");

        String choice = scanner.nextLine();

        if (choice.equals("1") && !audienceUsed) {
            audienceUsed = true;
            int chance = new Random().nextInt(100);
            int suggestIndex = (chance < 80) ? q.correctIndex : new Random().nextInt(4);
            System.out.println("Audience suggests: " + (char) ('A' + suggestIndex));
            return false;
        } else if (choice.equals("2") && !fiftyFiftyUsed) {
            fiftyFiftyUsed = true;
            List<Integer> incorrectOptions = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                if (i != q.correctIndex) incorrectOptions.add(i);
            }
            Collections.shuffle(incorrectOptions);
            int removed1 = incorrectOptions.get(0);
            int removed2 = incorrectOptions.get(1);

            System.out.println("50-50 Lifeline used. Remaining options:");
            for (int i = 0; i < 4; i++) {
                if (i == q.correctIndex || i == incorrectOptions.get(2)) {
                    System.out.println((char) ('A' + i) + ". " + q.options[i]);
                }
            }
            return false;
        } else if (choice.equals("3")) {
            return false;
        } else {
            System.out.println("Invalid lifeline or already used.");
            return false;
        }
    }

    static void loadQuestions() {
        questions.add(new Question("Which team won Tata IPL 2025?", new String[]{"MI", "RCB", "CSK", "KKR"}, 1));
        questions.add(new Question("How many colors are there in Rainbow?", new String[]{"Five", "Eight", "Seven", "Six"}, 2));
        questions.add(new Question("Who is known as the 'God of Cricket'?", new String[]{"Rohit", "Sachin", "Virat", "Dhoni"}, 1));
        questions.add(new Question("Chemical symbol for Carbondioxide?", new String[]{"H2O", "O2", "NaCl", "CO2"}, 3));
        questions.add(new Question("2 + 2 * 2 = ?", new String[]{"6", "8", "4", "10"}, 0));
        questions.add(new Question("In which year did worldwar-1 begin?", new String[]{"1950", "1930", "1914", "1947"}, 2));
        questions.add(new Question("How many continents are there in the world ?", new String[]{"Five", "Eight", "Seven", "Nine"}, 2));
        questions.add(new Question("Which is the smallest state in india?", new String[]{"Goa", "Kerala", "Telangana", "Jharkhand"}, 0));
        questions.add(new Question("When the indian peoples celebrate Independence Day?", new String[]{"jan27", "Aug15", "Jan26", "Oct2"}, 1));
        questions.add(new Question("Which is programming language?", new String[]{"Java", "Snake", "Viper", "Cobra"}, 0));
    }

    static void printGreen(String message) {
        System.out.println("\u001B[32m" + message + "\u001B[0m");
    }

    static void printRed(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }

    static void printPurple(String message) {
        System.out.println("\u001B[35m" + message + "\u001B[0m");
    }
}