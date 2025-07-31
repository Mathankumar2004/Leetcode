import java.util.*;

public class sortColor {
    public static void main(String[] args) {
        int a[] = { 1, 2, 0, 1, 2, 0 };
        sortColors(a);
    }

    public static void sortColors(int[] nums) {
        int zero = 0, one = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (zero != 0) {
                nums[i] = 0;
                zero--;
            } else if (one != 0) {
                nums[i] = 1;
                one--;
            } else {
                nums[i] = 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
