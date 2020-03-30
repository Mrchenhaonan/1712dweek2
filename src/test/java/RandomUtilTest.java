import junit.framework.TestCase;


public class RandomUtilTest extends TestCase {

	public void testRandom() {
		int r = RandomUtil.random(1, 3);
		System.out.println(r);
	}

	public void testSubRandom() {
		int[] s = RandomUtil.subRandom(1, 10, 1);
		for (int i : s) {
			System.out.println(s);
		}
	}

	public void testRandomCharacter() {
		char r = RandomUtil.randomCharacter();
		System.out.println(r);
	}
	
	public void testRandomString() {
		String s = RandomUtil.randomString(5);
		System.out.println(s);
	}

}
