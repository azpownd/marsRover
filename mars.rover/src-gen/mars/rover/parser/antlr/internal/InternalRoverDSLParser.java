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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'BeginSentence:'", "'FinalSentence:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Safety:'", "'AvoidObjects:'", "'OuterBorder:'", "'LakeColors:'", "'Colors:'", "'MeasurementColors:'", "'FlashingColor:'", "'Timeout:'", "'End'", "'FindColors'", "'Measure'", "'Park'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'On'", "'Off'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
        	return "Tasks";
       	}

       	@Override
       	protected RoverDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTasks"
    // InternalRoverDSL.g:65:1: entryRuleTasks returns [EObject current=null] : iv_ruleTasks= ruleTasks EOF ;
    public final EObject entryRuleTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasks = null;


        try {
            // InternalRoverDSL.g:65:46: (iv_ruleTasks= ruleTasks EOF )
            // InternalRoverDSL.g:66:2: iv_ruleTasks= ruleTasks EOF
            {
             newCompositeNode(grammarAccess.getTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTasks=ruleTasks();

            state._fsp--;

             current =iv_ruleTasks; 
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
    // $ANTLR end "entryRuleTasks"


    // $ANTLR start "ruleTasks"
    // InternalRoverDSL.g:72:1: ruleTasks returns [EObject current=null] : ( (lv_missionlist_0_0= ruleMission ) )+ ;
    public final EObject ruleTasks() throws RecognitionException {
        EObject current = null;

        EObject lv_missionlist_0_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:78:2: ( ( (lv_missionlist_0_0= ruleMission ) )+ )
            // InternalRoverDSL.g:79:2: ( (lv_missionlist_0_0= ruleMission ) )+
            {
            // InternalRoverDSL.g:79:2: ( (lv_missionlist_0_0= ruleMission ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoverDSL.g:80:3: (lv_missionlist_0_0= ruleMission )
            	    {
            	    // InternalRoverDSL.g:80:3: (lv_missionlist_0_0= ruleMission )
            	    // InternalRoverDSL.g:81:4: lv_missionlist_0_0= ruleMission
            	    {

            	    				newCompositeNode(grammarAccess.getTasksAccess().getMissionlistMissionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_missionlist_0_0=ruleMission();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTasksRule());
            	    				}
            	    				add(
            	    					current,
            	    					"missionlist",
            	    					lv_missionlist_0_0,
            	    					"mars.rover.RoverDSL.Mission");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleTasks"


    // $ANTLR start "entryRuleMission"
    // InternalRoverDSL.g:101:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRoverDSL.g:101:48: (iv_ruleMission= ruleMission EOF )
            // InternalRoverDSL.g:102:2: iv_ruleMission= ruleMission EOF
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
    // InternalRoverDSL.g:108:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )? (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )? (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )? (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )? (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )? (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )? (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )? (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )? (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )? (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )? (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )? (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )? otherlv_28= 'End' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_beginsentence_3_0=null;
        Token otherlv_4=null;
        Token lv_finalsentence_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_missiontype_1_0 = null;

        EObject lv_forwardspeed_7_0 = null;

        EObject lv_reversespeed_9_0 = null;

        EObject lv_turndirection_11_0 = null;

        Enumerator lv_safetyproperty_13_0 = null;

        EObject lv_objectdistance_15_0 = null;

        EObject lv_bordercolor_17_0 = null;

        Enumerator lv_lakelist_19_0 = null;

        Enumerator lv_colorlist_21_0 = null;

        Enumerator lv_measurelist_23_0 = null;

        EObject lv_flashingcolor_25_0 = null;

        EObject lv_timeout_27_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:114:2: ( (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )? (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )? (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )? (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )? (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )? (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )? (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )? (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )? (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )? (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )? (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )? (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )? otherlv_28= 'End' ) )
            // InternalRoverDSL.g:115:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )? (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )? (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )? (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )? (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )? (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )? (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )? (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )? (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )? (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )? (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )? (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )? otherlv_28= 'End' )
            {
            // InternalRoverDSL.g:115:2: (otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )? (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )? (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )? (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )? (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )? (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )? (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )? (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )? (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )? (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )? (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )? (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )? otherlv_28= 'End' )
            // InternalRoverDSL.g:116:3: otherlv_0= 'Mission:' ( (lv_missiontype_1_0= ruleMissionType ) ) (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )? (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )? (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )? (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )? (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )? (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )? (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )? (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )? (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )? (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )? (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )? (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )? (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )? otherlv_28= 'End'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRoverDSL.g:120:3: ( (lv_missiontype_1_0= ruleMissionType ) )
            // InternalRoverDSL.g:121:4: (lv_missiontype_1_0= ruleMissionType )
            {
            // InternalRoverDSL.g:121:4: (lv_missiontype_1_0= ruleMissionType )
            // InternalRoverDSL.g:122:5: lv_missiontype_1_0= ruleMissionType
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalRoverDSL.g:139:3: (otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:140:4: otherlv_2= 'BeginSentence:' ( (lv_beginsentence_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getBeginSentenceKeyword_2_0());
                    			
                    // InternalRoverDSL.g:144:4: ( (lv_beginsentence_3_0= RULE_STRING ) )
                    // InternalRoverDSL.g:145:5: (lv_beginsentence_3_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:145:5: (lv_beginsentence_3_0= RULE_STRING )
                    // InternalRoverDSL.g:146:6: lv_beginsentence_3_0= RULE_STRING
                    {
                    lv_beginsentence_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_beginsentence_3_0, grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"beginsentence",
                    							lv_beginsentence_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:163:3: (otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:164:4: otherlv_4= 'FinalSentence:' ( (lv_finalsentence_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getFinalSentenceKeyword_3_0());
                    			
                    // InternalRoverDSL.g:168:4: ( (lv_finalsentence_5_0= RULE_STRING ) )
                    // InternalRoverDSL.g:169:5: (lv_finalsentence_5_0= RULE_STRING )
                    {
                    // InternalRoverDSL.g:169:5: (lv_finalsentence_5_0= RULE_STRING )
                    // InternalRoverDSL.g:170:6: lv_finalsentence_5_0= RULE_STRING
                    {
                    lv_finalsentence_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_finalsentence_5_0, grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"finalsentence",
                    							lv_finalsentence_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:187:3: (otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:188:4: otherlv_6= 'ForwardSpeed:' ( (lv_forwardspeed_7_0= ruleInteger ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getForwardSpeedKeyword_4_0());
                    			
                    // InternalRoverDSL.g:192:4: ( (lv_forwardspeed_7_0= ruleInteger ) )
                    // InternalRoverDSL.g:193:5: (lv_forwardspeed_7_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:193:5: (lv_forwardspeed_7_0= ruleInteger )
                    // InternalRoverDSL.g:194:6: lv_forwardspeed_7_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_forwardspeed_7_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"forwardspeed",
                    							lv_forwardspeed_7_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:212:3: (otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:213:4: otherlv_8= 'ReverseSpeed:' ( (lv_reversespeed_9_0= ruleInteger ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getMissionAccess().getReverseSpeedKeyword_5_0());
                    			
                    // InternalRoverDSL.g:217:4: ( (lv_reversespeed_9_0= ruleInteger ) )
                    // InternalRoverDSL.g:218:5: (lv_reversespeed_9_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:218:5: (lv_reversespeed_9_0= ruleInteger )
                    // InternalRoverDSL.g:219:6: lv_reversespeed_9_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_reversespeed_9_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"reversespeed",
                    							lv_reversespeed_9_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:237:3: (otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:238:4: otherlv_10= 'TurnDirection:' ( (lv_turndirection_11_0= ruleInteger ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionAccess().getTurnDirectionKeyword_6_0());
                    			
                    // InternalRoverDSL.g:242:4: ( (lv_turndirection_11_0= ruleInteger ) )
                    // InternalRoverDSL.g:243:5: (lv_turndirection_11_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:243:5: (lv_turndirection_11_0= ruleInteger )
                    // InternalRoverDSL.g:244:6: lv_turndirection_11_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_turndirection_11_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"turndirection",
                    							lv_turndirection_11_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:262:3: (otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:263:4: otherlv_12= 'Safety:' ( (lv_safetyproperty_13_0= ruleSafety ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getSafetyKeyword_7_0());
                    			
                    // InternalRoverDSL.g:267:4: ( (lv_safetyproperty_13_0= ruleSafety ) )
                    // InternalRoverDSL.g:268:5: (lv_safetyproperty_13_0= ruleSafety )
                    {
                    // InternalRoverDSL.g:268:5: (lv_safetyproperty_13_0= ruleSafety )
                    // InternalRoverDSL.g:269:6: lv_safetyproperty_13_0= ruleSafety
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_safetyproperty_13_0=ruleSafety();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"safetyproperty",
                    							lv_safetyproperty_13_0,
                    							"mars.rover.RoverDSL.Safety");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:287:3: (otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:288:4: otherlv_14= 'AvoidObjects:' ( (lv_objectdistance_15_0= ruleInteger ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getAvoidObjectsKeyword_8_0());
                    			
                    // InternalRoverDSL.g:292:4: ( (lv_objectdistance_15_0= ruleInteger ) )
                    // InternalRoverDSL.g:293:5: (lv_objectdistance_15_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:293:5: (lv_objectdistance_15_0= ruleInteger )
                    // InternalRoverDSL.g:294:6: lv_objectdistance_15_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_objectdistance_15_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"objectdistance",
                    							lv_objectdistance_15_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:312:3: (otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:313:4: otherlv_16= 'OuterBorder:' ( (lv_bordercolor_17_0= ruleColor ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getOuterBorderKeyword_9_0());
                    			
                    // InternalRoverDSL.g:317:4: ( (lv_bordercolor_17_0= ruleColor ) )
                    // InternalRoverDSL.g:318:5: (lv_bordercolor_17_0= ruleColor )
                    {
                    // InternalRoverDSL.g:318:5: (lv_bordercolor_17_0= ruleColor )
                    // InternalRoverDSL.g:319:6: lv_bordercolor_17_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_bordercolor_17_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"bordercolor",
                    							lv_bordercolor_17_0,
                    							"mars.rover.RoverDSL.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:337:3: (otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:338:4: otherlv_18= 'LakeColors:' ( (lv_lakelist_19_0= ruleColors ) )*
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getLakeColorsKeyword_10_0());
                    			
                    // InternalRoverDSL.g:342:4: ( (lv_lakelist_19_0= ruleColors ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=29 && LA10_0<=33)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRoverDSL.g:343:5: (lv_lakelist_19_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:343:5: (lv_lakelist_19_0= ruleColors )
                    	    // InternalRoverDSL.g:344:6: lv_lakelist_19_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_lakelist_19_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lakelist",
                    	    							lv_lakelist_19_0,
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

            // InternalRoverDSL.g:362:3: (otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:363:4: otherlv_20= 'Colors:' ( (lv_colorlist_21_0= ruleColors ) )*
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getMissionAccess().getColorsKeyword_11_0());
                    			
                    // InternalRoverDSL.g:367:4: ( (lv_colorlist_21_0= ruleColors ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=29 && LA12_0<=33)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRoverDSL.g:368:5: (lv_colorlist_21_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:368:5: (lv_colorlist_21_0= ruleColors )
                    	    // InternalRoverDSL.g:369:6: lv_colorlist_21_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_colorlist_21_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"colorlist",
                    	    							lv_colorlist_21_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRoverDSL.g:387:3: (otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoverDSL.g:388:4: otherlv_22= 'MeasurementColors:' ( (lv_measurelist_23_0= ruleColors ) )*
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_22, grammarAccess.getMissionAccess().getMeasurementColorsKeyword_12_0());
                    			
                    // InternalRoverDSL.g:392:4: ( (lv_measurelist_23_0= ruleColors ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=29 && LA14_0<=33)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRoverDSL.g:393:5: (lv_measurelist_23_0= ruleColors )
                    	    {
                    	    // InternalRoverDSL.g:393:5: (lv_measurelist_23_0= ruleColors )
                    	    // InternalRoverDSL.g:394:6: lv_measurelist_23_0= ruleColors
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getMeasurelistColorsEnumRuleCall_12_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_measurelist_23_0=ruleColors();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"measurelist",
                    	    							lv_measurelist_23_0,
                    	    							"mars.rover.RoverDSL.Colors");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRoverDSL.g:412:3: (otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoverDSL.g:413:4: otherlv_24= 'FlashingColor:' ( (lv_flashingcolor_25_0= ruleColor ) )
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_24, grammarAccess.getMissionAccess().getFlashingColorKeyword_13_0());
                    			
                    // InternalRoverDSL.g:417:4: ( (lv_flashingcolor_25_0= ruleColor ) )
                    // InternalRoverDSL.g:418:5: (lv_flashingcolor_25_0= ruleColor )
                    {
                    // InternalRoverDSL.g:418:5: (lv_flashingcolor_25_0= ruleColor )
                    // InternalRoverDSL.g:419:6: lv_flashingcolor_25_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getFlashingcolorColorParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_flashingcolor_25_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"flashingcolor",
                    							lv_flashingcolor_25_0,
                    							"mars.rover.RoverDSL.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoverDSL.g:437:3: (otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRoverDSL.g:438:4: otherlv_26= 'Timeout:' ( (lv_timeout_27_0= ruleInteger ) )
                    {
                    otherlv_26=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getMissionAccess().getTimeoutKeyword_14_0());
                    			
                    // InternalRoverDSL.g:442:4: ( (lv_timeout_27_0= ruleInteger ) )
                    // InternalRoverDSL.g:443:5: (lv_timeout_27_0= ruleInteger )
                    {
                    // InternalRoverDSL.g:443:5: (lv_timeout_27_0= ruleInteger )
                    // InternalRoverDSL.g:444:6: lv_timeout_27_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTimeoutIntegerParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_timeout_27_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"timeout",
                    							lv_timeout_27_0,
                    							"mars.rover.RoverDSL.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getMissionAccess().getEndKeyword_15());
            		

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
    // InternalRoverDSL.g:470:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalRoverDSL.g:470:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalRoverDSL.g:471:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalRoverDSL.g:477:1: ruleInteger returns [EObject current=null] : ( (lv_integer_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:483:2: ( ( (lv_integer_0_0= RULE_INT ) ) )
            // InternalRoverDSL.g:484:2: ( (lv_integer_0_0= RULE_INT ) )
            {
            // InternalRoverDSL.g:484:2: ( (lv_integer_0_0= RULE_INT ) )
            // InternalRoverDSL.g:485:3: (lv_integer_0_0= RULE_INT )
            {
            // InternalRoverDSL.g:485:3: (lv_integer_0_0= RULE_INT )
            // InternalRoverDSL.g:486:4: lv_integer_0_0= RULE_INT
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
    // InternalRoverDSL.g:505:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalRoverDSL.g:505:46: (iv_ruleColor= ruleColor EOF )
            // InternalRoverDSL.g:506:2: iv_ruleColor= ruleColor EOF
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
    // InternalRoverDSL.g:512:1: ruleColor returns [EObject current=null] : ( (lv_color_0_0= ruleColors ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;



        	enterRule();

        try {
            // InternalRoverDSL.g:518:2: ( ( (lv_color_0_0= ruleColors ) ) )
            // InternalRoverDSL.g:519:2: ( (lv_color_0_0= ruleColors ) )
            {
            // InternalRoverDSL.g:519:2: ( (lv_color_0_0= ruleColors ) )
            // InternalRoverDSL.g:520:3: (lv_color_0_0= ruleColors )
            {
            // InternalRoverDSL.g:520:3: (lv_color_0_0= ruleColors )
            // InternalRoverDSL.g:521:4: lv_color_0_0= ruleColors
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
    // InternalRoverDSL.g:541:1: ruleMissionType returns [Enumerator current=null] : ( (enumLiteral_0= 'FindColors' ) | (enumLiteral_1= 'Measure' ) | (enumLiteral_2= 'Park' ) ) ;
    public final Enumerator ruleMissionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:547:2: ( ( (enumLiteral_0= 'FindColors' ) | (enumLiteral_1= 'Measure' ) | (enumLiteral_2= 'Park' ) ) )
            // InternalRoverDSL.g:548:2: ( (enumLiteral_0= 'FindColors' ) | (enumLiteral_1= 'Measure' ) | (enumLiteral_2= 'Park' ) )
            {
            // InternalRoverDSL.g:548:2: ( (enumLiteral_0= 'FindColors' ) | (enumLiteral_1= 'Measure' ) | (enumLiteral_2= 'Park' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRoverDSL.g:549:3: (enumLiteral_0= 'FindColors' )
                    {
                    // InternalRoverDSL.g:549:3: (enumLiteral_0= 'FindColors' )
                    // InternalRoverDSL.g:550:4: enumLiteral_0= 'FindColors'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:557:3: (enumLiteral_1= 'Measure' )
                    {
                    // InternalRoverDSL.g:557:3: (enumLiteral_1= 'Measure' )
                    // InternalRoverDSL.g:558:4: enumLiteral_1= 'Measure'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getMeasureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMissionTypeAccess().getMeasureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:565:3: (enumLiteral_2= 'Park' )
                    {
                    // InternalRoverDSL.g:565:3: (enumLiteral_2= 'Park' )
                    // InternalRoverDSL.g:566:4: enumLiteral_2= 'Park'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMissionTypeAccess().getParkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMissionTypeAccess().getParkEnumLiteralDeclaration_2());
                    			

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
    // InternalRoverDSL.g:576:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:582:2: ( ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) ) )
            // InternalRoverDSL.g:583:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) )
            {
            // InternalRoverDSL.g:583:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Red' ) | (enumLiteral_2= 'Blue' ) | (enumLiteral_3= 'Yellow' ) | (enumLiteral_4= 'Black' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case 30:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            case 32:
                {
                alt19=4;
                }
                break;
            case 33:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRoverDSL.g:584:3: (enumLiteral_0= 'White' )
                    {
                    // InternalRoverDSL.g:584:3: (enumLiteral_0= 'White' )
                    // InternalRoverDSL.g:585:4: enumLiteral_0= 'White'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:592:3: (enumLiteral_1= 'Red' )
                    {
                    // InternalRoverDSL.g:592:3: (enumLiteral_1= 'Red' )
                    // InternalRoverDSL.g:593:4: enumLiteral_1= 'Red'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:600:3: (enumLiteral_2= 'Blue' )
                    {
                    // InternalRoverDSL.g:600:3: (enumLiteral_2= 'Blue' )
                    // InternalRoverDSL.g:601:4: enumLiteral_2= 'Blue'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:608:3: (enumLiteral_3= 'Yellow' )
                    {
                    // InternalRoverDSL.g:608:3: (enumLiteral_3= 'Yellow' )
                    // InternalRoverDSL.g:609:4: enumLiteral_3= 'Yellow'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:616:3: (enumLiteral_4= 'Black' )
                    {
                    // InternalRoverDSL.g:616:3: (enumLiteral_4= 'Black' )
                    // InternalRoverDSL.g:617:4: enumLiteral_4= 'Black'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRoverDSL.g:627:1: ruleSafety returns [Enumerator current=null] : ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) ) ;
    public final Enumerator ruleSafety() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverDSL.g:633:2: ( ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) ) )
            // InternalRoverDSL.g:634:2: ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) )
            {
            // InternalRoverDSL.g:634:2: ( (enumLiteral_0= 'On' ) | (enumLiteral_1= 'Off' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            else if ( (LA20_0==35) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRoverDSL.g:635:3: (enumLiteral_0= 'On' )
                    {
                    // InternalRoverDSL.g:635:3: (enumLiteral_0= 'On' )
                    // InternalRoverDSL.g:636:4: enumLiteral_0= 'On'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:643:3: (enumLiteral_1= 'Off' )
                    {
                    // InternalRoverDSL.g:643:3: (enumLiteral_1= 'Off' )
                    // InternalRoverDSL.g:644:4: enumLiteral_1= 'Off'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003FFF000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FFE000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003FF0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003FE0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003E3E00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003E3C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003E3800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});

}