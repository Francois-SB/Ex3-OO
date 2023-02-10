/**
 * 
 * @author SupervielleF
 * @since 08/02/2023
 */
public class Capital extends City{
	//attributs
	private String monument;
	
	//constructeurs
	public Capital(String name, String country, int residentNumber, String monument) {
		super(name, country, residentNumber);
		this.monument = monument;
	}
	//get&set
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	public String toString() {
		return super.toString() + " Capital [monument=" + monument + "]";
	}
	
	
}
