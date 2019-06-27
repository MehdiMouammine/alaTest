package com.alaTest.test.main;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import com.alaTest.main.Main;

public class MainTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Test
	public void test919903() {
		/*Expected :Prefix 919903 Operator 1 Price 1.3*/
		System.out.print("Test: +919903379908\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"919903379908"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 1 the price will be 1.3/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test2125() {
		/*Expected :Prefix 2125 Operator 1 Price 1.4*/
		System.out.print("Test: +2125668529941\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"2125668529941"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 1 the price will be 1.4/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test91() {
		/*Expected :Prefix 91 Operator 2 Price 0.7*/
		System.out.print("Test: +918903375508\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"918903375508"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 2 the price will be 0.7/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test919() {
		/*Expected :Prefix 919 Operator 2 Price 1.0*/
		System.out.print("Test: +919603546908\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"919603546908"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 2 the price will be 1.0/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test9199() {
		/*Expected :Prefix 9199 Operator 1 Price 1.0*/
		System.out.print("Test: +919945781208\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"919945781208"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 1 the price will be 1.0/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test21() {
		/*Expected :Prefix 21 Operator 2 Price 0.8*/
		System.out.print("Test: +219444786891\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"219444786891"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 2 the price will be 0.8/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test212() {
		/*Expected :Prefix 212 Operator 3 Price 1.0*/
		System.out.print("Test: +212657075761\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"212657075761"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 3 the price will be 1.0/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test621() {
		/*Expected :Prefix 621 Operator 3 Price 0.7*/
		System.out.print("Test: +621225487899\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"621225487899"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 3 the price will be 0.7/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void test62155577() {
		/*Expected :Prefix 62155577 Operator 3 Price 1.2*/
		System.out.print("Test: +621555778987\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"621555778987"};
	    Main.main(args);
	    assertEquals("The best operator to make this call is operator number 3 the price will be 1.2/min\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void testnone() {
		/*Expected :Prefix none Operator none Price none*/
		System.out.print("Test: +542356568877\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"542356568877"};
	    Main.main(args);
	    assertEquals("Sorry none of our operators can handle your number\n*****************************************\n", systemOutRule.getLog());
	}
	
	@Test
	public void testnone2() {
		/*Expected :Prefix none Operator none Price none*/
		System.out.print("Test: +719945781208\n*************************\n");
		systemOutRule.clearLog();
	    String[] args = {"719945781208"};
	    Main.main(args);
	    assertEquals("Sorry none of our operators can handle your number\n*****************************************\n", systemOutRule.getLog());
	}
}
