package LineSearch;

public class LineSearch
{
    public static int LineSearch(int[] arr, int el)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == el) return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,54,34,12,63,3,12,6};
        System.out.println(LineSearch(arr,12));
    }
}
