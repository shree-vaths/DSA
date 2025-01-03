
public class G00_Start {
	
	/*
	 * Edges may be associated with weight
	 * weighted vs unweighted
	 * Directed vs undirected
	 * Cyclic vs Acyclic
	 * Tree is directed acyclic graph
	 * 
	 * Types -
	 * Unweighted undirected
	 * Unweighted directed
	 * weighted undirected
	 * weighted undirected
	 * 
	 * If each of nodes are connected to all the nodes use adjacency matrix
	 * If there are few edges use adjacency list
	 * 
	 * In BFS, we first visit all nodes at level 1 then level 2.
	 * Cant do BFS using recursion
	 * In DFS, we visit in depth nodes for level 1 nodes, then same for level 2 nodes
	 * 
	 * If we dont mark visited then, there can be two conditions.
	 * One is infinite one parent to child and then child to parent.
	 * Second is repetition of path, At C we can come by A or B. If C is already reached by A then dont go same path through C by B.
	 * In DAG we do it bcz of second condition. It maintains redundant traversal of same path.
	 * 
	 * Topological sort only works on directed acyclic graph
	 * Once DFS is done for a node, push it to the stack.
	 * With undirected we cant decide which one should appear first
	 * With cycle, its a infinite loop, we dont know which one is first point
	 * 
	 * 
	 * If Topological queue has no of nodes sized array then there is no cycle else it has cycle.
	 * Undirected cycle detection using BFS and DFS
	 * Directed cycle detection using DFS and Topo BFS
	 * 
	 * Shortest path for DAG
	 * Dijkstra shortest path for undirected. We can also use this for DAG but more complexcity
	 */
	
	/*
	 * Missing -
	 * G16 - Distinct Islands
	 * G19 - Cycle in directed Graph
	 * G20 - Safe Node
	 */
}
