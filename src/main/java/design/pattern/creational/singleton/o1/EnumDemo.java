package design.pattern.creational.singleton.o1;

public class EnumDemo {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

	}

}
