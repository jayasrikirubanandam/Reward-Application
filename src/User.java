import java.util.Arrays;
import java.util.List;

public class User
{
    private int userId;
    private String userName;
    private String userPassword;
    private int userPoints =0;
    public  static List<User> listOfUsers;
    public User() {
    }

    public User(int userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                 +
                '}';
    }

    public void initialiseUsers() {

                listOfUsers = Arrays.asList(
                new User(101, "Jayasri", "j#8132B!"),
                new User(102, "Raja", "PO321K#"),
                new User(103, "Srinath", "H81!9*"),
                new User(104, "Andhuvan", "AD123@" ),
                new User(105, "Lakshan", "L90$HK")

        );

        for( User user : listOfUsers)
        {
            System.out.println(user.toString());
        }
    }

    public void redeemPoints(){

    }

}
