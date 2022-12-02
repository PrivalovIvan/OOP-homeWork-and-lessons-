public class Dog extends Animal implements SpeakAble, RunAble {

    public Dog(String nickname, String breed, String colour, int numberOfPaws, int age) {
        super(nickname, breed, colour, numberOfPaws, age);
    }

    @Override
    public String speak() {
        return "vaf";
    }

    @Override
    public String run() {
        return "20 км/ч";
    }

}
