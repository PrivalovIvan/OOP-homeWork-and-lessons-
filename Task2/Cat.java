public class Cat extends Animal implements SpeakAble, RunAble {

    public Cat(String nickname, String breed, String colour, int numberOfPaws, int age) {
        super(nickname, breed, colour, numberOfPaws, age);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String run() {
        return "15 км/ч";
    }

}
