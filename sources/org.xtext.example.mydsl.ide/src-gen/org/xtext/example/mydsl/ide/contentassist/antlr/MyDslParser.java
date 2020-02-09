/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFSMAccess().getAlternatives_5(), "rule__FSM__Alternatives_5");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getFSMAccess().getGroup(), "rule__FSM__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getStartStateAccess().getGroup(), "rule__StartState__Group__0");
			builder.put(grammarAccess.getFinalStateAccess().getGroup(), "rule__FinalState__Group__0");
			builder.put(grammarAccess.getFSMAccess().getNameAssignment_2(), "rule__FSM__NameAssignment_2");
			builder.put(grammarAccess.getFSMAccess().getStateAssignment_3(), "rule__FSM__StateAssignment_3");
			builder.put(grammarAccess.getFSMAccess().getStateAssignment_4(), "rule__FSM__StateAssignment_4");
			builder.put(grammarAccess.getFSMAccess().getStateAssignment_5_0(), "rule__FSM__StateAssignment_5_0");
			builder.put(grammarAccess.getFSMAccess().getTransitionAssignment_5_1(), "rule__FSM__TransitionAssignment_5_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getSourceAssignment_2(), "rule__Transition__SourceAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_4(), "rule__Transition__TargetAssignment_4");
			builder.put(grammarAccess.getStartStateAccess().getNameAssignment_2(), "rule__StartState__NameAssignment_2");
			builder.put(grammarAccess.getFinalStateAccess().getNameAssignment_2(), "rule__FinalState__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
