package algorithms;

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
		
		
		
		
		return false;
	}

	@Override
	public double shortestPathDist(int src, int dest) {
		setWeight(src);
		Dijkstras(src);
//		graph.getNode(src).setTag(1);
//		Collection <node_data> nodes = this.graph.getV();
//		for (node_data node_data : nodes) {
//			Collection <edge_data> Edges = this.graph.getE(dest);
//			
//			
//			this.graph.getE(dest).iterator();
//			for(edge_data edge_data : Edges) {
//				double myWieght = node_data.getWeight();
//				double weight=edge_data.getWeight();
//				int id = edge_data.getDest();
//				if (myWieght + weight <  ) {
//				node_data.setWeight(weight);
//			}
			
			
		
		
		return 0;
	}
	
	private void Dijkstras(int src) {
		node_data nowNode = graph.getNode(src);
		node_data current = null;
		
		while (nowNode != null ) {
			nowNode.setTag(1);
			current=null;
			Collection <edge_data> Edges = this.graph.getE(nowNode.getKey());
			for (edge_data edge_data : Edges) {
				node_data nei_node = graph.getNode(edge_data.getDest());
				double weight_node = nowNode.getWeight();
				double weight_nie = nei_node.getWeight();
				double weight_edge = edge_data.getWeight();
				
				if (weight_node + weight_edge < weight_nie  ) {
					nei_node.setWeight(weight_node + weight_edge);
					nowNode.setInfo(nei_node.getKey()+"");
					
					if(nowNode==null && nei_node.getTag()==0 ) {
						nowNode=nei_node;
					}
				}
				
				
			}
			
			
			
			
		}
		
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
		// TODO Auto-generated method stub
		return null;
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

		return ans;
	}

}
