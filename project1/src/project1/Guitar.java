package project1;

public class Guitar extends StringInstrument{
	
	// instance variable
    private String stringType;
    
    private static int maximumNumberOfGuitarStrings = 6;
    
    // constructor
    public Guitar() {
        super();
        this.stringType = "Not Yet Set";
    }
    
    // non-static methods
    // mutator
    public void setStringType(String newStringType) {
        this.stringType = newStringType;
    }
    
    // accessor method
    public String getStringType() {
        return this.stringType;
    }
    
    public static int getMaximumNumberOfGuitarStrings() {
        return maximumNumberOfGuitarStrings;
    }
    
    // toString() method
    public String toString() {
        return super.toString() + " StringType: " + this.getStringType();
    }
    
    // equals() method
    public boolean equals(Object otherObject) {
        if(otherObject instanceof Guitar) {
            // typecasting otherObject into Guitar object
            Guitar guitar = (Guitar) otherObject;
            
            // comparing name
            if(guitar.getName().equals(this.getName())){
                // comparing strings
                if(guitar.getStrings().equals(this.getStrings())) 
                    // comparing stringtype
                    if(guitar.getStringType().equals(this.getStringType()))
                        return true;
            }
        }
        
        return false;
    }

}
