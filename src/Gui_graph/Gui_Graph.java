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
import java.util.LinkedList;

import javax.swing.JFrame;

import algorithms.Graph_Algo;
import dataStructure.graph;
import utils.Point3D;

public class Gui_Graph extends JFrame implements ActionListener, MouseListener
{
	private graph graph;
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6128157318970002904L;
	LinkedList<Point3D> points = new LinkedList<Point3D>();
	
	public void init(graph g) {
		this.graph=g;
	}
	
	public Gui_Graph()
	{
		initGUI();
	}
	
	private void initGUI() 
	{
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		MenuItem isConnected = new MenuItem("is Connected");
		isConnected.addActionListener(this);
		
		MenuItem shortestPathDist = new MenuItem("shortest Path Dist");
		shortestPathDist.addActionListener(this);
		
		MenuItem shortestPath = new MenuItem("shortest Path");
		shortestPath.addActionListener(this);
		
		graph_paint.add(isConnected);
		graph_paint.add(shortestPathDist);
		graph_paint.add(shortestPath);
		
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Point3D prev = null;
		
		for (Point3D p : points) 
		{
			g.setColor(Color.ORANGE);
			g.fillOval((int)p.x(), (int)p.y(), 10, 10);
			
			if(prev != null)
			{
				g.setColor(Color.BLUE);
				g.drawLine((int)p.x(), (int)p.y(), 
						(int)prev.x(), (int)prev.y());
				
				g.drawString("5", (int)((p.x()+prev.x())/2),(int)((p.y()+prev.y())/2));
			}
			
			prev = p;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String str = e.getActionCommand();
		
		if(str.equals("Save graph"))
		{
			Point3D p1 = new Point3D(100,100);
			Point3D p2 = new Point3D(50,300);
			Point3D p3 = new Point3D(400,150);
			
			points.add(p1);
			points.add(p2);
			points.add(p3);
			
			repaint();
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
//		JFileChooser fileChooser = new JFileChooser();
//		if (fileChooser.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
//		  File file = fileChooser.getSelectedFile();
//		   load from file
//		}
		
//		int x = e.getX();
//		int y = e.getY();
//		Point3D p = new Point3D(x,y);
//		points.add(p);
//		repaint();
//		System.out.println("mousePressed");		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
