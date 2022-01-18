package app.core.beans.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FamilyCar implements Car {
	
	private int number;
	@Autowired
	private Engine engine;
	@Autowired
	@Qualifier("automaticGear")
	private Gear gear;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public String getModel() {
		return "Family-Car";
	}

	@Override
	public String getEngineModel() {
		return this.engine.getModel();
	}

	@Override
	public String getGearModel() {
		return this.gear.getModel();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive(int distance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
