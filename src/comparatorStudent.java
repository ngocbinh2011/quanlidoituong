import java.util.Comparator;

public class comparatorStudent<T extends people> implements Comparator<T>{

	@Override
	public int compare(T obj1, T obj2){
		String s1 = obj1.getFullName().substring(obj1.getFullName().lastIndexOf(" "));
		String s2 = obj2.getFullName().substring(obj2.getFullName().lastIndexOf(" "));
		return s1.compareTo(s2);
	}
}