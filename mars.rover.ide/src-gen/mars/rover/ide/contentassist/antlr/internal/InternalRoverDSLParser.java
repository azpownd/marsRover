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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AvoidColors'", "'FindColors'", "'Mission:'", "'End:'", "'Safety:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'Sensors:'", "'FlashingColor:'", "'FinalSentence:'"
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
    // InternalRoverDSL.g:143:1: rule__MissionType__Alternatives : ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:147:1: ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
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
                    // InternalRoverDSL.g:154:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:154:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:155:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:156:3: ( 'FindColors' )
                    // InternalRoverDSL.g:156:4: 'FindColors'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); 

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
    // InternalRoverDSL.g:164:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:168:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:169:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalRoverDSL.g:176:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:180:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:181:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:181:1: ( 'Mission:' )
            // InternalRoverDSL.g:182:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalRoverDSL.g:191:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:195:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:196:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalRoverDSL.g:203:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:207:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:208:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:208:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:209:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:210:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:210:3: rule__Mission__MissiontypeAssignment_1
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
    // InternalRoverDSL.g:218:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:222:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:223:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:230:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__Group_2__0 )? ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:234:1: ( ( ( rule__Mission__Group_2__0 )? ) )
            // InternalRoverDSL.g:235:1: ( ( rule__Mission__Group_2__0 )? )
            {
            // InternalRoverDSL.g:235:1: ( ( rule__Mission__Group_2__0 )? )
            // InternalRoverDSL.g:236:2: ( rule__Mission__Group_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_2()); 
            // InternalRoverDSL.g:237:2: ( rule__Mission__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:237:3: rule__Mission__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_2()); 

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
    // InternalRoverDSL.g:245:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:249:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:250:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:257:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )? ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:261:1: ( ( ( rule__Mission__Group_3__0 )? ) )
            // InternalRoverDSL.g:262:1: ( ( rule__Mission__Group_3__0 )? )
            {
            // InternalRoverDSL.g:262:1: ( ( rule__Mission__Group_3__0 )? )
            // InternalRoverDSL.g:263:2: ( rule__Mission__Group_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalRoverDSL.g:264:2: ( rule__Mission__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:264:3: rule__Mission__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_3()); 

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
    // InternalRoverDSL.g:272:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:276:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:277:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:284:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )? ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:288:1: ( ( ( rule__Mission__Group_4__0 )? ) )
            // InternalRoverDSL.g:289:1: ( ( rule__Mission__Group_4__0 )? )
            {
            // InternalRoverDSL.g:289:1: ( ( rule__Mission__Group_4__0 )? )
            // InternalRoverDSL.g:290:2: ( rule__Mission__Group_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalRoverDSL.g:291:2: ( rule__Mission__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:291:3: rule__Mission__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_4()); 

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
    // InternalRoverDSL.g:299:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:303:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:304:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:311:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:315:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalRoverDSL.g:316:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalRoverDSL.g:316:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalRoverDSL.g:317:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalRoverDSL.g:318:2: ( rule__Mission__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:318:3: rule__Mission__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_5()); 

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
    // InternalRoverDSL.g:326:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:330:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:331:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:338:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:342:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalRoverDSL.g:343:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalRoverDSL.g:343:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalRoverDSL.g:344:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalRoverDSL.g:345:2: ( rule__Mission__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:345:3: rule__Mission__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6()); 

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
    // InternalRoverDSL.g:353:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:357:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:358:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:365:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )? ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:369:1: ( ( ( rule__Mission__Group_7__0 )? ) )
            // InternalRoverDSL.g:370:1: ( ( rule__Mission__Group_7__0 )? )
            {
            // InternalRoverDSL.g:370:1: ( ( rule__Mission__Group_7__0 )? )
            // InternalRoverDSL.g:371:2: ( rule__Mission__Group_7__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalRoverDSL.g:372:2: ( rule__Mission__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:372:3: rule__Mission__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_7()); 

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
    // InternalRoverDSL.g:380:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:384:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:385:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:392:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__Group_8__0 )? ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:396:1: ( ( ( rule__Mission__Group_8__0 )? ) )
            // InternalRoverDSL.g:397:1: ( ( rule__Mission__Group_8__0 )? )
            {
            // InternalRoverDSL.g:397:1: ( ( rule__Mission__Group_8__0 )? )
            // InternalRoverDSL.g:398:2: ( rule__Mission__Group_8__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_8()); 
            // InternalRoverDSL.g:399:2: ( rule__Mission__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:399:3: rule__Mission__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_8()); 

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
    // InternalRoverDSL.g:407:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:411:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:412:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:419:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__Group_9__0 )? ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:423:1: ( ( ( rule__Mission__Group_9__0 )? ) )
            // InternalRoverDSL.g:424:1: ( ( rule__Mission__Group_9__0 )? )
            {
            // InternalRoverDSL.g:424:1: ( ( rule__Mission__Group_9__0 )? )
            // InternalRoverDSL.g:425:2: ( rule__Mission__Group_9__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_9()); 
            // InternalRoverDSL.g:426:2: ( rule__Mission__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:426:3: rule__Mission__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_9()); 

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
    // InternalRoverDSL.g:434:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:438:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:439:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:446:1: rule__Mission__Group__10__Impl : ( 'End:' ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:450:1: ( ( 'End:' ) )
            // InternalRoverDSL.g:451:1: ( 'End:' )
            {
            // InternalRoverDSL.g:451:1: ( 'End:' )
            // InternalRoverDSL.g:452:2: 'End:'
            {
             before(grammarAccess.getMissionAccess().getEndKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndKeyword_10()); 

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
    // InternalRoverDSL.g:461:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:465:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:466:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
            {
            pushFollow(FOLLOW_6);
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
    // InternalRoverDSL.g:473:1: rule__Mission__Group__11__Impl : ( ( rule__Mission__TerminationconditionAssignment_11 ) ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:477:1: ( ( ( rule__Mission__TerminationconditionAssignment_11 ) ) )
            // InternalRoverDSL.g:478:1: ( ( rule__Mission__TerminationconditionAssignment_11 ) )
            {
            // InternalRoverDSL.g:478:1: ( ( rule__Mission__TerminationconditionAssignment_11 ) )
            // InternalRoverDSL.g:479:2: ( rule__Mission__TerminationconditionAssignment_11 )
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11()); 
            // InternalRoverDSL.g:480:2: ( rule__Mission__TerminationconditionAssignment_11 )
            // InternalRoverDSL.g:480:3: rule__Mission__TerminationconditionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TerminationconditionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11()); 

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
    // InternalRoverDSL.g:488:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:492:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:493:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
            {
            pushFollow(FOLLOW_6);
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
    // InternalRoverDSL.g:500:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__Group_12__0 )? ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:504:1: ( ( ( rule__Mission__Group_12__0 )? ) )
            // InternalRoverDSL.g:505:1: ( ( rule__Mission__Group_12__0 )? )
            {
            // InternalRoverDSL.g:505:1: ( ( rule__Mission__Group_12__0 )? )
            // InternalRoverDSL.g:506:2: ( rule__Mission__Group_12__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_12()); 
            // InternalRoverDSL.g:507:2: ( rule__Mission__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:507:3: rule__Mission__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_12()); 

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
    // InternalRoverDSL.g:515:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:519:1: ( rule__Mission__Group__13__Impl )
            // InternalRoverDSL.g:520:2: rule__Mission__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__13__Impl();

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
    // InternalRoverDSL.g:526:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__Group_13__0 )? ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:530:1: ( ( ( rule__Mission__Group_13__0 )? ) )
            // InternalRoverDSL.g:531:1: ( ( rule__Mission__Group_13__0 )? )
            {
            // InternalRoverDSL.g:531:1: ( ( rule__Mission__Group_13__0 )? )
            // InternalRoverDSL.g:532:2: ( rule__Mission__Group_13__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_13()); 
            // InternalRoverDSL.g:533:2: ( rule__Mission__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:533:3: rule__Mission__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_13()); 

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


    // $ANTLR start "rule__Mission__Group_2__0"
    // InternalRoverDSL.g:542:1: rule__Mission__Group_2__0 : rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 ;
    public final void rule__Mission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:546:1: ( rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 )
            // InternalRoverDSL.g:547:2: rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_2__1();

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
    // $ANTLR end "rule__Mission__Group_2__0"


    // $ANTLR start "rule__Mission__Group_2__0__Impl"
    // InternalRoverDSL.g:554:1: rule__Mission__Group_2__0__Impl : ( 'Safety:' ) ;
    public final void rule__Mission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:558:1: ( ( 'Safety:' ) )
            // InternalRoverDSL.g:559:1: ( 'Safety:' )
            {
            // InternalRoverDSL.g:559:1: ( 'Safety:' )
            // InternalRoverDSL.g:560:2: 'Safety:'
            {
             before(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); 

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
    // $ANTLR end "rule__Mission__Group_2__0__Impl"


    // $ANTLR start "rule__Mission__Group_2__1"
    // InternalRoverDSL.g:569:1: rule__Mission__Group_2__1 : rule__Mission__Group_2__1__Impl ;
    public final void rule__Mission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:573:1: ( rule__Mission__Group_2__1__Impl )
            // InternalRoverDSL.g:574:2: rule__Mission__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_2__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_2__1"


    // $ANTLR start "rule__Mission__Group_2__1__Impl"
    // InternalRoverDSL.g:580:1: rule__Mission__Group_2__1__Impl : ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) ;
    public final void rule__Mission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:584:1: ( ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) )
            // InternalRoverDSL.g:585:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            {
            // InternalRoverDSL.g:585:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            // InternalRoverDSL.g:586:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            {
             before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); 
            // InternalRoverDSL.g:587:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            // InternalRoverDSL.g:587:3: rule__Mission__SafetypropertyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__SafetypropertyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); 

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
    // $ANTLR end "rule__Mission__Group_2__1__Impl"


    // $ANTLR start "rule__Mission__Group_3__0"
    // InternalRoverDSL.g:596:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:600:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalRoverDSL.g:601:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_3__1();

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
    // $ANTLR end "rule__Mission__Group_3__0"


    // $ANTLR start "rule__Mission__Group_3__0__Impl"
    // InternalRoverDSL.g:608:1: rule__Mission__Group_3__0__Impl : ( 'BeginSentence:' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:612:1: ( ( 'BeginSentence:' ) )
            // InternalRoverDSL.g:613:1: ( 'BeginSentence:' )
            {
            // InternalRoverDSL.g:613:1: ( 'BeginSentence:' )
            // InternalRoverDSL.g:614:2: 'BeginSentence:'
            {
             before(grammarAccess.getMissionAccess().getBeginSentenceKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginSentenceKeyword_3_0()); 

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
    // $ANTLR end "rule__Mission__Group_3__0__Impl"


    // $ANTLR start "rule__Mission__Group_3__1"
    // InternalRoverDSL.g:623:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:627:1: ( rule__Mission__Group_3__1__Impl )
            // InternalRoverDSL.g:628:2: rule__Mission__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_3__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_3__1"


    // $ANTLR start "rule__Mission__Group_3__1__Impl"
    // InternalRoverDSL.g:634:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__BeginsentenceAssignment_3_1 ) ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:638:1: ( ( ( rule__Mission__BeginsentenceAssignment_3_1 ) ) )
            // InternalRoverDSL.g:639:1: ( ( rule__Mission__BeginsentenceAssignment_3_1 ) )
            {
            // InternalRoverDSL.g:639:1: ( ( rule__Mission__BeginsentenceAssignment_3_1 ) )
            // InternalRoverDSL.g:640:2: ( rule__Mission__BeginsentenceAssignment_3_1 )
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_3_1()); 
            // InternalRoverDSL.g:641:2: ( rule__Mission__BeginsentenceAssignment_3_1 )
            // InternalRoverDSL.g:641:3: rule__Mission__BeginsentenceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BeginsentenceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBeginsentenceAssignment_3_1()); 

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
    // $ANTLR end "rule__Mission__Group_3__1__Impl"


    // $ANTLR start "rule__Mission__Group_4__0"
    // InternalRoverDSL.g:650:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:654:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalRoverDSL.g:655:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_4__1();

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
    // $ANTLR end "rule__Mission__Group_4__0"


    // $ANTLR start "rule__Mission__Group_4__0__Impl"
    // InternalRoverDSL.g:662:1: rule__Mission__Group_4__0__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:666:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:667:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:667:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:668:2: 'OuterBorder:'
            {
             before(grammarAccess.getMissionAccess().getOuterBorderKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getOuterBorderKeyword_4_0()); 

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
    // $ANTLR end "rule__Mission__Group_4__0__Impl"


    // $ANTLR start "rule__Mission__Group_4__1"
    // InternalRoverDSL.g:677:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:681:1: ( rule__Mission__Group_4__1__Impl )
            // InternalRoverDSL.g:682:2: rule__Mission__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_4__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_4__1"


    // $ANTLR start "rule__Mission__Group_4__1__Impl"
    // InternalRoverDSL.g:688:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__BorderAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:692:1: ( ( ( rule__Mission__BorderAssignment_4_1 ) ) )
            // InternalRoverDSL.g:693:1: ( ( rule__Mission__BorderAssignment_4_1 ) )
            {
            // InternalRoverDSL.g:693:1: ( ( rule__Mission__BorderAssignment_4_1 ) )
            // InternalRoverDSL.g:694:2: ( rule__Mission__BorderAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getBorderAssignment_4_1()); 
            // InternalRoverDSL.g:695:2: ( rule__Mission__BorderAssignment_4_1 )
            // InternalRoverDSL.g:695:3: rule__Mission__BorderAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BorderAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBorderAssignment_4_1()); 

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
    // $ANTLR end "rule__Mission__Group_4__1__Impl"


    // $ANTLR start "rule__Mission__Group_5__0"
    // InternalRoverDSL.g:704:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:708:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalRoverDSL.g:709:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_5__1();

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
    // $ANTLR end "rule__Mission__Group_5__0"


    // $ANTLR start "rule__Mission__Group_5__0__Impl"
    // InternalRoverDSL.g:716:1: rule__Mission__Group_5__0__Impl : ( 'ForwardSpeed:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:720:1: ( ( 'ForwardSpeed:' ) )
            // InternalRoverDSL.g:721:1: ( 'ForwardSpeed:' )
            {
            // InternalRoverDSL.g:721:1: ( 'ForwardSpeed:' )
            // InternalRoverDSL.g:722:2: 'ForwardSpeed:'
            {
             before(grammarAccess.getMissionAccess().getForwardSpeedKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardSpeedKeyword_5_0()); 

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
    // $ANTLR end "rule__Mission__Group_5__0__Impl"


    // $ANTLR start "rule__Mission__Group_5__1"
    // InternalRoverDSL.g:731:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:735:1: ( rule__Mission__Group_5__1__Impl )
            // InternalRoverDSL.g:736:2: rule__Mission__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_5__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_5__1"


    // $ANTLR start "rule__Mission__Group_5__1__Impl"
    // InternalRoverDSL.g:742:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__ForwardspeedAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:746:1: ( ( ( rule__Mission__ForwardspeedAssignment_5_1 ) ) )
            // InternalRoverDSL.g:747:1: ( ( rule__Mission__ForwardspeedAssignment_5_1 ) )
            {
            // InternalRoverDSL.g:747:1: ( ( rule__Mission__ForwardspeedAssignment_5_1 ) )
            // InternalRoverDSL.g:748:2: ( rule__Mission__ForwardspeedAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_5_1()); 
            // InternalRoverDSL.g:749:2: ( rule__Mission__ForwardspeedAssignment_5_1 )
            // InternalRoverDSL.g:749:3: rule__Mission__ForwardspeedAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ForwardspeedAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getForwardspeedAssignment_5_1()); 

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
    // $ANTLR end "rule__Mission__Group_5__1__Impl"


    // $ANTLR start "rule__Mission__Group_6__0"
    // InternalRoverDSL.g:758:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:762:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalRoverDSL.g:763:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__1();

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
    // $ANTLR end "rule__Mission__Group_6__0"


    // $ANTLR start "rule__Mission__Group_6__0__Impl"
    // InternalRoverDSL.g:770:1: rule__Mission__Group_6__0__Impl : ( 'ReverseSpeed:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:774:1: ( ( 'ReverseSpeed:' ) )
            // InternalRoverDSL.g:775:1: ( 'ReverseSpeed:' )
            {
            // InternalRoverDSL.g:775:1: ( 'ReverseSpeed:' )
            // InternalRoverDSL.g:776:2: 'ReverseSpeed:'
            {
             before(grammarAccess.getMissionAccess().getReverseSpeedKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReverseSpeedKeyword_6_0()); 

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
    // $ANTLR end "rule__Mission__Group_6__0__Impl"


    // $ANTLR start "rule__Mission__Group_6__1"
    // InternalRoverDSL.g:785:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:789:1: ( rule__Mission__Group_6__1__Impl )
            // InternalRoverDSL.g:790:2: rule__Mission__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_6__1"


    // $ANTLR start "rule__Mission__Group_6__1__Impl"
    // InternalRoverDSL.g:796:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__ReversespeedAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:800:1: ( ( ( rule__Mission__ReversespeedAssignment_6_1 ) ) )
            // InternalRoverDSL.g:801:1: ( ( rule__Mission__ReversespeedAssignment_6_1 ) )
            {
            // InternalRoverDSL.g:801:1: ( ( rule__Mission__ReversespeedAssignment_6_1 ) )
            // InternalRoverDSL.g:802:2: ( rule__Mission__ReversespeedAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_6_1()); 
            // InternalRoverDSL.g:803:2: ( rule__Mission__ReversespeedAssignment_6_1 )
            // InternalRoverDSL.g:803:3: rule__Mission__ReversespeedAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ReversespeedAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getReversespeedAssignment_6_1()); 

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
    // $ANTLR end "rule__Mission__Group_6__1__Impl"


    // $ANTLR start "rule__Mission__Group_7__0"
    // InternalRoverDSL.g:812:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:816:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalRoverDSL.g:817:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_7__1();

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
    // $ANTLR end "rule__Mission__Group_7__0"


    // $ANTLR start "rule__Mission__Group_7__0__Impl"
    // InternalRoverDSL.g:824:1: rule__Mission__Group_7__0__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:828:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:829:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:829:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:830:2: 'TurnDirection:'
            {
             before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_7_0()); 

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
    // $ANTLR end "rule__Mission__Group_7__0__Impl"


    // $ANTLR start "rule__Mission__Group_7__1"
    // InternalRoverDSL.g:839:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:843:1: ( rule__Mission__Group_7__1__Impl )
            // InternalRoverDSL.g:844:2: rule__Mission__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_7__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_7__1"


    // $ANTLR start "rule__Mission__Group_7__1__Impl"
    // InternalRoverDSL.g:850:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__TurndirectionAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:854:1: ( ( ( rule__Mission__TurndirectionAssignment_7_1 ) ) )
            // InternalRoverDSL.g:855:1: ( ( rule__Mission__TurndirectionAssignment_7_1 ) )
            {
            // InternalRoverDSL.g:855:1: ( ( rule__Mission__TurndirectionAssignment_7_1 ) )
            // InternalRoverDSL.g:856:2: ( rule__Mission__TurndirectionAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_7_1()); 
            // InternalRoverDSL.g:857:2: ( rule__Mission__TurndirectionAssignment_7_1 )
            // InternalRoverDSL.g:857:3: rule__Mission__TurndirectionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TurndirectionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTurndirectionAssignment_7_1()); 

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
    // $ANTLR end "rule__Mission__Group_7__1__Impl"


    // $ANTLR start "rule__Mission__Group_8__0"
    // InternalRoverDSL.g:866:1: rule__Mission__Group_8__0 : rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 ;
    public final void rule__Mission__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:870:1: ( rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 )
            // InternalRoverDSL.g:871:2: rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_8__1();

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
    // $ANTLR end "rule__Mission__Group_8__0"


    // $ANTLR start "rule__Mission__Group_8__0__Impl"
    // InternalRoverDSL.g:878:1: rule__Mission__Group_8__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:882:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:883:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:883:1: ( 'Colors:' )
            // InternalRoverDSL.g:884:2: 'Colors:'
            {
             before(grammarAccess.getMissionAccess().getColorsKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__Mission__Group_8__0__Impl"


    // $ANTLR start "rule__Mission__Group_8__1"
    // InternalRoverDSL.g:893:1: rule__Mission__Group_8__1 : rule__Mission__Group_8__1__Impl ;
    public final void rule__Mission__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:897:1: ( rule__Mission__Group_8__1__Impl )
            // InternalRoverDSL.g:898:2: rule__Mission__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_8__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_8__1"


    // $ANTLR start "rule__Mission__Group_8__1__Impl"
    // InternalRoverDSL.g:904:1: rule__Mission__Group_8__1__Impl : ( ( rule__Mission__ColorlistAssignment_8_1 )* ) ;
    public final void rule__Mission__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:908:1: ( ( ( rule__Mission__ColorlistAssignment_8_1 )* ) )
            // InternalRoverDSL.g:909:1: ( ( rule__Mission__ColorlistAssignment_8_1 )* )
            {
            // InternalRoverDSL.g:909:1: ( ( rule__Mission__ColorlistAssignment_8_1 )* )
            // InternalRoverDSL.g:910:2: ( rule__Mission__ColorlistAssignment_8_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_8_1()); 
            // InternalRoverDSL.g:911:2: ( rule__Mission__ColorlistAssignment_8_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRoverDSL.g:911:3: rule__Mission__ColorlistAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mission__ColorlistAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getColorlistAssignment_8_1()); 

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
    // $ANTLR end "rule__Mission__Group_8__1__Impl"


    // $ANTLR start "rule__Mission__Group_9__0"
    // InternalRoverDSL.g:920:1: rule__Mission__Group_9__0 : rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 ;
    public final void rule__Mission__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:924:1: ( rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 )
            // InternalRoverDSL.g:925:2: rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_9__1();

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
    // $ANTLR end "rule__Mission__Group_9__0"


    // $ANTLR start "rule__Mission__Group_9__0__Impl"
    // InternalRoverDSL.g:932:1: rule__Mission__Group_9__0__Impl : ( 'Sensors:' ) ;
    public final void rule__Mission__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:936:1: ( ( 'Sensors:' ) )
            // InternalRoverDSL.g:937:1: ( 'Sensors:' )
            {
            // InternalRoverDSL.g:937:1: ( 'Sensors:' )
            // InternalRoverDSL.g:938:2: 'Sensors:'
            {
             before(grammarAccess.getMissionAccess().getSensorsKeyword_9_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getSensorsKeyword_9_0()); 

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
    // $ANTLR end "rule__Mission__Group_9__0__Impl"


    // $ANTLR start "rule__Mission__Group_9__1"
    // InternalRoverDSL.g:947:1: rule__Mission__Group_9__1 : rule__Mission__Group_9__1__Impl ;
    public final void rule__Mission__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:951:1: ( rule__Mission__Group_9__1__Impl )
            // InternalRoverDSL.g:952:2: rule__Mission__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_9__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_9__1"


    // $ANTLR start "rule__Mission__Group_9__1__Impl"
    // InternalRoverDSL.g:958:1: rule__Mission__Group_9__1__Impl : ( ( rule__Mission__SensorlistAssignment_9_1 )* ) ;
    public final void rule__Mission__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:962:1: ( ( ( rule__Mission__SensorlistAssignment_9_1 )* ) )
            // InternalRoverDSL.g:963:1: ( ( rule__Mission__SensorlistAssignment_9_1 )* )
            {
            // InternalRoverDSL.g:963:1: ( ( rule__Mission__SensorlistAssignment_9_1 )* )
            // InternalRoverDSL.g:964:2: ( rule__Mission__SensorlistAssignment_9_1 )*
            {
             before(grammarAccess.getMissionAccess().getSensorlistAssignment_9_1()); 
            // InternalRoverDSL.g:965:2: ( rule__Mission__SensorlistAssignment_9_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRoverDSL.g:965:3: rule__Mission__SensorlistAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mission__SensorlistAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getSensorlistAssignment_9_1()); 

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
    // $ANTLR end "rule__Mission__Group_9__1__Impl"


    // $ANTLR start "rule__Mission__Group_12__0"
    // InternalRoverDSL.g:974:1: rule__Mission__Group_12__0 : rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 ;
    public final void rule__Mission__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:978:1: ( rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 )
            // InternalRoverDSL.g:979:2: rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__1();

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
    // $ANTLR end "rule__Mission__Group_12__0"


    // $ANTLR start "rule__Mission__Group_12__0__Impl"
    // InternalRoverDSL.g:986:1: rule__Mission__Group_12__0__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:990:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:991:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:991:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:992:2: 'FlashingColor:'
            {
             before(grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0()); 

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
    // $ANTLR end "rule__Mission__Group_12__0__Impl"


    // $ANTLR start "rule__Mission__Group_12__1"
    // InternalRoverDSL.g:1001:1: rule__Mission__Group_12__1 : rule__Mission__Group_12__1__Impl ;
    public final void rule__Mission__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1005:1: ( rule__Mission__Group_12__1__Impl )
            // InternalRoverDSL.g:1006:2: rule__Mission__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_12__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_12__1"


    // $ANTLR start "rule__Mission__Group_12__1__Impl"
    // InternalRoverDSL.g:1012:1: rule__Mission__Group_12__1__Impl : ( ( rule__Mission__FlashingcolorAssignment_12_1 ) ) ;
    public final void rule__Mission__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1016:1: ( ( ( rule__Mission__FlashingcolorAssignment_12_1 ) ) )
            // InternalRoverDSL.g:1017:1: ( ( rule__Mission__FlashingcolorAssignment_12_1 ) )
            {
            // InternalRoverDSL.g:1017:1: ( ( rule__Mission__FlashingcolorAssignment_12_1 ) )
            // InternalRoverDSL.g:1018:2: ( rule__Mission__FlashingcolorAssignment_12_1 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1()); 
            // InternalRoverDSL.g:1019:2: ( rule__Mission__FlashingcolorAssignment_12_1 )
            // InternalRoverDSL.g:1019:3: rule__Mission__FlashingcolorAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FlashingcolorAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1()); 

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
    // $ANTLR end "rule__Mission__Group_12__1__Impl"


    // $ANTLR start "rule__Mission__Group_13__0"
    // InternalRoverDSL.g:1028:1: rule__Mission__Group_13__0 : rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 ;
    public final void rule__Mission__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1032:1: ( rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 )
            // InternalRoverDSL.g:1033:2: rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_13__1();

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
    // $ANTLR end "rule__Mission__Group_13__0"


    // $ANTLR start "rule__Mission__Group_13__0__Impl"
    // InternalRoverDSL.g:1040:1: rule__Mission__Group_13__0__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1044:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:1045:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:1045:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:1046:2: 'FinalSentence:'
            {
             before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0()); 

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
    // $ANTLR end "rule__Mission__Group_13__0__Impl"


    // $ANTLR start "rule__Mission__Group_13__1"
    // InternalRoverDSL.g:1055:1: rule__Mission__Group_13__1 : rule__Mission__Group_13__1__Impl ;
    public final void rule__Mission__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1059:1: ( rule__Mission__Group_13__1__Impl )
            // InternalRoverDSL.g:1060:2: rule__Mission__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_13__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_13__1"


    // $ANTLR start "rule__Mission__Group_13__1__Impl"
    // InternalRoverDSL.g:1066:1: rule__Mission__Group_13__1__Impl : ( ( rule__Mission__FinalsentenceAssignment_13_1 ) ) ;
    public final void rule__Mission__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1070:1: ( ( ( rule__Mission__FinalsentenceAssignment_13_1 ) ) )
            // InternalRoverDSL.g:1071:1: ( ( rule__Mission__FinalsentenceAssignment_13_1 ) )
            {
            // InternalRoverDSL.g:1071:1: ( ( rule__Mission__FinalsentenceAssignment_13_1 ) )
            // InternalRoverDSL.g:1072:2: ( rule__Mission__FinalsentenceAssignment_13_1 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1()); 
            // InternalRoverDSL.g:1073:2: ( rule__Mission__FinalsentenceAssignment_13_1 )
            // InternalRoverDSL.g:1073:3: rule__Mission__FinalsentenceAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FinalsentenceAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1()); 

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
    // $ANTLR end "rule__Mission__Group_13__1__Impl"


    // $ANTLR start "rule__Mission__MissiontypeAssignment_1"
    // InternalRoverDSL.g:1082:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1086:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:1087:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:1087:2: ( ruleMissionType )
            // InternalRoverDSL.g:1088:3: ruleMissionType
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


    // $ANTLR start "rule__Mission__SafetypropertyAssignment_2_1"
    // InternalRoverDSL.g:1097:1: rule__Mission__SafetypropertyAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Mission__SafetypropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1101:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1102:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1102:2: ( RULE_STRING )
            // InternalRoverDSL.g:1103:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getSafetypropertySTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getSafetypropertySTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Mission__SafetypropertyAssignment_2_1"


    // $ANTLR start "rule__Mission__BeginsentenceAssignment_3_1"
    // InternalRoverDSL.g:1112:1: rule__Mission__BeginsentenceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BeginsentenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1116:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1117:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1117:2: ( RULE_STRING )
            // InternalRoverDSL.g:1118:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Mission__BeginsentenceAssignment_3_1"


    // $ANTLR start "rule__Mission__BorderAssignment_4_1"
    // InternalRoverDSL.g:1127:1: rule__Mission__BorderAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BorderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1131:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1132:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1132:2: ( RULE_STRING )
            // InternalRoverDSL.g:1133:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Mission__BorderAssignment_4_1"


    // $ANTLR start "rule__Mission__ForwardspeedAssignment_5_1"
    // InternalRoverDSL.g:1142:1: rule__Mission__ForwardspeedAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Mission__ForwardspeedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1146:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1147:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1147:2: ( RULE_INT )
            // InternalRoverDSL.g:1148:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Mission__ForwardspeedAssignment_5_1"


    // $ANTLR start "rule__Mission__ReversespeedAssignment_6_1"
    // InternalRoverDSL.g:1157:1: rule__Mission__ReversespeedAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Mission__ReversespeedAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1161:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1162:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1162:2: ( RULE_INT )
            // InternalRoverDSL.g:1163:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Mission__ReversespeedAssignment_6_1"


    // $ANTLR start "rule__Mission__TurndirectionAssignment_7_1"
    // InternalRoverDSL.g:1172:1: rule__Mission__TurndirectionAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Mission__TurndirectionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1176:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1177:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1177:2: ( RULE_INT )
            // InternalRoverDSL.g:1178:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Mission__TurndirectionAssignment_7_1"


    // $ANTLR start "rule__Mission__ColorlistAssignment_8_1"
    // InternalRoverDSL.g:1187:1: rule__Mission__ColorlistAssignment_8_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1191:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1192:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1192:2: ( ruleColors )
            // InternalRoverDSL.g:1193:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Mission__ColorlistAssignment_8_1"


    // $ANTLR start "rule__Mission__SensorlistAssignment_9_1"
    // InternalRoverDSL.g:1202:1: rule__Mission__SensorlistAssignment_9_1 : ( ruleSensors ) ;
    public final void rule__Mission__SensorlistAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1206:1: ( ( ruleSensors ) )
            // InternalRoverDSL.g:1207:2: ( ruleSensors )
            {
            // InternalRoverDSL.g:1207:2: ( ruleSensors )
            // InternalRoverDSL.g:1208:3: ruleSensors
            {
             before(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Mission__SensorlistAssignment_9_1"


    // $ANTLR start "rule__Mission__TerminationconditionAssignment_11"
    // InternalRoverDSL.g:1217:1: rule__Mission__TerminationconditionAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Mission__TerminationconditionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1221:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1222:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1222:2: ( RULE_STRING )
            // InternalRoverDSL.g:1223:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Mission__TerminationconditionAssignment_11"


    // $ANTLR start "rule__Mission__FlashingcolorAssignment_12_1"
    // InternalRoverDSL.g:1232:1: rule__Mission__FlashingcolorAssignment_12_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FlashingcolorAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1236:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1237:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1237:2: ( RULE_STRING )
            // InternalRoverDSL.g:1238:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_12_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Mission__FlashingcolorAssignment_12_1"


    // $ANTLR start "rule__Mission__FinalsentenceAssignment_13_1"
    // InternalRoverDSL.g:1247:1: rule__Mission__FinalsentenceAssignment_13_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1251:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1252:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1252:2: ( RULE_STRING )
            // InternalRoverDSL.g:1253:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_13_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Mission__FinalsentenceAssignment_13_1"


    // $ANTLR start "rule__Colors__ColorAssignment"
    // InternalRoverDSL.g:1262:1: rule__Colors__ColorAssignment : ( RULE_STRING ) ;
    public final void rule__Colors__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1266:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1267:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1267:2: ( RULE_STRING )
            // InternalRoverDSL.g:1268:3: RULE_STRING
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
    // InternalRoverDSL.g:1277:1: rule__Sensors__SensorAssignment : ( RULE_STRING ) ;
    public final void rule__Sensors__SensorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1281:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1282:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1282:2: ( RULE_STRING )
            // InternalRoverDSL.g:1283:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});

}