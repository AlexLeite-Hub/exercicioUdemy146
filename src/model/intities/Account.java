package model.intities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public Double deposit(Double amount) {
		return balance += amount;
	}
	
	public String withdrawn(Double amount) {
		if (amount > withdrawLimit) {
			return "The amount exceeds withdraw limit";
		} else if (amount > balance) {
			return "Not enough balance";
		} else {
		balance -= amount;
		return null;
		}
	}
	
	@Override
	public String toString() {
		return "New balance: "
				+ String.format("%.2f", balance);
	}

}
