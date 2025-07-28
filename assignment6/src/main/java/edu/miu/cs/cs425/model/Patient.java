package edu.miu.cs.cs425.model;

/**
 * Problem Description and Tasks:
 * Assume you have been employed as a Software Engineer to
 * develop a Patients-Appointments booking and management
 * CLI application for a hospital. The application will be used to
 * register new Patients who are requesting to receive medical
 * care, including the Patient’s First Name, Last Name, Contact
 * Phone Number, Email, Mailing Address and Date of Birth.
 * For the purpose of this lab assignment, simply create a CLI
 * application project that uses Maven or Gradle. Add a class
 * named, Patient, including the necessary data fields
 * (attributes) as specified above. Make appropriate use of
 * packages (or namespaces or modules to properly organize
 * your code). In an executable class named, PAMSApp, in the
 * main method, add code to simply create an array of Patient
 * objects (using the data given below).
 */
public class Patient {
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private String dateOfBirth;

    public Patient(String firstName, String lastName, String contactPhoneNumber, String email, String mailingAddress, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
