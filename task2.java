Task 2


Q1)


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose an option
        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize the text for word counting
        String text = "";

        // Process the user's choice
        if (option == 1) {
            // Prompt the user to enter text
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            // Prompt the user to provide a file
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                // Read the content of the file
                File file = new File(filePath);
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    text += fileScanner.nextLine() + " ";
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        // Close the Scanner
        scanner.close();

        // Count the words in the text
        int wordCount = countWords(text);

        // Display the word count
        System.out.println("The number of words in the text: " + wordCount);
    }

    // Method to count the number of words in a string
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
}



Q2)


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        }
 else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
 
           try {
                text = readFromFile(filePath);
            }
 catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        }
 else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        int wordCount = countWords(text);

        System.out.println("The number of words in the text: " + wordCount);
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
}



Q3)


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        int wordCount = words.length;

        System.out.println("The number of words in the text: " + wordCount);
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }
}



Q4)

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        int wordCount = countWords(words);

        System.out.println("The number of words in the text: " + wordCount);
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static int countWords(String[] words) {
        return words.length;
    }
}


Q5)


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);

        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}



Q6)


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);

        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total count of words: " + words.length);
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}



Q7)


import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);
        Set<String> commonWords = createCommonWordsSet();
        wordCounts.keySet().removeAll(commonWords);

        System.out.println("Word counts (excluding common words):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total count of words (excluding common words): " + wordCounts.size());
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public static Set<String> createCommonWordsSet() {
        // Add common words to this set
        Set<String> commonWords = new HashSet<>();
        commonWords.add("the");
        commonWords.add("and");
        commonWords.add("is");
        commonWords.add("in");
        // Add more common words as needed
        return commonWords;
    }
}


Q8)

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (option == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFromFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please check the file path and try again.");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        String[] words = splitIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);
        Set<String> commonWords = createCommonWordsSet();
        wordCounts.keySet().removeAll(commonWords);

        System.out.println("Word counts (excluding common words):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total count of words (excluding common words): " + wordCounts.size());
        System.out.println("Number of unique words (excluding common words): " + wordCounts.keySet().size());
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public static Set<String> createCommonWordsSet() {
        // Add common words to this set
        Set<String> commonWords = new HashSet<>();
        commonWords.add("the");
        commonWords.add("and");
        commonWords.add("is");
        commonWords.add("in");
        // Add more common words as needed
        return commonWords;
    }
}



Q9)


import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input text manually or '2' to provide a file for word counting:");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (option == 1) {
            text = inputText(scanner);
        } else if (option == 2) {
            text = inputFromFile(scanner);
        } else {
            System.out.println("Invalid option. Please try again.");
            System.exit(1);
        }

        scanner.close();

        if (text.isEmpty()) {
            System.out.println("No input provided. Exiting program.");
            System.exit(1);
        }

        String[] words = splitIntoWords(text);
        Map<String, Integer> wordCounts = countWords(words);
        Set<String> commonWords = createCommonWordsSet();
        wordCounts.keySet().removeAll(commonWords);

        System.out.println("Word counts (excluding common words):");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total count of words (excluding common words): " + wordCounts.size());
        System.out.println("Number of unique words (excluding common words): " + wordCounts.keySet().size());
    }

    public static String inputText(Scanner scanner) {
        System.out.println("Enter your text:");
        return scanner.nextLine();
    }

    public static String inputFromFile(Scanner scanner) {
        System.out.println("Enter the file path:");
        String filePath = scanner.nextLine();
        try {
            return readFromFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file path and try again.");
            System.exit(1);
        }
        return "";
    }

    public static String readFromFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return content.toString();
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public static Set<String> createCommonWordsSet() {
        // Add common words to this set
        Set<String> commonWords = new HashSet<>();
        commonWords.add("the");
        commonWords.add("and");
        commonWords.add("is");
        commonWords.add("in");
        // Add more common words as needed
        return commonWords;
    }
}


Q10)



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Input:");
        inputLabel.setBounds(10, 20, 80, 25);
        panel.add(inputLabel);

        JTextField inputText = new JTextField(20);
        inputText.setBounds(100, 20, 165, 25);
        panel.add(inputText);

        JButton countButton = new JButton("Count Words");
        countButton.setBounds(10, 80, 150, 25);
        panel.add(countButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 120, 380, 150);
        resultArea.setEditable(false);
        panel.add(resultArea);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputText.getText();
                String[] words = splitIntoWords(text);
                Map<String, Integer> wordCounts = countWords(words);
                Set<String> commonWords = createCommonWordsSet();
                wordCounts.keySet().removeAll(commonWords);

                StringBuilder result = new StringBuilder();
                result.append("Word counts (excluding common words):\n");
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                }
                result.append("Total count of words (excluding common words): ").append(wordCounts.size()).append("\n");
                result.append("Number of unique words (excluding common words): ").append(wordCounts.keySet().size());

                resultArea.setText(result.toString());
            }
        });
    }

    public static String[] splitIntoWords(String text) {
        return text.split("[\\s.,;?!()\\[\\]{}\"]+");
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public static Set<String> createCommonWordsSet() {
        // Add common words to this set
        Set<String> commonWords = new HashSet<>();
        commonWords.add("the");
        commonWords.add("and");
        commonWords.add("is");
        commonWords.add("in");
        // Add more common words as needed
        return commonWords;
    }
}





