package module6;

public abstract class MusicalInstrument {
	public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{"+getType()+"}";
    } 

}
