package com.ds.heaps;

public class BinaryHeap {
	private int heapSize;
	private int capacity;
	private int[] heap;

	BinaryHeap(int capacity) {
		this.capacity = capacity;
		heapSize = 0;
		heap = new int[capacity];
	}

	public int parent(int index) {
		return (index - 1) / 2;
	}

	public int leftChild(int index) {
		return 2 * index + 1;
	}

	public int rightChild(int index) {
		return 2 * index + 2;
	}

	public void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	public boolean insert(int num) {
		if (heapSize == capacity) {
			System.out.println("Heap capacity reached");
			return false;
		}

		heapSize++;
		int currentIndex = heapSize - 1;
		heap[currentIndex] = num;

		while (currentIndex != 0 && heap[parent(currentIndex)] > heap[currentIndex]) {
			swap(currentIndex, parent(currentIndex));
			currentIndex = parent(currentIndex);
		}
		return true;
	}

	public int getMin() throws Exception {
		if (heapSize == 0) {
			throw new Exception();
		}

		return heap[0];
	}

	public void heapify(int index) throws Exception {
		if (index < 0 || index >= capacity) {
			throw new Exception();
		}

		int smallest = index;
		int leftChild = leftChild(index);
		int rightChild = rightChild(index);

		if (leftChild < heapSize && heap[leftChild] < heap[smallest]) {
			smallest = leftChild;
		}

		if (rightChild < heapSize && heap[rightChild] < heap[smallest]) {
			smallest = rightChild;
		}

		if (smallest != index) {
			int temp = heap[smallest];
			heap[smallest] = heap[index];
			heap[index] = temp;
			heapify(smallest);
		}
	}

	public int extractMin() throws Exception {
		if (heapSize == 0) {
			throw new Exception();
		}
		int value = heap[0];
		heap[0] = heap[heapSize - 1];

		heapSize--;
		heapify(0);

		return value;
	}

	public void decreaseKey(int index, int value) throws Exception {
		if (index < 0 || index >= capacity) {
			throw new Exception();
		}

		if (heap[index] <= value) {
			throw new Exception();
		}

		heap[index] = value;
		while (index != 0 && heap[parent(index)] > heap[index]) {
			swap(index, parent(index));
			index = parent(index);
		}
	}

}
