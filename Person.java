
public class Person extends TelephoneEntry{
    private String name;
    private String lastName;
   
    //TelephoneNumber
    Person(String name, String lastName, TelephoneNumber telephoneNumber, Address newAddress) {
        super(telephoneNumber, newAddress);
        this.name = name;
        this.lastName = lastName;
    }

    public Address getAddress(){
        return address; 
    }
    public TelephoneNumber getNumber()
    {
        return telephoneNumber;
    }

    public void setAddress(String country,String region, String city, String street, String houseNumber,  String postcode)
    {
        address = new Address(country, region, city, street, houseNumber, postcode);
    }
    //DELETE COMPARTO

    public String description(){
        return "Person: " + name + " " + lastName + ", Address: " + address + ", Phone Number: " + telephoneNumber; 
    }
}
