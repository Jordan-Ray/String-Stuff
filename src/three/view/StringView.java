package three.view;

import javax.swing.JOptionPane;

/**\
 * 
 * @author jray1621
 *
 */
public class StringView
{
	
	
	/**
	 * shows the runtime error when a non-integer is typed into the input JOption
	 */
	public void displayError()
	{
		int test;
		String temp;
		
		JOptionPane.showMessageDialog(null, "Let's watch the program crash!'");
		temp = JOptionPane.showInputDialog("Type your favorite number!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Your favorite number is" + test);
	}
	
	/**
	 * must have a variable assigned to a variable or you can not use it.
	 * If it says can't define variable that means you need to add the variable.
	 * @return
	 */
	public String getResponse()
	{
		String response = null;
		JOptionPane.showInputDialog(null,"Type your name");
		response = JOptionPane.showInputDialog(null, "Come on type it again");
		return response;
		
	}
	//formal paramater is what we use inside of the method.
	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue + " is supposed to be funny...");
	}
	
	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "hey" + first + "\n" + "says: " + second);
	}
	public void gobblyGoockjfsaitpo()
	{
		testEndsWith();
	}
	private void testEndsWith()
	{
		String testEnd = "So how has your day been.";
		JOptionPane.showMessageDialog(null, "The ends with Test ");
		JOptionPane.showMessageDialog(null, "We are going to make sure that the next sentance ends with a period.  ");
		JOptionPane.showMessageDialog(null, "The sentance is: " + testEnd);
		JOptionPane.showMessageDialog(null, testEnd.endsWith("."));
	}
	
	public void notSure()
	{
		testcontains();
	}
	
	private void testcontains()
	{
		String testcont = "1, 2, 5, My lord three is what you meant to say.";
		JOptionPane.showMessageDialog(null, "The contains Test");
		JOptionPane.showMessageDialog(null, "Lets check to see if this has the word (what) in it.");
		JOptionPane.showMessageDialog(null, "The sentance is:" + testcont);
		JOptionPane.showMessageDialog(null, testcont.contains("what"));
	}
	
	public void kindaSure()
	{
		testlength();
	}
	
	private void testlength()
	{
		String testlen = "How has your day been?";
		JOptionPane.showMessageDialog(null, "The Length Test");
		JOptionPane.showMessageDialog(null, "Let see how long this sentance is.");
		JOptionPane.showMessageDialog(null, "The sentance is:" + testlen);
		JOptionPane.showMessageDialog(null, testlen.length());
		
	
	}
	
	
	
}
