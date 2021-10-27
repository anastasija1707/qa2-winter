package objects;

public class Student {
    //----(atributi objekta)ATTRIBUTES----
    //atributi studenta (imja, familija, email, vozrast) eto peremennije
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;

    //----CONSTRUCTOR-----
    //vsegda public, nikogda nichego ne vozvaschaet u nego srazu idjot nazvanije, bez void i t.d., on vsegda budet nazivatsa kak nazivaetsa klass, vsjo vipolnjaetsa prinuditelno v moment sozdanija kopiji klassa)
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //----(vozvraschatj znachenije i shto to klatj, poluchennuju info v peremennuju)GETTERS/SETTERS----
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPhone(long phone) {
        this.phone = String.valueOf(phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //----CUSTOM METHODS (ili funkciji)----

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
