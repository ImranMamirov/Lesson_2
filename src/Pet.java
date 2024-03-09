import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }

    public String getInfo() {
        return "Age: " + age +
                "\n Color: " + colorEnum +
                "\nShelter address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }

    public String getInfo1() {
        return "Age: " + age +
                "\n Color: " + colorEnum +
                "\nShelter address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
