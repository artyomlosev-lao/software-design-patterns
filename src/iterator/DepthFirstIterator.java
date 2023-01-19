package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class DepthFirstIterator<T> implements Iterator<T> {

    private Queue<T> queue = new LinkedList<>();

    public DepthFirstIterator(SimpleBinaryTreeNode<T> root) {
        readData(root);
    }

    private void readData(SimpleBinaryTreeNode<T> node) {
        queue.offer(node.getData());
        if (node.getLeft() != null) readData(node.getLeft());
        if (node.getRight() != null) readData(node.getRight());
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        return queue.poll();
    }

}