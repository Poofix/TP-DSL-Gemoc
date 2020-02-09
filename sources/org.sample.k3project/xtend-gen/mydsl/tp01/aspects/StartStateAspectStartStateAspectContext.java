package mydsl.tp01.aspects;

import fr.ut2j.tp01.StartState;
import java.util.Map;
import mydsl.tp01.aspects.StartStateAspectStartStateAspectProperties;

@SuppressWarnings("all")
public class StartStateAspectStartStateAspectContext {
  public final static StartStateAspectStartStateAspectContext INSTANCE = new StartStateAspectStartStateAspectContext();
  
  public static StartStateAspectStartStateAspectProperties getSelf(final StartState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new mydsl.tp01.aspects.StartStateAspectStartStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StartState, StartStateAspectStartStateAspectProperties> map = new java.util.WeakHashMap<fr.ut2j.tp01.StartState, mydsl.tp01.aspects.StartStateAspectStartStateAspectProperties>();
  
  public Map<StartState, StartStateAspectStartStateAspectProperties> getMap() {
    return map;
  }
}
