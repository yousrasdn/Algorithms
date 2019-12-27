package algorithm.dailycodingproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Statement:
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a algorithm.string,
 * and deserialize(s), which deserializes the algorithm.string back into the tree.
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
public class Prolem3BinaryTreeSerializationTest {
    private Prolem3BinaryTreeSerialization instance = new Prolem3BinaryTreeSerialization();

    @Test
    public void serialize_NullNode_StringWithEmptyValueIsReturned() {
        assertEquals("null", instance.serialize(null));
    }

    @Test
    public void serialize_NodeWithLeftAndRightChildren_StringWithNodeInformationIsReturned() {
        String result = instance.serialize(new Node("root",
                new Node("left", null, null),
                new Node("right", null, null)));

        assertEquals("root-left-null-null-right-null-null", result);
    }
}
