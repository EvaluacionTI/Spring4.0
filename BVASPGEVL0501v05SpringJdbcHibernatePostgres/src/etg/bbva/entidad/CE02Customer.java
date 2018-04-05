package etg.bbva.entidad;

public class CE02Customer {
	long custId;
	String name;
	int age;

	public CE02Customer() {}
	
	public CE02Customer(long plId, String psName, int piAge) {
		this.custId = plId;
		this.name = psName;
		this.age=piAge;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [id = " + custId + ", name = " + name + ", age = " + age + "]"; 
	}
}
