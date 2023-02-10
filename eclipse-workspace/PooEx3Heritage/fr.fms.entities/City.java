/**
 * 
 * @author SupervielleF
 * @since 08/02/2023
 */
public class City {
	//attributs
private String name;
private String country;
private int residentNumber;

private static int instanceCount = 0;
{ // Constructeur implicite
	  instanceCount++;
	}
	//constructeurs
public City(String name, String country, int residentNumber) {
	this.setName(name);
	this.setCountry(country);
	this.setResidentNumber(residentNumber);
}
//2//
public City(String name, String country) {
	this.setName(name);
	this.setCountry(country);
	this.setResidentNumber(0);
}
//2//
	//1.3//
public City(String name, int residentNumber) {
	this.setName(name);
	this.setCountry("unknown");
	this.setResidentNumber(residentNumber);
}
	//1.3//
public City() {
	this("unknown","unknown",0);
}

//get&set
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getResidentNumber() {
	return residentNumber;
}
public void setResidentNumber(int residentNumber) {
	if (residentNumber<0)
		throw new RuntimeException("nombre de résidents negatif pas posssible");
	this.residentNumber = residentNumber;
}
//1.7//
public static int getNumberOfInstances() {
	return instanceCount;
}
//1.7//

//other
@Override
//public String toString() {
//	return "[ville : "+ name +"] [pays : " + country + "] [nombre d'habitants : " + residentNumber +"]";//[name=" + name + ", country=" + country + ", residentNumber=" + residentNumber + "]"
//}
public String toString() {
	return "[name="+ name +", state=" + country + ", residentNumber=" + residentNumber +"]";//[name=" + name + ", country=" + country + ", residentNumber=" + residentNumber + "]"
}
//1.6//
//public String toString() {
//	return "ville de " + name + " en " + country + " ayant " + residentNumber;
//}
//1.6//

//1.4//
public void display() {
	System.out.println("ville de " + name + " en " + country + " ayant " + residentNumber);
}
//1.4//
public int addResident(int numberResidentAdded) {
	if (numberResidentAdded<0)
		throw new RuntimeException("neg not possible");
		return residentNumber+=numberResidentAdded;
	
	}
}