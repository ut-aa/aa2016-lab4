package ee.ut.cs.aa.grading.hash_table;

/**
 *Interface for converting type K object to int.
 *Used for converting key object to int for hash function.
 */
public interface IntConverter<K> {
	
	/**
	 * Converts type K object to int.
	 * @param key
	 * @return int value for the object.
	 */
	int convert(K key);
}
