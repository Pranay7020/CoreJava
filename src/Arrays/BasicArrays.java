package Arrays;

public class BasicArrays {
    public static void main(String[] args) {
//        declaration
        int arr[];

//        Allocation

        int[] arr1 = new int[33];

//        init
        int arr2[]={2,3,4,4};
//        index accesing
        System.out.println(arr2[2]);
// length
        for (int i=0;i<= arr2.length-1;i++){
            System.out.println(arr2[i]);
        }
    }
}