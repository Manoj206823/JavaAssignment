package project1;

public class Instrument extends Object{
	
	// instance variable
    private String name;
    
    // Constructor
    public Instrument() {
        super();
        this.name = "No Name Yet";
    }
    
    // non-static methods
    // mutator method
    public void setName(String newName) {
        this.name = newName;
    }
    
    // accessor method
    public String getName() {
        return this.name;
    }
    
    // toString() method
    public String toString() {
        return "Name: " + this.getName();
    }
    
    // equals() method
    public boolean equals(Object otherObject) {
        if(otherObject instanceof Instrument) {
            // typecasting otherObject into Instrument object
            Instrument instrument = (Instrument) otherObject;
            if(instrument.getName().equals(this.getName())) {
                return true;
            }
        }
        
        return false;
    }

}
