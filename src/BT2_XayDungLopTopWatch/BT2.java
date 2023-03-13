package BT2_XayDungLopTopWatch;

public class BT2 {
    public static void main(String[] args) {
        int arr[]=new int[100000];
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        sort(arr);
        stopWatch.end();
        System.out.println("Time : "+stopWatch.getElapsedTime());
    }
    public static void sort(int [] arr) {
        int temp ;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
