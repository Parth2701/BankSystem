package banking;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		this.companyName = companyName;
    AccountHolder(taxId);
	}

	public String getCompanyName() {
        return this.companyName;
	}
}
