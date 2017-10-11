package model;

/**
 * Created by carlorizzante on 24/08/17.
 */
public class Order {

    // received | processing | completed
    private String status = "received";

    private static int ticketCounter = 0;
    private int ticket;
    private String customerName;
    private String instructions = "";
    private char comboID;
    private Double price = 10.0; // default price


    public Order(String name, char combo) {
        setTicket();
        this.customerName = name;
        this.comboID = combo;
        setPrice(combo);
    }


    // Getters
    public int getTicket() { return ticket; }
    public Double getPrice() { return price; }
    public char getCombo() { return comboID; }
    public String getCustomerName() { return customerName; }
    public String getInstructions() { return instructions; }
    public String getStatus() { return status; }


    // Printers
    public void printTicket() {}
    public void printReceipt() {}
    public void printStatus() {}
    public void printInstructions() {}


    // REQUIRES: none
    // MODIFIES: this
    // EFFECTS: Set ticket number for current order
    private void setTicket() {
        ticketCounter += 1;
        this.ticket = ticketCounter;
    }


    // REQUIRES: char for combo ID
    // MODIFIES: none
    // EFFECTS: Returns a price as Double depending by argument
    private void setPrice(char combo) {
        switch (comboID) {
            case 'A':
                price = 10.0;
                break;
            case 'B':
                price = 9.5;
                break;
            case 'C':
                price = 11.0;
                break;
            case 'D':
                price = 7.5;
                break;
            case 'E':
                price = 9.0;
                break;
            default :
                price = 10.0;
        }
    }


    // EFFECTS: returns this Order's combo letter
    public String getComboFood(){
        switch(getCombo()){
            case 'A': return "Salad";
            case 'B': return "Pasta";
            case 'C': return "Pizza";
            case 'D': return "Tacos";
            case 'E': return "Sandwich";
            default: return "Soup";
        }
    }


    // REQUIRES: String for instructions
    // MODIFIES: this
    // EFFECTS: Adds instructions for current order as simple string
    public void instructions(String instructions) {
        this.instructions = instructions;
    }


    // REQUIRES: none
    // MODIFIES: this
    // EFFECTS: Change status of current order to processing
    public void processing() {
        this.status = "processing";
    }


    // REQUIRES: none
    // MODIFIES: this
    // EFFECTS: Changes status of current order to complete
    public void completed() {
        this.status = "completed";
    }


    public boolean isProcessing() { return this.status == "processing"; }
    public boolean isCompleted() { return this.status == "completed"; }


}
