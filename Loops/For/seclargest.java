public class seclargest {
    public static void main(String[] args) {
        int[] nums = {10, 25, 15, 30, 20, 5};
        int second = findSecondLargest(nums);
        System.out.println("Second Largest Number: " + second);
    }
    
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        
        for (int val : arr) {
            if (val > max) {
                maxTwo = max;
                max = val;
            }
            else if (val > maxTwo && val != max) {
                maxTwo = val;
            }
        }
        
        return maxTwo;
    }
}
