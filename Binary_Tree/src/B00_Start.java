/*
 * Full BT has either 0 or 2 children
 * Complete BT has all middle levels filled and last level has node as left as possible
 * Perfect BT has all leaf nodes at same level
 * The balanced BT has maximum of height of log(n)
 * Degenerate tree are skewed which has single link as linked list.
 * 
 * Path is route between any pair of nodes
 * The depth of a node is the number of nodes from the root to the node [both inclusive].
 * The height of a node is the number of nodes from the node to the deepest leaf [both inclusive].
 * The height of a tree is a height of the root.
 * The height and depth of a tree is same.
 * 
 * We need inorder to tell what is on right of the tree or left of the tree
 * With given pre and post order we cant build unique tree. We need inorder with pre or post order
 */

/* Missing - 
 * L12 - PostOrder with 1 stack
 * L28 - Max width
 * L30 - Nodes at distance k
 * 
 * Not Doing -
 * L13 - All order in one flow
 * L33 - Count nodes in complete tree
 * L37 - Morris traversal
 * L38 - Tree to list
 * 
 */
public class B00_Start {
	
	/*
	 * Creation of tree
	 * insertion of node
	 * deletion of node
	 * search of node
	 * traverse all node
	 * Delete a tree
	 */
	
	/*
	 * The preorder, inorder and postorder are depth first search
	 * The level order is bredth first search
	 */
	
	/*
	 * Top view is 0 th index of vertical traversal
	 * Bottom view is last index of vertical traversal
	 * Right view is first node in level order traversal from right to left
	 * In top view, bottom and right view the inside nodes will not be visible
	 */
}
