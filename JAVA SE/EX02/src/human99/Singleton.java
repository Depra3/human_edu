package human99;

public class Singleton {
//	private static Singleton instance = null;
	private static Singleton instance = new Singleton();
	private int cnt = 0;

	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
		return instance;
	}

	public void count() {
		this.cnt++;
	}

	public int getCount() {
		return this.cnt;
	}

}
