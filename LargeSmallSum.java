public class LargeSmallSum {
    public static int sumSecondSmallestAndSecondLargest(int[] arr) {

            int secondSmallest = Integer.MAX_VALUE;
            int secondLargest = Integer.MIN_VALUE;


            for (int i = 1; i < arr.length; i += 2) {
                if (arr[i] < secondSmallest) {
                    secondSmallest = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i += 2) {
                if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }


            return secondSmallest + secondLargest;
        }

        public static void main(String[] args) {
            int[] arr = {3 ,2, 1, 7, 5, 4};
            int result = sumSecondSmallestAndSecondLargest(arr);
            System.out.println(result);
        }
    }

