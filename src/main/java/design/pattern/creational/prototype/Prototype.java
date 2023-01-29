package design.pattern.creational.prototype;

public interface Prototype {

	public AccessControl clone() throws CloneNotSupportedException;
	
}
