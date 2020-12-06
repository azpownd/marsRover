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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'Safety:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'Sensors:'", "'End:'", "'FlashingColor:'", "'FinalSentence:'", "'AvoidColors'", "'FindColors'"
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
    public static final int T__24=24;
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
    // InternalRoverDSL.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )? (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )? (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )? (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )? (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )? (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )? (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )? otherlv_18= 'End:' ( (lv_terminationcondition_19_0= RULE_STRING ) ) (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )? (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_safetyproperty_3_0=null;
        Token otherlv_4=null;
        Token lv_beginsentence_5_0=null;
        Token otherlv_6=null;
        Token lv_border_7_0=null;
        Token otherlv_8=null;
        Token lv_forwardspeed_9_0=null;
        Token otherlv_10=null;
        Token lv_reversespeed_11_0=null;
        Token otherlv_12=null;
        Token lv_turndirection_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_terminationcondition_19_0=null;
        Token otherlv_20=null;
        Token lv_flashingcolor_21_0=null;
        Token otherlv_22=null;
        Token lv_finalsentence_23_0=null;
        Enumerator lv_missiontype_1_0 = null;

        EObject lv_colorlist_15_0 = null;

        EObject lv_sensorlist_17_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )? (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )? (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )? (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )? (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )? (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )? (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )? otherlv_18= 'End:' ( (lv_terminationcondition_19_0= RULE_STRING ) ) (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )? (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )? ) )
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )? (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )? (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )? (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )? (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )? (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )? (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )? otherlv_18= 'End:' ( (lv_terminationcondition_19_0= RULE_STRING ) ) (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )? (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )? )
            {
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )? (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )? (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )? (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )? (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )? (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )? (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )? otherlv_18= 'End:' ( (lv_terminationcondition_19_0= RULE_STRING ) ) (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )? (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )? )
            // InternalRoverDSL.g:80:3: otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )? (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )? (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )? (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )? (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )? (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )? (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )? otherlv_18= 'End:' ( (lv_terminationcondition_19_0= RULE_STRING ) ) (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )? (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )?
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

            // InternalRoverDSL.g:103:3: (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRoverDSL.g:104:4: otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getSafetyKeyword_2_0());
                    			
                    // InternalRoverDSL.g:108:4: ( (lv_safetyproperty_3_0= RULE_STRING ) )
                    // InternalRoverDSL.g:109:5: (lv_safetyproperty_3_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:109:5: (lv_safetyproperty_3_0= RULE_STRING )
                    // InternalRoverDSL.g:110:6: lv_safetyproperty_3_0= RULE_STRING
                    {
                    lv_safetyproperty_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_safetyproperty_3_0, grammarAccess.getMissionAccess().getSafetypropertySTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"safetyproperty",
                    							lv_safetyproperty_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:127:3: (otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:128:4: otherlv_4= 'BeginSentence:' ( (lv_beginsentence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getBeginSentenceKeyword_3_0());
                    			
                    // InternalRoverDSL.g:132:4: ( (lv_beginsentence_5_0= RULE_STRING ) )
                    // InternalRoverDSL.g:133:5: (lv_beginsentence_5_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:133:5: (lv_beginsentence_5_0= RULE_STRING )
                    // InternalRoverDSL.g:134:6: lv_beginsentence_5_0= RULE_STRING
                    {
                    lv_beginsentence_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_beginsentence_5_0, grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"beginsentence",
                    							lv_beginsentence_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:151:3: (otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:152:4: otherlv_6= 'OuterBorder:' ( (lv_border_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getOuterBorderKeyword_4_0());
                    			
                    // InternalRoverDSL.g:156:4: ( (lv_border_7_0= RULE_STRING ) )
                    // InternalRoverDSL.g:157:5: (lv_border_7_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:157:5: (lv_border_7_0= RULE_STRING )
                    // InternalRoverDSL.g:158:6: lv_border_7_0= RULE_STRING
                    {
                    lv_border_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_border_7_0, grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"border",
                    							lv_border_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:175:3: (otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:176:4: otherlv_8= 'ForwardSpeed:' ( (lv_forwardspeed_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getForwardSpeedKeyword_5_0());
                    			
                    // InternalRoverDSL.g:180:4: ( (lv_forwardspeed_9_0= RULE_INT ) )
                    // InternalRoverDSL.g:181:5: (lv_forwardspeed_9_0= RULE_INT )
                    {
                    // InternalRoverDSL.g:181:5: (lv_forwardspeed_9_0= RULE_INT )
                    // InternalRoverDSL.g:182:6: lv_forwardspeed_9_0= RULE_INT
                    {
                    lv_forwardspeed_9_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_forwardspeed_9_0, grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"forwardspeed",
                    							lv_forwardspeed_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:199:3: (otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:200:4: otherlv_10= 'ReverseSpeed:' ( (lv_reversespeed_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getReverseSpeedKeyword_6_0());
                    			
                    // InternalRoverDSL.g:204:4: ( (lv_reversespeed_11_0= RULE_INT ) )
                    // InternalRoverDSL.g:205:5: (lv_reversespeed_11_0= RULE_INT )
                    {
                    // InternalRoverDSL.g:205:5: (lv_reversespeed_11_0= RULE_INT )
                    // InternalRoverDSL.g:206:6: lv_reversespeed_11_0= RULE_INT
                    {
                    lv_reversespeed_11_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_reversespeed_11_0, grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"reversespeed",
                    							lv_reversespeed_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:223:3: (otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:224:4: otherlv_12= 'TurnDirection:' ( (lv_turndirection_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getTurnDirectionKeyword_7_0());
                    			
                    // InternalRoverDSL.g:228:4: ( (lv_turndirection_13_0= RULE_INT ) )
                    // InternalRoverDSL.g:229:5: (lv_turndirection_13_0= RULE_INT )
                    {
                    // InternalRoverDSL.g:229:5: (lv_turndirection_13_0= RULE_INT )
                    // InternalRoverDSL.g:230:6: lv_turndirection_13_0= RULE_INT
                    {
                    lv_turndirection_13_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_turndirection_13_0, grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"turndirection",
                    							lv_turndirection_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:247:3: (otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:248:4: otherlv_14= 'Colors:' ( (lv_colorlist_15_0= ruleColors ) )*
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getColorsKeyword_8_0());
                    			
                    // InternalRoverDSL.g:252:4: ( (lv_colorlist_15_0= ruleColors ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRoverDSL.g:253:5: (lv_colorlist_15_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:253:5: (lv_colorlist_15_0= ruleColors )
                    	    // InternalRoverDSL.g:254:6: lv_colorlist_15_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_colorlist_15_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorlist",
                    	    							lv_colorlist_15_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRoverDSL.g:272:3: (otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:273:4: otherlv_16= 'Sensors:' ( (lv_sensorlist_17_0= ruleSensors ) )*
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getSensorsKeyword_9_0());
                    			
                    // InternalRoverDSL.g:277:4: ( (lv_sensorlist_17_0= ruleSensors ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRoverDSL.g:278:5: (lv_sensorlist_17_0= ruleSensors )
                    	    {
                    	    // InternalRoverDSL.g:278:5: (lv_sensorlist_17_0= ruleSensors )
                    	    // InternalRoverDSL.g:279:6: lv_sensorlist_17_0= ruleSensors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_sensorlist_17_0=ruleSensors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensorlist",
                    	    							lv_sensorlist_17_0,
                    	    							"mars.rover.RoverDSL.Sensors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEndKeyword_10());
            		
            // InternalRoverDSL.g:301:3: ( (lv_terminationcondition_19_0= RULE_STRING ) )
            // InternalRoverDSL.g:302:4: (lv_terminationcondition_19_0= RULE_STRING )
            {
            // InternalRoverDSL.g:302:4: (lv_terminationcondition_19_0= RULE_STRING )
            // InternalRoverDSL.g:303:5: lv_terminationcondition_19_0= RULE_STRING
            {
            lv_terminationcondition_19_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_terminationcondition_19_0, grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"terminationcondition",
            						lv_terminationcondition_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRoverDSL.g:319:3: (otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:320:4: otherlv_20= 'FlashingColor:' ( (lv_flashingcolor_21_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0());
                    			
                    // InternalRoverDSL.g:324:4: ( (lv_flashingcolor_21_0= RULE_STRING ) )
                    // InternalRoverDSL.g:325:5: (lv_flashingcolor_21_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:325:5: (lv_flashingcolor_21_0= RULE_STRING )
                    // InternalRoverDSL.g:326:6: lv_flashingcolor_21_0= RULE_STRING
                    {
                    lv_flashingcolor_21_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_flashingcolor_21_0, grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"flashingcolor",
                    							lv_flashingcolor_21_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:343:3: (otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:344:4: otherlv_22= 'FinalSentence:' ( (lv_finalsentence_23_0= RULE_STRING ) )
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0());
                    			
                    // InternalRoverDSL.g:348:4: ( (lv_finalsentence_23_0= RULE_STRING ) )
                    // InternalRoverDSL.g:349:5: (lv_finalsentence_23_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:349:5: (lv_finalsentence_23_0= RULE_STRING )
                    // InternalRoverDSL.g:350:6: lv_finalsentence_23_0= RULE_STRING
                    {
                    lv_finalsentence_23_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_finalsentence_23_0, grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"finalsentence",
                    							lv_finalsentence_23_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // InternalRoverDSL.g:371:1: entryRuleColors returns [EObject current=null] : iv_ruleColors= ruleColors EOF ;
    public final EObject entryRuleColors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColors = null;


        try {
            // InternalRoverDSL.g:371:47: (iv_ruleColors= ruleColors EOF )
            // InternalRoverDSL.g:372:2: iv_ruleColors= ruleColors EOF
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
    // InternalRoverDSL.g:378:1: ruleColors returns [EObject current=null] : ( (lv_color_0_0= RULE_STRING ) ) ;
    public final EObject ruleColors() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:384:2: ( ( (lv_color_0_0= RULE_STRING ) ) )
            // InternalRoverDSL.g:385:2: ( (lv_color_0_0= RULE_STRING ) )
            {
            // InternalRoverDSL.g:385:2: ( (lv_color_0_0= RULE_STRING ) )
            // InternalRoverDSL.g:386:3: (lv_color_0_0= RULE_STRING )
            {
            // InternalRoverDSL.g:386:3: (lv_color_0_0= RULE_STRING )
            // InternalRoverDSL.g:387:4: lv_color_0_0= RULE_STRING
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
    // InternalRoverDSL.g:406:1: entryRuleSensors returns [EObject current=null] : iv_ruleSensors= ruleSensors EOF ;
    public final EObject entryRuleSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensors = null;


        try {
            // InternalRoverDSL.g:406:48: (iv_ruleSensors= ruleSensors EOF )
            // InternalRoverDSL.g:407:2: iv_ruleSensors= ruleSensors EOF
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
    // InternalRoverDSL.g:413:1: ruleSensors returns [EObject current=null] : ( (lv_sensor_0_0= RULE_STRING ) ) ;
    public final EObject ruleSensors() throws RecognitionException {
        EObject current = null;

        Token lv_sensor_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:419:2: ( ( (lv_sensor_0_0= RULE_STRING ) ) )
            // InternalRoverDSL.g:420:2: ( (lv_sensor_0_0= RULE_STRING ) )
            {
            // InternalRoverDSL.g:420:2: ( (lv_sensor_0_0= RULE_STRING ) )
            // InternalRoverDSL.g:421:3: (lv_sensor_0_0= RULE_STRING )
            {
            // InternalRoverDSL.g:421:3: (lv_sensor_0_0= RULE_STRING )
            // InternalRoverDSL.g:422:4: lv_sensor_0_0= RULE_STRING
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
    // InternalRoverDSL.g:441:1: ruleMissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) ) ;
    public final Enumerator ruleMissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:447:2: ( ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) ) )
            // InternalRoverDSL.g:448:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) )
            {
            // InternalRoverDSL.g:448:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:449:3: (enumLiteral_0= 'AvoidColors' )
                    {
                    // InternalRoverDSL.g:449:3: (enumLiteral_0= 'AvoidColors' )
                    // InternalRoverDSL.g:450:4: enumLiteral_0= 'AvoidColors'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:457:3: (enumLiteral_1= 'FindColors' )
                    {
                    // InternalRoverDSL.g:457:3: (enumLiteral_1= 'FindColors' )
                    // InternalRoverDSL.g:458:4: enumLiteral_1= 'FindColors'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FF000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});

}