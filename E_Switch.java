 public class E_Switch
{
    public static void main(String[] args)
	{
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
				/*
					The break and continue statements change the loop's execution flow, also used in switch
					The break statement terminates the loop and transfers execution to the statement immediately following the loop.
				*/
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;                
			default:
				System.out.println("Could Be any Day");    //No break is needed in the default case, as it is always the last statement in the switch.
        }
    }
}
/**
for (initialization; condition; increment/decrement)
{
   statement(s)
}
Initialization: Expression executes only once during the beginning of loop
Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
Increment/Decrement: Executes after each iteration of the loop.
*/
/**
do {
  System.out.println(x);
  x++;
} while(x < 5);
*/