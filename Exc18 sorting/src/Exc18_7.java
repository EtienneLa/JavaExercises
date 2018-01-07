import java.util.Random;

public class Exc18_7
{
    public static void exchange_sort( int[] a )
    {
        for ( int i = 0; i < a.length; i++)
            for ( int j = 0; j < a.length; j++)
                if ( a[i] < a [j])
                swap(a,i,j);
    }


    public static void swap( int[] a , int i, int j )
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main( String[] args )
    {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        exchange_sort( arr );

        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}