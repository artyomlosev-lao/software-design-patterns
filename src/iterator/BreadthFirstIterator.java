package iterator;

import java.util.*;

class BreadthFirstIterator<T> implements Iterator<T> {

    Queue<T> queue = new LinkedList<>();

    public BreadthFirstIterator(SimpleBinaryTreeNode<T> root) {
        readData(List.of(root));
    }

    private void readData(List<SimpleBinaryTreeNode<T>> nodes) {
        List<SimpleBinaryTreeNode<T>> nestedNodes = new ArrayList<>();
        nodes.forEach(n-> {
            queue.offer(n.getData());
            if (n.getLeft() != null) nestedNodes.add(n.getLeft());
            if (n.getRight() != null) nestedNodes.add(n.getRight());
        });
        if (!nestedNodes.isEmpty()) readData(nestedNodes);
    }
    @Override
    public boolean hasNext(){
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        return queue.poll();
    }

}