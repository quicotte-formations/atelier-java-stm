package stm.stjava.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class DatesTest {

	@Test
	public void checkDateFormatOK() throws ParseException {
		
		SimpleDateFormat usFormat = new SimpleDateFormat("yyyy/MMMM/dd", Locale.US);
		SimpleDateFormat frFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.FRANCE);
		
		Date date = usFormat.parse("2019/October/21");
		String dateStr = frFormat.format(date);
		System.out.println( dateStr );
		
		assertEquals("lundi, 21 octobre 2019", dateStr);
	}
	
//	@Test
	public void checkDate20052019OK() throws ParseException {
		// D'une date française vers une date standard
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//		Date d = format.parse("31/12/2019 23:59:59");
//		System.out.println( d );
		
		// D'une date vers un format
		Date now = new Date();
		System.out.println( now );
		System.out.println( format.format(now) );
	}
}
