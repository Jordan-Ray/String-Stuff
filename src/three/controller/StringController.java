package three.controller;

import three.view.StringView;

/**
 * String Controller for the third project dealing with strings in java
 * @author jray1621
 *
 */
public class StringController
{
	//Declaration Section
	//All needed models and my view objects
	private StringView myView;
	
	/**
	 * Creates a stringcontroller object initializing all values
	 */
	public StringController()
	{
		myView = new StringView();
	}
	
	/**
	 * starts the view using the display error method from string view
	 */
	public void start()
	{
//		myView.displayError();
//		String myResponse =	myView.getResponse();
//		myView.showPassedValue(myResponse);
//		
//		myView.moreInteractive("Jordan", myResponse);
		myView.gobblyGoockjfsaitpo();
		myView.notSure();
		myView.kindaSure();
	}
}


