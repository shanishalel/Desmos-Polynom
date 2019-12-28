package Gui_graph;

import java.util.Collection;
import java.util.Random;

import algorithms.Graph_Algo;
import algorithms.graph_algorithms;
import dataStructure.DGraph;
import dataStructure.Nodes;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

public class main_gui {

	public static void main(String[] args) {
//		testmaybe();
			test();
	}

	public static void test() {
		DGraph d = new DGraph();
		d.addNode(new Nodes(1, new Point3D(130, 130)));
		d.addNode(new Nodes(2, new Point3D(200, 140)));
		d.addNode(new Nodes(3, new Point3D(600, 600)));
		d.addNode(new Nodes(4, new Point3D(100, 400)));
		d.addNode(new Nodes(5, new Point3D(120, 300)));
		d.addNode(new Nodes(6, new Point3D(200, 123)));
		d.addNode(new Nodes(7, new Point3D(250, 250)));
		d.addNode(new Nodes(8, new Point3D(20, 400)));
		d.addNode(new Nodes(9, new Point3D(330, 145)));
		d.addNode(new Nodes(10, new Point3D(155, 155)));
		d.connect(1, 2, 10);
		d.connect(1, 3, 4);
		d.connect(2, 4, 5);
		d.connect(3, 2, 2);
		d.connect(5, 6, 7);
		d.connect(1, 5, 3);
		d.connect(10, 7, 2);
		d.connect(10, 1, 1);
		d.connect(1, 7, 6);
		d.connect(9, 3, 2);
		d.connect(3, 10, 10);
		d.connect(8, 3, 4);
		Gui_Graph graph = new Gui_Graph(d);
		
	}
}
