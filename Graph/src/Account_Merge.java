import java.util.*;
import java.util.Map.Entry;

public class Account_Merge {

	public static void main(String[] args) {
		List<List<String>> graph = new ArrayList() {
            {
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j2@com", "j3@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j4@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r1@com", "r2@com")));
                add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j5@com")));
                add(new ArrayList<String>(Arrays.asList("Raj", "r2@com", "r3@com")));
                add(new ArrayList<String>(Arrays.asList("Mary", "m1@com")));

            }
        };
        
        merge(graph);
	}
	
	public static void merge(List<List<String>> graph) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Disjoint_Set DS = new Disjoint_Set(graph.size()-1);
		
		ArrayList<ArrayList<String>> ans = new ArrayList();

		for(int i = 0; i < graph.size(); i++) {
			for(int j = 1; j < graph.get(i).size(); j++) {
				String mail = graph.get(i).get(j);
				
				if(map.containsKey(mail) == false) {
					map.put(mail, i);
				} else {
					DS.union(map.get(mail), i);
				}
			}
			ans.add(i, new ArrayList());
			ans.get(i).add(graph.get(i).get(0));
		}
		
		for(int i = 0; i<DS.parent.length; i++) {
			System.out.print(i + " -> " + DS.parent[i] + " ");
		}
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			String email = entry.getKey();
			int index = entry.getValue();
			
			int ultimateParent = DS.findParent(index);
			
			ans.get(ultimateParent).add(email);
			
		}
		
		for(ArrayList<String> str: ans) {
			System.out.println(str);
		}
	}

}
