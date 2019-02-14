package banking;

public class Account
	{

		private static int nextId = 1;
		private int id;
		private double balance;
		private String description;

		public int getId()
			{
				return id;
			}

		public double getBalance()
			{
				return balance;
			}

		private void setBalance(double newBalance)
			{
				balance = newBalance;
			}

		public String getDescription()
			{
				return description;
			}

		public void setDescription(String newDescription)
			{
				description = newDescription;
			}

		public boolean transferTo(Account account, double amount)
				throws DepositWithdrawTransferAmountNotPostiveException
			{
				try
					{
						withdraw(amount);
					} catch (InsufficientFundsException ex)
					{
						return false;
					}
				account.deposit(amount);
				return true;
			}

		private void checkAmountGtZero(double amount) throws DepositWithdrawTransferAmountNotPostiveException
			{
				if (amount <= 0)
					throw new DepositWithdrawTransferAmountNotPostiveException("Amount must be positive");
			}

		public void deposit(double amount) throws DepositWithdrawTransferAmountNotPostiveException
			{
				checkAmountGtZero(amount);
				setBalance(getBalance() + amount);
			}

		public void withdraw(double amount)
				throws DepositWithdrawTransferAmountNotPostiveException, InsufficientFundsException
			{
				checkAmountGtZero(amount);
				if (getBalance() < amount)
					{
						throw new InsufficientFundsException("Insufficient Funds");
					}
				setBalance(getBalance() - amount);
			}

		public Account(String newDescription)
			{
				this();
				this.description = newDescription;
			}

		public Account()
			{

				id = nextId++;
				balance = 0;
				description = "*New Account*";

			}
	}
