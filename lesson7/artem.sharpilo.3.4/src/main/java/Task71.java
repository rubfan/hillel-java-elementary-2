public class Task71 {
    public static void main(String[] args) {


        Lantern lantern = new Lantern();
        lantern.setModeWhite();
        lantern.setModeRed();
        lantern.setModeTrim();
    }
}
    class Lantern {
        int battery;
        String color;


        void setModeWhite() {
            battery = 1;
            color = "White";
            System.out.println(color+" mode set, you need "+ battery + " battery" );
        }
        void setModeRed(){
            battery = 2;
            color = "Red";
            System.out.println(color+" mode set, you need "+ battery + " batteries" );
        }
        void setModeTrim(){
            battery = 3;
            color = "Trim";
            System.out.println(color+" mode set, you need "+ battery + " batteries" );
        }

    }


