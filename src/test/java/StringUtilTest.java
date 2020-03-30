import junit.framework.TestCase;


public class StringUtilTest extends TestCase {

	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("safadgsa");
		System.out.println(hasLength);
	}

	public void testHasText() {
		boolean hasLength = StringUtil.hasText("safadgsa");
		System.out.println(hasLength);
	}

	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(1);
		System.out.println(randomChineseString);
		
	}

	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}

}
