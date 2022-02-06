package Arrays.Questions;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7, 11,15};
        int target = 9;

        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++){
            int element = Math.abs(target - nums[i]);
            for (int j = 1; j < nums.length; j++){
                if (element == nums[j]) {
                    int firstIndex = i;
                    int secondIndex = j;
                    if (i > j){
                        firstIndex = j;
                        secondIndex = i;
                    }
                    System.out.println("["+firstIndex+","+secondIndex+"]");
                    return;
                }
            }
        }
    }
}
