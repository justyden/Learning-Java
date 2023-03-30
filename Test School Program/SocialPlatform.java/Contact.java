public class Contact {
    private String contactName = "";
    private String contactNumber = "";

    Contact() {
        contactName = "";
        contactNumber = "";
    }

    Contact(String contactName, String contantNumber) {
        this.contactName = contactName;
        this.contactNumber = contantNumber;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
}
