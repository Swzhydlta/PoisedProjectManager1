public class Project {
//    Attributes
    int projectNumber;
    String projectName;
    String buildingType;
    String address;
    int erfNumber;
    long projectFee;
    long amountPaid;
    String deadline;
    String finalized;
    Person architect;
    Person contractor;
    Person customer;

//    Methods
    public Project(int projectNumber, String projectName, String buildingType,
                   String address, int erfNumber, long projectFee,
                   long amountPaid, String deadline, String finalized,
                   Person architect, Person contractor, Person customer) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.address = address;
        this.erfNumber = erfNumber;
        this.projectFee = projectFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.finalized = finalized;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;a
    }
    public String toString() {
        String output = "Project number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding type: " + buildingType;
        output += "\nAddress: " + address;
        output += "\nERF number: " + erfNumber;
        output += "\nProject fee: " + projectFee;
        output += "\nAmount paid: " + amountPaid;
        output += "\nDeadline: " + deadline;
        output += "\nFinalized: " + finalized;
        output += "\nContractor: " + contractor.name + ", " + contractor.contactNumber +
                ", " + contractor.email + ", " + contractor.address;

        return output;
    }
}
