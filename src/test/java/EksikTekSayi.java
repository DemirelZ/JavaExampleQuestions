public class EksikTekSayi {


    /**
     * Assume that we have an array of positive integers from m to n which includes all odd
     * numbers from m to n except one.
     * Write a function that finds the missing odd number in the list.
     * <p>
     * Ex.:
     * Input :[1,3,5,7,11,13,15]
     * Output: 11
     * <p>
     * Input:[9,7,3]
     * Output:5
     * <p>
     * Constraints:
     * 1<length of the input list(nums)<100
     * There is always a single missing number
     * Array is sorted either descending or ascending.
     */


    public static void main(String[] args) {

        Integer[] exArr = {1, 3, 5, 7, 11, 13, 15};
        Integer[] exArr2 = {9, 7, 3};

        System.out.println(eksikTekSayiBul(exArr2));


    }

    public static int eksikTekSayiBul(Integer[] arr) {


        if (arr.length < 100) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] - arr[i + 1] == -4) {

                    return arr[i] + 2;
                } else if (arr[i] - arr[i + 1] == 4) {

                    return arr[i] - 2;
                }

            }

        } else {
            System.out.println("Please, length of the input array should be less than 100");
        }

        return -1;
    }

    public static int findMissingOddNumber(int[] nums) {
        int length = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int expectedSum = (nums[0] + nums[length - 1]) * length / 2;
        int missingNumber = expectedSum - totalSum;
        return missingNumber;
    }


}
