package homeworks.interfaces;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Like a fish in the water boi");
    }

    @Override
    public double maxSwimSped() {
        return 56;
    }
}
