public class ContainsSum {

    public static void main(String[] args) {
        int a[] = {1, 5, 7, 9, 12};
        int sum = 12;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length && a[i] + a[j] <=sum; j++) {
                if(a[i] + a[j] == sum){
                    System.out.println("True: " + a[i] + " + " + a[j] + " = " + sum);
                    return;
                }

            }
            
        }
        System.out.println("False");
    }
}