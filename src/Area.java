package src;

/*
 * The classes shapes.Square and shapes.Circle must implement this interface.
 */
public interface Area
{
	/**
	 * @return the area of a shape. The type is double so there won't be type casting issues with the Java Math library. 
	 */
    double getArea();
}