package ee.ut.cs.aa.grading.hash_table;

/**
 * int converter for the Integer type
 */
public class IntConverterFromInt implements IntConverter<Integer>{

	@Override
	public int convert(Integer item) {
		return item;
	}

}
