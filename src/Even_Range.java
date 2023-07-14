import java.util.Scanner;

public class Even_Range {
    int even_Range(int arr[],int start,int end){
       //
        // System.out.println(start+" "+end);
        return arr[end]-arr[start-1];

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Even_Range range=new Even_Range();
        int size=scan.nextInt();
        int array[]=new int[size];
        array[0]=scan.nextInt();
        array[0]=array[0]%2==0?1:0;
        for(int i=1;i<size;i++){
            array[i]=scan.nextInt();
            array[i] = (array[i] % 2==0) ? (array[i - 1] + 1) : (array[i - 1] + 0);
        }
        int n=scan.nextInt();
        int _2d[][]=new int[n][2];

        for(int i=0;i<n;i++) {
            _2d[i][0] = scan.nextInt();
            _2d[i][1] = scan.nextInt();

            if (_2d[i][0] == 0) {

                System.out.println(array[_2d[i][1] - 1]);
            } else {

                System.out.println(range.even_Range(array, _2d[i][0], _2d[i][1]));
            }

        }

    }
}
