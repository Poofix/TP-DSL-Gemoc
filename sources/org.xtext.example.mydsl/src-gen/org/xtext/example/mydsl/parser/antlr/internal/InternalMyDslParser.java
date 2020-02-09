package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'State'", "'Transition'", "'->'", "'StartState'", "'FinalState'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleStartState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_3_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleStartState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleStartState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleStartState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleStartState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: ( (lv_state_3_0= ruleStartState ) )
            // InternalMyDsl.g:110:4: (lv_state_3_0= ruleStartState )
            {
            // InternalMyDsl.g:110:4: (lv_state_3_0= ruleStartState )
            // InternalMyDsl.g:111:5: lv_state_3_0= ruleStartState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateStartStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_state_3_0=ruleStartState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_3_0,
            						"org.xtext.example.mydsl.MyDsl.StartState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:128:3: ( (lv_state_4_0= ruleFinalState ) )
            // InternalMyDsl.g:129:4: (lv_state_4_0= ruleFinalState )
            {
            // InternalMyDsl.g:129:4: (lv_state_4_0= ruleFinalState )
            // InternalMyDsl.g:130:5: lv_state_4_0= ruleFinalState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_4_0=ruleFinalState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.example.mydsl.MyDsl.FinalState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:147:3: ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:148:4: ( (lv_state_5_0= ruleState ) )
            	    {
            	    // InternalMyDsl.g:148:4: ( (lv_state_5_0= ruleState ) )
            	    // InternalMyDsl.g:149:5: (lv_state_5_0= ruleState )
            	    {
            	    // InternalMyDsl.g:149:5: (lv_state_5_0= ruleState )
            	    // InternalMyDsl.g:150:6: lv_state_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_state_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"state",
            	    							lv_state_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:168:4: ( (lv_transition_6_0= ruleTransition ) )
            	    {
            	    // InternalMyDsl.g:168:4: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalMyDsl.g:169:5: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:169:5: (lv_transition_6_0= ruleTransition )
            	    // InternalMyDsl.g:170:6: lv_transition_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:192:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:192:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:193:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:199:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:206:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:206:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:207:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:207:3: ()
            // InternalMyDsl.g:208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalMyDsl.g:218:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:219:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:219:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:220:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:241:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:241:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:242:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:248:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalMyDsl.g:256:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:261:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:261:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:262:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:279:3: ( ( ruleEString ) )
            // InternalMyDsl.g:280:4: ( ruleEString )
            {
            // InternalMyDsl.g:280:4: ( ruleEString )
            // InternalMyDsl.g:281:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:299:3: ( ( ruleEString ) )
            // InternalMyDsl.g:300:4: ( ruleEString )
            {
            // InternalMyDsl.g:300:4: ( ruleEString )
            // InternalMyDsl.g:301:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStartState"
    // InternalMyDsl.g:319:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalMyDsl.g:319:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalMyDsl.g:320:2: iv_ruleStartState= ruleStartState EOF
            {
             newCompositeNode(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartState=ruleStartState();

            state._fsp--;

             current =iv_ruleStartState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartState"


    // $ANTLR start "ruleStartState"
    // InternalMyDsl.g:326:1: ruleStartState returns [EObject current=null] : ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:332:2: ( ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:333:2: ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:333:2: ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:334:3: () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:334:3: ()
            // InternalMyDsl.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartStateAccess().getStartStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartStateAccess().getStartStateKeyword_1());
            		
            // InternalMyDsl.g:345:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:346:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:346:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:347:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStartStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleFinalState"
    // InternalMyDsl.g:368:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMyDsl.g:368:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMyDsl.g:369:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMyDsl.g:375:1: ruleFinalState returns [EObject current=null] : ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:381:2: ( ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:382:2: ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:382:2: ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:383:3: () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:383:3: ()
            // InternalMyDsl.g:384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getFinalStateKeyword_1());
            		
            // InternalMyDsl.g:394:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:395:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:395:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:396:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:417:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:417:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:418:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:424:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:430:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:432:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:440:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}