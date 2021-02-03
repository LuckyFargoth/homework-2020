package homeworks.interfaces;

public class Cat implements Walkable, Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Pursuing a mouse!");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public void swim() {
        System.out.println("Damn, man, that's the last time");
    }

    @Override
    public double maxSwimSped() {
        return 4;
    }

    @Override
    public void walk() {
        System.out.println("Imposing walking");
    }
}
