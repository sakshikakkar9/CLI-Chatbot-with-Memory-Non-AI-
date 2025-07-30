package ChatBotCLI;

import java.util.*;

public class ResponseGenerator {
    private final MemoryManager memory;

    public ResponseGenerator(MemoryManager memory) {
        this.memory = memory;
    }

    public String getReply(String input) {
        input = input.toLowerCase();

        if (input.contains("name is")) {
            String name = input.substring(input.indexOf("name is") + 8);
            memory.setName(name);
            return "Nice to meet you, " + name + "!";
        }

        if (input.contains("i like")) {
            String hobby = input.substring(input.indexOf("i like") + 7);
            memory.addHobby(hobby);
            return "Cool! I'll remember that you like " + hobby;
        }

        if (input.contains("favorite") || input.contains("i love")) {
            memory.addFact(input);
            return "Got it! I'll keep that in mind.";
        }

        if (input.contains("bored")) {
            if (!memory.getHobbies().isEmpty()) {
                return "Maybe do something related to " + memory.getHobbies().get(0) + "?";
            } else {
                return "Maybe go for a walk or try something new!";
            }
        }

        if (input.contains("who am i")) {
            return "You're " + (memory.getName().isEmpty() ? "someone special!" : memory.getName());
        }

        return "Hmm, interesting... Tell me more!";
    }
}

