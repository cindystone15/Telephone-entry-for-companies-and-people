
public class Company extends TelephoneEntry{
    private String name;

    public Company(String name, TelephoneNumber telephoneNumber, Address address){
        super(telephoneNumber, address);
        this.name = name;
    }

    public Address getAddress()
    {
        return address; 
    }
    public TelephoneNumber getNumber()
    {
        return telephoneNumber;
    }

    public String description() 
    {
    return "Company: " + name + ", Address: " + address.toString() + ", Phone number: " + telephoneNumber;
    }
    
}
