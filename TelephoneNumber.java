
public class TelephoneNumber implements Comparable<TelephoneNumber> {
    private String countryCode;
    private String localNumber;

    public TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public String getCountryCode() 
    {
        return countryCode;
    }

    public String getLocalNumber()
    {
        return localNumber; 
    }

    @Override
    public int compareTo(TelephoneNumber other) {

        int counrtyCodeCompare = this.countryCode.compareTo(other.countryCode);

        if(counrtyCodeCompare == 0){
            return this.localNumber.compareTo(other.localNumber);
        }   
        else{
            return counrtyCodeCompare;
        }
            
    }
    
    //compare countrycode 
    @Override
    public String toString() {
        return "+" + countryCode + " " + localNumber;
    }
}
