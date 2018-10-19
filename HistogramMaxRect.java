package leet;

import java.util.Stack;

public class HistogramMaxRect {

    public static void main(String[] args) {
        int hist[] = { 6, 5, 5,4, 2};
        System.out.println("Maximum area is " + getMaxArea(hist));

    }


    static int getMaxArea(final int[] arr){
        int max = 0;

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length){

            if(stack.isEmpty() || arr[i] >= arr[stack.peek()]){
                stack.push(i++);
            }else{
                int stackTop = stack.peek();
                stack.pop();
                int area = stack.isEmpty() ? arr[stackTop] * i : arr[stackTop] * ( i - stack.peek() - 1);

                System.out.println(stackTop + "  i, " + i + "  area, " + area);
                if(area > max){
                    max = area;
                }
            }

        }

        while (!stack.isEmpty()){
            int stackTop = stack.pop();
            int area = stack.isEmpty() ? arr[stackTop] : arr[stackTop] * ( i - stack.peek() - 1);

            if(area > max){
                max = area;
            }
        }

        return max;
    }
}

