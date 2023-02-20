package testCases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utils.Constants;
import utils.ExcelUtility;

public class test {

	public static void main(String[] args) throws IOException {
		
		Integer[] t = new Integer[3];
		t[0] = 1;
		t[1] = 2;
		
		
		
		test test = new test();
		
		test.genericMethod(t);
		

	}
	
	
	public <E> void genericMethod(E[] inputArray) {
		for (E element : inputArray) {
			System.out.println("here is the elment " + element);
		}
	}
	
}
