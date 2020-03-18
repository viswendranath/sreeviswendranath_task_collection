package task_collection;

import java.util.AbstractList;

import org.apache.log4j.Logger;

@SuppressWarnings("unchecked")
public class CustomList<T> extends AbstractList<T> {

	Logger log = Logger.getLogger(CustomList.class.getName());
	
	T arr[] = null;
	
	
	CustomList(){
		log.info("Inside constructor");

		arr = (T[]) new Object[0];
		log.info("Initialized arr reference");
	}
	
	CustomList(Object[] a) {
		log.info("Inside parameterized constructor");
		
		arr = (T[]) new Object[a.length];		
		log.info("Initialized arr object with " + a.length + " size");
		System.arraycopy(a,0,arr,0,a.length);
		
		log.info("Copied the given array to arr object");
	}

	@Override
	public T get(int index) {
		log.info("Insied get method");
		
		return arr[index];
	}
	
	@Override
	public boolean add(Object o) {
		log.info("Insied add method");
		T arr2[] = (T[]) new Object[arr.length + 1];
		log.info("Created temporary array with size " + (arr.length+1));
		
		System.arraycopy(arr,0,arr2,0,arr.length);
		log.info("Copied arr to temporary array");
		
		arr2[arr.length] = (T) o;
		arr = arr2;
		log.info("Copied the object to last index");
		
		return true;
	}
	
	@Override
	public T remove(int index) {
		log.info("Inside remove method");
		
		T temp = arr[index];
		T arr2[] = (T[]) new Object[arr.length-1];
		log.info("Created temporary array with size " + (arr.length-1));
		
		System.arraycopy(arr,0,arr2,0,arr.length-1);
		log.info("Copied " + (arr.length-1) + " elements to temporary array");
		
		arr = arr2;
		log.info("Changed the reference to temporary array");
		
		return temp;
	}
	
	@Override
	public int size() {
		log.info("Inside size method");
		
		return arr.length;
	}
}
