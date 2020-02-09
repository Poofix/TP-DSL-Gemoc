package mydsl.tp01.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.ut2j.tp01.FinalState;
import mydsl.tp01.aspects.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
