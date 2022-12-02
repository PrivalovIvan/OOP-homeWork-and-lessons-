import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    Zoo() {
        animals = new ArrayList<>(
                Arrays.asList(new Cat("Holio", "seamease", "red", 4, 10),
                        new Dog("Perdolio", "PitBull", "Blackowhite", 4, 7),
                        new Fish("Nemo", "Gold Fish", "Gold", 0, 2),
                        new Duck("Donald", "AngryBird", "White", 4, 3),
                        new Shark("Killer Machinе", "Shark", "Grey", 2, 20)));
    }

    void talk() {
        System.out.println("=============TALK============");
        for (int i = 0; i < gSpeakAbles().size(); i++) {
            System.out.printf("%s Говорит: %s\n", gSpeakAbles().get(i).toString(),
                    gSpeakAbles().get(i).speak());
        }
    }

    void runs() {
        System.out.println("=============RUN============");
        for (int i = 0; i < gRunAbles().size(); i++) {
            System.out.printf("%s Скорость бега:%s\n",
                    gRunAbles().get(i).toString(), gRunAbles().get(i).run());
        }
    }

    void fly() {
        System.out.println("=============FLY============");
        for (int i = 0; i < gFlyAbles().size(); i++) {
            System.out.printf("%s Скорость полета: %s\n",
                    gFlyAbles().get(i).toString(), gFlyAbles().get(i).fly());
        }
    }

    void swimming() {
        System.out.println("=============SWIMMING============");
        for (int i = 0; i < gSwimmingAbles().size(); i++) {
            System.out.printf("%s Скорость плавания: %s\n",
                    gSwimmingAbles().get(i).toString(),
                    gSwimmingAbles().get(i).SpeedSwimmig());
        }
    }
    // void talk() {
    // for (int i = 0; i < animals.size(); i++) {
    // System.out.printf("%s : %s\n", animals.get(i).getNickname(),
    // animals.get(i).speak());
    // }
    // }

    public List<SpeakAble> gSpeakAbles() {
        List<SpeakAble> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof SpeakAble) {
                result.add((SpeakAble) item);
            }

        }
        // result.add(new Radio());
        return result;
    }

    public List<RunAble> gRunAbles() {
        List<RunAble> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof RunAble) {
                result.add((RunAble) item);
            }
        }
        return result;
    }

    public List<FlyAble> gFlyAbles() {
        List<FlyAble> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof FlyAble) {
                result.add((FlyAble) item);
            }
        }
        return result;
    }

    public List<SwimmingAble> gSwimmingAbles() {
        List<SwimmingAble> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof SwimmingAble) {
                result.add((SwimmingAble) item);
            }
        }
        return result;

    }

    public void infoAnimals() {
        runs();
        talk();
        fly();
        swimming();
    }
}
