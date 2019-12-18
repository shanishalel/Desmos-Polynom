package dataStructure;

import utils.Point3D;

public class Node_data_ implements node_data {
	private Integer KEY;
	private Point3D POINT3D;
	private double WEIGHT;
	private String INFO;
	private int TAG;
	
	public Node_data_(Integer KEY ,Point3D POINT3D , double WEIGHT) {
		this.KEY = KEY;
		this.POINT3D = POINT3D;
		this.WEIGHT =WEIGHT;
	}

	@Override
	public int getKey() {
		return this.KEY;
	}

	@Override
	public Point3D getLocation() {
		return this.POINT3D;
	}

	@Override
	public void setLocation(Point3D p) {
		double x=p.x();
		double y=p.y();
		double z=p.z();
		this.POINT3D=new Point3D (x,y,z);
	
	}

	@Override
	public double getWeight() {
		return this.WEIGHT;
	}

	@Override
	public void setWeight(double w) {
		this.WEIGHT=w;

	}

	@Override
	public String getInfo() {
		return this.INFO;
	}

	@Override
	public void setInfo(String s) {
		this.INFO=s;

	}

	@Override
	public int getTag() {
		return TAG;
	}

	@Override
	public void setTag(int t) {
		this.TAG=t;
	}

}
