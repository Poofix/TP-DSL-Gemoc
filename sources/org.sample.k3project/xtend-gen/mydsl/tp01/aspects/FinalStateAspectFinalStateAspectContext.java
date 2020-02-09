package mydsl.tp01.aspects;

import fr.ut2j.tp01.FinalState;
import java.util.Map;
import mydsl.tp01.aspects.FinalStateAspectFinalStateAspectProperties;

@SuppressWarnings("all")
public class FinalStateAspectFinalStateAspectContext {
  public final static FinalStateAspectFinalStateAspectContext INSTANCE = new FinalStateAspectFinalStateAspectContext();
  
  public static FinalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new mydsl.tp01.aspects.FinalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalState, FinalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.tp01.FinalState, mydsl.tp01.aspects.FinalStateAspectFinalStateAspectProperties>();
  
  public Map<FinalState, FinalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
