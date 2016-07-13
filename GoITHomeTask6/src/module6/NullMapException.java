package module6;

public class NullMapException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String nameNullInstruments;

	public String getNameNullInstruments() {
		return nameNullInstruments;
	}

	public NullMapException(String nameNullInstruments) {
		super();
		this.nameNullInstruments = nameNullInstruments;
	}
	
	
    
}
