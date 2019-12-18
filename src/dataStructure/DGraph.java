package dataStructure;

import java.util.Collection;
import java.util.Hashtable;

public class DGraph implements graph{
	//this hash will represents the node
	Hashtable<Integer, node_data> hash = new Hashtable<Integer, node_data>();

	/*The function represent an edges by Hashtable <Integer, Hashtable<Node_data_, Edge_Data_>>  */
	Hashtable<node_data, Hashtable<Integer, edge_data>>  Edge= new Hashtable<node_data, Hashtable<Integer, edge_data>>();

//	public DGraph() {
//		hash.put(NODE.getKey(), NODE);
//	}

	@Override
	public node_data getNode(int key) {
		if (key != 0) {
			return hash.get(key);
		}
		return null;
	}

	@Override
	public edge_data getEdge(int src, int dest) {
		node_data Src = hash.get(src);
		Edge_Data_ edge = Edge.get(Src).get(dest);
		return edge;
	}

	@Override
	public void addNode(node_data n) {
		Node_data_ ver = (Node_data_) n; 
		hash.put(n.getKey(), ver);
	}

	@Override
	public void connect(int src, int dest, double w) {
		Edge_Data_ edge = new Edge_Data_(hash.get(src) , hash.get(dest), w);
		Hashtable<Integer, Edge_Data_> table= new Hashtable<Integer, Edge_Data_>();
		table.put(dest, edge);
		Edge.put(hash.get(src), table );
	}

	@Override
	public Collection<node_data> getV() {
		return hash.values();
	}

	@Override
	public Collection<edge_data> getE(int node_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public node_data removeNode(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public edge_data removeEdge(int src, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nodeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edgeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMC() {
		// TODO Auto-generated method stub
		return 0;
	}

}
