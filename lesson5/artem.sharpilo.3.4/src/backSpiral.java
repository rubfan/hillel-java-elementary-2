/**
 * @author artem_sharpilo
 * This class creates an array filled with  numbers from 1 to size of array in back-spiral form.
 *
 *
 *
 */

public class backSpiral {

    public static void main(String[] args)
    {

        int size=10;
        int [][] a= new int [size][size];
        int count=1;
        int top=0;
        int right=size-1;
        int niz=size-1;
        int left=0;

        while (count<=size*size)
        {
            if (count==size*size)
            {
                int b=Math.round(size/2);
                a[b][b]=size*size;
                break;
            }
            else
            {
                for (int i=top; i<right+1; i++)
                {
                    a[top][i]=count;
                    count++;
                }

                for (int i=top+1; i<right;i++)
                {
                    a[i][right]=count;
                    count++;
                }

                for (int i=right;i>=top; i--)
                {
                    a[right][i]=count;
                    count++;
                }
                for (int i=niz-1;i>left; i--)
                {
                    a[i][left]=count;
                    count++;
                }
                top++;
                right--;
                niz--;
                left++;

            }
        }
        for (int i=0;i<size; i++)
        {
            for (int j=0;j<size; j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }
}
