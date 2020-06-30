package week6_Listener;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void entry()
	{
		System.out.println("entry");
		throw new NoSuchElementException();
	}

}
