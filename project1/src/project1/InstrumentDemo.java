package project1;

public class InstrumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] instrumentArray = new Instrument[5];
        
        Instrument mySaxophone = new Instrument();
        mySaxophone.setName("Saxophone");
        
        StringInstrument myViolin = new StringInstrument();
        myViolin.setName("Violin");
        myViolin.addString("G");
        myViolin.addString("D");
        myViolin.addString("A");
        myViolin.addString("E");
        
        int guitarStrings = Guitar.getMaximumNumberOfGuitarStrings();
        
        StringInstrument.increaseMaximumNumberOfStrings(guitarStrings);
        
        Guitar myGuitar = new Guitar();
        myGuitar.setName("Guitar");
        myGuitar.addString("E");
        myGuitar.addString("A");
        myGuitar.addString("D");
        myGuitar.addString("G");
        myGuitar.addString("B");
        myGuitar.addString("E");
        myGuitar.setStringType("nylon");
        
        instrumentArray[0] = mySaxophone;
        instrumentArray[1] = myViolin;
        instrumentArray[2] = myGuitar;
        
        Guitar myGuitar2 = new Guitar();
        myGuitar2.setName("Guitar");
        myGuitar2.addString("E");
        myGuitar2.addString("A");
        myGuitar2.addString("D");
        myGuitar2.addString("G");
        myGuitar2.addString("B");
        myGuitar2.addString("E");
        myGuitar2.setStringType("nylon");
        
        if(myGuitar2.equals(myGuitar))
        {
           System.out.println("They are the same"); 
        }
        
        System.out.println();
        
        for(int i=0; i<3; i++) {
            System.out.println(instrumentArray[i].toString());
        }
        
	}

}
