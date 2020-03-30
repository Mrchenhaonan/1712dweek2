import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;


public class PersonTest extends TestCase {
	@Test
		public void test1(){
		ArrayList<Person> list=new ArrayList<Person>();
		Person p = new Person();
		for (int i = 0; i < 10000; i++) {
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));//添加
			Date date=randomDate("2010-01-01","2020-03-30");
			p.setCreated(date);
			list.add(p);
		}
		for (Person person : list) {
			System.out.println(person);
		}
		}

	private static Date randomDate(String deginDate, String endDate) {
		// TODO Auto-generated method stub
		
		try {
			SimpleDateFormat fomat = new SimpleDateFormat("yyyy-MM-dd");//日期类
			Date start = fomat.parse(deginDate);
			Date end=fomat.parse(endDate);
			if(start.getTime()>=end.getTime()){
				return null;
			}
			long date=random(start.getTime(),end.getTime());
			return new Date(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static long random(long begin, long end) {
		// TODO Auto-generated method stub
		long rtn =begin+(long)(Math.random()*(end-begin));
		if(rtn==begin||rtn==end){
			return random(begin,end);
		}
		return rtn;
	}
}
