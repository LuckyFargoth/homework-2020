package homeworks.interfaces;

public class Bird implements Flyable, Runnable, Walkable, Swimmable {
    @Override
    public void fly() {
        System.out.println("High as a kite");
    }

    @Override
    public String sing() {
        return "weep-weep";
    }

    @Override
    public void run() {
        System.out.println("Running funny");
    }

    @Override
    public int maxRunDistance() {
        return 3;
    }

    @Override
    public void swim() {
        System.out.println("Dude, i'm a duck, deal with it");
    }

    @Override
    public double maxSwimSped() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Surf's up Mikey style");
    }
}
