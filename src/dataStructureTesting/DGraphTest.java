package dataStructureTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructure.DGraph;
import dataStructure.Nodes;
import utils.Point3D;

class DGraphTest {

	@Test
	void testGetNode() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEdge() {
		fail("Not yet implemented");
	}

	@Test
	void testAddNode() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
		    Nodes n = new Nodes(i , p , i);
		    d.addNode(n);
		}
	}

	@Test
	void testConnect() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
		    Nodes n = new Nodes(i , p , i);
		    d.addNode(n);
		}
		for(int i =1 ; i <d.nodeSize() ;i++) {
			 if (i+1 <d.nodeSize()) {
			d.connect(i, i+1, i);
			 }
		}
	}

	@Test
	void testGetV() {
		fail("Not yet implemented");
	}

	@Test
	void testGetE() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveNode() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
		    Nodes n = new Nodes(i , p , i);
		    d.addNode(n);
		}
		if (d.nodeSize() != 9) {
			fail();
		}
		d.removeNode(6);
		if (d.nodeSize() != 8) {
			fail();
		}
	}

	@Test
	void testRemoveEdge() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
		    Nodes n = new Nodes(i , p , i);
		    d.addNode(n);
		}
		for(int i =1 ; i <d.nodeSize() ;i++) {
			d.connect(1, i, i);
		}
		d.removeNode(1);
	}

	@Test
	void testNodeSize() {
		DGraph d = new DGraph();
		int j=1;
		for (int i =1 ; i<10 ;i++){
			Point3D p = new Point3D(j, j, j);
		    Nodes n = new Nodes(i , p , i);
		    d.addNode(n);
		}
		if (d.nodeSize() != 9) {
			fail();
		}
	}

	@Test
	void testEdgeSize() {
		fail("Not yet implemented");
	}
	
	@Test
	void testGetMC() {
		fail("Not yet implemented");
	}

}
