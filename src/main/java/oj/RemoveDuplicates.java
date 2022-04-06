package oj;/**
 * Created by yangningkai on 2019/4/4.
 */

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/4/4 9:18
 * @Version:
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        int first = 0, second = 1;
        while (second < nums.length) {
            if (nums[second] == nums[first]) {
                second++;
            }else {
                first++;
                nums[first] = nums[second];
                second++;
            }
        }
        return first + 1;
    }
}
