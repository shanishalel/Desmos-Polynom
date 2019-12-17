package dataStructure;

public class Edge_Data_ implements edge_data {
	private Node_data_ SRC;
	private Node_data_ DEST;
	private Integer WEIGHT;
	private String INFO;
	
	public Edge_Data_ (Node_data_ SRC, Node_data_ DEST, Integer WEIGHT) {
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTag(int t) {
		// TODO Auto-generated method stub
		
	}

}
