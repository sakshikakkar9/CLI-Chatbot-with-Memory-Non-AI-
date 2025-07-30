package ChatBotCLI;

import java.util.Scanner;

public class ChatBotApp {
    public static void main(String[] args) {
        MemoryManager memory = new MemoryManager();
        ResponseGenerator responder = new ResponseGenerator(memory);
        Scanner sc = new Scanner(System.in);

        System.out.println("🤖 ChatBot: Hello! Let's chat. (Type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("bye")) {
                System.out.println("🤖 ChatBot: Bye! Talk to you later.");
                break;
            }

            String response = responder.getReply(input);
            System.out.println("🤖 ChatBot: " + response);
        }
    }
}

