/**
 * 剑指Offer 03 数组中重复的数字
 */
 class Solution {
     //超时算法 双层循环
    public int findRepeatNumber(int[] nums) {
       for(int slow = 0;slow<nums.length;slow++){
         for(int fast = slow+1;fast<nums.length;fast++){
           if(nums[slow]==nums[fast]){
               return nums[slow];
           } 
         }
       }
        return -1;
    }
    // 哈希集合
    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int i=0;i<nums.length;i++) {
            if (!set.add(nums[i])) {
                repeat = nums[i];
                break;
            }
        }
        return repeat;
    }
    //位运算异或
    public static int findRepeatNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
            
            } else {
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[nums[i]] = tmp;
                if ((tmp ^ nums[i]) == 0) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    // 数组值作为索引自增
    public int findRepeatNumber(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            res[nums[i]]++;
            if(res[nums[i]] >1 ) {
                return nums[i];
            }
        }
        return -1;
    }
}
