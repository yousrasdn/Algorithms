package algorithm.tree;

import datastructures.binarytrees.BinarySearchTree;

public class BinaryTreeHeight {

    public static int findHeight(BinarySearchTree tree) {
        if (tree == null || tree.getRoot() == null) {
            throw new IllegalArgumentException("Tree is null");
        }

        return height(tree.getRoot());
    }

    private static int height(BinarySearchTree.Node node) {
        if (node==null) {
            return 0;
        }

        int heightLeft = height(node.getLeft());
        int heightRight = height(node.getRight());

        return heightLeft>heightRight? heightLeft+1: heightRight+1;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1, "1");
        tree.insert(2, "2");
        tree.insert(3, "3");
        tree.insert(4, "4");
        tree.insert(5, "5");

        System.out.println(findHeight(tree));
    }
}
