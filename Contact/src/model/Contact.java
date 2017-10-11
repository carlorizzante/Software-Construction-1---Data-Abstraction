package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 25/08/17.
 */
public class Contact {

    // Fields
    private String name;
    private String number;
    private ContactType type;
    private List<String> callLog;

    // Constructor
    public Contact(String name, String number, ContactType type) {
        this.name = name;
        this.number = number;
        this.type = type;
        callLog = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public String getNumber() { return number; }
    public ContactType getType() { return type; }
    public List<String> getCallLog() { return callLog; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setNumber(String number) { this.number = number; }
    public void setType(ContactType type) { this.type = type; }


}
