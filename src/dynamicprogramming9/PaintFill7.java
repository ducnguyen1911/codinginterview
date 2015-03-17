package dynamicprogramming9;

import java.util.ArrayList;
import java.util.List;

public class PaintFill7 {

	public Integer[][] arrColor;
	public Integer[][] arrFlag;
	public static int size = 10;
	
	public static void main(String[] args) {
		PaintFill7 pf = new PaintFill7();
		pf.init();
		print(pf.arrColor);
		int lat = 5;
		int log = 5;
		int curColor = pf.arrColor[lat][log];
		int newColor = 3;
		pf.fill(lat, log, curColor, newColor);
		print(pf.arrColor);
	}

	private static void print(Integer[][] arr) {
		System.out.println("Print: ...");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void init(){
		this.arrColor = new Integer[size][size];
		this.arrFlag = new Integer[size][size];
		// random assign colors for each cell
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j ++){
				if (i == 0 || j == 0 || i == size-1 || j == size-1){
					this.arrColor[i][j] = 0;  // random
				} else this.arrColor[i][j] = 1;  // random
			}
		}
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j ++){
				this.arrFlag[i][j] = 0;
			}
		}
	}

	private void fill(int lat, int log, int curColor, int newColor){
		this.arrFlag[lat][log] = 1;
		this.arrColor[lat][log] = newColor;
		for (Point p : this.getNeighbors(lat, log)){
			if ((this.arrFlag[p.getLat()][p.getLog()] == 0) 
				&& (this.arrColor[p.getLat()][p.getLog()] == curColor)){
				fill(p.getLat(), p.getLog(), curColor, newColor);
			}
		}

	}

	private List<Point> getNeighbors(int lat, int log){
		List<Point> neighbors = new ArrayList<Point>();
		neighbors.add(new Point(lat -1, log - 1));
		neighbors.add(new Point(lat -1, log ));
		neighbors.add(new Point(lat -1, log + 1));
		neighbors.add(new Point(lat, log - 1));
		neighbors.add(new Point(lat, log + 1));
		neighbors.add(new Point(lat +1, log - 1));
		neighbors.add(new Point(lat +1, log ));
		neighbors.add(new Point(lat +1, log + 1));
		return neighbors;
	}

	class Point{
		int lat;
		int log;
		public Point(int lt, int lg){
			this.lat = lt;
			this.log = lg;
		}

		public int getLat(){ return this.lat;}
		public int getLog(){ return this.log;}
	}


}
