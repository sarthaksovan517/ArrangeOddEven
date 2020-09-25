public class ArrangeOddEven
{
public static void arrangeOddEvenLeftToRight(int[] arr)
    {
        int size = arr.length;
        int left = 0, right = size - 1;

        while (left < right)
        {
            while (arr[left] % 2 != 0 && left < right)
                left++;

            while (arr[right]%2 == 0 && left < right)
                right--;

            if (left < right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args)
    {
        /**
         * I have used this for my own testing
         * please ignore and run it against test cases
         */
        int[] arr = new int[]{1, 3, 2, 4, 0, 5};
        ArrangeOddEven.arrangeOddEvenLeftToRight(arr);

        System.out.print("Array after arrangement is ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
