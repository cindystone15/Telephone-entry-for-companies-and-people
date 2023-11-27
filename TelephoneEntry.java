public abstract class TelephoneEntry{

    protected TelephoneNumber telephoneNumber;
    protected Address address;

    public abstract Address getAddress();
    public abstract TelephoneNumber getNumber();
    public abstract String description();


    public TelephoneEntry(TelephoneNumber telephoneNumber, Address address){
        this.telephoneNumber = telephoneNumber;
        this.address = address;
    }

    public int compareTo(TelephoneEntry other){
        return this.telephoneNumber.compareTo(other.telephoneNumber);
    }
}