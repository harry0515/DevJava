public class HelloWorld {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        HelloWorld test = new HelloWorld();
        test.pupAge();
    }
}