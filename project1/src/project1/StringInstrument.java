package project1;

public class StringInstrument extends Instrument{
	// instance variables
    private int numberOfStrings;
    private String[] stringArray;
    
    private static int maximumNumberOfStrings = 4;
    
    // constructor
    public StringInstrument() {
        super();
        this.numberOfStrings = 0;
        this.stringArray = new String[maximumNumberOfStrings];
    }
    
    // non-static methods
    // mutator method
    public void addString(String newString) {
        if(this.numberOfStrings < this.stringArray.length) {
            this.stringArray[this.numberOfStrings] = newString;
            this.numberOfStrings++;
        }
    }
    
    // accessors
    public String getStrings() {
        String singleString = "";
        for(int i=0; i<this.stringArray.length; i++) {
            singleString += this.stringArray[i];
        }
        return singleString;
    }
    
    
    // static methods
    public static int getMaximumNumberOfStrings() {
        return maximumNumberOfStrings;
    }
    
    public static void increaseMaximumNumberOfStrings(int newMaximumNumberOfStrings) {
        if(newMaximumNumberOfStrings > getMaximumNumberOfStrings())
            maximumNumberOfStrings = newMaximumNumberOfStrings;
    }
    
    // toString() method
    public String toString() {
        return super.toString() + " Strings: " + this.getStrings();
    }
    

}
