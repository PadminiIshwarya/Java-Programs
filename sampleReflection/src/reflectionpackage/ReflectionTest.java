package reflectionpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Class classReflect = ReflectionDemo.class;
		ReflectionDemo rd = new ReflectionDemo();
		String className = classReflect.getName();
		System.out.println("Class Name :" + className);
		Method[] methods = classReflect.getDeclaredMethods();
		System.out.println("INFO OF " + className + " are ");
		System.out.print("\nMETHODS : ");
		for(Method m: methods)
			System.out.print("\t"+m.getName());
		Constructor constructor = classReflect.getDeclaredConstructor();
		System.out.println();
		System.out.println("CONSTRUCTORS : ");
			System.out.print("\t" + constructor.getName());
		System.out.print("\nFields : ");
		Field[] fields = classReflect.getFields();
		for(Field f : fields)
			System.out.println(f);
		Field f = classReflect.getDeclaredField("name");
		f.setAccessible(true);
		f.set(rd,"Ishwarya");
		
		Method m1 = classReflect.getDeclaredMethod("registerMem",String.class);
		m1.invoke(rd,"ishu");
		
		Method m2 = classReflect.getDeclaredMethod("displayDetails", int.class,String.class);
		m2.setAccessible(true);
		m2.invoke(rd,535,"ishwarya");
		System.out.println("interfaces :");
		Class[] interfaces = classReflect.getInterfaces();
		for(Class c : interfaces)
			System.out.println(c.getName());
		Method m3= classReflect.getDeclaredMethod("age", int.class);
		m3.invoke(rd, 25);
		
	}

}
