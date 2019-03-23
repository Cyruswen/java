/**
 * @author chenlepeipei
 * @other ת��������
 */
public class MonthIncome {
	private int monthIncome = 0; //������
	
	public MonthIncome(int monthIncome)
	{
		this.setMonthIncome(monthIncome);
	}
	
	public void setMonthIncome(int monthIncome)
	{
		monthIncome = monthIncome <= Enum.MIN_INCOME ? Enum.MIN_INCOME : monthIncome;
		monthIncome = monthIncome > Enum.MAX_INCOME ? Enum.MAX_INCOME : monthIncome;
		this.monthIncome = monthIncome;
	}
	
	public int getMonthIncome()
	{
		return this.monthIncome;
	}
}
