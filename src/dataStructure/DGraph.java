package dataStructure;

import java.util.Collection;
import java.util.Hashtable;

public class DGraph implements graph{
	Hashtable<Integer, Node_data_> hash = new Hashtable<Integer, Node_data_>();
	Node_data_ NODE;
	
	public DGraph( Node_data_ NODE) {
		hash.put(NODE.getKey(), NODE);
	}
	
	@Override
	public node_data getNode(int key) {
		if (key != 0) {
			return hash.get(key);
		}
		return null;
	}

	@Override
	public edge_data getEdge(int src, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNode(node_data n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect(int src, int dest, double w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<node_data> getV() {
		// TODO Auto-generated method stub
		return null;
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
