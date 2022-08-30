package org.medmota.exercicemockito.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestingSpy {

	/*
	 * Write a test named TestingSpy. Configure a List<String> with the @Spy
	 * annotation to return a certain string for the get(10000000) on on the list.
	 * 
	 * HINT: Use doReturn to configure the spy
	 */
	
	@Spy
	List<String> myList = new ArrayList<>();
	
	@Test
	void retunStringWhenGet10000000() {
		doReturn("fooBar").when(myList).get(10000000);
		assertEquals("fooBar", myList.get(10000000));
	}
	

}
