package mars.rover.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mars.rover.services.RoverDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoverDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AvoidColors'", "'DetectBottle'", "'FindColors'", "'Mission:'", "'OuterBorder:'", "'ForwardSpeedPercentage:'", "'ReverseSpeedPercentage:'", "'TurnDirection:'", "'End:'", "'FlashingColor:'", "'FinalSentence:'", "'Colors:'", "'Sensors:'"
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

    	public void setGrammarAccess(RoverDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMission"
    // InternalRoverDSL.g:53:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalRoverDSL.g:54:1: ( ruleMission EOF )
            // InternalRoverDSL.g:55:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalRoverDSL.g:62:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:66:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalRoverDSL.g:67:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalRoverDSL.g:67:2: ( ( rule__Mission__Group__0 ) )
            // InternalRoverDSL.g:68:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalRoverDSL.g:69:3: ( rule__Mission__Group__0 )
            // InternalRoverDSL.g:69:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleColors"
    // InternalRoverDSL.g:78:1: entryRuleColors : ruleColors EOF ;
    public final void entryRuleColors() throws RecognitionException {
        try {
            // InternalRoverDSL.g:79:1: ( ruleColors EOF )
            // InternalRoverDSL.g:80:1: ruleColors EOF
            {
             before(grammarAccess.getColorsRule()); 
            pushFollow(FOLLOW_1);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getColorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColors"


    // $ANTLR start "ruleColors"
    // InternalRoverDSL.g:87:1: ruleColors : ( ( rule__Colors__ColorAssignment ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:91:2: ( ( ( rule__Colors__ColorAssignment ) ) )
            // InternalRoverDSL.g:92:2: ( ( rule__Colors__ColorAssignment ) )
            {
            // InternalRoverDSL.g:92:2: ( ( rule__Colors__ColorAssignment ) )
            // InternalRoverDSL.g:93:3: ( rule__Colors__ColorAssignment )
            {
             before(grammarAccess.getColorsAccess().getColorAssignment()); 
            // InternalRoverDSL.g:94:3: ( rule__Colors__ColorAssignment )
            // InternalRoverDSL.g:94:4: rule__Colors__ColorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Colors__ColorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColorsAccess().getColorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColors"


    // $ANTLR start "entryRuleSensors"
    // InternalRoverDSL.g:103:1: entryRuleSensors : ruleSensors EOF ;
    public final void entryRuleSensors() throws RecognitionException {
        try {
            // InternalRoverDSL.g:104:1: ( ruleSensors EOF )
            // InternalRoverDSL.g:105:1: ruleSensors EOF
            {
             before(grammarAccess.getSensorsRule()); 
            pushFollow(FOLLOW_1);
            ruleSensors();

            state._fsp--;

             after(grammarAccess.getSensorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensors"


    // $ANTLR start "ruleSensors"
    // InternalRoverDSL.g:112:1: ruleSensors : ( ( rule__Sensors__SensorAssignment ) ) ;
    public final void ruleSensors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:116:2: ( ( ( rule__Sensors__SensorAssignment ) ) )
            // InternalRoverDSL.g:117:2: ( ( rule__Sensors__SensorAssignment ) )
            {
            // InternalRoverDSL.g:117:2: ( ( rule__Sensors__SensorAssignment ) )
            // InternalRoverDSL.g:118:3: ( rule__Sensors__SensorAssignment )
            {
             before(grammarAccess.getSensorsAccess().getSensorAssignment()); 
            // InternalRoverDSL.g:119:3: ( rule__Sensors__SensorAssignment )
            // InternalRoverDSL.g:119:4: rule__Sensors__SensorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sensors__SensorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSensorsAccess().getSensorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensors"


    // $ANTLR start "ruleMissionType"
    // InternalRoverDSL.g:128:1: ruleMissionType : ( ( rule__MissionType__Alternatives ) ) ;
    public final void ruleMissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:132:1: ( ( ( rule__MissionType__Alternatives ) ) )
            // InternalRoverDSL.g:133:2: ( ( rule__MissionType__Alternatives ) )
            {
            // InternalRoverDSL.g:133:2: ( ( rule__MissionType__Alternatives ) )
            // InternalRoverDSL.g:134:3: ( rule__MissionType__Alternatives )
            {
             before(grammarAccess.getMissionTypeAccess().getAlternatives()); 
            // InternalRoverDSL.g:135:3: ( rule__MissionType__Alternatives )
            // InternalRoverDSL.g:135:4: rule__MissionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MissionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMissionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMissionType"


    // $ANTLR start "rule__MissionType__Alternatives"
    // InternalRoverDSL.g:143:1: rule__MissionType__Alternatives : ( ( ( 'AvoidColors' ) ) | ( ( 'DetectBottle' ) ) | ( ( 'FindColors' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:147:1: ( ( ( 'AvoidColors' ) ) | ( ( 'DetectBottle' ) ) | ( ( 'FindColors' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRoverDSL.g:148:2: ( ( 'AvoidColors' ) )
                    {
                    // InternalRoverDSL.g:148:2: ( ( 'AvoidColors' ) )
                    // InternalRoverDSL.g:149:3: ( 'AvoidColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:150:3: ( 'AvoidColors' )
                    // InternalRoverDSL.g:150:4: 'AvoidColors'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:154:2: ( ( 'DetectBottle' ) )
                    {
                    // InternalRoverDSL.g:154:2: ( ( 'DetectBottle' ) )
                    // InternalRoverDSL.g:155:3: ( 'DetectBottle' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getDetectBottleEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:156:3: ( 'DetectBottle' )
                    // InternalRoverDSL.g:156:4: 'DetectBottle'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getDetectBottleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:160:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:160:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:161:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:162:3: ( 'FindColors' )
                    // InternalRoverDSL.g:162:4: 'FindColors'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionType__Alternatives"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalRoverDSL.g:170:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:174:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:175:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalRoverDSL.g:182:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:186:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:187:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:187:1: ( 'Mission:' )
            // InternalRoverDSL.g:188:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalRoverDSL.g:197:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:201:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:202:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalRoverDSL.g:209:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:213:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:214:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:214:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:215:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:216:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:216:3: rule__Mission__MissiontypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__MissiontypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalRoverDSL.g:224:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:228:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:229:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalRoverDSL.g:236:1: rule__Mission__Group__2__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:240:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:241:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:241:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:242:2: 'OuterBorder:'
            {
             before(grammarAccess.getMissionAccess().getOuterBorderKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getOuterBorderKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalRoverDSL.g:251:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:255:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:256:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalRoverDSL.g:263:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__BorderAssignment_3 ) ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:267:1: ( ( ( rule__Mission__BorderAssignment_3 ) ) )
            // InternalRoverDSL.g:268:1: ( ( rule__Mission__BorderAssignment_3 ) )
            {
            // InternalRoverDSL.g:268:1: ( ( rule__Mission__BorderAssignment_3 ) )
            // InternalRoverDSL.g:269:2: ( rule__Mission__BorderAssignment_3 )
            {
             before(grammarAccess.getMissionAccess().getBorderAssignment_3()); 
            // InternalRoverDSL.g:270:2: ( rule__Mission__BorderAssignment_3 )
            // InternalRoverDSL.g:270:3: rule__Mission__BorderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BorderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBorderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalRoverDSL.g:278:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:282:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:283:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalRoverDSL.g:290:1: rule__Mission__Group__4__Impl : ( 'ForwardSpeedPercentage:' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:294:1: ( ( 'ForwardSpeedPercentage:' ) )
            // InternalRoverDSL.g:295:1: ( 'ForwardSpeedPercentage:' )
            {
            // InternalRoverDSL.g:295:1: ( 'ForwardSpeedPercentage:' )
            // InternalRoverDSL.g:296:2: 'ForwardSpeedPercentage:'
            {
             before(grammarAccess.getMissionAccess().getForwardSpeedPercentageKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardSpeedPercentageKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalRoverDSL.g:305:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:309:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:310:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Mission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalRoverDSL.g:317:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__ForwardspeedAssignment_5 ) ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:321:1: ( ( ( rule__Mission__ForwardspeedAssignment_5 ) ) )
            // InternalRoverDSL.g:322:1: ( ( rule__Mission__ForwardspeedAssignment_5 ) )
            {
            // InternalRoverDSL.g:322:1: ( ( rule__Mission__ForwardspeedAssignment_5 ) )
            // InternalRoverDSL.g:323:2: ( rule__Mission__ForwardspeedAssignment_5 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_5()); 
            // InternalRoverDSL.g:324:2: ( rule__Mission__ForwardspeedAssignment_5 )
            // InternalRoverDSL.g:324:3: rule__Mission__ForwardspeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ForwardspeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getForwardspeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Mission__Group__6"
    // InternalRoverDSL.g:332:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:336:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:337:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6"


    // $ANTLR start "rule__Mission__Group__6__Impl"
    // InternalRoverDSL.g:344:1: rule__Mission__Group__6__Impl : ( 'ReverseSpeedPercentage:' ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:348:1: ( ( 'ReverseSpeedPercentage:' ) )
            // InternalRoverDSL.g:349:1: ( 'ReverseSpeedPercentage:' )
            {
            // InternalRoverDSL.g:349:1: ( 'ReverseSpeedPercentage:' )
            // InternalRoverDSL.g:350:2: 'ReverseSpeedPercentage:'
            {
             before(grammarAccess.getMissionAccess().getReverseSpeedPercentageKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReverseSpeedPercentageKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6__Impl"


    // $ANTLR start "rule__Mission__Group__7"
    // InternalRoverDSL.g:359:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:363:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:364:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7"


    // $ANTLR start "rule__Mission__Group__7__Impl"
    // InternalRoverDSL.g:371:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__ReversespeedAssignment_7 ) ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:375:1: ( ( ( rule__Mission__ReversespeedAssignment_7 ) ) )
            // InternalRoverDSL.g:376:1: ( ( rule__Mission__ReversespeedAssignment_7 ) )
            {
            // InternalRoverDSL.g:376:1: ( ( rule__Mission__ReversespeedAssignment_7 ) )
            // InternalRoverDSL.g:377:2: ( rule__Mission__ReversespeedAssignment_7 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_7()); 
            // InternalRoverDSL.g:378:2: ( rule__Mission__ReversespeedAssignment_7 )
            // InternalRoverDSL.g:378:3: rule__Mission__ReversespeedAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ReversespeedAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getReversespeedAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7__Impl"


    // $ANTLR start "rule__Mission__Group__8"
    // InternalRoverDSL.g:386:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:390:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:391:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8"


    // $ANTLR start "rule__Mission__Group__8__Impl"
    // InternalRoverDSL.g:398:1: rule__Mission__Group__8__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:402:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:403:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:403:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:404:2: 'TurnDirection:'
            {
             before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8__Impl"


    // $ANTLR start "rule__Mission__Group__9"
    // InternalRoverDSL.g:413:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:417:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:418:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__9"


    // $ANTLR start "rule__Mission__Group__9__Impl"
    // InternalRoverDSL.g:425:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__TurndirectionAssignment_9 ) ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:429:1: ( ( ( rule__Mission__TurndirectionAssignment_9 ) ) )
            // InternalRoverDSL.g:430:1: ( ( rule__Mission__TurndirectionAssignment_9 ) )
            {
            // InternalRoverDSL.g:430:1: ( ( rule__Mission__TurndirectionAssignment_9 ) )
            // InternalRoverDSL.g:431:2: ( rule__Mission__TurndirectionAssignment_9 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_9()); 
            // InternalRoverDSL.g:432:2: ( rule__Mission__TurndirectionAssignment_9 )
            // InternalRoverDSL.g:432:3: rule__Mission__TurndirectionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TurndirectionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTurndirectionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__9__Impl"


    // $ANTLR start "rule__Mission__Group__10"
    // InternalRoverDSL.g:440:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:444:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:445:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__10"


    // $ANTLR start "rule__Mission__Group__10__Impl"
    // InternalRoverDSL.g:452:1: rule__Mission__Group__10__Impl : ( ( rule__Mission__Group_10__0 )? ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:456:1: ( ( ( rule__Mission__Group_10__0 )? ) )
            // InternalRoverDSL.g:457:1: ( ( rule__Mission__Group_10__0 )? )
            {
            // InternalRoverDSL.g:457:1: ( ( rule__Mission__Group_10__0 )? )
            // InternalRoverDSL.g:458:2: ( rule__Mission__Group_10__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_10()); 
            // InternalRoverDSL.g:459:2: ( rule__Mission__Group_10__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:459:3: rule__Mission__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__10__Impl"


    // $ANTLR start "rule__Mission__Group__11"
    // InternalRoverDSL.g:467:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:471:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:472:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__11"


    // $ANTLR start "rule__Mission__Group__11__Impl"
    // InternalRoverDSL.g:479:1: rule__Mission__Group__11__Impl : ( ( rule__Mission__Group_11__0 )? ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:483:1: ( ( ( rule__Mission__Group_11__0 )? ) )
            // InternalRoverDSL.g:484:1: ( ( rule__Mission__Group_11__0 )? )
            {
            // InternalRoverDSL.g:484:1: ( ( rule__Mission__Group_11__0 )? )
            // InternalRoverDSL.g:485:2: ( rule__Mission__Group_11__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_11()); 
            // InternalRoverDSL.g:486:2: ( rule__Mission__Group_11__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:486:3: rule__Mission__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__11__Impl"


    // $ANTLR start "rule__Mission__Group__12"
    // InternalRoverDSL.g:494:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:498:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:499:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__12"


    // $ANTLR start "rule__Mission__Group__12__Impl"
    // InternalRoverDSL.g:506:1: rule__Mission__Group__12__Impl : ( 'End:' ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:510:1: ( ( 'End:' ) )
            // InternalRoverDSL.g:511:1: ( 'End:' )
            {
            // InternalRoverDSL.g:511:1: ( 'End:' )
            // InternalRoverDSL.g:512:2: 'End:'
            {
             before(grammarAccess.getMissionAccess().getEndKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__12__Impl"


    // $ANTLR start "rule__Mission__Group__13"
    // InternalRoverDSL.g:521:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl rule__Mission__Group__14 ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:525:1: ( rule__Mission__Group__13__Impl rule__Mission__Group__14 )
            // InternalRoverDSL.g:526:2: rule__Mission__Group__13__Impl rule__Mission__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__13"


    // $ANTLR start "rule__Mission__Group__13__Impl"
    // InternalRoverDSL.g:533:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__TerminationconditionAssignment_13 ) ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:537:1: ( ( ( rule__Mission__TerminationconditionAssignment_13 ) ) )
            // InternalRoverDSL.g:538:1: ( ( rule__Mission__TerminationconditionAssignment_13 ) )
            {
            // InternalRoverDSL.g:538:1: ( ( rule__Mission__TerminationconditionAssignment_13 ) )
            // InternalRoverDSL.g:539:2: ( rule__Mission__TerminationconditionAssignment_13 )
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_13()); 
            // InternalRoverDSL.g:540:2: ( rule__Mission__TerminationconditionAssignment_13 )
            // InternalRoverDSL.g:540:3: rule__Mission__TerminationconditionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TerminationconditionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTerminationconditionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__13__Impl"


    // $ANTLR start "rule__Mission__Group__14"
    // InternalRoverDSL.g:548:1: rule__Mission__Group__14 : rule__Mission__Group__14__Impl rule__Mission__Group__15 ;
    public final void rule__Mission__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:552:1: ( rule__Mission__Group__14__Impl rule__Mission__Group__15 )
            // InternalRoverDSL.g:553:2: rule__Mission__Group__14__Impl rule__Mission__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__14"


    // $ANTLR start "rule__Mission__Group__14__Impl"
    // InternalRoverDSL.g:560:1: rule__Mission__Group__14__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:564:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:565:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:565:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:566:2: 'FlashingColor:'
            {
             before(grammarAccess.getMissionAccess().getFlashingColorKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFlashingColorKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__14__Impl"


    // $ANTLR start "rule__Mission__Group__15"
    // InternalRoverDSL.g:575:1: rule__Mission__Group__15 : rule__Mission__Group__15__Impl rule__Mission__Group__16 ;
    public final void rule__Mission__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:579:1: ( rule__Mission__Group__15__Impl rule__Mission__Group__16 )
            // InternalRoverDSL.g:580:2: rule__Mission__Group__15__Impl rule__Mission__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__Mission__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__15"


    // $ANTLR start "rule__Mission__Group__15__Impl"
    // InternalRoverDSL.g:587:1: rule__Mission__Group__15__Impl : ( ( rule__Mission__FlashingcolorAssignment_15 ) ) ;
    public final void rule__Mission__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:591:1: ( ( ( rule__Mission__FlashingcolorAssignment_15 ) ) )
            // InternalRoverDSL.g:592:1: ( ( rule__Mission__FlashingcolorAssignment_15 ) )
            {
            // InternalRoverDSL.g:592:1: ( ( rule__Mission__FlashingcolorAssignment_15 ) )
            // InternalRoverDSL.g:593:2: ( rule__Mission__FlashingcolorAssignment_15 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_15()); 
            // InternalRoverDSL.g:594:2: ( rule__Mission__FlashingcolorAssignment_15 )
            // InternalRoverDSL.g:594:3: rule__Mission__FlashingcolorAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FlashingcolorAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFlashingcolorAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__15__Impl"


    // $ANTLR start "rule__Mission__Group__16"
    // InternalRoverDSL.g:602:1: rule__Mission__Group__16 : rule__Mission__Group__16__Impl rule__Mission__Group__17 ;
    public final void rule__Mission__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:606:1: ( rule__Mission__Group__16__Impl rule__Mission__Group__17 )
            // InternalRoverDSL.g:607:2: rule__Mission__Group__16__Impl rule__Mission__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__16"


    // $ANTLR start "rule__Mission__Group__16__Impl"
    // InternalRoverDSL.g:614:1: rule__Mission__Group__16__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:618:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:619:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:619:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:620:2: 'FinalSentence:'
            {
             before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_16()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalSentenceKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__16__Impl"


    // $ANTLR start "rule__Mission__Group__17"
    // InternalRoverDSL.g:629:1: rule__Mission__Group__17 : rule__Mission__Group__17__Impl ;
    public final void rule__Mission__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:633:1: ( rule__Mission__Group__17__Impl )
            // InternalRoverDSL.g:634:2: rule__Mission__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__17"


    // $ANTLR start "rule__Mission__Group__17__Impl"
    // InternalRoverDSL.g:640:1: rule__Mission__Group__17__Impl : ( ( rule__Mission__FinalsentenceAssignment_17 ) ) ;
    public final void rule__Mission__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:644:1: ( ( ( rule__Mission__FinalsentenceAssignment_17 ) ) )
            // InternalRoverDSL.g:645:1: ( ( rule__Mission__FinalsentenceAssignment_17 ) )
            {
            // InternalRoverDSL.g:645:1: ( ( rule__Mission__FinalsentenceAssignment_17 ) )
            // InternalRoverDSL.g:646:2: ( rule__Mission__FinalsentenceAssignment_17 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_17()); 
            // InternalRoverDSL.g:647:2: ( rule__Mission__FinalsentenceAssignment_17 )
            // InternalRoverDSL.g:647:3: rule__Mission__FinalsentenceAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FinalsentenceAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFinalsentenceAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__17__Impl"


    // $ANTLR start "rule__Mission__Group_10__0"
    // InternalRoverDSL.g:656:1: rule__Mission__Group_10__0 : rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 ;
    public final void rule__Mission__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:660:1: ( rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 )
            // InternalRoverDSL.g:661:2: rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__0"


    // $ANTLR start "rule__Mission__Group_10__0__Impl"
    // InternalRoverDSL.g:668:1: rule__Mission__Group_10__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:672:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:673:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:673:1: ( 'Colors:' )
            // InternalRoverDSL.g:674:2: 'Colors:'
            {
             before(grammarAccess.getMissionAccess().getColorsKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColorsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__0__Impl"


    // $ANTLR start "rule__Mission__Group_10__1"
    // InternalRoverDSL.g:683:1: rule__Mission__Group_10__1 : rule__Mission__Group_10__1__Impl ;
    public final void rule__Mission__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:687:1: ( rule__Mission__Group_10__1__Impl )
            // InternalRoverDSL.g:688:2: rule__Mission__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__1"


    // $ANTLR start "rule__Mission__Group_10__1__Impl"
    // InternalRoverDSL.g:694:1: rule__Mission__Group_10__1__Impl : ( ( rule__Mission__ColorlistAssignment_10_1 )* ) ;
    public final void rule__Mission__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:698:1: ( ( ( rule__Mission__ColorlistAssignment_10_1 )* ) )
            // InternalRoverDSL.g:699:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            {
            // InternalRoverDSL.g:699:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            // InternalRoverDSL.g:700:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_10_1()); 
            // InternalRoverDSL.g:701:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRoverDSL.g:701:3: rule__Mission__ColorlistAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Mission__ColorlistAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getColorlistAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_10__1__Impl"


    // $ANTLR start "rule__Mission__Group_11__0"
    // InternalRoverDSL.g:710:1: rule__Mission__Group_11__0 : rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1 ;
    public final void rule__Mission__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:714:1: ( rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1 )
            // InternalRoverDSL.g:715:2: rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_11__0"


    // $ANTLR start "rule__Mission__Group_11__0__Impl"
    // InternalRoverDSL.g:722:1: rule__Mission__Group_11__0__Impl : ( 'Sensors:' ) ;
    public final void rule__Mission__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:726:1: ( ( 'Sensors:' ) )
            // InternalRoverDSL.g:727:1: ( 'Sensors:' )
            {
            // InternalRoverDSL.g:727:1: ( 'Sensors:' )
            // InternalRoverDSL.g:728:2: 'Sensors:'
            {
             before(grammarAccess.getMissionAccess().getSensorsKeyword_11_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getSensorsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_11__0__Impl"


    // $ANTLR start "rule__Mission__Group_11__1"
    // InternalRoverDSL.g:737:1: rule__Mission__Group_11__1 : rule__Mission__Group_11__1__Impl ;
    public final void rule__Mission__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:741:1: ( rule__Mission__Group_11__1__Impl )
            // InternalRoverDSL.g:742:2: rule__Mission__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_11__1"


    // $ANTLR start "rule__Mission__Group_11__1__Impl"
    // InternalRoverDSL.g:748:1: rule__Mission__Group_11__1__Impl : ( ( rule__Mission__SensorlistAssignment_11_1 )* ) ;
    public final void rule__Mission__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:752:1: ( ( ( rule__Mission__SensorlistAssignment_11_1 )* ) )
            // InternalRoverDSL.g:753:1: ( ( rule__Mission__SensorlistAssignment_11_1 )* )
            {
            // InternalRoverDSL.g:753:1: ( ( rule__Mission__SensorlistAssignment_11_1 )* )
            // InternalRoverDSL.g:754:2: ( rule__Mission__SensorlistAssignment_11_1 )*
            {
             before(grammarAccess.getMissionAccess().getSensorlistAssignment_11_1()); 
            // InternalRoverDSL.g:755:2: ( rule__Mission__SensorlistAssignment_11_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRoverDSL.g:755:3: rule__Mission__SensorlistAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Mission__SensorlistAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getSensorlistAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_11__1__Impl"


    // $ANTLR start "rule__Mission__MissiontypeAssignment_1"
    // InternalRoverDSL.g:764:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:768:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:769:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:769:2: ( ruleMissionType )
            // InternalRoverDSL.g:770:3: ruleMissionType
            {
             before(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMissionType();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__MissiontypeAssignment_1"


    // $ANTLR start "rule__Mission__BorderAssignment_3"
    // InternalRoverDSL.g:779:1: rule__Mission__BorderAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Mission__BorderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:783:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:784:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:784:2: ( RULE_STRING )
            // InternalRoverDSL.g:785:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__BorderAssignment_3"


    // $ANTLR start "rule__Mission__ForwardspeedAssignment_5"
    // InternalRoverDSL.g:794:1: rule__Mission__ForwardspeedAssignment_5 : ( RULE_INT ) ;
    public final void rule__Mission__ForwardspeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:798:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:799:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:799:2: ( RULE_INT )
            // InternalRoverDSL.g:800:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ForwardspeedAssignment_5"


    // $ANTLR start "rule__Mission__ReversespeedAssignment_7"
    // InternalRoverDSL.g:809:1: rule__Mission__ReversespeedAssignment_7 : ( RULE_INT ) ;
    public final void rule__Mission__ReversespeedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:813:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:814:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:814:2: ( RULE_INT )
            // InternalRoverDSL.g:815:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ReversespeedAssignment_7"


    // $ANTLR start "rule__Mission__TurndirectionAssignment_9"
    // InternalRoverDSL.g:824:1: rule__Mission__TurndirectionAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Mission__TurndirectionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:828:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:829:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:829:2: ( RULE_STRING )
            // InternalRoverDSL.g:830:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getTurndirectionSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurndirectionSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TurndirectionAssignment_9"


    // $ANTLR start "rule__Mission__ColorlistAssignment_10_1"
    // InternalRoverDSL.g:839:1: rule__Mission__ColorlistAssignment_10_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:843:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:844:2: ( ruleColors )
            {
            // InternalRoverDSL.g:844:2: ( ruleColors )
            // InternalRoverDSL.g:845:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ColorlistAssignment_10_1"


    // $ANTLR start "rule__Mission__SensorlistAssignment_11_1"
    // InternalRoverDSL.g:854:1: rule__Mission__SensorlistAssignment_11_1 : ( ruleSensors ) ;
    public final void rule__Mission__SensorlistAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:858:1: ( ( ruleSensors ) )
            // InternalRoverDSL.g:859:2: ( ruleSensors )
            {
            // InternalRoverDSL.g:859:2: ( ruleSensors )
            // InternalRoverDSL.g:860:3: ruleSensors
            {
             before(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__SensorlistAssignment_11_1"


    // $ANTLR start "rule__Mission__TerminationconditionAssignment_13"
    // InternalRoverDSL.g:869:1: rule__Mission__TerminationconditionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Mission__TerminationconditionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:873:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:874:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:874:2: ( RULE_STRING )
            // InternalRoverDSL.g:875:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TerminationconditionAssignment_13"


    // $ANTLR start "rule__Mission__FlashingcolorAssignment_15"
    // InternalRoverDSL.g:884:1: rule__Mission__FlashingcolorAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Mission__FlashingcolorAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:888:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:889:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:889:2: ( RULE_STRING )
            // InternalRoverDSL.g:890:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__FlashingcolorAssignment_15"


    // $ANTLR start "rule__Mission__FinalsentenceAssignment_17"
    // InternalRoverDSL.g:899:1: rule__Mission__FinalsentenceAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:903:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:904:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:904:2: ( RULE_STRING )
            // InternalRoverDSL.g:905:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__FinalsentenceAssignment_17"


    // $ANTLR start "rule__Colors__ColorAssignment"
    // InternalRoverDSL.g:914:1: rule__Colors__ColorAssignment : ( RULE_STRING ) ;
    public final void rule__Colors__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:918:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:919:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:919:2: ( RULE_STRING )
            // InternalRoverDSL.g:920:3: RULE_STRING
            {
             before(grammarAccess.getColorsAccess().getColorSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColorsAccess().getColorSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colors__ColorAssignment"


    // $ANTLR start "rule__Sensors__SensorAssignment"
    // InternalRoverDSL.g:929:1: rule__Sensors__SensorAssignment : ( RULE_STRING ) ;
    public final void rule__Sensors__SensorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:933:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:934:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:934:2: ( RULE_STRING )
            // InternalRoverDSL.g:935:3: RULE_STRING
            {
             before(grammarAccess.getSensorsAccess().getSensorSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensorsAccess().getSensorSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensors__SensorAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});

}