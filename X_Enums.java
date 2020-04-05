/**
An Enum is a special type used to define collections of constants.
Basically, Enums define variables that represent members of a fixed set.
*/
public class X_Enums {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;
                
        switch(a) 
		{
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
		}
		a=Rank.SERGEANT;
		switch(a)
		{
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
		}
    }
}