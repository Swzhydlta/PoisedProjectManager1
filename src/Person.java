public class Person {

//    Attributes
    String name;
    String contactNumber;
    String email;
    String address;

//    Methods
    public Person(String name, String contactNumber, String email,
                  String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }
    public String toString() {
        String output = "Name: " + name;
        output += "\nContact:" + contactNumber;
        output += "\nemail:" + email;
        output += "\naddress" + address;

        return output;
    }
}
