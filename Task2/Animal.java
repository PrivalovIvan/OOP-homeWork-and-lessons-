// Реализовать абстрактный класс Animal и его наследники Cat,Dog,и прочее.
// Родитель имеет в себе общие данные(пример:кличка,количествор лап,какие звуки
// издают и тд),а наследники собственные параметры(тип перемещения).
abstract class Animal {
    protected String nickname;
    protected String breed;
    protected String colour;
    protected int numberOfPaws;
    protected int age;

    public Animal(String nickname, String breed, String colour, int numberOfPaws, int age) {
        this.nickname = nickname;
        this.breed = breed;
        this.colour = colour;
        this.numberOfPaws = numberOfPaws;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s Breed: %s,", this.getNickname(), this.getBreed());
    }
}
