import java.util.ArrayList;
import java.util.NoSuchElementException;

class MinHeapPriorityQueue<T extends Comparable<T>>// implements PriorityQueue<T>
{
    private ArrayList<T> heap;
    
    public MinHeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    //@Override
    public void insert(T element) {
        heap.add(element);
        bubbleUp(heap.size() - 1);
    }

    //@Override
    public T removeMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        T min = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastElement);
            bubbleDown(0);
        }
        return min;
    }

   // @Override
    public T peekMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return heap.get(0);
    }

    //@Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    //@Override
    public int size() {
        return heap.size();
    }

    private void bubbleUp(int index) {
        T element = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (element.compareTo(parent) >= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, element);
    }

    private void bubbleDown(int index) {
        int size = heap.size();
        T element = heap.get(index);
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallest = index;

            if (leftChildIndex < size && heap.get(leftChildIndex).compareTo(heap.get(smallest)) < 0) {
                smallest = leftChildIndex;
            }
            if (rightChildIndex < size && heap.get(rightChildIndex).compareTo(heap.get(smallest)) < 0) {
                smallest = rightChildIndex;
            }
            if (smallest == index) {
                break;
            }
            heap.set(index, heap.get(smallest));
            index = smallest;
        }
        heap.set(index, element);
    }
}
 class Main
	{
    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer> pq = new MinHeapPriorityQueue<>();

        pq.insert(10);
        pq.insert(5);
        pq.insert(20);
        pq.insert(15);

        System.out.println("Min element: " + pq.peekMin()); // Should print 5
        System.out.println("Removed min: " + pq.removeMin()); // Should print 5
        System.out.println("New min element: " + pq.peekMin()); // Should print 10
        System.out.println("Priority Queue size: " + pq.size()); // Should print 3
    }
}
