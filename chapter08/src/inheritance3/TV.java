package inheritance3;

public class TV {
	protected int size; //인치
	
	public TV() {}
	
	public TV(int size) { 
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>0) {
			this.size = size;
		}
	};
}
