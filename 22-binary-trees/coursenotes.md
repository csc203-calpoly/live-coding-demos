# 22 – Binary trees

- What is a binary tree
- Recursively defined
- NOT necessarily a binary search tree
- Searching in a binary tree (a graph with more contraints)

## Build tree

- Find the middle element and create a root Node out of it. If there's no middle element, return `null`.
- Do the same for the left subtree and set the result to the left child of the root Node from step 1.
- Do the same for the right subtree and set the result to the right child of the root Node from step 1.
- Return the root Note from step 1.

```java
// Recursively build each subtree starting at the beginning of the list.
   private Node buildTree(int[] values, int low, int high)
   {
      /*
      Steps:
      1. Find the middle element and create a root node out of it
         If there's no middle element, return Null
      2. Do the same for the left subtree
         and set the result to the left child of the node from step #1
      3. Do the same for the right subtree
         and set the result to the right child of the node from step #1
      4. Return the node from step #1
      */

      if (high < low) {
         return null;
      }

      int mid = (low + high) / 2;

      Node left = this.buildTree(values, low, mid - 1);
      Node right = this.buildTree(values, mid + 1, high);
      Node root = new Node(values[mid], left, right);
      return root;
   }
```

## Find

```java
// Recursively search each subtree for the given value
   private boolean find(int searchVal, Node node)
   {
      // TODO: FILL IN THIS METHOD HERE
      /*
      Steps:
      1. Check the root node
         2. If it's null, return false
         3. If it's the value we want, return true
      4. Otherwise, check the left subtree and the right subtree
      */
      boolean found;

      if (node == null) {
        return false;
      }

      found = node.value == searchVal
              || this.find(searchVal, node.left)
              || this.find(searchVal, node.right);

      // This root node was on the successful path
      if (found) {
         this.path.addFirst(node.value);
      }

      return found;
   }
```

## Traversals

Talk about pre-order, post-order traversals etc.

Show that DFS is simply a pre-order traversal where the "visitation" for a node is checking whether its the item that's being searched for.

Show that recursive DFS is using a Stack behind the scenes 

Replacing a Stack with a Queue turns the DFS into a BFS

## BFS

```java
/**
* Search the binary tree for the specified value using
* a breadth-first search.
*
* @param searchVal The value to search for
*/
public boolean findBFS(int searchVal) {
   ArrayList<Node> nodeQueue = new ArrayList<>(); // This is an array list, but we can use it as a queue

   if (this.root == null) {
      return false;
   }

   nodeQueue.add(this.root); // enqueue
 
   while (!nodeQueue.isEmpty()) {
      Node current = nodeQueue.remove(0); // Dequeue

      // Can inspect the current node at each step to confirm that 
      // we're doing a level-order search.
      System.out.println("Current node: " + current);

      if (current.value == searchVal) {
         return true;
      }

      // Enqueue its children
      if (current.left != null) {
         nodeQueue.add(current.left);
      }

      if (current.right != null) {
         nodeQueue.add(current.right);
      }
   }

   return false;
}
```
