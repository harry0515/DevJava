package pack;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }


    public static void main(String args[]) {
        Person karthik1 = new Person("karthik",25,"florida");
        Person Hari1 = new Person("Hariprasad",25,"sanjose");
        System.out.println(karthik1.getName());
        System.out.println(karthik1.getAge());
        System.out.println(Hari1.getName());
        karthik1.setAge(30);
        System.out.println(karthik1.getAge());

    }
}