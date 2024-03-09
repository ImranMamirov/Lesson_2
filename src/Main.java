public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sit", "Run"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Dog dog = new Dog("Reks", "Senbernar", commands, ColorEnum.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гав гав");

        Shelter shelter1 = new Shelter("Animal", "Lermontova 1");
        Dog dog1 = new Dog("Klaus", "Pitbool", ColorEnum.GRAY, shelter1);
        System.out.println(dog1.getInfo1());
        dog1.makeVoice();
        dog1.makeVoice("Гав гав");
    }
}