
public class Time_Space {
	/*
	 * The program execution time is measured with respect to size of input.
	 * The rate at which program execution time increases with size of input.
	 * The program execution is not measured in terms of seconds as diff system may have diff hardware.
	 * The time measured using no of operations.
	 * The rate at which no of operation grows as input grows.
	 * n is no of inputs. O(n) is no of operations
	 * Big O focuses on individual operation and only worst-case scenarios.
	 * While amortized analysis considers the average cost over a sequence of operations
	 * O(n^3+n^2) -> n^2 can be avoided
	 * 
	 * If the no of operation grows linearly with increasing input its O(n)
	 * If no of operations grows quadtrically with increasing inputs its O(n^2)
	 * 
	 * arr[0] = 2, does not change as the size of input grows. O(1)
	 * for loop does three operations assign, check and increment for n=1
	 * For n= 5, it does 5 * 3 operations.
	 * For 5 sized input it does 5*3 operations. For 100 it does 100*3 operations. O(n*3) = O(n)
	 * Nested for loop, for each outer input the inner loop runs n times. for n inputs the inner loop n times.
	 * if else has O(1) as they take in only single value irrspective of size of input
	 * Inserting at 0 is O(1) but inserting at the end is O(n) as need to traverse till middle.
	 * arr[1], pop(), adding item to hasmap or removing is O(1)
	 * 
	 * O(1) < O(logn) < O(n) < O(nlogN) < O(n^2) < O(n^3) < O(2^n) < O(n!)
	 * 
	 * If we keep on halving input sizes in each iteration its logN
	 * 
	 * Most of recursive have exponential, (recursive_branches)^n
	 */
	
	/*
	 * The space can be extra auxiliary space to solve the given problem,
	 * or input space to in which inputs are stored.
	 * All extra things we do to calculate comes under auxillary.
	 * Never change given input data to store extra memory
	 * The recursive function calls at same level dont exists at same time in the stack
	 * Only linked function calls like parent and child exists at a time
	 * So the space complexity if height of the tree from top to bottom of longest path.
	 */
}
