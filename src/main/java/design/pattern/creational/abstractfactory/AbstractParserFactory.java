package design.pattern.creational.abstractfactory;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
	
}
