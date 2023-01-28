package design.pattern.creational.factorymethod;

public class ErrorXMLDisplayService extends DisplayService{
	
	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
