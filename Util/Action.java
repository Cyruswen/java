/**
 * @author 13213
 * @desc ������
 */
public abstract class Action {
	public void command(int cmd)
	{
		switch (cmd) 
		{
		case Enum.EAT:
			this.eat();
			break;
		case Enum.WORK:
			this.work();
			break;
		case Enum.SLEEP:
			this.sleep();
			break;
		case Enum.EAT + Enum.SLEEP + Enum.WORK:
			this.sleep();
		    this.work();
		    this.eat();
		    break;
		default:
			System.out.println("���޴˷���");
			break;
		}
	}
	
	public abstract void eat();
	
	public abstract void sleep();
	
	public abstract void work();
}
