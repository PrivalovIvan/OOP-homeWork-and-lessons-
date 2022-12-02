public class Fish extends Animal implements SwimmingAble {

    public Fish(String nickname, String breed, String colour, int numberOfPaws, int age) {
        super(nickname, breed, colour, numberOfPaws, age);
    }

    @Override
    public String SpeedSwimmig() {
        return "30 км/ч";
    }

}
