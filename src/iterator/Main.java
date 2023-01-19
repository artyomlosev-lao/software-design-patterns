package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SimpleBinaryTreeNode<Integer> root = new SimpleBinaryTreeNode<>(1);
        root.setLeft(new SimpleBinaryTreeNode<>(
                2,
                new SimpleBinaryTreeNode<>(4,
                        new SimpleBinaryTreeNode<>(8),
                        new SimpleBinaryTreeNode<>(9)),
                new SimpleBinaryTreeNode<>(5,
                        new SimpleBinaryTreeNode<>(10),
                        new SimpleBinaryTreeNode<>(11))));
        root.setRight(new SimpleBinaryTreeNode<>(
                3,
                new SimpleBinaryTreeNode<>(6,
                        new SimpleBinaryTreeNode<>(12),
                        new SimpleBinaryTreeNode<>(13)),
                new SimpleBinaryTreeNode<>(7,
                        new SimpleBinaryTreeNode<>(14),
                        new SimpleBinaryTreeNode<>(15))));




        Iterator breadthFirstIterator = root.getBreadthFirstIterator();
        while(breadthFirstIterator.hasNext()){
            System.out.print(breadthFirstIterator.next()+ " ");
        }
        System.out.println();

        Iterator depthFirstIterator = root.getDepthFirstIterator();
        while(depthFirstIterator.hasNext()){
            System.out.print(depthFirstIterator.next() + " ");
        }

        System.out.println();
        System.out.println();


        //Упрощение работы с итератором средствами интерфейса java Iterable

        root.forEach(r -> System.out.print(r+" "));
        System.out.println();

        root.changeIteratorType();

        root.forEach(r -> System.out.print(r+" "));
        System.out.println();

    }
}
