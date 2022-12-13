package tech.strategio;

public class E04 {
    /**
     * Create an array where the element is the product of all
     * other elements except itself. Dividing is not allowed
     *
     * @param nums, an array of integers
     * @return an array of numbers but w/ all products (except self)
     */
    public int[] arrayOfProducts(int[] nums) {
        int len = nums.length;

        int [] leftProduct = new int[len];
        int [] rightProduct = new int[len];

        int[] answer = new int[len];

        leftProduct[0] = 1;
        rightProduct[len -1] = 1;

        for (int i = 1; i < len; i++){
            leftProduct[i] = nums[i -1] * leftProduct[i -1];
        }

        for (int j = len -2; j >= 0; j--){
            rightProduct[j] = nums[j+1] * rightProduct[j +1];
        }

        for (int k = 0; k < len; k++){
            answer[k] = leftProduct[k] * rightProduct[k];
        }


        return answer;
    }
}
