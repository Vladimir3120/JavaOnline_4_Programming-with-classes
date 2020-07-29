package Simpleclass08;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private int numberOfCreditCrd;
	private int bankAccauntNumber;

	public Customer() {
		super();
	}

	public Customer(int id, String surname, String name, String middleName, String address, int numberOfCreditCrd,
			int bankAccauntNumber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.numberOfCreditCrd = numberOfCreditCrd;
		this.bankAccauntNumber = bankAccauntNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfCreditCrd() {
		return numberOfCreditCrd;
	}

	public void setNumberOfCreditCrd(int numberOfCreditCrd) {
		this.numberOfCreditCrd = numberOfCreditCrd;
	}

	public int getBankAccauntNumber() {
		return bankAccauntNumber;
	}

	public void setBankAccauntNumber(int bankAccauntNumber) {
		this.bankAccauntNumber = bankAccauntNumber;
	}

	@Override
	public String toString() {
		return "Customer id = " + id + ", " + surname + ", " + name + ", " + middleName + ", " + address
				+ ", numberOfCard = " + numberOfCreditCrd + ", bankAccauntNumber = " + bankAccauntNumber;
	}

}
