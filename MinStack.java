package test;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by Ajinkya on 10/17/18.
 */
public class MinStack<T> {

    private Stack<T> main;
    private Stack<T> min;
    private Comparator<T> comparator;

    MinStack(Comparator<T> comparator){
        this.main = new Stack<T>();
        this.min = new Stack<T>();
        this.comparator = comparator;
    }

    private void push(final T val){

        main.push(val);

        if(min.isEmpty()){
            min.push(val);
            return;
        }

        if(comparator.compare(val, min.peek()) > 0){
            min.push(val);
        }
    }

    private T pop(){
        if(main.isEmpty()){
            System.out.println("Empty");
            return null;
        }

        T val = main.pop();

        if(comparator.compare(val, min.peek()) == 0){
            min.pop();
        }

        return val;
    }

    private T getMin(){
        if(main.isEmpty()){
            System.out.println("Empty");
            return null;
        }
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        minStack.push(14);
        minStack.push(10);
        minStack.push(2);
        minStack.push(12);
        minStack.push(8);
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());

    }

}

