package mydsl.tp01.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension mydsl.tp01.aspects.FSMAspect.*
import static extension mydsl.tp01.aspects.StateAspect.*
import static extension mydsl.tp01.aspects.TransitionAspect.*
import static extension mydsl.tp01.aspects.StartStateAspect.*
import static extension mydsl.tp01.aspects.FinalStateAspect.*
import fr.ut2j.tp01.FSM
import fr.ut2j.tp01.State
import fr.ut2j.tp01.Transition
import fr.ut2j.tp01.StartState
import fr.ut2j.tp01.FinalState

@Aspect(className=FSM)
class FSMAspect {

}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=StartState)
class StartStateAspect extends StateAspect {

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

}



