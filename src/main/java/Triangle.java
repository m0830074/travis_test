package main;

/**
 * 三角形
 */
public class Triangle {
	
	private int e1, e2, e3;

    public Triangle(int e1, int e2, int e3){
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	public int getEdge1(){
		return this.e1;
	}
	
	public int getEdge2(){
		return this.e2;
	}
	
	public int getEdge3(){
		return this.e3;
	}
	
}
