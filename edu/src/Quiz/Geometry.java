package Quiz;

import java.util.ArrayList;
import java.util.List;


	
//게임 개발을 위해 아래 그림과 같이 객체를 정의.  
//Geometry를 추상클래스로 정의하고, 자식 클래스들의 속성과 메서드를 구현하라
//Point , Line , Polyline , TriAngle , Rectangle //자식클래스 5개의 객체
//
//int[] xArr;
//int[] yArr;
//double getArea();
//double getLength();


abstract class Geometry {
	List<Integer> xArr = new ArrayList<>();
	List<Integer> yArr = new ArrayList<>();
	abstract double getArea();
	abstract double getLength();
}

class Point extends Geometry{
	public Point(int x, int y) {
		xArr.add(x);
		yArr.add(y);
	
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString() {
		return "[" + xArr.get(0) + "," + xArr.get(0) + "," + yArr.get(0) + "]";
	}
	
	
	
}
class Line extends Geometry{
	public Line(int x1, int y1, int x2, int y2) {
		xArr.add(x1); yArr.add(y1);
		xArr.add(x2); yArr.add(y2);
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0; //피타고라스
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		return Line.length(xArr.get(0), yArr.get(0), xArr.get(1), yArr.get(1));
	}
	
	static double length(int x, int y, int x2, int y2) {
		//피타고라스
		return 0.0;
	}
	
}
class PolyLine extends Geometry{
	public PolyLine(int... arr) {
		for(int i = 0; i<arr.length/2; i++) {
			xArr.add(arr[2*i]); yArr.add(arr[2*i+1]);
		}
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		
		double ret = 0.0;
		for(int i = 0; i<xArr.size() -1; i++) {
			ret += Line.length(xArr.get(i), yArr.get(i), xArr.get(i+1), yArr.get(i+1));
					
		}	
		return ret;
	}
	
	
	
}

public class GeometryMethods {

}
