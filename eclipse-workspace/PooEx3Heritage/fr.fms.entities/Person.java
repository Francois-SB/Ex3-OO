/**
 * @author FSUP
 * @since 08/02/2023
 * @param
 * @return
 * 
 */
public class Person {
	//attributs
//	private static int instanceCount = 0;
//	{ // Constructeur implicite
//		  instanceCount++;
//		}
	private String lastname;
	private String firstname;
	private int age;
	private String address;
	private City bornCity;
	//const
//	public Person() {
//		this("unknown", "unknown", 0, "unknown");
//	}
	public Person(String lastname, String firstname) {
		this.setLastname(lastname);
		this.setFirstname(firstname);
		this.setAge(0);
		this.setAddress("unknown");
	}
	public Person(String lastname, String firstname, int age) {
		this.setLastname(lastname);
		this.setFirstname(firstname);
		this.setAge(age);
		this.setAddress("unknown");
	}
	public Person(String lastname, String firstname, int age, String address, City bornCity) {
		this.setLastname(lastname);
		this.setFirstname(firstname);
		this.setAge(age);
		this.setAddress(address);
		//this.bornCity = new City();
		this.bornCity=bornCity;
	}
	
	//get&set
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public City getBornCity() {
		return bornCity;
	}
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}
	//Others
	@Override
	public String toString() {
		if (this.bornCity == null) {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", age=" + age + ", address=" + address
				+ "]Bornnull";
		}
		else
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", age=" + age + ", address=" + address
				+ "]BornCity " + this.bornCity.toString();
	}
	/**
	 * @return Array of persons born in a city 
	 */
//	bornIn(Person[] persons, City city){
//}
	/**
	 * @return boolean if person born in a city 
	 */
//	bornIn(Person person, City city){
//}
	// liveIn(){
//}
	//
	
}
