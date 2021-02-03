package homeworks.interfaces;

public class Man implements Walkable, Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public double maxSwimSped() {
        return 4;
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }

}
