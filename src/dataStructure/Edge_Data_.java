package dataStructure;

public class Edge_Data_ implements edge_data {
	
	private node_data SRC;
	private node_data DEST;
	private double WEIGHT;
	private String INFO;
	private int TAG;
	
	public Edge_Data_ (node_data SRC, node_data DEST, double WEIGHT) {
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

}
