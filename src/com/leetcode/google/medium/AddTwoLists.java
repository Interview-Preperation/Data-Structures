package com.leetcode.google.medium;

import java.util.Stack;

public class AddTwoLists {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        int sizeL1 = 0;
        int sizeL2 = 0;
        
        ListNode current = l1;
        
        while(current != null){
            sizeL1++;
            current = current.next;
        }
        
        current = l2;
        while(current != null){
            sizeL2++;
            current = current.next;
        }
        
        if(sizeL1 > sizeL2) {
            for(int i = 0; i < sizeL1-sizeL2; i++){
                s2.push(0);
            }
        } else if(sizeL2 > sizeL1) {
            for(int i = 0; i < sizeL2-sizeL1; i++){
                s1.push(0);
            }
        }
        
        current = l1;
        while(current != null){
            s1.push(current.val);
            current = current.next;
        }
        
        current = l2;
        while(current != null){
            s2.push(current.val);
            current = current.next;
        }
        int sum = 0;
        int carry = 0;
        Stack<Integer> result = new Stack<>();
        while(!s1.isEmpty() && !s2.isEmpty()){
            sum = (carry + s1.peek() + s2.peek())%10;
            carry = (carry + s1.pop() + s2.pop())/10;
            result.push(sum);
        }
        
        if(carry> 0){
            result.push(carry);
        }
        ListNode prev = new ListNode(0);
        ListNode resultList = prev;
        while(!result.isEmpty()){
            prev.next = new ListNode((int)result.pop());
            prev = prev.next;
        }
        
        return resultList.next;
    }
}
