package stm.stjava.service;

public interface IPaymentService {

	public void transfer(long idAccountA, long idAccountB, double amount);
	public double getAmount(long idAccount);
	public String listTransactions(long accountId);
}
