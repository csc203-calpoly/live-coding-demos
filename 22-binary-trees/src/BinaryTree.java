import java.util.LinkedList;

/**
 * A binary tree implementation.
 */
public class BinaryTree {
    private final Node root;
    private final LinkedList<Integer> path;

    public BinaryTree(int[] values) {
        this.root = buildTree(values, 0, values.length - 1);
        this.path = new LinkedList<>();
    }

    public LinkedList<Integer> getPath() {
        return path;
    }

    public Node getRoot() {
        return this.root;
    }

    // Build a binary tree by adding the middle element to the tree,
    // then recursively doing the same to the left and right halves
    // of the array.
    private Node buildTree(int[] values, int low, int high) {
        /*
         * 1. Grab the middle element.
         * 2. Create a root Node with that element as the value.
         * 3. Do the same on the left half, and make the result the left child
         *    of the root.
         * 4. Do the same on the right half, and make the result the right child
         *    of the root.
         * 5. Return the root from step 1.
         */
        return null; 
    }

    /**
     * Search for the specified value in the tree, and
     * if found return a path from the root to the value.
     * @param searchVal The value to search for
     * @return true if searchVal was found, false otherwise
     */
    public boolean find(int searchVal) {
        path.clear();
        return find(searchVal, root);
    }

    // Search the binary tree for the value.
    private boolean find(int searchVal, Node node) {
        // TODO: Implement this method.
        return false;
    }

    // Inner class.  Private data can be accessed by outer class
    private static class Node {
        private final int value;
        private Node left, right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
