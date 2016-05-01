
public class SingeltonPatternDemo {

	public static void main(String[] args) {
		
		SingleObject singleObject = SingleObject.getSingleObject();
		singleObject.showMessage();

	}

}
