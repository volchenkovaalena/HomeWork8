import java.util.Arrays;

public class Main {
    public static void main ( String[] args ) {
        int[] a = new int[]{1, 2, 3};
        System.out.print ( a[0] + ", " );
        System.out.print ( a[1] + ", " );
        System.out.print ( a[2] );
        System.out.println ( " " );


        double[] b = {1.57, 7.654, 9.986};
        System.out.print ( b[0] + ", " );
        System.out.print ( b[1] + ", " );
        System.out.print ( b[2] );
        System.out.println ( " " );

        int[] years = {2023, 2024, 2025};
        System.out.print ( years[0] + ", " );
        System.out.print ( years[1] + ", " );
        System.out.print ( years[2] );
        System.out.println ( " " );

        System.out.print ( a[2] + ", " );
        System.out.print ( a[1] + ", " );
        System.out.print ( a[0] );
        System.out.println ( " " );

        System.out.print ( b[2] + ", " );
        System.out.print ( b[1] + ", " );
        System.out.print ( b[0] );
        System.out.println ( " ");

        System.out.print (years [2] +", " );
        System.out.print ( years [1] + ", " );
        System.out.print ( years [0] );
        System.out.println ( " ");

      for (int i = 0 ; i < a.length ; i = i + 1) {
          if ( a[i] % 2 != 0 ) {
              a[i] = a[i] + 1;
          }
      }
      System.out.println(Arrays.toString(a));




    }

}