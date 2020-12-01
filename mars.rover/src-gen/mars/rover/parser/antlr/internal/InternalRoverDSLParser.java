package mars.rover.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mars.rover.services.RoverDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoverDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'OuterBorder:'", "'ForwardSpeedPercentage:'", "'ReverseSpeedPercentage:'", "'TurnDirection:'", "'Colors:'", "'Sensors:'", "'End:'", "'FlashingColor:'", "'FinalSentence:'", "'AvoidColors'", "'DetectBottle'", "'FindColors'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRoverDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoverDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoverDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoverDSL.g"; }



     	private RoverDSLGrammarAccess grammarAccess;

        public InternalRoverDSLParser(TokenStream input, RoverDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mission";
       	}

       	@Override
       	protected RoverDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalRoverDSL.g:65:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRoverDSL.g:65:48: (iv_ruleMission= ruleMission EOF )
            // InternalRoverDSL.g:66:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalRoverDSL.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) otherlv_2= 'OuterBorder:' ( (lv_border_3_0= RULE_STRING ) ) otherlv_4= 'ForwardSpeedPercentage:' ( (lv_forwardspeed_5_0= RULE_INT ) ) otherlv_6= 'ReverseSpeedPercentage:' ( (lv_reversespeed_7_0= RULE_INT ) ) otherlv_8= 'TurnDirection:' ( (lv_turndirection_9_0= RULE_STRING ) ) (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )? (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )? otherlv_14= 'End:' ( (lv_terminationcondition_15_0= RULE_STRING ) ) otherlv_16= 'FlashingColor:' ( (lv_flashingcolor_17_0= RULE_STRING ) ) otherlv_18= 'FinalSentence:' ( (lv_finalsentence_19_0= RULE_STRING ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_border_3_0=null;
        Token otherlv_4=null;
        Token lv_forwardspeed_5_0=null;
        Token otherlv_6=null;
        Token lv_reversespeed_7_0=null;
        Token otherlv_8=null;
        Token lv_turndirection_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_terminationcondition_15_0=null;
        Token otherlv_16=null;
        Token lv_flashingcolor_17_0=null;
        Token otherlv_18=null;
        Token lv_finalsentence_19_0=null;
        Enumerator lv_missiontype_1_0 = null;

        EObject lv_colorlist_11_0 = null;

        EObject lv_sensorlist_13_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) otherlv_2= 'OuterBorder:' ( (lv_border_3_0= RULE_STRING ) ) otherlv_4= 'ForwardSpeedPercentage:' ( (lv_forwardspeed_5_0= RULE_INT ) ) otherlv_6= 'ReverseSpeedPercentage:' ( (lv_reversespeed_7_0= RULE_INT ) ) otherlv_8= 'TurnDirection:' ( (lv_turndirection_9_0= RULE_STRING ) ) (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )? (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )? otherlv_14= 'End:' ( (lv_terminationcondition_15_0= RULE_STRING ) ) otherlv_16= 'FlashingColor:' ( (lv_flashingcolor_17_0= RULE_STRING ) ) otherlv_18= 'FinalSentence:' ( (lv_finalsentence_19_0= RULE_STRING ) ) ) )
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) otherlv_2= 'OuterBorder:' ( (lv_border_3_0= RULE_STRING ) ) otherlv_4= 'ForwardSpeedPercentage:' ( (lv_forwardspeed_5_0= RULE_INT ) ) otherlv_6= 'ReverseSpeedPercentage:' ( (lv_reversespeed_7_0= RULE_INT ) ) otherlv_8= 'TurnDirection:' ( (lv_turndirection_9_0= RULE_STRING ) ) (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )? (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )? otherlv_14= 'End:' ( (lv_terminationcondition_15_0= RULE_STRING ) ) otherlv_16= 'FlashingColor:' ( (lv_flashingcolor_17_0= RULE_STRING ) ) otherlv_18= 'FinalSentence:' ( (lv_finalsentence_19_0= RULE_STRING ) ) )
            {
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) otherlv_2= 'OuterBorder:' ( (lv_border_3_0= RULE_STRING ) ) otherlv_4= 'ForwardSpeedPercentage:' ( (lv_forwardspeed_5_0= RULE_INT ) ) otherlv_6= 'ReverseSpeedPercentage:' ( (lv_reversespeed_7_0= RULE_INT ) ) otherlv_8= 'TurnDirection:' ( (lv_turndirection_9_0= RULE_STRING ) ) (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )? (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )? otherlv_14= 'End:' ( (lv_terminationcondition_15_0= RULE_STRING ) ) otherlv_16= 'FlashingColor:' ( (lv_flashingcolor_17_0= RULE_STRING ) ) otherlv_18= 'FinalSentence:' ( (lv_finalsentence_19_0= RULE_STRING ) ) )
            // InternalRoverDSL.g:80:3: otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) otherlv_2= 'OuterBorder:' ( (lv_border_3_0= RULE_STRING ) ) otherlv_4= 'ForwardSpeedPercentage:' ( (lv_forwardspeed_5_0= RULE_INT ) ) otherlv_6= 'ReverseSpeedPercentage:' ( (lv_reversespeed_7_0= RULE_INT ) ) otherlv_8= 'TurnDirection:' ( (lv_turndirection_9_0= RULE_STRING ) ) (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )? (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )? otherlv_14= 'End:' ( (lv_terminationcondition_15_0= RULE_STRING ) ) otherlv_16= 'FlashingColor:' ( (lv_flashingcolor_17_0= RULE_STRING ) ) otherlv_18= 'FinalSentence:' ( (lv_finalsentence_19_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRoverDSL.g:84:3: ( (lv_missiontype_1_0= ruleMissionType ) )
            // InternalRoverDSL.g:85:4: (lv_missiontype_1_0= ruleMissionType )
            {
            // InternalRoverDSL.g:85:4: (lv_missiontype_1_0= ruleMissionType )
            // InternalRoverDSL.g:86:5: lv_missiontype_1_0= ruleMissionType
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_missiontype_1_0=ruleMissionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"missiontype",
            						lv_missiontype_1_0,
            						"mars.rover.RoverDSL.MissionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getOuterBorderKeyword_2());
            		
            // InternalRoverDSL.g:107:3: ( (lv_border_3_0= RULE_STRING ) )
            // InternalRoverDSL.g:108:4: (lv_border_3_0= RULE_STRING )
            {
            // InternalRoverDSL.g:108:4: (lv_border_3_0= RULE_STRING )
            // InternalRoverDSL.g:109:5: lv_border_3_0= RULE_STRING
            {
            lv_border_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_border_3_0, grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"border",
            						lv_border_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getForwardSpeedPercentageKeyword_4());
            		
            // InternalRoverDSL.g:129:3: ( (lv_forwardspeed_5_0= RULE_INT ) )
            // InternalRoverDSL.g:130:4: (lv_forwardspeed_5_0= RULE_INT )
            {
            // InternalRoverDSL.g:130:4: (lv_forwardspeed_5_0= RULE_INT )
            // InternalRoverDSL.g:131:5: lv_forwardspeed_5_0= RULE_INT
            {
            lv_forwardspeed_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_forwardspeed_5_0, grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forwardspeed",
            						lv_forwardspeed_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getReverseSpeedPercentageKeyword_6());
            		
            // InternalRoverDSL.g:151:3: ( (lv_reversespeed_7_0= RULE_INT ) )
            // InternalRoverDSL.g:152:4: (lv_reversespeed_7_0= RULE_INT )
            {
            // InternalRoverDSL.g:152:4: (lv_reversespeed_7_0= RULE_INT )
            // InternalRoverDSL.g:153:5: lv_reversespeed_7_0= RULE_INT
            {
            lv_reversespeed_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_reversespeed_7_0, grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reversespeed",
            						lv_reversespeed_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getTurnDirectionKeyword_8());
            		
            // InternalRoverDSL.g:173:3: ( (lv_turndirection_9_0= RULE_STRING ) )
            // InternalRoverDSL.g:174:4: (lv_turndirection_9_0= RULE_STRING )
            {
            // InternalRoverDSL.g:174:4: (lv_turndirection_9_0= RULE_STRING )
            // InternalRoverDSL.g:175:5: lv_turndirection_9_0= RULE_STRING
            {
            lv_turndirection_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_turndirection_9_0, grammarAccess.getMissionAccess().getTurndirectionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"turndirection",
            						lv_turndirection_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRoverDSL.g:191:3: (otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:192:4: otherlv_10= 'Colors:' ( (lv_colorlist_11_0= ruleColors ) )*
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getColorsKeyword_10_0());
                    			
                    // InternalRoverDSL.g:196:4: ( (lv_colorlist_11_0= ruleColors ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRoverDSL.g:197:5: (lv_colorlist_11_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:197:5: (lv_colorlist_11_0= ruleColors )
                    	    // InternalRoverDSL.g:198:6: lv_colorlist_11_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_colorlist_11_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorlist",
                    	    							lv_colorlist_11_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRoverDSL.g:216:3: (otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:217:4: otherlv_12= 'Sensors:' ( (lv_sensorlist_13_0= ruleSensors ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getSensorsKeyword_11_0());
                    			
                    // InternalRoverDSL.g:221:4: ( (lv_sensorlist_13_0= ruleSensors ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRoverDSL.g:222:5: (lv_sensorlist_13_0= ruleSensors )
                    	    {
                    	    // InternalRoverDSL.g:222:5: (lv_sensorlist_13_0= ruleSensors )
                    	    // InternalRoverDSL.g:223:6: lv_sensorlist_13_0= ruleSensors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_sensorlist_13_0=ruleSensors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensorlist",
                    	    							lv_sensorlist_13_0,
                    	    							"mars.rover.RoverDSL.Sensors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getEndKeyword_12());
            		
            // InternalRoverDSL.g:245:3: ( (lv_terminationcondition_15_0= RULE_STRING ) )
            // InternalRoverDSL.g:246:4: (lv_terminationcondition_15_0= RULE_STRING )
            {
            // InternalRoverDSL.g:246:4: (lv_terminationcondition_15_0= RULE_STRING )
            // InternalRoverDSL.g:247:5: lv_terminationcondition_15_0= RULE_STRING
            {
            lv_terminationcondition_15_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_terminationcondition_15_0, grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"terminationcondition",
            						lv_terminationcondition_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getFlashingColorKeyword_14());
            		
            // InternalRoverDSL.g:267:3: ( (lv_flashingcolor_17_0= RULE_STRING ) )
            // InternalRoverDSL.g:268:4: (lv_flashingcolor_17_0= RULE_STRING )
            {
            // InternalRoverDSL.g:268:4: (lv_flashingcolor_17_0= RULE_STRING )
            // InternalRoverDSL.g:269:5: lv_flashingcolor_17_0= RULE_STRING
            {
            lv_flashingcolor_17_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_flashingcolor_17_0, grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flashingcolor",
            						lv_flashingcolor_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getFinalSentenceKeyword_16());
            		
            // InternalRoverDSL.g:289:3: ( (lv_finalsentence_19_0= RULE_STRING ) )
            // InternalRoverDSL.g:290:4: (lv_finalsentence_19_0= RULE_STRING )
            {
            // InternalRoverDSL.g:290:4: (lv_finalsentence_19_0= RULE_STRING )
            // InternalRoverDSL.g:291:5: lv_finalsentence_19_0= RULE_STRING
            {
            lv_finalsentence_19_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_finalsentence_19_0, grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"finalsentence",
            						lv_finalsentence_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleColors"
    // InternalRoverDSL.g:311:1: entryRuleColors returns [EObject current=null] : iv_ruleColors= ruleColors EOF ;
    public final EObject entryRuleColors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColors = null;


        try {
            // InternalRoverDSL.g:311:47: (iv_ruleColors= ruleColors EOF )
            // InternalRoverDSL.g:312:2: iv_ruleColors= ruleColors EOF
            {
             newCompositeNode(grammarAccess.getColorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColors=ruleColors();

            state._fsp--;

             current =iv_ruleColors; 
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
    // $ANTLR end "entryRuleColors"


    // $ANTLR start "ruleColors"
    // InternalRoverDSL.g:318:1: ruleColors returns [EObject current=null] : ( (lv_color_0_0= RULE_STRING ) ) ;
    public final EObject ruleColors() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:324:2: ( ( (lv_color_0_0= RULE_STRING ) ) )
            // InternalRoverDSL.g:325:2: ( (lv_color_0_0= RULE_STRING ) )
            {
            // InternalRoverDSL.g:325:2: ( (lv_color_0_0= RULE_STRING ) )
            // InternalRoverDSL.g:326:3: (lv_color_0_0= RULE_STRING )
            {
            // InternalRoverDSL.g:326:3: (lv_color_0_0= RULE_STRING )
            // InternalRoverDSL.g:327:4: lv_color_0_0= RULE_STRING
            {
            lv_color_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_color_0_0, grammarAccess.getColorsAccess().getColorSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColorsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"color",
            					lv_color_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "entryRuleSensors"
    // InternalRoverDSL.g:346:1: entryRuleSensors returns [EObject current=null] : iv_ruleSensors= ruleSensors EOF ;
    public final EObject entryRuleSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensors = null;


        try {
            // InternalRoverDSL.g:346:48: (iv_ruleSensors= ruleSensors EOF )
            // InternalRoverDSL.g:347:2: iv_ruleSensors= ruleSensors EOF
            {
             newCompositeNode(grammarAccess.getSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensors=ruleSensors();

            state._fsp--;

             current =iv_ruleSensors; 
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
    // $ANTLR end "entryRuleSensors"


    // $ANTLR start "ruleSensors"
    // InternalRoverDSL.g:353:1: ruleSensors returns [EObject current=null] : ( (lv_sensor_0_0= RULE_STRING ) ) ;
    public final EObject ruleSensors() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:359:2: ( ( (lv_sensor_0_0= RULE_STRING ) ) )
            // InternalRoverDSL.g:360:2: ( (lv_sensor_0_0= RULE_STRING ) )
            {
            // InternalRoverDSL.g:360:2: ( (lv_sensor_0_0= RULE_STRING ) )
            // InternalRoverDSL.g:361:3: (lv_sensor_0_0= RULE_STRING )
            {
            // InternalRoverDSL.g:361:3: (lv_sensor_0_0= RULE_STRING )
            // InternalRoverDSL.g:362:4: lv_sensor_0_0= RULE_STRING
            {
            lv_sensor_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_sensor_0_0, grammarAccess.getSensorsAccess().getSensorSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSensorsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"sensor",
            					lv_sensor_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleSensors"


    // $ANTLR start "ruleMissionType"
    // InternalRoverDSL.g:381:1: ruleMissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'DetectBottle' ) | (enumLiteral_2= 'FindColors' ) ) ;
    public final Enumerator ruleMissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:387:2: ( ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'DetectBottle' ) | (enumLiteral_2= 'FindColors' ) ) )
            // InternalRoverDSL.g:388:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'DetectBottle' ) | (enumLiteral_2= 'FindColors' ) )
            {
            // InternalRoverDSL.g:388:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'DetectBottle' ) | (enumLiteral_2= 'FindColors' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:389:3: (enumLiteral_0= 'AvoidColors' )
                    {
                    // InternalRoverDSL.g:389:3: (enumLiteral_0= 'AvoidColors' )
                    // InternalRoverDSL.g:390:4: enumLiteral_0= 'AvoidColors'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:397:3: (enumLiteral_1= 'DetectBottle' )
                    {
                    // InternalRoverDSL.g:397:3: (enumLiteral_1= 'DetectBottle' )
                    // InternalRoverDSL.g:398:4: enumLiteral_1= 'DetectBottle'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getDetectBottleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMissionTypeAccess().getDetectBottleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:405:3: (enumLiteral_2= 'FindColors' )
                    {
                    // InternalRoverDSL.g:405:3: (enumLiteral_2= 'FindColors' )
                    // InternalRoverDSL.g:406:4: enumLiteral_2= 'FindColors'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleMissionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}