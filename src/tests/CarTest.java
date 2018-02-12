package tests;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.Car;
import tests.CarTest;

public class CarTest {

	@Test
	void testCarToString() {
		assertThat(new Car("red", 100).toString(), is("Color: red, Speed: 100"));
	}

}
