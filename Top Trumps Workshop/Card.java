public class Card {
    private String name;
    private int age;
    public double speed;
    private int ram;

    public Card(String n, int a, double s, int r) {
        this.name = n;
        this.age = a;
        this.speed = s;
        this.ram = r;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getRam() {
        return this.ram;
    }
}