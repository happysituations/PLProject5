package cannata;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String userId;
    private int start;
    private String comments;
    private String title;
    private int salary;
    private int commission;
    private int dept;
    private int manage;


    public static class Builder{

        private int id = 0;
        private String firstName = "";
        private String lastName = "";
        private String userId = "";
        private int start = 0;
        private String comments = "";
        private String title = "";
        private int salary = 0;
        private int commission = 0;
        private int dept = 0;
        private int manage= 0;

        public Person.Builder id(int id){this.id = id;return this;}
        public Person.Builder firstName(String firstName){this.firstName = firstName;return this;}
        public Person.Builder lastName(String lastName){this.lastName = lastName;return this;}
        public Person.Builder userId(String userId){this.userId = userId;return this;}
        public Person.Builder start(int start){this.start = start;return this;}
        public Person.Builder comments(String comments){this.comments = comments; return this;}
        public Person.Builder title(String title){this.title= title;return this;}
        public Person.Builder salary(int salary){this.salary = salary;return this;}
        public Person.Builder commission(int commission){this.commission = commission;return this;}
        public Person.Builder dept(int dept){this.dept = dept;return this;}
        public Person.Builder manage(int manage){this.manage = manage ;return this;}




        public Person build(){return new Person(this);}
    }

    private Person(){super();}

    private Person(Person.Builder builder){

        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        userId = builder.userId;
        start = builder.start;
        comments = builder.comments;
        title = builder.title;
        salary = builder.salary;
        commission = builder.commission;
        dept = builder.dept;
        manage = builder.manage;

    }

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getUserId(){return userId;}
    public int getStart(){return start;}
    public String getComments(){return comments;}
    public String getTitle(){return title;}
    public int getSalary(){return salary;}
    public int getCommission(){return commission;}
    public int getDept(){return dept;}
    public int getManage(){return manage;}

    public void print(){
        System.out.println(
                "\n" +
                        "ID: "+ id + "\n"+
                        "Name: " + firstName + " " + lastName + "\n" +
                        "User ID: " + userId + "\n" +
                        "Start Date: " + start + "\n" +
                        "Comments: " + comments + "\n" +
                        "Title: " + title + "\n" +
                        "Salary: " + salary + "\n" +
                        "Commission: " + commission + "\n" +
                        "Dept ID: " + dept + "\n" +
                        "Manager ID: " + manage + "\n"
        );
    }

    @Override
    public String toString(){
        return "ID: " + id + " " + "\n" + "Name: " + firstName + " " + lastName + "\n" + "User ID: " + userId + "\n" +
                "Start Date: " + start + "\n" +
                "Comments: " + comments + "\n" +
                "Title: " + title + "\n" +
                "Salary: " + salary + "\n" +
                "Commission: " + commission + "\n" +
                "Dept ID: " + dept + "\n" +
                "Manager ID: " + manage + "\n";
    }
/*
    public static List<Person> createShortList(){
        List<Person> people = new ArrayList<>();

        people.add(
                new Person.Builder()
                        .givenName("Bob")
                        .surName("Baker")
                        .age(21)
                        .gender(Gender.MALE)
                        .email("bob.baker@example.com")
                        .phoneNumber("201-121-4678")
                        .address("44 4th St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Jane")
                        .surName("Doe")
                        .age(25)
                        .gender(Gender.FEMALE)
                        .email("jane.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("John")
                        .surName("Doe")
                        .age(25)
                        .gender(Gender.MALE)
                        .email("john.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("James")
                        .surName("Johnson")
                        .age(45)
                        .gender(Gender.MALE)
                        .email("james.johnson@example.com")
                        .phoneNumber("333-456-1233")
                        .address("201 2nd St, New York, NY 12111")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Joe")
                        .surName("Bailey")
                        .age(67)
                        .gender(Gender.MALE)
                        .email("joebob.bailey@example.com")
                        .phoneNumber("112-111-1111")
                        .address("111 1st St, Town, CA 11111")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Phil")
                        .surName("Smith")
                        .age(55)
                        .gender(Gender.MALE)
                        .email("phil.smith@examp;e.com")
                        .phoneNumber("222-33-1234")
                        .address("22 2nd St, New Park, CO 222333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Betty")
                        .surName("Jones")
                        .age(85)
                        .gender(Gender.FEMALE)
                        .email("betty.jones@example.com")
                        .phoneNumber("211-33-1234")
                        .address("22 4th St, New Park, CO 222333")
                        .build()
        );


        return people;
    }
*/

}
