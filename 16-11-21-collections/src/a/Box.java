package a;

public class Box<T> {

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {
		Box<String> boxOfString = new Box<>();
		boxOfString.setContent("aaa");
		String str = boxOfString.getContent();

		Box<Integer> boxOfInt = new Box<>();
		boxOfInt.setContent(5);
		int x = boxOfInt.getContent();
	}

}
