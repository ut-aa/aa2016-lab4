package ee.ut.cs.aa.grading.hash_table;

/**
 * Interface for hash function.
 *
 */
public interface HashFunction{
	
	/**
	 * Hash function that calculates position of the integer key in the
	 * hash table.
	 * 
	 * @param key  
	 * @param size Size of the hash table.
	 * @return Index to the hash table.
	 */
	int hash(int key, int size);
}
