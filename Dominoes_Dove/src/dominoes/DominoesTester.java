package dominoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominoes.Domino;
import dominoes.DominoHighLowImpl_Dove;
import dominoes.DominoHighLowSetImpl_Dove;
import dominoes.DominoLowDifferenceStringImpl_Dove;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;



public class DominoesTester {
	
	//Testing isHighLowString
	
    @Test
    void testFiveSepLetterShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("5:r"), "5:r isn't a domino");
    }
    
    @Test
    void testLetterSepLetterShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("r:5"), "5:r isn't a domino");
    }

    @Test
    void testFiveSepFiveShouldReturnTrue() {
        assertTrue(DominoHighLowImpl_Dove.isHighLowString("5:5"), "5:5 is a domino");
    }

    @Test
    void testFiveStarLetterShouldReturnfalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("5*r"), "5*r is not a domino");
    }

    @Test
    void testEightSepLetterShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("8*r"), "8*r is not a domino");
    }

    @Test
    void testFiveStarEightShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("5*8"), "5*8 is not a domino");
    }

    @Test
    void testSixStarSixShouldReturnTrue() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("6*6"), "6*6 is not a domino if");
    }

    @Test
    void testSixSepSixShouldReturnTrue() {
        assertTrue(DominoHighLowImpl_Dove.isHighLowString("6:6"), "6:6 is a domino ");
    }

    @Test
    void testTwelveStarTwelveShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("12*12"), "12*12 is not a domino");
    }

    @Test
    void testSixStarTwelveShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("6*12"), "6*12 is not a domino");
    }

    @Test
    void testSixSepTwelveShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("6:12"), "6:12 is not a domino");
    }

    @Test
    void testZeroSepZeroShouldReturnTrue() {
        assertTrue(DominoHighLowImpl_Dove.isHighLowString("0:0"), "0:0 is a domino");
    }

    @Test
    void testEightSepZeroShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString("8:0"), "8:0 is not a domino");
    }

    @Test
    void testColonZeroZeroShouldReturnFalse() {
        assertFalse(DominoHighLowImpl_Dove.isHighLowString(":00"), ":00 is not a domino");
    }
    
    @Test
    void testNullShouldReturnFalse() {
    	assertFalse(DominoHighLowImpl_Dove.isHighLowString(null), "null is not a domino");
    	
    }
    
    @Test
    void testLowHighStringReturnFalse() {
    	assertFalse(DominoHighLowImpl_Dove.isHighLowString("4:5"), "null is not a domino");
    	
    }
    
    @Test
    void testLowHighStringReturnFalse5() {
    	assertFalse(DominoHighLowImpl_Dove.isHighLowString("4: 5"), "null is not a domino");
    	
    }
    
    @Test
    void testLowHighStringReturnFalse6() {
    	assertFalse(DominoHighLowImpl_Dove.isHighLowString(" 4:5"), "null is not a domino");
    	
    }
    
    @Test
    void testLowHighStringReturnFalse7() {
    	assertFalse(DominoHighLowImpl_Dove.isHighLowString("4:5 "), "null is not a domino");
    	
    }
    

    //testing  DominoHighLowImpl_Dove(String highLowString)
    @Test
    public void highLowTest1() {
    	int highPipCount = 5;
    	int lowPipCount = 5;
    	
    	
    	String highLowString = String.valueOf(highPipCount)+":"+String.valueOf(lowPipCount);

    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowString);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    //testing  DominoHighLowImpl_Dove(String highLowString)
    @Test
    public void highLowTest2() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	

    	
    	String highLowString = String.valueOf(highPipCount)+":"+String.valueOf(lowPipCount);

    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowString);
    	
    	
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    public void highLowTest3() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	

    	
    	String highLowString = String.valueOf(highPipCount)+":"+String.valueOf(lowPipCount);

    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowString);
    	
    	
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    
    
    @Test
    void highLowTest4() {
    	int highPipCount = 5;
    	int lowPipCount = 4;
    	
    	

    	
    	String highLowString = String.valueOf(highPipCount)+":"+String.valueOf(lowPipCount);

    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowString);
    	
    	
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    
    //Testing sumDifferences
    @Test
    public void sumDifferenceTest1() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	int sum = highPipCount+lowPipCount;
    	int dif = highPipCount-lowPipCount;
    	
    	
    	int[] sumDifArray = {sum,dif};
    	
    	Domino domino = new DominoHighLowImpl_Dove(sumDifArray);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    public void sumDifferenceTest2() {
    	int highPipCount = 5;
    	int lowPipCount = 2;
    	
    	int sum = highPipCount+lowPipCount;
    	int dif = highPipCount-lowPipCount;
    	
    	
    	int[] sumDifArray = {sum,dif};
    	
    	Domino domino = new DominoHighLowImpl_Dove(sumDifArray);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    public void sumDifferenceTest3() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	int sum = highPipCount+lowPipCount;
    	int dif = highPipCount-lowPipCount;
    	
    	
    	int[] sumDifArray = {sum,dif};
    	
    	Domino domino = new DominoHighLowImpl_Dove(sumDifArray);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
   
    
    
    //testing HighLowSet
    @Test
    public void highLowSetTest1() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	Set<Integer> highLowSet = new HashSet<Integer>();
    	highLowSet.add(lowPipCount);
    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowSet);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    public void highLowSetTest2() {
    	int highPipCount = 6;
    	int lowPipCount = 4;
    	
    	Set<Integer> highLowSet = new HashSet<Integer>();
    	highLowSet.add(lowPipCount);
    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowSet);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    public void highLowSetTest3() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	Set<Integer> highLowSet = new HashSet<Integer>();
    	highLowSet.add(lowPipCount);
    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowSet);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    /////Testing DominoHighLowSetImpl
    
    
    @Test
    public void highLowSetImplTest1() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
