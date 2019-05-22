package stm.stjava.service;

public class PaymentService implements IPaymentService{

	@Override
	public void transfer(long idAccountA, long idAccountB, double amount) {
		
		System.out.println("OK");
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
