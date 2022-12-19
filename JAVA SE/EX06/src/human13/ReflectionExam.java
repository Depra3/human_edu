package human13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExam {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("human01_2.Member"); // 해당 패키지 내 클래스 정보를 가져옴
		System.out.println("---- 클래스 정보 ----");
		System.out.println(clazz.getName());
		
		System.out.println("---- 생성자 정보 ----");
		Constructor[] cons = clazz.getDeclaredConstructors();
		// 생성자 갯수만큼 배열로 정의
		for (Constructor c : cons) {
			System.out.print(c.getName() + " : ");		// 생성자 별로 출력
			Class[] params = c.getParameterTypes();
			// 한개의 생성자 별로 가지고 있는 인자 Type에 대한 배열.
			for(Class p : params) {
				System.out.print(p.getName());
			}
			System.out.println();
		}
		
		System.out.println("---- 멤버 변수 ----");
		Field[] fields = clazz.getDeclaredFields();
		for (Field f : fields) {
			System.out.print(f.getName() + " : ");
			System.out.println(f.getType().getSimpleName());
		}
		
		System.out.println("---- 메서드 ----");
		Method[] methods = clazz.getDeclaredMethods();
		// 메서드에 대한 정보를 가져옴.
		for (Method m : methods) {
			System.out.print(m.getName() + " : ");
			// 메서드의 이름을 출력함.
			Class[] params = m.getParameterTypes();
			// 메서드별 인자의 정보를 가져옴.
			for (Class c : params) {
				System.out.print(c.getName() + ", ");
				// 인자의 타입을 출력함.
			}
			System.out.println();
		}
	}
}
