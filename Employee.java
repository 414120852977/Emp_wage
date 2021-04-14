
public class Employee {
	public static final int MAX = 2;
	public static final int MIN = 0;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int WAGES_PER_MONTH_DAY = 20;

	public void check() {
		int workinghour = 0,totalworkingday = 0;
		int emphr = 0;
		while (workinghour <= 10 && totalworkingday <= 2) {
			
		int die = (int) (Math.random()*(MAX-MIN+1)+MIN);
		
		switch(die) {
		case IS_FULL_TIME :
			emphr = 8;
			break;
		case IS_PART_TIME :
			emphr = 4;
			break;
		default :
			emphr = 0;
		}
		
		int empdailywage = EMP_WAGE_PER_HR * emphr;
		int monthlyWage = WAGES_PER_MONTH_DAY * empdailywage;
		System.out.println("monthly wage of a employee is :"+monthlyWage);
		}
	}
}
