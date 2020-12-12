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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'Safety:'", "'LakeColors:'", "'AvoidObjects:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'End:'", "'FlashingColor:'", "'FinalSentence:'", "'AvoidColors'", "'FindColors'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'On'", "'Off'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalRoverDSL.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )? (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )? (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )? (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )? (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )? (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )? (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )? (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )? (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )? otherlv_20= 'End:' ( (lv_terminationcondition_21_0= RULE_STRING ) ) (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )? (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_beginsentence_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_terminationcondition_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_finalsentence_25_0=null;
        Enumerator lv_missiontype_1_0 = null;

        Enumerator lv_safetyproperty_3_0 = null;

        Enumerator lv_lakelist_5_0 = null;

        EObject lv_objectdistance_7_0 = null;

        EObject lv_bordercolor_11_0 = null;

        EObject lv_forwardspeed_13_0 = null;

        EObject lv_reversespeed_15_0 = null;

        EObject lv_turndirection_17_0 = null;

        Enumerator lv_colorlist_19_0 = null;

        EObject lv_flashingcolor_23_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )? (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )? (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )? (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )? (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )? (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )? (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )? (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )? (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )? otherlv_20= 'End:' ( (lv_terminationcondition_21_0= RULE_STRING ) ) (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )? (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )? ) )
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )? (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )? (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )? (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )? (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )? (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )? (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )? (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )? (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )? otherlv_20= 'End:' ( (lv_terminationcondition_21_0= RULE_STRING ) ) (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )? (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )? )
            {
            // InternalRoverDSL.g:79:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )? (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )? (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )? (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )? (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )? (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )? (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )? (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )? (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )? otherlv_20= 'End:' ( (lv_terminationcondition_21_0= RULE_STRING ) ) (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )? (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )? )
            // InternalRoverDSL.g:80:3: otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )? (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )? (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )? (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )? (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )? (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )? (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )? (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )? (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )? otherlv_20= 'End:' ( (lv_terminationcondition_21_0= RULE_STRING ) ) (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )? (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )?
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

            // InternalRoverDSL.g:103:3: (otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRoverDSL.g:104:4: otherlv_2= 'Safety:' ( (lv_safetyproperty_3_0= ruleSafety ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getSafetyKeyword_2_0());
                    			
                    // InternalRoverDSL.g:108:4: ( (lv_safetyproperty_3_0= ruleSafety ) )
                    // InternalRoverDSL.g:109:5: (lv_safetyproperty_3_0= ruleSafety )
                    {
                    // InternalRoverDSL.g:109:5: (lv_safetyproperty_3_0= ruleSafety )
                    // InternalRoverDSL.g:110:6: lv_safetyproperty_3_0= ruleSafety
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_safetyproperty_3_0=ruleSafety();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"safetyproperty",
                    							lv_safetyproperty_3_0,
                    							"mars.rover.RoverDSL.Safety");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:128:3: (otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:129:4: otherlv_4= 'LakeColors:' ( (lv_lakelist_5_0= ruleColors ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getLakeColorsKeyword_3_0());
                    			
                    // InternalRoverDSL.g:133:4: ( (lv_lakelist_5_0= ruleColors ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=26 && LA2_0<=30)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRoverDSL.g:134:5: (lv_lakelist_5_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:134:5: (lv_lakelist_5_0= ruleColors )
                    	    // InternalRoverDSL.g:135:6: lv_lakelist_5_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_lakelist_5_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lakelist",
                    	    							lv_lakelist_5_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRoverDSL.g:153:3: (otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:154:4: otherlv_6= 'AvoidObjects:' ( (lv_objectdistance_7_0= ruleInteger ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getAvoidObjectsKeyword_4_0());
                    			
                    // InternalRoverDSL.g:158:4: ( (lv_objectdistance_7_0= ruleInteger ) )
                    // InternalRoverDSL.g:159:5: (lv_objectdistance_7_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:159:5: (lv_objectdistance_7_0= ruleInteger )
                    // InternalRoverDSL.g:160:6: lv_objectdistance_7_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_objectdistance_7_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"objectdistance",
                    							lv_objectdistance_7_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:178:3: (otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:179:4: otherlv_8= 'BeginSentence:' ( (lv_beginsentence_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getBeginSentenceKeyword_5_0());
                    			
                    // InternalRoverDSL.g:183:4: ( (lv_beginsentence_9_0= RULE_STRING ) )
                    // InternalRoverDSL.g:184:5: (lv_beginsentence_9_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:184:5: (lv_beginsentence_9_0= RULE_STRING )
                    // InternalRoverDSL.g:185:6: lv_beginsentence_9_0= RULE_STRING
                    {
                    lv_beginsentence_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_beginsentence_9_0, grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"beginsentence",
                    							lv_beginsentence_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:202:3: (otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:203:4: otherlv_10= 'OuterBorder:' ( (lv_bordercolor_11_0= ruleColor ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getOuterBorderKeyword_6_0());
                    			
                    // InternalRoverDSL.g:207:4: ( (lv_bordercolor_11_0= ruleColor ) )
                    // InternalRoverDSL.g:208:5: (lv_bordercolor_11_0= ruleColor )
                    {
                    // InternalRoverDSL.g:208:5: (lv_bordercolor_11_0= ruleColor )
                    // InternalRoverDSL.g:209:6: lv_bordercolor_11_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_bordercolor_11_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"bordercolor",
                    							lv_bordercolor_11_0,
                    							"mars.rover.RoverDSL.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:227:3: (otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:228:4: otherlv_12= 'ForwardSpeed:' ( (lv_forwardspeed_13_0= ruleInteger ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getForwardSpeedKeyword_7_0());
                    			
                    // InternalRoverDSL.g:232:4: ( (lv_forwardspeed_13_0= ruleInteger ) )
                    // InternalRoverDSL.g:233:5: (lv_forwardspeed_13_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:233:5: (lv_forwardspeed_13_0= ruleInteger )
                    // InternalRoverDSL.g:234:6: lv_forwardspeed_13_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_forwardspeed_13_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"forwardspeed",
                    							lv_forwardspeed_13_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:252:3: (otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:253:4: otherlv_14= 'ReverseSpeed:' ( (lv_reversespeed_15_0= ruleInteger ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getReverseSpeedKeyword_8_0());
                    			
                    // InternalRoverDSL.g:257:4: ( (lv_reversespeed_15_0= ruleInteger ) )
                    // InternalRoverDSL.g:258:5: (lv_reversespeed_15_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:258:5: (lv_reversespeed_15_0= ruleInteger )
                    // InternalRoverDSL.g:259:6: lv_reversespeed_15_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_reversespeed_15_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"reversespeed",
                    							lv_reversespeed_15_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:277:3: (otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:278:4: otherlv_16= 'TurnDirection:' ( (lv_turndirection_17_0= ruleInteger ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getTurnDirectionKeyword_9_0());
                    			
                    // InternalRoverDSL.g:282:4: ( (lv_turndirection_17_0= ruleInteger ) )
                    // InternalRoverDSL.g:283:5: (lv_turndirection_17_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:283:5: (lv_turndirection_17_0= ruleInteger )
                    // InternalRoverDSL.g:284:6: lv_turndirection_17_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_turndirection_17_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"turndirection",
                    							lv_turndirection_17_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:302:3: (otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:303:4: otherlv_18= 'Colors:' ( (lv_colorlist_19_0= ruleColors ) )*
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getColorsKeyword_10_0());
                    			
                    // InternalRoverDSL.g:307:4: ( (lv_colorlist_19_0= ruleColors ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=26 && LA10_0<=30)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRoverDSL.g:308:5: (lv_colorlist_19_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:308:5: (lv_colorlist_19_0= ruleColors )
                    	    // InternalRoverDSL.g:309:6: lv_colorlist_19_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_colorlist_19_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorlist",
                    	    							lv_colorlist_19_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getEndKeyword_11());
            		
            // InternalRoverDSL.g:331:3: ( (lv_terminationcondition_21_0= RULE_STRING ) )
            // InternalRoverDSL.g:332:4: (lv_terminationcondition_21_0= RULE_STRING )
            {
            // InternalRoverDSL.g:332:4: (lv_terminationcondition_21_0= RULE_STRING )
            // InternalRoverDSL.g:333:5: lv_terminationcondition_21_0= RULE_STRING
            {
            lv_terminationcondition_21_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_terminationcondition_21_0, grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"terminationcondition",
            						lv_terminationcondition_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRoverDSL.g:349:3: (otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:350:4: otherlv_22= 'FlashingColor:' ( (lv_flashingcolor_23_0= ruleColor ) )
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getFlashingColorKeyword_13_0());
                    			
                    // InternalRoverDSL.g:354:4: ( (lv_flashingcolor_23_0= ruleColor ) )
                    // InternalRoverDSL.g:355:5: (lv_flashingcolor_23_0= ruleColor )
                    {
                    // InternalRoverDSL.g:355:5: (lv_flashingcolor_23_0= ruleColor )
                    // InternalRoverDSL.g:356:6: lv_flashingcolor_23_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getFlashingcolorColorParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_flashingcolor_23_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"flashingcolor",
                    							lv_flashingcolor_23_0,
                    							"mars.rover.RoverDSL.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:374:3: (otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:375:4: otherlv_24= 'FinalSentence:' ( (lv_finalsentence_25_0= RULE_STRING ) )
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getFinalSentenceKeyword_14_0());
                    			
                    // InternalRoverDSL.g:379:4: ( (lv_finalsentence_25_0= RULE_STRING ) )
                    // InternalRoverDSL.g:380:5: (lv_finalsentence_25_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:380:5: (lv_finalsentence_25_0= RULE_STRING )
                    // InternalRoverDSL.g:381:6: lv_finalsentence_25_0= RULE_STRING
                    {
                    lv_finalsentence_25_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_finalsentence_25_0, grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"finalsentence",
                    							lv_finalsentence_25_0,
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


    // $ANTLR start "entryRuleInteger"
    // InternalRoverDSL.g:402:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalRoverDSL.g:402:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalRoverDSL.g:403:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalRoverDSL.g:409:1: ruleInteger returns [EObject current=null] : ( (lv_integer_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:415:2: ( ( (lv_integer_0_0= RULE_INT ) ) )
            // InternalRoverDSL.g:416:2: ( (lv_integer_0_0= RULE_INT ) )
            {
            // InternalRoverDSL.g:416:2: ( (lv_integer_0_0= RULE_INT ) )
            // InternalRoverDSL.g:417:3: (lv_integer_0_0= RULE_INT )
            {
            // InternalRoverDSL.g:417:3: (lv_integer_0_0= RULE_INT )
            // InternalRoverDSL.g:418:4: lv_integer_0_0= RULE_INT
            {
            lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_integer_0_0, grammarAccess.getIntegerAccess().getIntegerINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"integer",
            					lv_integer_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleColor"
    // InternalRoverDSL.g:437:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalRoverDSL.g:437:46: (iv_ruleColor= ruleColor EOF )
            // InternalRoverDSL.g:438:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalRoverDSL.g:444:1: ruleColor returns [EObject current=null] : ( (lv_color_0_0= ruleColors ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:450:2: ( ( (lv_color_0_0= ruleColors ) ) )
            // InternalRoverDSL.g:451:2: ( (lv_color_0_0= ruleColors ) )
            {
            // InternalRoverDSL.g:451:2: ( (lv_color_0_0= ruleColors ) )
            // InternalRoverDSL.g:452:3: (lv_color_0_0= ruleColors )
            {
            // InternalRoverDSL.g:452:3: (lv_color_0_0= ruleColors )
            // InternalRoverDSL.g:453:4: lv_color_0_0= ruleColors
            {

            				newCompositeNode(grammarAccess.getColorAccess().getColorColorsEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_color_0_0=ruleColors();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColorRule());
            				}
            				set(
            					current,
            					"color",
            					lv_color_0_0,
            					"mars.rover.RoverDSL.Colors");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleMissionType"
    // InternalRoverDSL.g:473:1: ruleMissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) ) ;
    public final Enumerator ruleMissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:479:2: ( ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) ) )
            // InternalRoverDSL.g:480:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) )
            {
            // InternalRoverDSL.g:480:2: ( (enumLiteral_0= 'AvoidColors' ) | (enumLiteral_1= 'FindColors' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverDSL.g:481:3: (enumLiteral_0= 'AvoidColors' )
                    {
                    // InternalRoverDSL.g:481:3: (enumLiteral_0= 'AvoidColors' )
                    // InternalRoverDSL.g:482:4: enumLiteral_0= 'AvoidColors'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:489:3: (enumLiteral_1= 'FindColors' )
                    {
                    // InternalRoverDSL.g:489:3: (enumLiteral_1= 'FindColors' )
                    // InternalRoverDSL.g:490:4: enumLiteral_1= 'FindColors'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "ruleColors"
    // InternalRoverDSL.g:500:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:506:2: ( ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) ) )
            // InternalRoverDSL.g:507:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) )
            {
            // InternalRoverDSL.g:507:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 30:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRoverDSL.g:508:3: (enumLiteral_0= 'White' )
                    {
                    // InternalRoverDSL.g:508:3: (enumLiteral_0= 'White' )
                    // InternalRoverDSL.g:509:4: enumLiteral_0= 'White'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:516:3: (enumLiteral_1= 'Red' )
                    {
                    // InternalRoverDSL.g:516:3: (enumLiteral_1= 'Red' )
                    // InternalRoverDSL.g:517:4: enumLiteral_1= 'Red'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:524:3: (enumLiteral_2= 'Blue' )
                    {
                    // InternalRoverDSL.g:524:3: (enumLiteral_2= 'Blue' )
                    // InternalRoverDSL.g:525:4: enumLiteral_2= 'Blue'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:532:3: (enumLiteral_3= 'Yellow' )
                    {
                    // InternalRoverDSL.g:532:3: (enumLiteral_3= 'Yellow' )
                    // InternalRoverDSL.g:533:4: enumLiteral_3= 'Yellow'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:540:3: (enumLiteral_4= 'Black' )
                    {
                    // InternalRoverDSL.g:540:3: (enumLiteral_4= 'Black' )
                    // InternalRoverDSL.g:541:4: enumLiteral_4= 'Black'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleSafety"
    // InternalRoverDSL.g:551:1: ruleSafety returns [Enumerator current=null] : ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) ) ;
    public final Enumerator ruleSafety() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:557:2: ( ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) ) )
            // InternalRoverDSL.g:558:2: ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) )
            {
            // InternalRoverDSL.g:558:2: ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoverDSL.g:559:3: (enumLiteral_0= 'On' )
                    {
                    // InternalRoverDSL.g:559:3: (enumLiteral_0= 'On' )
                    // InternalRoverDSL.g:560:4: enumLiteral_0= 'On'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:567:3: (enumLiteral_1= 'Off' )
                    {
                    // InternalRoverDSL.g:567:3: (enumLiteral_1= 'Off' )
                    // InternalRoverDSL.g:568:4: enumLiteral_1= 'Off'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSafety"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003FE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007C3FC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007C200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});

}