package moduleTwice.labwork24;

public class MyMath {

    public final static double PI = 3.14;

        static int findMin(int[] nums){
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

      static int findMax ( int[] nums){
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

    public  static double avg ( int[] nums){
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];
            return (double) a / nums.length;
        }

        static double areaOfCircle(int radius){
            double area = PI * radius * radius;
            return area;
        }
    }
