package randomstring;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class PasswordMaker {

    RandomStringGenerator magic = new RandomStringGenerator(20,"abcdefghijklmnopqrst");
    private final int MAGIC_NUMBER = 10;
    private final String MAGIC_STRING = magic.next();
    private String firstName;
    private String lastName;
    private int age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPassword(){

        String first = firstName.substring(age%3);
        RandomStringGenerator alphabet = new RandomStringGenerator(10,MAGIC_STRING);
        RandomStringGenerator second = new RandomStringGenerator(MAGIC_NUMBER,alphabet.next());
        int third = age + lastName.length();
        String theFinal = first + second.next() + third;

        return theFinal;
    }
}
