package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.Car;
import tests.CarTest;

public class CarTest {

@Test
public void testCarToString() {
	assertThat(new Car("red", 100).toString(), is("Color: red, Speed: 0"));
	}



@Test
public void testCarDecelerate() {
	Car car = new Car("red", 200);
	car.accelerate(20);
	car.decelerate(10);
	assertThat(car.getSpeed(), is(10));
	car.decelerate(11);
	assertThat(car.getSpeed(), is(0));
	
	}

}