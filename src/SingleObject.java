
public class SingleObject {
	
	private static SingleObject SINGLE_OBJECT;
	
	private SingleObject(){};
	
	public static SingleObject getSingleObject(){
		if(SINGLE_OBJECT==null){
			return new SingleObject();
		}
		return SINGLE_OBJECT;
	}
	
	public void showMessage(){
		System.out.println("Hello World");
	}

}
