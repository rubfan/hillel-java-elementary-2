package Rocket.Entity;

public class RocketEngine {

    private String name;
    private boolean on = false;

    public RocketEngine(String name) {
        this.name = name;
    }

    public void turnOnEngine(){
        on = true;
    }

    public void turnOffEngine(){
        on = false;
    }

    @Override
    public String toString() {
        return "RocketEngine{" +
                "name='" + name + '\'' +
                '}';
    }
}
