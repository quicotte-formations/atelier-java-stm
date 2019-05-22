package stm.stjava.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import stm.stjava.service.IPaymentService;
import stm.stjava.service.MicroPaymentService;
import stm.stjava.service.PaymentService;
import stm.stjava.service.PaymentServiceTemp;

public class ConditionsTest {

//	@Test
	public void testTransfertOKEnModeMP() {
		
		List<IPaymentService> lst = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			
			lst.add( new PaymentService() );
			lst.add( new PaymentServiceTemp() );
			lst.add( new MicroPaymentService() );
		}
		
		
		
		for(IPaymentService service : lst) {
			
			service.transfer(1, 2, 100);
		}
	}
	
	
	
	
	@Test
	public void test2() {

		// 1. Inverse map
//		Map<, String> map = 																		new HashMap<>();	
		
//		map.put("LAVANDE_CURCUMA", "RELAXANT");
//		map.put("CIRONELLE_GIROFFLE", "ANTIPUCES");
//		map.put("THYM_ROMARIN", "ANTIBIO");
//		
//		Set<String> ingredients = map.keySet();
//		Map<String, String> map2 = new HashMap<>();
//		for (String cle : ingredients) {
//			map2.put( map.get(cle) , cle);
//		}
//		
//		System.out.println( map2 );
//		
//		// 2. Rech ingredients pour ANTIBIO
//		System.out.println( map2.get("ANTIBIO") );
	}
	
	
//	@Test
	public void test() {

		// 1. Inverse map
		Map<String, String> map = 																		new HashMap<>();	
		
		map.put("LAVANDE_CURCUMA", "RELAXANT");
		map.put("CIRONELLE_GIROFFLE", "ANTIPUCES");
		map.put("THYM_ROMARIN", "ANTIBIO");
		
		Set<String> ingredients = map.keySet();
		Map<String, String> map2 = new HashMap<>();
		for (String cle : ingredients) {
			map2.put( map.get(cle) , cle);
		}
		
		System.out.println( map2 );
		
		// 2. Rech ingredients pour ANTIBIO
		System.out.println( map2.get("ANTIBIO") );
	}
	
	
	
	
	
	
	
	
	
	

}
