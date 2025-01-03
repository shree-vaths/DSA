
public class R00_Start {

	/*
	 * Not Doing -
	 * L13 - Permutation 2
	 */
	
	/* Recursion -
	 * Check if problem can be divided into smaller problems
	 * Identify the base condition from the question.
	 * If we are waiting for result from below steps to complete our processing, its called tailed recursion.
	 * The function ends on return or when last } is reached
	 * Recursion can be linear or divide and concur.
	 * In linear the problem is divided linearly in small steps.
	 * In divide and concur, the problem is divided into multiple pieces in larger steps.
	 * Divide and concur is most efficient.
	 * 
	 * Variables -
	 * If you want to pass some values to next recursive call, then pass into function parameter
	 * If the variable is only limited to one function call, then keep it in the body.
	 * return from every function if there is return type mentioned
	 * Never do fun(n--), this is infinite loop
	 * 
	 * While going down, we can calculate the result. When we reach the end we can just return that result
	 * We can reach the end and while coming back we can keep on aggregating the result.
	 * We can update the result into external global variable.
	 * 
	 * 
	 * We can add restriction if to avoid infinite loop
	 * This can be added as base condition from which function call would return back at the end
	 * Or we can add this before calling that function call which will lead to infinite loop
	 * 
	 */
}
