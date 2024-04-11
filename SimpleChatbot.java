import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! I'm a simple chatbot. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");

        // Conversation loop
        while (true) {
            String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity

            // Check for exit condition
            if (userInput.equals("bye") || userInput.equals("exit")) {
                System.out.println("Goodbye, " + name + "! Have a great day!");
                break; // Exit loop
            } else {
                // Predefined responses based on user input
                String response;
                if (userInput.contains("how are you")) {
                    response = "I'm just a computer program, so I don't have feelings, but thanks for asking!";
                } else if (userInput.contains("hello") || userInput.contains("hi")) {
                    response = "Hello there! How can I help you?";
                } else if (userInput.contains("thanks") || userInput.contains("thank you")) {
                    response = "You're welcome!";
                } else if (userInput.contains("time")) {
                    response = "The current time is " + java.time.LocalTime.now();
                } else if (userInput.contains("date")) {
                    response = "Today's date is " + java.time.LocalDate.now();
                } else if (userInput.contains("weather")) {
                    response = "I'm sorry, I can't provide weather information at the moment.";
                } else if (userInput.contains("joke")) {
                    response = "Why don't scientists trust atoms? Because they make up everything!";
                } else if (userInput.contains("news")) {
                    response = "I'm sorry, I can't provide news updates at the moment.";
                } else {
                    response = "Sorry, I didn't understand that. Can you please rephrase?";
                }

                // Print response
                System.out.println(response);
            }
        }

        scanner.close();
    }
}