//    	Set<Integer> highLowSet = new HashSet<Integer>();
//    	highLowSet.add(lowPipCount);
//    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    	
    }
    
    @Test
    public void highLowSetImplTest2() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
//    	Set<Integer> highLowSet = new HashSet<Integer>();
//    	highLowSet.add(lowPipCount);
//    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    	
    }
    
    @Test
    public void highLowSetImplTest3() {
    	int highPipCount = 3;
    	int lowPipCount = 2;
    	

    	Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    	
    }
    
    
    //Testing DominoHighLowSetImpl isSumDifferenceString
    
    @Test
    public void isSumDiffString1() {
    	int highPipCount = 3;
    	int lowPipCount = 2;
    	
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    
    @Test
    public void isSumDiffString2() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    
    @Test
    public void isSumDiffString3() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    @Test
    public void isSumDiffString4() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	String sumDiffString = ","+(highPipCount+lowPipCount)+""+(highPipCount-lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertFalse(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    
    @Test
    public void isSumDiffString5() {
    	int highPipCount = 5;
    	int lowPipCount = 4;
    	
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    
    
    @Test
    public void sumDiffString6() {
    	int highPipCount = 5;
    	int lowPipCount = 4;
    	
    	//swapped positions
    	String sumDiffString = (highPipCount-lowPipCount)+","+(highPipCount+lowPipCount);
    	//"5,1" sumDiffdomino

    	//Domino domino = new DominoHighLowSetImpl_Dove(highPipCount, lowPipCount);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString));
	
    }
    
    @Test
    public void isSumDiffString7() {
    	int highPipCount = 5;
    	int lowPipCount = 4;
    	
    	String sumDiffString = ",";

    	
    	assertFalse(DominoHighLowSetImpl_Dove.isSumDifferenceString(sumDiffString), "its a 3,2 domino");

    	
    }
    
    
    
    //Testing DominoHighLowSetImpl_Dove(string sumDifferenceString)
    
    @Test
    public void highLowSetImplStringTest1() {
    	int highPipCount = 3;
    	int lowPipCount = 2;
    	

    	//creating string
    	String sumDiffString = ("5")+","+("1");
    	
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(sumDiffString);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    	
    }
    
    @Test
    public void highLowSetImplStringTest2() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	

    	//creating string
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(sumDiffString);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(6, domino.getHighPipCount());
    	assertEquals(6, domino.getLowPipCount());
    	
    	
    }
    
    @Test
    public void highLowSetImplStringTest3() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	

    	//creating string
    	String sumDiffString = (highPipCount+lowPipCount)+","+(highPipCount-lowPipCount);
    	
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(sumDiffString);
    	
//    	System.out.print(domino.getHighPipCount());
//    	System.out.print(domino.getLowPipCount());

    	
    	assertEquals(0, domino.getHighPipCount());
    	assertEquals(0, domino.getLowPipCount());
    	
    	
    }
    
    //testing DominoHighLowSetImpl_Dove isLowPlus8TimesHighInteger
    
    @Test
    public void islowPlus8TimeHighInteger1() {
    	int highPipCount = 5;
    	int lowPipCount = 4;
    	
    	int testLowPlus8TimeHighInteger = lowPipCount + (8*highPipCount);
    	

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isLowPlus8TimesHighInteger(testLowPlus8TimeHighInteger), "it's a 5:4 domino" );

    	
    }
    
    @Test
    public void islowPlus8TimeHighInteger2() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	int testLowPlus8TimeHighInteger = lowPipCount + (8*highPipCount);
    	

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isLowPlus8TimesHighInteger(testLowPlus8TimeHighInteger), "it's a 5:4 domino" );

    	
    }
    
    @Test
    public void islowPlus8TimeHighInteger3() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	int testLowPlus8TimeHighInteger = lowPipCount + (8*highPipCount);
    	

    	
    	assertTrue(DominoHighLowSetImpl_Dove.isLowPlus8TimesHighInteger(testLowPlus8TimeHighInteger), "it's a 5:4 domino" );

    	
    }
    
    @Test
    public void islowPlus8TimeHighInteger4() {
    	int highPipCount = 12;
    	int lowPipCount = 1;
    	
    	int testLowPlus8TimeHighInteger = lowPipCount + (8*highPipCount);
    	

    	
    	assertFalse(DominoHighLowSetImpl_Dove.isLowPlus8TimesHighInteger(testLowPlus8TimeHighInteger), "it's a 5:4 domino" );

    	
    }
    
    
    //Testing DominoHighLowSetImpl_Dove dominoHighLowSetIpl_Dove(int lowPlus8TimesHigh
    
    @Test
    void intLowPlus8TimesHighTest1() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	int lowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(lowPlus8TimesHigh);
    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	
    }
    
    @Test
    void intLowPlus8TimesHighTest2() {
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	int lowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(lowPlus8TimesHigh);
    	
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	assertEquals(highPipCount, domino.getHighPipCount());

 
    	
    }
    
    @Test
    void intLowPlus8TimesHighTest3() {
    	int highPipCount = 3;
    	int lowPipCount = 2;
    	
    	int lowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	Domino domino = new DominoHighLowSetImpl_Dove(lowPlus8TimesHigh);
    	
    	assertEquals(lowPipCount, domino.getLowPipCount());
    	assertEquals(highPipCount, domino.getHighPipCount());

 
    	
    }
    
    //Testing DominoLowDifference int lowPlus8TimesHigh
    
    @Test
    void makeStringLowPlus8TimesHigh1() {
    	int lowPipCount = 2;
    	int highPipCount = 6;
    	
    	int intLowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	String stringLowPlus8TimesHigh = String.valueOf(intLowPlus8TimesHigh);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(intLowPlus8TimesHigh);
    	
    	assertEquals(highPipCount, domino.getHighPipCount() );
    	assertEquals(lowPipCount, domino.getLowPipCount() );
	

    	
    }
    
    @Test
    void makeStringLowPlus8TimesHig2() {
    	int lowPipCount = 6;
    	int highPipCount = 6;
    	
    	int intLowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	String stringLowPlus8TimesHigh = String.valueOf(intLowPlus8TimesHigh);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(intLowPlus8TimesHigh);
    	
    	assertEquals(highPipCount, domino.getHighPipCount() );
    	assertEquals(lowPipCount, domino.getLowPipCount() );
	

    	
    }
    
    @Test
    void makeStringLowPlus8TimesHig3() {
    	int lowPipCount = 0;
    	int highPipCount = 0;
    	
    	int intLowPlus8TimesHigh = lowPipCount+(8*highPipCount);
    	
    	String stringLowPlus8TimesHigh = String.valueOf(intLowPlus8TimesHigh);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(intLowPlus8TimesHigh);
    	
    	assertEquals(highPipCount, domino.getHighPipCount() );
    	assertEquals(lowPipCount, domino.getLowPipCount() );

    	
    }
    
    
    //testing List<Integer> highSum
    @Test
    void integerListHighSumTest1(){
    	
    	
    	int highPipCount = 5;
    	int lowPipCount = 2;
    	
    	int sumHighLow = highPipCount+lowPipCount;
    	
    	List<Integer> highSumList = new ArrayList<>();
    	highSumList.add(highPipCount);
    	highSumList.add(sumHighLow);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(highSumList);
    	
    	
    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());

    	
    }
    
    @Test
    void integerListHighSumTest2(){
    	
    	
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	int sumHighLow = highPipCount+lowPipCount;
    	
    	List<Integer> highSumList = new ArrayList<>();
    	highSumList.add(highPipCount);
    	highSumList.add(sumHighLow);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(highSumList);
    	
    	
    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());

    	
    }
    
    @Test
    void integerListHighSumTest3(){
    	
    	
    	int highPipCount = 0;
    	int lowPipCount = 0;
    	
    	int sumHighLow = highPipCount+lowPipCount;
    	
    	List<Integer> highSumList = new ArrayList<>();
    	highSumList.add(highPipCount);
    	highSumList.add(sumHighLow);
    	
    	Domino domino = new DominoLowDifferenceStringImpl_Dove(highSumList);
    	
    	
    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());

    	
    }
    
    @Test
    public void highLowImplTest() {
    	int highPipCount = 5;
    	int lowPipCount = 2;
    	
    	Domino domino = new DominoHighLowImpl_Dove(highPipCount, lowPipCount);
    	
    	int expectedHighPipCount = 5;
    	int expectedLowPipCount = 2;
    	
    	int actualHighPipCount = domino.getHighPipCount();
    	int actualLowPipCount = domino.getLowPipCount();
    	
    	assertEquals(expectedHighPipCount, actualHighPipCount);
    	assertEquals(expectedLowPipCount, actualLowPipCount);
    }
    
    
    @Test
    public void highLowImplTest4() {
    	int highPipCount = 6;
    	int lowPipCount = 6;
    	
    	Set<Integer> highLowSet = new HashSet<Integer>();
    	highLowSet.add(lowPipCount);
    	highLowSet.add(highPipCount);
    	
    	Domino domino = new DominoHighLowImpl_Dove(highLowSet);
    	
    	assertEquals(highPipCount, domino.getHighPipCount());
    	assertEquals(lowPipCount, domino.getLowPipCount());
    }
    
    
    
    
	
	


}