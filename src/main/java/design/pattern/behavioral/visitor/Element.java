package design.pattern.behavioral.visitor;

public interface Element {

	public void accept(Visitor visitor);
	
}