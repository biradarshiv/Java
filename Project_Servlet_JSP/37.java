package com.jlc.book.shop.util;

import java.text.DecimalFormat;

// This method is used to format a double in the properway

public class DoubleFormator {
	public static String formatDouble(String value){
		String newValue = "";
		double d = Double.parseDouble(value);
		DecimalFormat twoDForm = new DecimalFormat("0.0");
		double d1 = Double.parseDouble(twoDForm.format(d));
		newValue = d1+"0";
		return newValue;
	}
}
