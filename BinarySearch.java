import java.sql.SQLOutput;
import java.util.*;
public class BinarySearch {
    public static void BS (int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid= (end + start)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
    }
    public static void main(String[] args) {
        BS(new int[]{1, 2, 3, 4, 5},3);
    }
}
