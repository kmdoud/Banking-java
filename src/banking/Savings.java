package banking;

public class Savings extends Account
	{

		private double intRate = .02;

		public double getIntRate()
			{
				return intRate;
			}

		private void setIntRate(double newIntRate)
			{
				intRate = newIntRate;
			}

		public void payInterst() throws Exception
			{
				deposit(getBalance() * getIntRate());
			}

		public Savings(String newDescription, double newIntRate)
			{
				this(newDescription);
				setIntRate(newIntRate);
			}

		public Savings(String newDescription)
			{
				super(newDescription);

			}

		public Savings()
			{
				super();
			}

	}
