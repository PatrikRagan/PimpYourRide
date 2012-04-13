package aspects;

import components.*;

public aspect CompatibilityAspect {
	
	pointcut discCompatibilityCheck(): execution(Wheel.Disc.new());

}
