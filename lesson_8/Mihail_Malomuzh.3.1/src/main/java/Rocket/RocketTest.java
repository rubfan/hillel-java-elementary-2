package Rocket;

import Rocket.Entity.Rocket;
import Rocket.Entity.RocketEngine;

import java.util.Scanner;

public class RocketTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rocket b = new Rocket("Falcon 9", new RocketEngine("Merlin 1D"));

        System.out.println("1. get info");
        System.out.println("2. rocket start");
        System.out.println("3. set acceleration");
        System.out.println("4. set theta direction");
        System.out.println("5. set phi direction");
        System.out.println("6. rocket stop");
        System.out.println("10. quit");

        double temp;
        int s;
        do {
            System.out.print("Act: ");
            s = sc.nextInt();

            switch (s){
                case 1 : {System.out.println(b.toString()); break;}
                case 2 : {System.out.println("Rocket starting"); b.start(); break;}
                case 3 : {sc.nextLine(); temp = sc.nextDouble(); b.setAcceleration(temp); break;}
                case 4 : {sc.nextLine(); temp = sc.nextDouble(); b.setThetaDirection(temp); break;}
                case 5 : {sc.nextLine(); temp = sc.nextDouble(); b.setPhiDirection(temp); break;}
                case 6 : {System.out.println("Rocket is stopped"); b.stop(); break;}
            }
        } while (s != 10);

        b.stop();

        System.out.println("out");




    }
}
