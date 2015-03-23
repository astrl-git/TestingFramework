package com.git.capie.TestingFramework.controls;

interface ILabel {
	String getAttribute(String attribute);
	String getText();
	String getContent();
	ILabelClickable makeLabelClickable();
	boolean isDisplayed();
	boolean isEnabled();
}