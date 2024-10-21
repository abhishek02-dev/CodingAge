package Java_3rdPractise_Set;

public class UserAccount {
    private String userName;
    private String email;
    private String password;

    public UserAccount(String userName,String email,String password){
        this.userName=userName;
        this.email=email;
        this.password=password;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userName='" + userName + '\''+" " + "email= "+email+
                '}';
    }

    void details(){

    }

    public static void main(String[] args) {
        UserAccount userAccount= new UserAccount("Abhisek","abhi@2345","devanshu02");
        System.out.println(userAccount);
    }
}
