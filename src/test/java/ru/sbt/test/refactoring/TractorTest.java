package ru.sbt.test.refactoring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.battlefield.Coordinates;
import ru.sbt.test.refactoring.command.CommandDispatcher;
import ru.sbt.test.refactoring.command.Orientation;
import ru.sbt.test.refactoring.unit.*;

import java.util.ArrayList;

/**
 * @author Ben
 *
 */
public class TractorTest {

	ArrayList<Unit> arrayList = new ArrayList<>();

	Tractor tractor;
	DefendTower defendTower;
	Rock rock;
	Wind wind;
	Tank tank;

	@Before
	public void initBattlefield(){
		Battlefield battlefield = new Battlefield(5,5);

		tractor = new Tractor();
		tractor.setPosition(new Coordinates(0,0));
		tractor.setBattlefield(battlefield);
		tractor.setOrientation(Orientation.NORTH);
		battlefield.placeUnit(tractor, tractor.getPosition());

		defendTower = new DefendTower();
		defendTower.setPosition(new Coordinates(1,0));
		defendTower.setBattlefield(battlefield);
		defendTower.setOrientation(Orientation.NORTH);
		defendTower.setNumberBullet(3);
		battlefield.placeUnit(defendTower, defendTower.getPosition());

		rock = new Rock();
		rock.setPosition(new Coordinates(2,0));
		rock.setBattlefield(battlefield);
		battlefield.placeUnit(rock, rock.getPosition());

		wind = new Wind();
		wind.setBattlefield(battlefield);
		wind.setOrientation(Orientation.NORTH);

		tank = new Tank();
		tank.setPosition(new Coordinates(4,0));
		tank.setBattlefield(battlefield);
		tank.setOrientation(Orientation.NORTH);
		tank.setNumberBullet(3);
		battlefield.placeUnit(tank, tank.getPosition());

		arrayList.add(tractor);
		arrayList.add(defendTower);
		arrayList.add(rock);
		arrayList.add(wind);
		arrayList.add(tank);
	}

	@Test
	public void testShouldMoveForward() {
		arrayList.forEach(el -> CommandDispatcher.dispatch("F", el));

		Assert.assertEquals(new Coordinates(0, 1), tractor.getPosition());
		Assert.assertEquals(new Coordinates(4, 1), tank.getPosition());
		Assert.assertEquals(new Coordinates(1, 0), defendTower.getPosition());
		Assert.assertEquals(new Coordinates(2, 0), rock.getPosition());
	}

	@Test
	public void testShouldTurn(){
		arrayList.forEach(el -> CommandDispatcher.dispatch("T", el));

		Assert.assertEquals(Orientation.EAST, tractor.getOrientation());
		Assert.assertEquals(Orientation.EAST, tank.getOrientation());
		Assert.assertEquals(Orientation.EAST, defendTower.getOrientation());
		Assert.assertEquals(Orientation.EAST, wind.getOrientation());

		arrayList.forEach(el -> CommandDispatcher.dispatch("T", el));
		arrayList.forEach(el -> CommandDispatcher.dispatch("T", el));
		arrayList.forEach(el -> CommandDispatcher.dispatch("T", el));

		Assert.assertEquals(Orientation.NORTH, tractor.getOrientation());
		Assert.assertEquals(Orientation.NORTH, tank.getOrientation());
		Assert.assertEquals(Orientation.NORTH, defendTower.getOrientation());
		Assert.assertEquals(Orientation.NORTH, wind.getOrientation());
	}

	@Test
	public void testShouldShoot(){
		arrayList.forEach(el -> CommandDispatcher.dispatch("S", el));

		Assert.assertEquals(new Integer(2), tank.getCountBullet());
		Assert.assertEquals(new Integer(2), defendTower.getCountBullet());
	}
}
