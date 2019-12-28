package Gui_graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JFrame;

import algorithms.Graph_Algo;
import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;

public class Gui_Graph extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private graph graph;
	private static final long serialVersionUID = 6128157318970002904L;
	LinkedList<Point3D> points = new LinkedList<Point3D>();

	public Gui_Graph(){
		this.graph =null;
		initGUI();
	}

	public Gui_Graph(graph g)
	{
		this.graph=g;
		initGUI();
	}

	private void initGUI() 
	{
		this.setSize(1000, 10000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// menu up
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("Menu");
		menuBar.add(menu);
		Menu graph_paint = new Menu("Graph commands");
		menuBar.add(graph_paint);
		this.setMenuBar(menuBar);

		MenuItem save = new MenuItem("Save graph");
		save.addActionListener(this);

		MenuItem load = new MenuItem("Load graph");
		load.addActionListener(this);

		menu.add(save);
		menu.add(load);

		// graph up
		MenuItem Drawgraph = new MenuItem("Draw graph");
		Drawgraph.addActionListener(this);
		MenuItem shortestPathDist = new MenuItem("shortest Path Dist");
		shortestPathDist.addActionListener(this);
		MenuItem shortestPath = new MenuItem("shortest Path");
		shortestPath.addActionListener(this);
		graph_paint.add(Drawgraph);
		graph_paint.add(shortestPathDist);
		graph_paint.add(shortestPath);
	}

	public void paint(Graphics g)
	{
		super.paint(g);


		if(this.graph != null) {
			Collection <node_data> Nodes = this.graph.getV();
			for (node_data node_data : Nodes) {
				Point3D p = node_data.getLocation();
				g.setColor(Color.ORANGE);
				g.fillOval(p.ix(), p.iy(), 10, 10);
				g.drawString(Integer.toString(node_data.getKey()), p.ix(), p.iy()-1);
				Collection<edge_data> Edge = this.graph.getE(node_data.getKey());
				for (edge_data edge_data : Edge) {
					node_data dest = graph.getNode(edge_data.getDest());
					Point3D p2 = dest.getLocation();
					g.setColor(Color.BLUE);
					g.drawLine(p.ix(), p.iy(),
							p2.ix(), p2.iy());
					g.drawString(Double.toString(edge_data.getWeight()),(p.ix()+p2.ix())/2 , (p.iy()+p2.iy())/2);
					g.setColor(Color.GREEN);
					g.fillOval(p2.ix()-3, p2.iy()-3, 5, 5);
				}
			}
		}
	}

	private void Savegraph() {
		
	}
	
	private void Loadgraph() {
		
	}
	
	private void shortestPathDist() {
		
	}
	
	private void shortestPath() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String str = e.getActionCommand();

		switch(str) {
		case "Draw graph" : repaint();
		break;
		case "Save graph": Savegraph();
		break;
		case "Load graph": Loadgraph();
		break;
		case "shortest Path Dist": shortestPathDist();
		break;
		case "shortest Path": shortestPath();
		break;
		default:
			break;

		}
	}

}
