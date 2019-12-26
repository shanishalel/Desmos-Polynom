package Gui_graph;

import algorithms.Graph_Algo;
import dataStructure.DGraph;
import dataStructure.Nodes;
import utils.Point3D;

public class main_gui {

	public static void main(String[] args) {
			Gui_Graph window = new Gui_Graph();
			window.setVisible(true);
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

}
