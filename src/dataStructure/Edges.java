package dataStructure;

public class Edges implements edge_data {
	
	private node_data SRC;
	private node_data DEST;
	private double WEIGHT;
	private String INFO;
	private int TAG;
	private int countEdge;
	
	public Edges (node_data SRC, node_data DEST, double WEIGHT) {
		this.SRC = SRC;
		this.DEST = DEST;
		this.WEIGHT =WEIGHT;
	}
		
	@Override
	public int getSrc() {
		return this.SRC.getKey();
	}
	
	@Override
	public int getDest() {
		return this.DEST.getKey();
	}

	@Override
	public double getWeight() {
		return this.WEIGHT;
	}

	@Override
	public String getInfo() {
		return this.INFO;
	}

	@Override
	public void setInfo(String s) {
		this.INFO =s;
	}

	@Override
	public int getTag() {
		return TAG;
	}

	@Override
	public void setTag(int t) {
		this.TAG=t;
	}
	
	public void setcountEdge(int countEdge) {
		this.countEdge=countEdge;
	}

	public int getcountEdge () {
		return this.countEdge;
	}
}
