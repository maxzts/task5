package academy.belhard.entity;

public class User extends Person {


    private String email;
    private String password;

    public User (String firstName, String lastName, String email, String password){
        super (firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo(){
        System.out.println("Name: " + super.getFullName() + "\n" + "E-mail: " + email);
        return email;
    }

    public boolean isPasswordCorrect(String password){
        System.out.println("The password matches the user's password: " + this.password.equals(password));
        return true;
    }


}
