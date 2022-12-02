public class Duck extends Animal implements SpeakAble, RunAble, FlyAble {

    public Duck(String nickname, String breed, String colour, int numberOfPaws, int age) {
        super(nickname, breed, colour, numberOfPaws, age);
    }

    @Override
    public String run() {
        return "10 km/h";
    }

    @Override
    public String speak() {
        return "Кря";
    }

    @Override
    public String fly() {
        return "20 км/ч";
    }

}
