package com.JUnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Junit.ContainsDuplicate;

import junit.framework.Assert;

public class ContainsDuplicateJUnitTestCase {

	private ContainsDuplicate containsDuplicate;
	
	@Before
	public void setup() {
		
		
		containsDuplicate = new ContainsDuplicate();
		
	}
	
	
	@Test
	public void testWithDuplicateCase() {
		
		int arr[] = {1,1,2};
		
		boolean actual = containsDuplicate.checkDuplicate(arr);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testWithNoDuplicateCase() {
		
		int arr[] = {1,2,3};
		
		boolean actual = containsDuplicate.checkDuplicate(arr);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}

}
