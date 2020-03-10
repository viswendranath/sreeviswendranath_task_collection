package task_collection;

import java.util.AbstractList;

@SuppressWarnings("unchecked")
public class CustomList<T> extends AbstractList<T> {

	T arr[];
	
	
	CustomList(){
		arr = (T[]) new Object[0];
	}
	
	CustomList(Object[] a) {
		arr = (T[]) new Object[a.length];
		System.arraycopy(a,0,arr,0,a.length);
	}

	@Override
	public T get(int index) {
		return arr[index];
	}
	
	@Override
	public boolean add(Object o) {
		T arr2[] = (T[]) new Object[arr.length + 1];
		System.arraycopy(arr,0,arr2,0,arr.length);
		arr2[arr.length] = (T) o;
		arr = arr2;
		return true;
	}
	
	@Override
	public T remove(int index) {
		T temp = arr[index];
		T arr2[] = (T[]) new Object[arr.length-1];
		System.arraycopy(arr,0,arr2,0,arr.length-1);
		arr = arr2;
		return temp;
	}
	
	@Override
	public int size() {
		return arr.length;
	}
}
