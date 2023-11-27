
public class Address{
    private String country;
    private String region;
    private String city;
    private String street;
    private String houseNumber;
    private String postcode;

    public Address(String country,String region, String city, 
                String street, String houseNumber,  String postcode)
    {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street; 
        this.houseNumber = houseNumber;
        this.postcode = postcode; 
        
    }

    @Override
    public String toString() {
    return "Country: " + country + ", Region: " + region + ", City: " + city +
           ", Street: " + street + ", House Number: " + houseNumber +
           ", Postcode: " + postcode;
    }



}
