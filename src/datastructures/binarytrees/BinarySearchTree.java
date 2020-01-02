package datastructures.binarytrees;

/**
 * A binary search tree is a tree where at each node n,
 * the left child is less than n, and the right child is greater than n => this tree stores items in a sorted order.
 */
public class BinarySearchTree {

    private static class Node {
        private int key;
        private String value;
        private Node left, right;

        private Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        private Node min() {
            if (left == null) {
                return this;
            } else {
                return left.min();
            }
        }
    }

    private  Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public String find(final int key) {
        // Finds the node
        Node node = find(root, key);

        // Returns the value
        return node == null ? null : node.value;
    }

    /**
     * Finds the node with the provided key.
     * If no node with the matching key is found, null is returned.
     */
    private Node find(final Node lookUpNode, final int lookUpKey) {
        if (lookUpNode == null || lookUpNode.key == lookUpKey) {
            return lookUpNode;
        }

        else if(lookUpNode.key > lookUpKey) {
            return find(lookUpNode.left, lookUpKey);
        }

        else { // lookUpNode.key < lookUpKey
            return find(lookUpNode.right, lookUpKey);
        }
    }

    public void insert(final int key, final String value) {
       root = insertIntoTree(root, key, value);
    }

    private Node insertIntoTree(Node node, final int key, final String value) {
        final Node nodeToInsert = new Node(key, value);

        if (node == null) {
            node = nodeToInsert;
            return node;
        }

        if(node.key > key) {
            node.left = insertIntoTree(node.left, key, value);
        } else if(node.key < key) {
            node.right = insertIntoTree(node.right, key, value);
        } else {
            throw new IllegalArgumentException("The provided key already exists in the tree.");
        }

        return node;
    }

    public void delete(final int key) {
        if(root == null) {
            throw new IllegalArgumentException("There are no items in the tree.");
        }

        root = delete(root, key);
    }

    private Node delete(Node node, final int key) {
        if(node == null) {
            return null;
        } else if(node.key > key) {
            node.left = delete(node.left, key);
        } else if(node.key < key) {
            node.right = delete(node.right, key);
        } else { // node with the given key has been found!

            // Case 1: the node to be deleted has 0 children
            if(node.left == null && node.right == null) {
                node = null;
            }

            // Case 2: the node to be deleted has 1 child
            else if(node.left == null) {
                node = node.right;
            }  else if(node.right == null) {
                node = node.left;
            }

            // Case 3: the node to be deleted has 2 children
            else {
                // Find the successor of the node
                final Node successor = findMinNode(node.right);

                // Replace the node to be deleted by its successor
                node.key = successor.key;
                node.value = successor.value;

                // Delete this successor (since has replaced a node)
                node.right = delete(node.right, node.key);
            }
        }

        return node;
    }

    public int findMinKey() {
        if (root == null) {
            throw new IllegalStateException("There are no elements in the tree");
        }
      return  root.min().key;
    }

    public Node findMinNode(final Node node) {
        if (node == null) {
            throw new IllegalStateException("There are no elements in the tree");
        }
        return  node.min();
    }

    // Util functions
    public void printInOrderTraversal() {
        printInOrderTraversal(root);
    }

    private void printInOrderTraversal(Node node) {
        if (node != null) {
            printInOrderTraversal(node.left);
            System.out.println(node.key);
            printInOrderTraversal(node.right);
        }
    }

    public void printPreOrderTraversal() {
        printPreOrderTraversal(root);
    }

    private void printPreOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.key);
            printPreOrderTraversal(node.left);
            printPreOrderTraversal(node.right);
        }
    }

    public void printPostOrderTraversal() {
        printPostOrderTraversal(root);
    }

    private void printPostOrderTraversal(Node node) {
        if (node != null) {
            printPostOrderTraversal(node.left);
            printPostOrderTraversal(node.right);
            System.out.println(node.key);
        }
    }

    private class NotFoundExeption extends RuntimeException {
        public NotFoundExeption(String message) {
            super(message);
        }
    }
}
