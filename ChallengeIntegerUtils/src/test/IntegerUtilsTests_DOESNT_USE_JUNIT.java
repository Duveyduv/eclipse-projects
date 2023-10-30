package test;

//Students should change IntegerUtils_0 below
//to IntegerUtils_LastName
import utils.IntegerUtils_Dove;

//RUN THIS AS A JAVA APPLICATION, NOT AS A JUNIT TEST
public class IntegerUtilsTests_DOESNT_USE_JUNIT
{
	private static void test_isEven_Rookie()
	{
		assert IntegerUtils_Dove.isEven(2) == true;
		assert IntegerUtils_Dove.isEven(4) == true;
		assert IntegerUtils_Dove.isEven(6) == true;
		assert IntegerUtils_Dove.isEven(8) == true;
		
//		assert IntegerUtils_0.isEven(3) == false;
//		assert IntegerUtils_0.isEven(5) == false;
//		assert IntegerUtils_0.isEven(7) == false;
//		assert IntegerUtils_0.isEven(9) == false;
		
		//Student should add other test cases
	}
	
	//Same exact testing as test_isEven_Rookie, just expressed
	//in a more sophisticated way:
	//(For now, use either, but put this on your "aspirational" list if you don't naturally
	//write the pro code)
	private static void test_isEven_Pro()
	{
		assert IntegerUtils_Dove.isEven(2);
		assert IntegerUtils_Dove.isEven(4);
		assert IntegerUtils_Dove.isEven(6);
		assert IntegerUtils_Dove.isEven(8);
		
		assert !IntegerUtils_Dove.isEven(3);
		assert !IntegerUtils_Dove.isEven(5);
		assert !IntegerUtils_Dove.isEven(7);
		assert !IntegerUtils_Dove.isEven(9);

		//Student should add other test cases
	}
	
	private static void test_getIntegerH()
	{
		//assert IntegerUtils_0.getIntegerH(h_q_3, h_r_5) == h;
		assert IntegerUtils_Dove.getIntegerH(9, 4) == 29;
		assert IntegerUtils_Dove.getIntegerH(20, 1) == 61;
		assert IntegerUtils_Dove.getIntegerH(0, 0) == 0;
		
		//Student should add other test cases
	}

	//Student: Don't worry about understanding this code:
	private static void checkAssertionsAreEnabled()
	{
		try{
			assert false;
			throw new RuntimeException("\nDr. Kart says: ASSERTIONS ARE NOT ENABLED; ENABLE THEM!!!!!!!!!\n1. Recall that assertions being enabled is a property of the Run (or Debug) Configuration\n2. Try Googling \"Eclipse Java enable assertions\"\n3. When assertions are enabled, you won't see this message");
		}
		catch(AssertionError ae)
		{
			//DO NOTHING HERE
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("-17/3 = " + (-17/3));
		System.out.println("-17 % 5 = " + (-17 % 3));
		
		//Student: Don't comment out or delete this check:
		checkAssertionsAreEnabled();
		
		test_isEven_Rookie();
//		test_getIntegerH();
		
		//Student: Make sure this next line stays the last line of main():
		System.out.println("Congratulations!\nYour program execution made it to the end of the main method!");
	}
}
