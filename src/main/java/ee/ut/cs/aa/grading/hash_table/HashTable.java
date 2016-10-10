package ee.ut.cs.aa.grading.hash_table;

/**
 * Interface for hash table methods. Allows storing key-value pairs and accessing
 * and removing values by key.
 * 
 * @param <K> Key type
 * @param <V> Value type
 */

public interface HashTable<K, V> {
	
	/**
	 * Method for initializing fields. Must be called 
	 * immediately after constructing the object. 
	 * 
	 * @param size
	 * @param hashFunction
	 * @param converter
	 */
	void setup(int size, HashFunction hashFunction, IntConverter<K> converter);
	
	
	/**
	 * Adds key and value pair to the hash table. If key already exists
	 * in the table then the old value corresponding to the key will be swapped with the
	 * new value.
	 * 
	 * @param key 
	 * @param value 
	 * @throws IllegalStateException If hash table is full.(only with open addressing) 
	 */
	void add(K key, V value) throws IllegalStateException;
	
	
	/**
	 * Returns value corresponding to the key. If key does not exist 
	 * then null is returned.
	 *
	 * @param key
	 * @return Value corresponding to the key. 
	 */
	V get(K key);
	
	
	/**
	 * Removes key and the value corresponding to the key from the table. Removed
	 * value is returned. Returns null if key does not exist.
	 * 
	 * @param key
	 * @return Removed value.
	 */
	V remove(K key);
}
