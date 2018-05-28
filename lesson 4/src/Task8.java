public class Task8 {
    public static void main (String[] args){
        int[] a= new int[900000];
        for(int i=0; i<a.length; i++){
            a[i]=100000+i;
        }


        System.out.println("You have got "+luckyTicket(a)+" lucky tickets!");

    }


    public static int luckyTicket (int[] a)
    {
        int b=0;
        int count=0;
        int test1=0, test2=0;
        int[] a2= new int[6];
        for (int i=0; i<a.length; i++)
        {
            for (int j=0;a[i]>0; a[i]/=10, j++){
                b=a[i]%10;
                if (j<=2) test2+=b;
                else test1+=b;
            }
            if (test1==test2) count++;

        }
        return count;
    }
}
