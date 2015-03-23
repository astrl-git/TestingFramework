package com.git.capie.TestingFramework.controls;

interface ILabelClickable{
	String getAttribute(String attribute);
	String getText();
	String getContent();
	void click();
	boolean isDisplayed();
	boolean isEnabled();
}
