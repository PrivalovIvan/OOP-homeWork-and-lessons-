public class Shark extends Animal implements SwimmingAble {

    public Shark(String nickname, String breed, String colour, int numberOfPaws, int age) {
        super(nickname, breed, colour, numberOfPaws, age);
    }

    @Override
    public String SpeedSwimmig() {
        return "100 км/ч";
    }

}
