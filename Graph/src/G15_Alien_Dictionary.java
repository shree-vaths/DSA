
public class G15_Alien_Dictionary {

	public static void main(String[] args) {
		String[] str = {"baa", "abcd", "abca", "cab", "cad"};
		findOrder(5, str);
	}
	
	public static void findOrder(int N, String[] str) {
		int[][] graph = new int[N][N];
		
		for(int i = 0; i < N-1; i++) {
			String s1 = str[i];
			String s2 = str[i+1];
			
			int len = Math.min(s1.length(), s2.length());
			
			for(int j = 0; j < len; j++) {
				if(s1.charAt(j) != s2.charAt(j)) {
					graph[s1.charAt(j) - 'a'][s2.charAt(j) - 'a'] = 1;
					break;
				}
			}
		}
		
		for(int[] row: graph) {
			for(int val: row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println();
		Topological_Sort_DFS.topological(graph);
	}

}
