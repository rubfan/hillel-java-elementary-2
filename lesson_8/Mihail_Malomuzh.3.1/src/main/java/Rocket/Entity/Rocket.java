package Rocket.Entity;

public class Rocket {
    private String tm;
    private RocketEngine engine;
    double speed;
    double acceleration;
    double thetaDirection;
    double phiDirection;
    double[] position = new double[3];
    double trajectoryLength;
    boolean moving = false;
    private Thread ax = null;

    public Rocket(String tm, RocketEngine engine) {
        this.tm = tm;
        this.engine = engine;
    }

    public void start(){
        if ((ax != null) && (ax.isAlive())) return;
        engine.turnOnEngine();
        moving = true;
        ax = new RocketFlyThread(this);
        ax.setDaemon(true);
        ax.start();
    }

    public void stop(){
        engine.turnOffEngine();
        acceleration = 0;
        speed = 0; // rubbish!!!
        moving = false;
        ax = null;
    }

    public void setAcceleration(double acceleration) {
        if (moving)
            this.acceleration = acceleration;
    }

    public void setThetaDirection(double thetaDirection) {
        this.thetaDirection = thetaDirection;
    }

    public void setPhiDirection(double phiDirection) {
        this.phiDirection = phiDirection;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "tm='" + tm + '\'' +
                "; Engine= " + engine +
                "; speed=" + String.format("%.2f", speed) +
                "; acceleration=" + String.format("%.2f", acceleration) +
                "; thetaDirection=" + String.format("%.2f", thetaDirection) +
                "; phiDirection=" + String.format("%.2f",phiDirection) +
                "; position (" + String.format("x = %.2f", position[0]) + String.format(" y = %.2f", position[1]) +
                                 String.format(" z = %.2f", position[2]) + ")" +
                "; trajectoryLength=" + String.format("%.2f", trajectoryLength)+
                "; moving=" + moving +
                '}';
    }
}



class RocketFlyThread extends Thread {
    private  Rocket rocket;
    private final int t = 100;

    public RocketFlyThread(Rocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public void run() {
        try {
            while (rocket.moving) {
                rocket.speed = rocket.speed + rocket.acceleration * t / 1000;
                rocket.trajectoryLength = rocket.trajectoryLength + rocket.speed * t / 1000;
                rocket.position[0] = rocket.position[0] + rocket.speed * t / 1000*
                                     Math.sin(Math.toRadians(rocket.thetaDirection)) *
                                     Math.cos(Math.toRadians(rocket.phiDirection));
                rocket.position[1] = rocket.position[1] + rocket.speed * t / 1000*
                                     Math.sin(Math.toRadians(rocket.thetaDirection)) *
                                     Math.sin(Math.toRadians(rocket.phiDirection));
                rocket.position[2] = rocket.position[2] + rocket.speed * t / 1000 *
                                     Math.cos(Math.toRadians(rocket.thetaDirection));
                Thread.sleep(t);
            }
        } catch (InterruptedException e) { };
    }
}
