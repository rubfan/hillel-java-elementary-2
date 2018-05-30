import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {

       public String counter (Integer int1, Integer int2,Integer int3, Integer int4){

           StringBuilder result = new StringBuilder();

           ArrayList <Integer> arrayOfInts = new ArrayList<>();
           arrayOfInts.add(int1);
           arrayOfInts.add(int2);
           arrayOfInts.add(int3);
           arrayOfInts.add(int4);
           Collections.sort(arrayOfInts);

           for (int i=0; i<arrayOfInts.size(); i++){
               if (arrayOfInts.get(0) == arrayOfInts.get(i)){
                   result.append("Minimum:" + arrayOfInts.get(i) + "\n");
               }
           }

           result.append("Maximum:" + Collections.max(arrayOfInts) + "\n");

           for (int i=0; i < arrayOfInts.size(); i++) {
                if (arrayOfInts.get(i) % 2 != 0){
                    result.append(arrayOfInts.get(i) + "is odd number" + "\n");
                }else {
                    result.append(arrayOfInts.get(i) + "is even number" + "\n");
                }
           }

           for (int i=0; i < arrayOfInts.size()-1; i++) {
               if (arrayOfInts.get(i) % arrayOfInts.get(i + 1) == 0) {
                   result.append(arrayOfInts.get(i) + " divided without remainder on " + arrayOfInts.get(i + 1) + "\n");
               }
           }

           if (Math.abs(10-arrayOfInts.get(2)) < Math.abs(10-arrayOfInts.get(3))){
               result.append(arrayOfInts.get(2) + " is closer to ten " + "\n");
           }else {
               result.append(arrayOfInts.get(3) + " is closer to ten " + "\n");
           }


           return result.toString();
       }

}
