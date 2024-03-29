package chapter14.generic;


// <T>: 타입 파라미터
public class GenericPrinter<T> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
}
