package ee.ut.cs.aa.grading.hash_table;

import java.util.List;

/**
 *Provides a method for list sorting. 
 * 
 * @param <K> Object type that list contains.
 */
public interface Sorter<K> {
	
	/**
	 * Initializes fields. Must be called immediately after constructing
	 * the object.
	 * @param converter Converts type K to int.
	 */
	void setup(IntConverter<K> converter);
	
	/**
	 * Sorts list in nondecreasing order.
	 * @param list
	 */
	void sort(List<K> list);
	
}
