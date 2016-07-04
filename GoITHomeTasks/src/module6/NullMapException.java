package module6;

public class NullMapException extends Exception {

	public NullMapException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String nameNullInstruments;

	public String getNameNullInstruments() {
		return nameNullInstruments;
	}

	public NullMapException(String nameNullInstruments) {
		super();
		this.nameNullInstruments = nameNullInstruments;
	}
	
	
    
}
