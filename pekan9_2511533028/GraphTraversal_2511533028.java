package pekan9_2511533028;

import java.util.*;
public class GraphTraversal_2511533028 {
	private Map<String, List<String>> graph_3028 = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_3028(String node1, String node2) {
		graph_3028.putIfAbsent(node1, new ArrayList<>());
		graph_3028.putIfAbsent(node2, new ArrayList<>());
		graph_3028.get(node1).add(node2);
		graph_3028.get(node2).add(node1);
	}
	// Menampilkan graf awal
	public void printGraph_3028() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node : graph_3028.keySet()) {
			System.out.print(node + " -> ");
			List<String> neighbors = graph_3028.get(node);
			System.out.println(String.join(", ", neighbors));
		}
		System.out.println();
	}
	
    // DFS rekursif
	public void dfs_3028(String start_3028) {
		Set<String> visited_3028 = new HashSet<>();
		System.out.println("Penelusuran  DFS:");
		dfsHelper_3028(start_3028, visited_3028);
		System.out.println();
	}
	private void dfsHelper_3028(String current_3028, Set<String> visited_3028) {
		if (visited_3028.contains(current_3028)) return;
		visited_3028.add(current_3028);
		System.out.print(current_3028 + " ");
		for (String neighbor_3028 : graph_3028.getOrDefault(current_3028, new ArrayList<>())) {
			dfsHelper_3028(neighbor_3028, visited_3028);
		}
	}
	// BFS iteratif
		public void bfs_3028(String start_3028) {
			Set<String> visited_3028 = new HashSet<>();
			Queue<String> queue_3028 = new LinkedList<>();
		        
			queue_3028.add(start_3028);
			visited_3028.add(start_3028);
		        
			System.out.println("Penelusuran BFS:");
			while (!queue_3028.isEmpty()) {
				String current_3028 = queue_3028.poll();
				System.out.print(current_3028 + " ");
		            
				for (String neighbor_3028 : graph_3028.getOrDefault(current_3028, new ArrayList<>())) {
					if (!visited_3028.contains(neighbor_3028)) {
						queue_3028.add(neighbor_3028);
						visited_3028.add(neighbor_3028);
					}
				}
			}
			System.out.println();
		}

		// Main
		public static void main(String[] args) {
			GraphTraversal_2511533028 graph_3028 = new GraphTraversal_2511533028();

			graph_3028.addEdge_3028("A", "B");
			graph_3028.addEdge_3028("A", "C");
			graph_3028.addEdge_3028("B", "D");
			graph_3028.addEdge_3028("B", "E");
			
			graph_3028.printGraph_3028();

			graph_3028.dfs_3028("A");
			graph_3028.bfs_3028("A");
		}

}
