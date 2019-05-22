package stm.stjava.service;

public class MicroPaymentService implements IPaymentService{

	@Override
	public void transfer(long idAccountA, long idAccountB, double amount) {
		
		if( amount>5 )
			throw new RuntimeException("Montant trop grand");
		
		// On disait que transfert en BD
		System.out.println( "transfer OK" );
	}

	@Override
	public double getAmount(long idAccount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String listTransactions(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
