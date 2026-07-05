package Arrays;

public class ShiftElementByOne {
    private static void shift(int[] arr) {
        int n= arr.length-1;
        int temp=arr[n];
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for (int k:arr){
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        shift(arr);
    }

}
