package ChatBotCLI;

import java.util.*;

public class MemoryManager {
    private String name = "";
    private List<String> hobbies = new ArrayList<>();
    private List<String> facts = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void addFact(String fact) {
        facts.add(fact);
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getFacts() {
        return facts;
    }
}

