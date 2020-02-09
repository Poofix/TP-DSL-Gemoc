package mydsl.tp01.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.tp01.StartState;
import mydsl.tp01.aspects.StateAspect;

@Aspect(className = StartState.class)
@SuppressWarnings("all")
public class StartStateAspect extends StateAspect {
}
