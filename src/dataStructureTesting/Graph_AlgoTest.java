package dataStructureTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

import algorithms.Graph_Algo;
import algorithms.graph_algorithms;
import dataStructure.DGraph;
import dataStructure.Nodes;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

class Graph_AlgoTest implements java.io.Serializable {

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
		graph.save("test_save1.txt");
		Graph_Algo graph1 = new Graph_Algo();
		graph1.init("test_save1.txt");
		
		
	}

	@Test
	void testSave() {
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
		graph.save("test_save.txt");

	}

	@Test
	void testIsConnected() {
//		DGraph d = new DGraph();
//		int j=1;
//		for (int i =1 ; i<=5 ;i++){
//			Point3D p = new Point3D(j, j, j);
//			Nodes n = new Nodes(i , p);
//			d.addNode(n);
//		}
//		d.connect(1, 2, 3);
//		d.connect(2, 5, 1);
//		d.connect(2, 3, 7);
//		d.connect(5, 1, 2);
//		d.connect(3, 4, 5);
//		d.connect(4, 1, 1);
//		Graph_Algo graph = new Graph_Algo();
//		graph.init(d);
//		if(!graph.isConnected()) {
//			fail();
//		}
//		
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		System.out.println(timestamp);
//		graph test = MillionVertex();
//		Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
//		System.out.println(timestamp2);
//		Graph_Algo gM = new Graph_Algo();
//		gM.init(test);
//		Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
//		System.out.println(timestamp3);
//		System.out.println(gM.isConnected());
//		Timestamp timestamp4 = new Timestamp(System.currentTimeMillis());
//		System.out.println(timestamp4);
//	}
//	
//	graph MillionVertex()
//	{
//		graph graph = new DGraph();
//		Random rand = new Random();
//		for (int i = 1; i <= 10000; i++) {
//			Point3D p = new Point3D(rand.nextInt(600), rand.nextInt(600));
//			graph.addNode(new Nodes(i,p));
//		}
//		for (int i = 1; i <= 10000-3; i++) {
//			graph.connect(i, i+1, 30);
//			graph.connect(i, i+2, 30);
//			graph.connect(i, i+3, 30);
//			graph.connect(i, i+4, 30);
			//graph.connect(i, i+5, 30);
//		}
//		graph.connect(9997, 1, 30);
//		graph.connect(9998, 1, 30);
//		graph.connect(9999, 1, 30);
//		Collection<node_data> nd = graph.getV();
//		for (node_data node_data : nd) {
//			//System.out.println(node_data.getKey());
//			for(int i=0;i<5;i++)
//			{
//				int dest = rand.nextInt(100000);
//				while(dest != node_data.getKey())
//				{
//					dest = rand.nextInt(100000);
//				}
//				double weight = rand.nextDouble();
//				weight*= 100;
//				graph.connect(node_data.getKey(), dest, weight);
//			}
//		}
		
//		return graph;
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
		System.out.println(graph.shortestPath(1, 6));
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
		try {
			System.out.println(graph.shortestPath(1, 6));
		}
		catch(Exception e) {
			System.out.println("good");
		}
		
	}

	//should be : 1,2,3,4,5
	@Test
	void testTSP() {
		DGraph d = new DGraph();
		List <Integer> targets = new ArrayList<Integer>();
		int j=1;
		for (int i =1 ; i<=6 ;i++){
			Point3D p = new Point3D(j, j, j);
			Nodes n = new Nodes(i , p);
			targets.add(n.getKey());
			d.addNode(n);
			}
		
		d.connect(1, 3, 1);
		d.connect(2, 3, 7);
		d.connect(3, 4, 2);
		d.connect(2, 4, 5);
		d.connect(2, 6, 1);
		d.connect(4, 6 ,7);
		Graph_Algo graph = new Graph_Algo();
		graph.init(d);
		System.out.println("the shorts path"+graph.shortestPathDist(1,2));
		try {
		graph.TSP(targets);
		}
		catch(Exception e) {
			System.out.println("good");
		}
	
	}

	@Test
	void testCopy() {
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
		//for deep copy the location in the memory shouldn't be the same
		if(graph.equals(graph.copy())) {
			fail();
		}
		
		
		
	}

}
