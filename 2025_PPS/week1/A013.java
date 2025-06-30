public class A013 {
    public int singleNumber(int[] nums) {
        int[] isExist = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
            isExist[i] = 1;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];

            if(isExist[i] != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (temp == nums[j]) {
                        isExist[i] = 0;
                        isExist[j] = 0;
                    }
                }
            }
        }

        int index = 0;
        for(int i = 0;i < nums.length;i++)
            if(isExist[i] == 1) {
                index = i;
                break;
            }

        return nums[index];
    }
}
