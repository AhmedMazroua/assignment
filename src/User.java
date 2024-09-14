public class User {

    public static void main(String[] args) {
        User batman = new User("Bruce", "Wayne", "bwayne@dc.com", "IamBatman#3");
        User superman = new User("kal-El", "Kent", "kkent@dc.com", "Kryptonite#1");

        superman.setFirstName("clark");
        System.out.println(superman.getFirstName());

        batman.setPassword("DarkKnight#1");
        System.out.println(batman.getPassword());


    }
   private String firstName;
   private String lastName;
    private String email;
    private String password;

    private User(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName(){
        return firstName;
    }

    public String setFirstName(String name){
        return firstName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public String setLastName(String name){
        return lastName = name;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String address){
        return email = address;
    }

    public String getPassword(){
        return password;
    }
    public String setPassword(String pass){
        return password = pass;
    }

}
