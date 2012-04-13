package aspects;

import Components.*;

public aspect CompatibilityAspect {
	
	pointcut discCompatibilityCheck(): execution(Wheel.Disc.new());

}
