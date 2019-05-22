package stm.stjava.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		
//		System.out.println( String.join(",","chaussure raquettes casquettes".split(" ") ));		
		String[] res = "0033123456789".split("([0-9]{4})(.*)");
		System.out.println(res[0]);
	}

}
