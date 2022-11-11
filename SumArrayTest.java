package com.dsaAlgoIncubation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class SumArrayTest {

	private SumArray sumArray;

	@Before
	public void createSumArray() {
		sumArray = mock(SumArray.class);
	}

	@Test
	public void testSum() {
		int arr[] = { 12, 3, 4, 15 };
		when(sumArray.sum(arr)).thenReturn(34);

		int sum = sumArray.sum(arr);
		assertEquals(sum, 34);
		verify(sumArray).sum(arr);
	}
}
