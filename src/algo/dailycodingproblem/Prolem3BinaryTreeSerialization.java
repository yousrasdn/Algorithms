package algo.dailycodingproblem;


/**
 * Statement:
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a algo.string,
 * and deserialize(s), which deserializes the algo.string back into the tree.
 *
 * For example, given the following Node class
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *
 * The following test should pass:
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 *
 * Source:  Daily Coding Problem https://www.dailycodingproblem.com/
 */
public class Prolem3BinaryTreeSerialization {
    Node node;
    static int counter;

    Prolem3BinaryTreeSerialization() {
//        this.node = new Node("root", new Node("left", new Node("left", null, null), null), new Node("right", null, null));
        this.node = new Node("root", new Node("left", null, null), new Node("right", null, null));

    }
    public static void main(String[] args) {

        Prolem3BinaryTreeSerialization instance = new Prolem3BinaryTreeSerialization();
        System.out.println(instance.serialize(instance.node));
        instance.deserialize(instance.serialize(instance.node));
    }

    // The following uses preorder tree traversal
    String serialize(Node node) {
        if(node == null ) {
            return "null";
        }
        String treeToString = "";

        treeToString += node.val + "-";
        treeToString += serialize(node.left);

        treeToString += "-";
        treeToString += serialize(node.right);

        return treeToString;
    }

    Node deserialize(String nodeAsStr) {
        Node node = new Node();
        String[] arr = nodeAsStr.split("-");

        deserialize(arr);
        return node;
    }

    Node deserialize(String[] arr) {
        if(counter > arr.length || arr[counter].equals("null")) {
            counter++;
            return null;
        }

        Node node = new Node(arr[counter++]);
        node.left = deserialize(arr);
        node.right = deserialize(arr);

        return node;
    }

}

class Node {
    String val;
    Node left;
    Node right;

    Node() {
    }

    Node(String val) {
        this.val = val;
    }

    Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree {
    Node root;
}
