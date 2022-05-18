
package first;

import java.util.*;

class Point {
	private int x, y;
	public Point (int xx, int yy){
		if (xx>=0) x=xx;
		y=yy;
	}
	double dist (Point q) {
		int dx = x-q.x;
		int dy= y-q.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
}

public class C1 {
    
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int i= 0;
		i = s.nextInt();
		i += 2;
		System.out.println(i);
		// TODO Auto-generated method stub
        Point p = new Point(0,0);
        Point a = new Point (4, 4);
        System.out.println(p.dist(a));
	}

}
