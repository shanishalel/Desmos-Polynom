package dataStructureTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructure.Nodes;
import utils.Point3D;

class NodesTest {

	@Test
	void testNodes() {
		Point3D point1=new Point3D(1,2,3);
		 Nodes node1= new Nodes(1,point1 );
		if(node1.getKey()!=1) {
			fail("Not the same key");	
		}
		if(node1.getWeight()!=5.0) {
			fail("Not the same weight");	
		}
		
	}

	@Test
	void testGetKey() {
		
	}

	@Test
	void testGetLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetWeight() {
		fail("Not yet implemented");
	}

	@Test
	void testSetWeight() {
		fail("Not yet implemented");
	}

	@Test
	void testGetInfo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetInfo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTag() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTag() {
		fail("Not yet implemented");
	}

}
