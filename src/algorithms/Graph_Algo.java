package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import dataStructure.DGraph;
import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
/**
 * This empty class represents the set of graph-theory algorithms
 * which should be implemented as part of Ex2 - Do edit this class.
 * @author 
 *
 */
public class Graph_Algo implements graph_algorithms{
	private graph graph ;


	@Override
	public void init(graph g) {
		this.graph=g;
	}

	@Override
	public void init(String file_name) {

	}

	@Override
	public void save(String file_name) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isConnected() {
		int count =1;
		Collection <node_data> Nodes = this.graph.getV();
		for (node_data node_data : Nodes) {
			int key = node_data.getKey();
			setWeight(key);
			if (!firstCanGet2(node_data, count , key)) return false;	
		}
		return false;
	}

	private boolean firstCanGet2 (node_data node , int count , int key) {
		Collection <node_data> Nodes = this.graph.getV();
		Collection <edge_data> Edges = this.graph.getE(node.getKey());
		node_data node1 = null;
		if (count == graph.nodeSize() ) {
			return true;
		}
		while(graph.getNode(key) != node   ) {
		for (edge_data edge_data : Edges) {
			node1 = graph.getNode(edge_data.getDest());
			if (node.getTag() == 0) {
				node1.setTag(1);
				count++;
				return firstCanGet2(node1 , count , key);
			}
			else {
				return firstCanGet2(node1 , count ,key);
			}
		}
		}


		return false;
	}

	private boolean firstCanGet(node_data node) {
		int count=1;
		Collection <node_data> Nodes = this.graph.getV();
		ArrayList<node_data> nei = new ArrayList<node_data>();
		Collection <edge_data> Edges = this.graph.getE(node.getKey());
		for (node_data node_data : Nodes) {
			for (edge_data edge_data : Edges) {
				int key=edge_data.getDest();
				nei.add(graph.getNode(key));
			}
			if(node_data.getTag()==0) {
				node_data.setTag(1);
				count++;
				node_data=nei.get(0);
			}
			else {

			}
		}

		return false;
	}

	@Override
	public double shortestPathDist(int src, int dest) {
		setWeight(src);
		Dijkstras(src);	
		return graph.getNode(dest).getWeight();
	}

	private void Dijkstras(int src) {
		node_data nowNode = graph.getNode(src);
		ArrayList<node_data> currentmin = new ArrayList<node_data>();
		currentmin.add(nowNode);
		while (!currentmin.isEmpty()) {
			nowNode = currentmin.get(0);
			currentmin.remove(0);
			if (nowNode.getTag() == 0) {
				nowNode.setTag(1);
				Collection <edge_data> Edges = this.graph.getE(nowNode.getKey());
				for (edge_data edge_data : Edges) {
					node_data nei_node = graph.getNode(edge_data.getDest());
					double weight_node = nowNode.getWeight();
					double weight_nie = nei_node.getWeight();
					double weight_edge = edge_data.getWeight();

					if (weight_node + weight_edge < weight_nie  ) {
						nei_node.setWeight(weight_node + weight_edge);
						nei_node.setInfo(nowNode.getKey()+"");
						if (nei_node.getTag() == 0) {
							int index = searchInsert(currentmin ,nei_node.getWeight());
							currentmin.add(index, nei_node);
						}
					}
				}
			}
		}

	}

	private static int searchInsert(ArrayList<node_data> arr, double target) {
		int hight = arr.size()-1;
		int low =0;
		int mid = low +((hight-low)/2);
		if (arr.size() == 0) {
			return 0;
		}
		else {
			while (low <= hight) {
				if (arr.get(mid).getWeight() == target ) {
					return mid;
				}
				if (arr.get(mid).getWeight() > target ) {
					hight=mid-1;
				}
				if (arr.get(mid).getWeight() < target  ) {
					low = mid+1;
				}
				mid = low +((hight-low)/2);
			}
		}
		return mid;
	}

	/* This function set the weight, and the tag to 0  */
	private void setWeight(int src) {
		//run alll over the hashtable and initialized the weight and the tag to 0
		Collection <node_data> nodes = this.graph.getV();
		for (node_data Collection : nodes) {
			Collection.setWeight(999999999);
			Collection.setTag(0);
		}
		graph.getNode(src).setWeight(0);

	}


	@Override
	public List<node_data> shortestPath(int src, int dest) {
		ArrayList<node_data> shortPath = new ArrayList<node_data>();
		setWeight(src);
		Dijkstras(src);
		String info = graph.getNode(dest).getInfo();
		int key = Integer.parseInt(info);
		shortPath.add(0,graph.getNode(dest));
		shortPath.add(0,graph.getNode(key));
		while (!shortPath.contains(graph.getNode(src))) {	
			info = graph.getNode(key).getInfo();
			key = Integer.parseInt(info);
			shortPath.add(0,graph.getNode(key));
		}
		return shortPath;
	}

	@Override
	public List<node_data> TSP(List<Integer> targets) {
		// TODO Auto-generated method stub
		return null;
	}

	//not finish
	@Override
	public graph copy() {
		// TODO Auto-generated method stub
		Graph_Algo ans= new Graph_Algo();
		ans.graph=this.graph;

		return null;
	}

}
