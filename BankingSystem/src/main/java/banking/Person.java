package banking;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		this.firstName = firstName;
    this.lastName = lastName;
    AccountHolder(idNumber);
	}


	public String getFirstName() {
        return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
}
