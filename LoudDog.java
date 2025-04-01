public class LoudDog extends Dog {
    public LoudDog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return super.speak() + " " + super.speak(); // LoudDog repeats the dog's speech
    }

    @Override
    public String toString() {
        return "LoudDog: " + super.getName();
    }
}
