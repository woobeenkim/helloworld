package com.javaex.ex05;

public class Point {

	private int x,y;
	
	public Point() {}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y; 
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw()
	{	
		System.out.println("[점] x좌표 : "+ x +", y좌표 : "+ y);
	}
	/*
	public boolean equals(Object obj)
	{
		Point p = (Point)obj;
		if((this.x == p.x) && (this.y == y))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	*/
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]" + this.hashCode();
	}
	
	
	
	

}
