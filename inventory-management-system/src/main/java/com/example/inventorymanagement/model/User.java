import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    @Column(name = "email", nullable = false, unique = true, length = 45)
    private String userEmail;

    @Column(name = "address", length = 105)
    private String address;

    public User() {}

    public User(String userName, String firstName, String lastName, String contactNumber, String email, String address) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.userEmail = email;
        this.address = address;
    }

    public Long getUserID() { return userID; }
    public void setUserID(Long userID) { this.userID = userID; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getEmail() { return userEmail; }
    public void setEmail(String userEmail) { this.userEmail = userEmail; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
