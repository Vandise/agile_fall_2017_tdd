import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Red", 100);
		car1.toString();
		assertThat(car1.toString(), is("Color: Red, Speed: 100"));
	}
	@Test 
	public void instancecanDoToString(){
		Car car1 = new Car("Blue", 75);
		assertThat(car1.toString(), is("Color: Blue, Speed: 75"));
	}

	// Create and pass test for deceleration.
	@Test
	public void decelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		car1.decelerate(-10);
		assertThat(car1.getSpeed(), is(0));
	}
	// Create and pass test for no deceleration below 0.
	
	@Test
	public void decelerateNotPastZero(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		car1.decelerate(-20);
		assertThat(car1.getSpeed(), is(0));
	}
}