package academy.belhard;


import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Maxim", "Zayats", "maxim.zayats2@gmail.com", "4616538a");
        user1.getFullInfo();
        user1.isPasswordCorrect("4616538");





    }
}
