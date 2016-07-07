package randomstring;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Main {
    public static void main(String[] args) {
        PasswordMaker password = new PasswordMaker();
        password.setAge(20);
        password.setFirstName("Ana");
        password.setLastName("Brown");
        System.out.println(password.getPassword());

    }
}
