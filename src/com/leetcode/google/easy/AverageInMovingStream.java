package com.leetcode.google.easy;

import java.util.LinkedList;
import java.util.Queue;

public class AverageInMovingStream {
	int size;
	Queue<Integer> queue;
	double sum;
	public AverageInMovingStream(int size) {
		this.size = size;
		queue = new LinkedList<>();
	}
	
	public double next(int val){
		if(queue.size() == size){
			sum = sum - queue.poll();
		}
		queue.offer(val);
		sum = sum + val;
		return (sum/queue.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageInMovingStream avg = new AverageInMovingStream(3);
		System.out.println(avg.next(1));
		System.out.println(avg.next(10));
		System.out.println(avg.next(3));
		System.out.println(avg.next(5));
	}

}
