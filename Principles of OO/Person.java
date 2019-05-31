public class Person {
    private String name = "John Doe";
    private int age = 0;

    public static void main(String args[]) {
        Person george = new Person();
        System.out.println("Hello "+ george.getName());
        george.changeName("George");
        george.birthday();
        System.out.println("Hello "+ george.getName());

        System.out.println("\n-------------------\n");

        Person evilTwin = new Person();
        System.out.println("Hello "+ evilTwin.getName());
        evilTwin.changeName("Egroeg");
        System.out.println("Hello "+ evilTwin.getName());
        evilTwin.changeAge(19);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void changeName(String newName) {
        name = newName;
        System.out.println("Name changed to: " + name);
    }

    public void changeAge(int newAge) {
        age = newAge;
        System.out.println("Age changed to: " + age);
    }

    public void birthday() {
        this.age++;
        System.out.println("Happy "+ this.age +"th Birthday!");
    }

}