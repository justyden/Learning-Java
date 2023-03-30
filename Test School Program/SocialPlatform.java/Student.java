public class Student extends Person {
    private Contact contact;
    private Contact guardianContact;
    private Contact emergancyContact;

    private Course[] enrolledCourses;

    private Grades grade;

    private Address currentAddress;

    Student() {
        Account account = new Account();
    }

    Student(String inputUserName, String inputPassword) {
        Account account = new Account(inputUserName, inputPassword);
    }

    Student(String inputUserName, String inputPassword, String inputName, int inputId, int inputAge, int inputYear) {
        Account account = new Account(inputUserName, inputPassword);
        name = inputName;
        id = inputId;
        age = inputAge;
        year = inputYear;
    }

    public void addEmergencyContact(Contact inputContact) {
        emergancyContact = inputContact;
    }
}
