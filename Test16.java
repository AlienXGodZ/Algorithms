public class Test16 {
    public static void main(String[] args){

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;

        int maxarea = 0;
        int bestleft = 0;
        int bestright = 0;

        while(left < right){

            int widtih = right - left;

            int minheight = Math.min(height[left],height[right]);

            int area = widtih * minheight;

            if(area > maxarea){

                maxarea = area;

                bestleft = left;
                bestright = right;

            }


            if(height[left] < height[right]){

                left++;

            }else{

                right--;

            }

        }

        System.out.println(maxarea);
        System.out.println(bestleft + " " + bestright);


    }
}
