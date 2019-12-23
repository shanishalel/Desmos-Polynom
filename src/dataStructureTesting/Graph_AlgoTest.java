package dataStructureTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import algorithms.Graph_Algo;
import algorithms.graph_algorithms;
import dataStructure.DGraph;
import dataStructure.Nodes;
import dataStructure.node_data;
import utils.Point3D;

class Graph_AlgoTest {

	@Test
	void testInitGraph() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
			Nodes n = new Nodes(i , p);
			d.addNode(n);
		}
		for(int i =1 ; i <d.nodeSize() ;i++) {
			d.connect(1, i, i);
		}
		//1->2, 1->3, 1->4, 1->5, 1->6, 1->7, 1->8, 1->9
		Graph_Algo graph = new Graph_Algo();
		graph.init(d);
	}

	@Test
	void testInitString() {
		fail("Not yet implemented");
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testIsConnected() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<=5 ;i++){
			Point3D p = new Point3D(j, j, j);
			Nodes n = new Nodes(i , p);
			d.addNode(n);
		}
		d.connect(1, 2, 3);
		d.connect(2, 5, 1);
		d.connect(2, 3, 7);
		d.connect(5, 1, 2);
		d.connect(3, 4, 5);
		d.connect(4, 1, 1);
		Graph_Algo graph = new Graph_Algo();
		graph.init(d);
		graph.isConnected();
	}

	@Test
	void testShortestPathDist() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<=6 ;i++){
			Point3D p = new Point3D(j, j, j);
			Nodes n = new Nodes(i , p);
			d.addNode(n);
		}
		d.connect(1, 2, 3);
		d.connect(1, 3, 1);
		d.connect(2, 3, 7);
		d.connect(3, 4, 2);
		d.connect(2, 4, 5);
		d.connect(2, 6, 1);
		d.connect(4, 6 ,7);
		Graph_Algo graph = new Graph_Algo();
		graph.init(d);
		System.out.println(graph.shortestPathDist(1, 6));
	}

	@Test
	void testShortestPath() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<=6 ;i++){
			Point3D p = new Point3D(j, j, j);
			Nodes n = new Nodes(i , p);
			d.addNode(n);
		}
		d.connect(1, 2, 3);
		d.connect(1, 3, 1);
		d.connect(2, 3, 7);
		d.connect(3, 4, 2);
		d.connect(2, 4, 5);
		d.connect(2, 6, 1);
		d.connect(4, 6 ,7);
		Graph_Algo graph = new Graph_Algo();
		graph.init(d);
		System.out.println(graph.shortestPath(1, 6));
	}

	@Test
	void testTSP() {
		fail("Not yet implemented");
	}

	@Test
	void testCopy() {
		fail("Not yet implemented");
	}

}
