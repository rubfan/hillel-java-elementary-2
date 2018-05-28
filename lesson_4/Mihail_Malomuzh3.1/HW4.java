import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
       
    public static void Plus3(){
        for (int i = 1000; i < 10000; i += 3){
            System.out.print(i + "  ");
            if ((i % 20) == 0)
                System.out.println();
        }
    }
    
    public static void Plus2(){
        int a = 1;
        for (int i = 1; i <= 55; i++){
            a += 2;
            System.out.print(a + " ");
            if ((i-1) % 20 == 0) 
               System.out.println();
        }
            
    }
    
    public static void Minus5(){
        for (int i = 90; i >= 0; i -= 5){
            System.out.print(i + " ");
        }
    }
    
    public static void Mul2(){
        int a;
        for(int i = 1; i <= 20; i++){
            a = 1 << i;
             System.out.print(a + " ");
        }
        
    }
       
    public static int SumFirstNArray(int [] in, int n){
        int sum = 0;
        if (in.length < n){
            System.out.println("array length is too small");
            return 0;
        }
        for (int i = 0; i < n; i++)
            sum += in[i];
        return sum;
    } 
    
    public static long MinMaxArray(int [] in){ //bits 63-32 = max, bits 31-0 = min
        int min = in[0];
        int max = in[0];
        
        for (int a : in){
            if (a > max) max = a;
            if (min > a) min = a;
        }   
        
        long k = (long)(max + (min<0?1:0))<<32;
        return k+min;
    }
    
    public static void EvenOdd(int [] in){
        int eSum = 0;
        int oSum = 0;
        for (int a : in)
            if ((a % 2) == 0) eSum += a;
            else oSum += a;
        System.out.println("even sum = " + eSum + " odd sum = " + oSum);
    }
    
    public static void LuckyTicket(){
        
        int k = 0;
        int sum = 0;
    
        for (int i1 = 1; i1 < 10; i1++){
            for (int i2 = 0; i2 < 10; i2++){
                for (int i3 = 0; i3 < 10; i3++){
                    sum = i1 + i2 + i3;
                    for (int i4 = Math.max(0, sum - 18); (i4 < 10) && (i4 <= sum); i4++){
                        for (int i5 = Math.max(0, sum - i4 - 9); (i5 < 10) && (i4 + i5 <= sum); i5++){
                            int i6 = sum - i4 - i5;
                            k++;
                            System.out.print(i1+""+i2+""+i3+""+i4+""+i5+""+i6+"   ");
                            if ((k % 15) == 0) System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("operations num = " + k);
        
    }
    
    public static String IntToBinaryString(int a){
        // System.out.println(Integer.toBinaryString(a));  //it's work also
        int mask;
        int bit;
        int n;
        StringBuilder res = new StringBuilder();
        
        if (a == 0) 
            return "0";
        if (a > 0)
            n = (int) (Math.log(a) / Math.log(2) + 1);
        else{
            res.append(1);
            n = 31;
        }
        do {
           mask = 1<<--n;
           bit = (a & mask) >> n;
           res.append(bit);
        } while (n > 0);
       
        return res.toString();
    } 
    
    private static int[] Merge(int[] a, int[] b, boolean descent){
        int i = 0; int aLength = a.length;
        int j = 0; int bLength = b.length;
        int[] res = new int[aLength + bLength]; 
        for (int k = 0; k < aLength + bLength; k++ ){
            if ((i < aLength) && (j < bLength)){
                if ((a[i] > b[j])^descent) res[k] = b[j++];
                else res[k] = a[i++];
                    
            }else{
                if (i < aLength) res[k] = a[i++];
                else res[k] = b[j++];
            }
        }
        
        return res;
    }
    
    public static int[] MergeSort(int[] a, boolean descent){
        int aLength = a.length;
	if (aLength < 2) return a;
	return Merge(MergeSort(Arrays.copyOfRange(a, 0, aLength / 2), descent),
	             MergeSort(Arrays.copyOfRange(a, aLength / 2, aLength), descent) , descent
                    );
    }
    
    public static int AllDigitsSum(int a){
        int sum = 0;
        
        while (a / 10 > 0)      {
            sum = 0;    
            while (a > 0){
                sum += a % 10;
                a = a / 10;
            }
            a = sum;
        }
        
        return sum;
    }
    
    public static void Task(int t, int[] a, int n){
        switch (t){
            case 1: Plus3(); 
                    System.out.println();
                    break;
            case 2: Plus2();
                    System.out.println();
                    break;
            case 3: Minus5();
                    System.out.println();
                    break;
            case 4: Mul2();
                    System.out.println();
                    break;
            case 5: System.out.println(SumFirstNArray(a, n));
                    System.out.println();
                    break;
            case 6: long h = MinMaxArray(a);
                    System.out.println("max = " + (h>>32) + "; min = " + (int) h);
                    System.out.println();
                    break;
            case 7: EvenOdd(a);
                    System.out.println();
                    break;
            case 8: LuckyTicket();
                    System.out.println();
                    break;
            case 9: System.out.println(IntToBinaryString(n));
                    System.out.println();
                    break;
            case 10: int [] sa = MergeSort(a, false);
                     for (int i = 0; i < 5; i++)
                        System.out.print(sa[i] + "  ");
                     System.out.println();
                     break;
            case 11: System.out.println(AllDigitsSum(n));
                     System.out.println();
                     break;
        }
    }
    

    public static void main(String[] args) {
        
          
        Scanner sc = new Scanner(System.in);
        int tsk;
        int n = 0;
        int a[] = {-1, 2, -3, 4,-5,-6, 8,-9,-10};
        
        do{
            System.out.print("input task number (quit 0) :");
            tsk = sc.nextInt();
            if ((tsk == 5) || (tsk == 9) || (tsk == 11)){
                System.out.print("    input integer number: ");
                n =  sc.nextInt();
            }  
            
            Task(tsk, a, n);
        } while (tsk != 0);
        
        sc.close();
    }       
    
}
    
