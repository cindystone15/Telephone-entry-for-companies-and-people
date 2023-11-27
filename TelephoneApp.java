import java.util.*;

public class TelephoneApp{
    
    public static void main(String[] args){
        TreeMap<TelephoneNumber, TelephoneEntry> directory = new TreeMap<>();

        //123 - street number, 54321 - post code
        Address cindyAddress = new Address("Country", "Region", "City", "Street", "123", "54-321");
        Address farahAddress = new Address("Poland", "Lodzkie", " Lodz", "candies", "13", "60-902");
        Address philipsAddress = new Address("Oman", "South", " Muscat", "mina al fahal", "2", "930");
        Address saturnAddress = new Address("Canada", "Canadian", " kanada", "Piotr", "8", "12-305");

        Person Cindy = new Person("Cindy", "Freestone", new TelephoneNumber("49", "99999121"), cindyAddress);
        Person Farah = new Person("Farah", "Patzelt", new TelephoneNumber("88", "246534"), farahAddress);
        Company Philips = new Company("Philips", new TelephoneNumber("48", "99999121"), philipsAddress); 
        Company Saturn = new Company("Saturn", new TelephoneNumber("55", "3434534"), saturnAddress);

        directory.put(Cindy.telephoneNumber, Cindy);
        directory.put(Farah.telephoneNumber, Farah); 
        directory.put(Philips.telephoneNumber, Philips);
        directory.put(Saturn.telephoneNumber, Saturn);

        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = directory.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<TelephoneNumber, TelephoneEntry> entry = iterator.next();
            System.out.println(entry.getValue().description());
        }

    }
}

// commands : 
    // javac *.java
    // java TelephoneApp