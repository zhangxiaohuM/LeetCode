import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static void main(String[]args){
        Solution sl =new Solution();
        int nums[] = {1,3,2,4};
        int target = 6;
        int a[] = sl.twoSum(nums,target);
        System.out.println(a[0]+" " +a[1]);
    }
}
//class Solution {//hashmap
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int x = target - nums[i];
//            if(map.containsKey(x))
//                return new int[]{i,map.get(x)};
//            map.put(nums[i],i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//}
//}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = nums.length - 1;j > i; j--){
                if(nums[i]+nums[j] == target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
}