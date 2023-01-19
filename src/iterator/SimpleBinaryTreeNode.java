package iterator;

import java.util.Iterator;

public class SimpleBinaryTreeNode<T> implements Iterable<T> {

    private SimpleBinaryTreeNode<T> left, right;

    private T data;

    private int iteratorType;

    public SimpleBinaryTreeNode(T data) {
        this.data = data;
        this.left = this.right = null;
        this.iteratorType = 1;
    }

    public SimpleBinaryTreeNode(T data, SimpleBinaryTreeNode<T> left, SimpleBinaryTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.iteratorType = 1;
    }

    @Override
    public Iterator<T> iterator() {
        if (iteratorType == 1) {
            return new BreadthFirstIterator<>(this);
        }
        else return new DepthFirstIterator<>(this);
    }

    public void changeIteratorType() {
        iteratorType = -1*iteratorType;
    }

    public Iterator<T> getDepthFirstIterator() {
        return new DepthFirstIterator<>(this);
    }

    public Iterator<T> getBreadthFirstIterator() {
        return new BreadthFirstIterator<>(this);
    }

    public SimpleBinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(SimpleBinaryTreeNode<T> left) {
        this.left = left;
    }

    public SimpleBinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(SimpleBinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
