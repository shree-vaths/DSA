
public class Kruskal {

	public static void main(String[] args) {
		Disjoint_Set DS = new Disjoint_Set(7);
		
		DS.union(1, 2);
		DS.union(2, 3);
		DS.union(4, 5);
		DS.union(6, 7);
		DS.union(5, 6);
		DS.union(3, 7);
		
	}

}
