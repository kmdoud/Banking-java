package banking;

public class Mainline
	{

		public static void main(String[] args)
			{

				Savings acct = new Savings("My First Java Account");
				Savings sav = new Savings("Second Java Account");
				try
					{
						acct.deposit(1000.00);
						acct.withdraw(200.00);
						acct.payInterst();
						System.out.println("Balance is " + acct.getBalance());
						acct.deposit(100);
						acct.withdraw(100);
						acct.transferTo(sav, 500);
						System.out.println("Balance in Account is " + acct.getBalance());
						System.out.println("Balance in Savings is " + sav.getBalance());
					} catch (InsufficientFundsException ex)
					{
					} catch (DepositWithdrawTransferAmountNotPostiveException ex)
					{
					} catch (Exception ex)
					{
						System.out.println(ex.getMessage());
					}
			}

	}
