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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AvoidColors'", "'FindColors'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'On'", "'Off'", "'Mission:'", "'End:'", "'Safety:'", "'LakeColors:'", "'AvoidObjects:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'FlashingColor:'", "'FinalSentence:'"
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


    // $ANTLR start "entryRuleInteger"
    // InternalRoverDSL.g:78:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalRoverDSL.g:79:1: ( ruleInteger EOF )
            // InternalRoverDSL.g:80:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalRoverDSL.g:87:1: ruleInteger : ( ( rule__Integer__IntegerAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:91:2: ( ( ( rule__Integer__IntegerAssignment ) ) )
            // InternalRoverDSL.g:92:2: ( ( rule__Integer__IntegerAssignment ) )
            {
            // InternalRoverDSL.g:92:2: ( ( rule__Integer__IntegerAssignment ) )
            // InternalRoverDSL.g:93:3: ( rule__Integer__IntegerAssignment )
            {
             before(grammarAccess.getIntegerAccess().getIntegerAssignment()); 
            // InternalRoverDSL.g:94:3: ( rule__Integer__IntegerAssignment )
            // InternalRoverDSL.g:94:4: rule__Integer__IntegerAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Integer__IntegerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getIntegerAssignment()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleColor"
    // InternalRoverDSL.g:103:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalRoverDSL.g:104:1: ( ruleColor EOF )
            // InternalRoverDSL.g:105:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalRoverDSL.g:112:1: ruleColor : ( ( rule__Color__ColorAssignment ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:116:2: ( ( ( rule__Color__ColorAssignment ) ) )
            // InternalRoverDSL.g:117:2: ( ( rule__Color__ColorAssignment ) )
            {
            // InternalRoverDSL.g:117:2: ( ( rule__Color__ColorAssignment ) )
            // InternalRoverDSL.g:118:3: ( rule__Color__ColorAssignment )
            {
             before(grammarAccess.getColorAccess().getColorAssignment()); 
            // InternalRoverDSL.g:119:3: ( rule__Color__ColorAssignment )
            // InternalRoverDSL.g:119:4: rule__Color__ColorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Color__ColorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColorAssignment()); 

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
    // $ANTLR end "ruleColor"


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


    // $ANTLR start "ruleColors"
    // InternalRoverDSL.g:144:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:148:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalRoverDSL.g:149:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalRoverDSL.g:149:2: ( ( rule__Colors__Alternatives ) )
            // InternalRoverDSL.g:150:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalRoverDSL.g:151:3: ( rule__Colors__Alternatives )
            // InternalRoverDSL.g:151:4: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorsAccess().getAlternatives()); 

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


    // $ANTLR start "ruleSafety"
    // InternalRoverDSL.g:160:1: ruleSafety : ( ( rule__Safety__Alternatives ) ) ;
    public final void ruleSafety() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:164:1: ( ( ( rule__Safety__Alternatives ) ) )
            // InternalRoverDSL.g:165:2: ( ( rule__Safety__Alternatives ) )
            {
            // InternalRoverDSL.g:165:2: ( ( rule__Safety__Alternatives ) )
            // InternalRoverDSL.g:166:3: ( rule__Safety__Alternatives )
            {
             before(grammarAccess.getSafetyAccess().getAlternatives()); 
            // InternalRoverDSL.g:167:3: ( rule__Safety__Alternatives )
            // InternalRoverDSL.g:167:4: rule__Safety__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Safety__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSafetyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSafety"


    // $ANTLR start "rule__MissionType__Alternatives"
    // InternalRoverDSL.g:175:1: rule__MissionType__Alternatives : ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:179:1: ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) )
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
                    // InternalRoverDSL.g:180:2: ( ( 'AvoidColors' ) )
                    {
                    // InternalRoverDSL.g:180:2: ( ( 'AvoidColors' ) )
                    // InternalRoverDSL.g:181:3: ( 'AvoidColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:182:3: ( 'AvoidColors' )
                    // InternalRoverDSL.g:182:4: 'AvoidColors'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:186:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:186:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:187:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:188:3: ( 'FindColors' )
                    // InternalRoverDSL.g:188:4: 'FindColors'
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


    // $ANTLR start "rule__Colors__Alternatives"
    // InternalRoverDSL.g:196:1: rule__Colors__Alternatives : ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:200:1: ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:201:2: ( ( 'White' ) )
                    {
                    // InternalRoverDSL.g:201:2: ( ( 'White' ) )
                    // InternalRoverDSL.g:202:3: ( 'White' )
                    {
                     before(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:203:3: ( 'White' )
                    // InternalRoverDSL.g:203:4: 'White'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:207:2: ( ( 'Red' ) )
                    {
                    // InternalRoverDSL.g:207:2: ( ( 'Red' ) )
                    // InternalRoverDSL.g:208:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:209:3: ( 'Red' )
                    // InternalRoverDSL.g:209:4: 'Red'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:213:2: ( ( 'Blue' ) )
                    {
                    // InternalRoverDSL.g:213:2: ( ( 'Blue' ) )
                    // InternalRoverDSL.g:214:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:215:3: ( 'Blue' )
                    // InternalRoverDSL.g:215:4: 'Blue'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:219:2: ( ( 'Yellow' ) )
                    {
                    // InternalRoverDSL.g:219:2: ( ( 'Yellow' ) )
                    // InternalRoverDSL.g:220:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 
                    // InternalRoverDSL.g:221:3: ( 'Yellow' )
                    // InternalRoverDSL.g:221:4: 'Yellow'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:225:2: ( ( 'Black' ) )
                    {
                    // InternalRoverDSL.g:225:2: ( ( 'Black' ) )
                    // InternalRoverDSL.g:226:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 
                    // InternalRoverDSL.g:227:3: ( 'Black' )
                    // InternalRoverDSL.g:227:4: 'Black'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Colors__Alternatives"


    // $ANTLR start "rule__Safety__Alternatives"
    // InternalRoverDSL.g:235:1: rule__Safety__Alternatives : ( ( ( 'On' ) ) | ( ( 'Off' ) ) );
    public final void rule__Safety__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:239:1: ( ( ( 'On' ) ) | ( ( 'Off' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:240:2: ( ( 'On' ) )
                    {
                    // InternalRoverDSL.g:240:2: ( ( 'On' ) )
                    // InternalRoverDSL.g:241:3: ( 'On' )
                    {
                     before(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:242:3: ( 'On' )
                    // InternalRoverDSL.g:242:4: 'On'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:246:2: ( ( 'Off' ) )
                    {
                    // InternalRoverDSL.g:246:2: ( ( 'Off' ) )
                    // InternalRoverDSL.g:247:3: ( 'Off' )
                    {
                     before(grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:248:3: ( 'Off' )
                    // InternalRoverDSL.g:248:4: 'Off'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Safety__Alternatives"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalRoverDSL.g:256:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:260:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:261:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalRoverDSL.g:268:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:272:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:273:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:273:1: ( 'Mission:' )
            // InternalRoverDSL.g:274:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRoverDSL.g:283:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:287:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:288:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalRoverDSL.g:295:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:299:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:300:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:300:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:301:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:302:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:302:3: rule__Mission__MissiontypeAssignment_1
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
    // InternalRoverDSL.g:310:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:314:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:315:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalRoverDSL.g:322:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__Group_2__0 )? ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:326:1: ( ( ( rule__Mission__Group_2__0 )? ) )
            // InternalRoverDSL.g:327:1: ( ( rule__Mission__Group_2__0 )? )
            {
            // InternalRoverDSL.g:327:1: ( ( rule__Mission__Group_2__0 )? )
            // InternalRoverDSL.g:328:2: ( rule__Mission__Group_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_2()); 
            // InternalRoverDSL.g:329:2: ( rule__Mission__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:329:3: rule__Mission__Group_2__0
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
    // InternalRoverDSL.g:337:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:341:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:342:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalRoverDSL.g:349:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )? ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:353:1: ( ( ( rule__Mission__Group_3__0 )? ) )
            // InternalRoverDSL.g:354:1: ( ( rule__Mission__Group_3__0 )? )
            {
            // InternalRoverDSL.g:354:1: ( ( rule__Mission__Group_3__0 )? )
            // InternalRoverDSL.g:355:2: ( rule__Mission__Group_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalRoverDSL.g:356:2: ( rule__Mission__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:356:3: rule__Mission__Group_3__0
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
    // InternalRoverDSL.g:364:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:368:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:369:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
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
    // InternalRoverDSL.g:376:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )? ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:380:1: ( ( ( rule__Mission__Group_4__0 )? ) )
            // InternalRoverDSL.g:381:1: ( ( rule__Mission__Group_4__0 )? )
            {
            // InternalRoverDSL.g:381:1: ( ( rule__Mission__Group_4__0 )? )
            // InternalRoverDSL.g:382:2: ( rule__Mission__Group_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalRoverDSL.g:383:2: ( rule__Mission__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:383:3: rule__Mission__Group_4__0
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
    // InternalRoverDSL.g:391:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:395:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:396:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
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
    // InternalRoverDSL.g:403:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:407:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalRoverDSL.g:408:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalRoverDSL.g:408:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalRoverDSL.g:409:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalRoverDSL.g:410:2: ( rule__Mission__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:410:3: rule__Mission__Group_5__0
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
    // InternalRoverDSL.g:418:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:422:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:423:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
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
    // InternalRoverDSL.g:430:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:434:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalRoverDSL.g:435:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalRoverDSL.g:435:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalRoverDSL.g:436:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalRoverDSL.g:437:2: ( rule__Mission__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:437:3: rule__Mission__Group_6__0
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
    // InternalRoverDSL.g:445:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:449:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:450:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
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
    // InternalRoverDSL.g:457:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )? ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:461:1: ( ( ( rule__Mission__Group_7__0 )? ) )
            // InternalRoverDSL.g:462:1: ( ( rule__Mission__Group_7__0 )? )
            {
            // InternalRoverDSL.g:462:1: ( ( rule__Mission__Group_7__0 )? )
            // InternalRoverDSL.g:463:2: ( rule__Mission__Group_7__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalRoverDSL.g:464:2: ( rule__Mission__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:464:3: rule__Mission__Group_7__0
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
    // InternalRoverDSL.g:472:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:476:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:477:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
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
    // InternalRoverDSL.g:484:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__Group_8__0 )? ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:488:1: ( ( ( rule__Mission__Group_8__0 )? ) )
            // InternalRoverDSL.g:489:1: ( ( rule__Mission__Group_8__0 )? )
            {
            // InternalRoverDSL.g:489:1: ( ( rule__Mission__Group_8__0 )? )
            // InternalRoverDSL.g:490:2: ( rule__Mission__Group_8__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_8()); 
            // InternalRoverDSL.g:491:2: ( rule__Mission__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:491:3: rule__Mission__Group_8__0
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
    // InternalRoverDSL.g:499:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:503:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:504:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
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
    // InternalRoverDSL.g:511:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__Group_9__0 )? ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:515:1: ( ( ( rule__Mission__Group_9__0 )? ) )
            // InternalRoverDSL.g:516:1: ( ( rule__Mission__Group_9__0 )? )
            {
            // InternalRoverDSL.g:516:1: ( ( rule__Mission__Group_9__0 )? )
            // InternalRoverDSL.g:517:2: ( rule__Mission__Group_9__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_9()); 
            // InternalRoverDSL.g:518:2: ( rule__Mission__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:518:3: rule__Mission__Group_9__0
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
    // InternalRoverDSL.g:526:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:530:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:531:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:538:1: rule__Mission__Group__10__Impl : ( ( rule__Mission__Group_10__0 )? ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:542:1: ( ( ( rule__Mission__Group_10__0 )? ) )
            // InternalRoverDSL.g:543:1: ( ( rule__Mission__Group_10__0 )? )
            {
            // InternalRoverDSL.g:543:1: ( ( rule__Mission__Group_10__0 )? )
            // InternalRoverDSL.g:544:2: ( rule__Mission__Group_10__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_10()); 
            // InternalRoverDSL.g:545:2: ( rule__Mission__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:545:3: rule__Mission__Group_10__0
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
    // InternalRoverDSL.g:553:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:557:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:558:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:565:1: rule__Mission__Group__11__Impl : ( 'End:' ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:569:1: ( ( 'End:' ) )
            // InternalRoverDSL.g:570:1: ( 'End:' )
            {
            // InternalRoverDSL.g:570:1: ( 'End:' )
            // InternalRoverDSL.g:571:2: 'End:'
            {
             before(grammarAccess.getMissionAccess().getEndKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndKeyword_11()); 

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
    // InternalRoverDSL.g:580:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:584:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:585:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
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
    // InternalRoverDSL.g:592:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__TerminationconditionAssignment_12 ) ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:596:1: ( ( ( rule__Mission__TerminationconditionAssignment_12 ) ) )
            // InternalRoverDSL.g:597:1: ( ( rule__Mission__TerminationconditionAssignment_12 ) )
            {
            // InternalRoverDSL.g:597:1: ( ( rule__Mission__TerminationconditionAssignment_12 ) )
            // InternalRoverDSL.g:598:2: ( rule__Mission__TerminationconditionAssignment_12 )
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_12()); 
            // InternalRoverDSL.g:599:2: ( rule__Mission__TerminationconditionAssignment_12 )
            // InternalRoverDSL.g:599:3: rule__Mission__TerminationconditionAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TerminationconditionAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTerminationconditionAssignment_12()); 

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
    // InternalRoverDSL.g:607:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl rule__Mission__Group__14 ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:611:1: ( rule__Mission__Group__13__Impl rule__Mission__Group__14 )
            // InternalRoverDSL.g:612:2: rule__Mission__Group__13__Impl rule__Mission__Group__14
            {
            pushFollow(FOLLOW_6);
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
    // InternalRoverDSL.g:619:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__Group_13__0 )? ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:623:1: ( ( ( rule__Mission__Group_13__0 )? ) )
            // InternalRoverDSL.g:624:1: ( ( rule__Mission__Group_13__0 )? )
            {
            // InternalRoverDSL.g:624:1: ( ( rule__Mission__Group_13__0 )? )
            // InternalRoverDSL.g:625:2: ( rule__Mission__Group_13__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_13()); 
            // InternalRoverDSL.g:626:2: ( rule__Mission__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:626:3: rule__Mission__Group_13__0
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


    // $ANTLR start "rule__Mission__Group__14"
    // InternalRoverDSL.g:634:1: rule__Mission__Group__14 : rule__Mission__Group__14__Impl ;
    public final void rule__Mission__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:638:1: ( rule__Mission__Group__14__Impl )
            // InternalRoverDSL.g:639:2: rule__Mission__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__14__Impl();

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
    // InternalRoverDSL.g:645:1: rule__Mission__Group__14__Impl : ( ( rule__Mission__Group_14__0 )? ) ;
    public final void rule__Mission__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:649:1: ( ( ( rule__Mission__Group_14__0 )? ) )
            // InternalRoverDSL.g:650:1: ( ( rule__Mission__Group_14__0 )? )
            {
            // InternalRoverDSL.g:650:1: ( ( rule__Mission__Group_14__0 )? )
            // InternalRoverDSL.g:651:2: ( rule__Mission__Group_14__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_14()); 
            // InternalRoverDSL.g:652:2: ( rule__Mission__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverDSL.g:652:3: rule__Mission__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_14()); 

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


    // $ANTLR start "rule__Mission__Group_2__0"
    // InternalRoverDSL.g:661:1: rule__Mission__Group_2__0 : rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 ;
    public final void rule__Mission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:665:1: ( rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 )
            // InternalRoverDSL.g:666:2: rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRoverDSL.g:673:1: rule__Mission__Group_2__0__Impl : ( 'Safety:' ) ;
    public final void rule__Mission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:677:1: ( ( 'Safety:' ) )
            // InternalRoverDSL.g:678:1: ( 'Safety:' )
            {
            // InternalRoverDSL.g:678:1: ( 'Safety:' )
            // InternalRoverDSL.g:679:2: 'Safety:'
            {
             before(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRoverDSL.g:688:1: rule__Mission__Group_2__1 : rule__Mission__Group_2__1__Impl ;
    public final void rule__Mission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:692:1: ( rule__Mission__Group_2__1__Impl )
            // InternalRoverDSL.g:693:2: rule__Mission__Group_2__1__Impl
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
    // InternalRoverDSL.g:699:1: rule__Mission__Group_2__1__Impl : ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) ;
    public final void rule__Mission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:703:1: ( ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) )
            // InternalRoverDSL.g:704:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            {
            // InternalRoverDSL.g:704:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            // InternalRoverDSL.g:705:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            {
             before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); 
            // InternalRoverDSL.g:706:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            // InternalRoverDSL.g:706:3: rule__Mission__SafetypropertyAssignment_2_1
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
    // InternalRoverDSL.g:715:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:719:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalRoverDSL.g:720:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:727:1: rule__Mission__Group_3__0__Impl : ( 'LakeColors:' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:731:1: ( ( 'LakeColors:' ) )
            // InternalRoverDSL.g:732:1: ( 'LakeColors:' )
            {
            // InternalRoverDSL.g:732:1: ( 'LakeColors:' )
            // InternalRoverDSL.g:733:2: 'LakeColors:'
            {
             before(grammarAccess.getMissionAccess().getLakeColorsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLakeColorsKeyword_3_0()); 

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
    // InternalRoverDSL.g:742:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:746:1: ( rule__Mission__Group_3__1__Impl )
            // InternalRoverDSL.g:747:2: rule__Mission__Group_3__1__Impl
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
    // InternalRoverDSL.g:753:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__LakelistAssignment_3_1 )* ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:757:1: ( ( ( rule__Mission__LakelistAssignment_3_1 )* ) )
            // InternalRoverDSL.g:758:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            {
            // InternalRoverDSL.g:758:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            // InternalRoverDSL.g:759:2: ( rule__Mission__LakelistAssignment_3_1 )*
            {
             before(grammarAccess.getMissionAccess().getLakelistAssignment_3_1()); 
            // InternalRoverDSL.g:760:2: ( rule__Mission__LakelistAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=17)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRoverDSL.g:760:3: rule__Mission__LakelistAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Mission__LakelistAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getLakelistAssignment_3_1()); 

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
    // InternalRoverDSL.g:769:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:773:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalRoverDSL.g:774:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoverDSL.g:781:1: rule__Mission__Group_4__0__Impl : ( 'AvoidObjects:' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:785:1: ( ( 'AvoidObjects:' ) )
            // InternalRoverDSL.g:786:1: ( 'AvoidObjects:' )
            {
            // InternalRoverDSL.g:786:1: ( 'AvoidObjects:' )
            // InternalRoverDSL.g:787:2: 'AvoidObjects:'
            {
             before(grammarAccess.getMissionAccess().getAvoidObjectsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAvoidObjectsKeyword_4_0()); 

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
    // InternalRoverDSL.g:796:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:800:1: ( rule__Mission__Group_4__1__Impl )
            // InternalRoverDSL.g:801:2: rule__Mission__Group_4__1__Impl
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
    // InternalRoverDSL.g:807:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:811:1: ( ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) ) )
            // InternalRoverDSL.g:812:1: ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) )
            {
            // InternalRoverDSL.g:812:1: ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) )
            // InternalRoverDSL.g:813:2: ( rule__Mission__ObjectdistanceAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceAssignment_4_1()); 
            // InternalRoverDSL.g:814:2: ( rule__Mission__ObjectdistanceAssignment_4_1 )
            // InternalRoverDSL.g:814:3: rule__Mission__ObjectdistanceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ObjectdistanceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getObjectdistanceAssignment_4_1()); 

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
    // InternalRoverDSL.g:823:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:827:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalRoverDSL.g:828:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:835:1: rule__Mission__Group_5__0__Impl : ( 'BeginSentence:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:839:1: ( ( 'BeginSentence:' ) )
            // InternalRoverDSL.g:840:1: ( 'BeginSentence:' )
            {
            // InternalRoverDSL.g:840:1: ( 'BeginSentence:' )
            // InternalRoverDSL.g:841:2: 'BeginSentence:'
            {
             before(grammarAccess.getMissionAccess().getBeginSentenceKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginSentenceKeyword_5_0()); 

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
    // InternalRoverDSL.g:850:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:854:1: ( rule__Mission__Group_5__1__Impl )
            // InternalRoverDSL.g:855:2: rule__Mission__Group_5__1__Impl
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
    // InternalRoverDSL.g:861:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__BeginsentenceAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:865:1: ( ( ( rule__Mission__BeginsentenceAssignment_5_1 ) ) )
            // InternalRoverDSL.g:866:1: ( ( rule__Mission__BeginsentenceAssignment_5_1 ) )
            {
            // InternalRoverDSL.g:866:1: ( ( rule__Mission__BeginsentenceAssignment_5_1 ) )
            // InternalRoverDSL.g:867:2: ( rule__Mission__BeginsentenceAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_5_1()); 
            // InternalRoverDSL.g:868:2: ( rule__Mission__BeginsentenceAssignment_5_1 )
            // InternalRoverDSL.g:868:3: rule__Mission__BeginsentenceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BeginsentenceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBeginsentenceAssignment_5_1()); 

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
    // InternalRoverDSL.g:877:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:881:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalRoverDSL.g:882:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:889:1: rule__Mission__Group_6__0__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:893:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:894:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:894:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:895:2: 'OuterBorder:'
            {
             before(grammarAccess.getMissionAccess().getOuterBorderKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getOuterBorderKeyword_6_0()); 

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
    // InternalRoverDSL.g:904:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:908:1: ( rule__Mission__Group_6__1__Impl )
            // InternalRoverDSL.g:909:2: rule__Mission__Group_6__1__Impl
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
    // InternalRoverDSL.g:915:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__BordercolorAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:919:1: ( ( ( rule__Mission__BordercolorAssignment_6_1 ) ) )
            // InternalRoverDSL.g:920:1: ( ( rule__Mission__BordercolorAssignment_6_1 ) )
            {
            // InternalRoverDSL.g:920:1: ( ( rule__Mission__BordercolorAssignment_6_1 ) )
            // InternalRoverDSL.g:921:2: ( rule__Mission__BordercolorAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getBordercolorAssignment_6_1()); 
            // InternalRoverDSL.g:922:2: ( rule__Mission__BordercolorAssignment_6_1 )
            // InternalRoverDSL.g:922:3: rule__Mission__BordercolorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BordercolorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBordercolorAssignment_6_1()); 

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
    // InternalRoverDSL.g:931:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:935:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalRoverDSL.g:936:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoverDSL.g:943:1: rule__Mission__Group_7__0__Impl : ( 'ForwardSpeed:' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:947:1: ( ( 'ForwardSpeed:' ) )
            // InternalRoverDSL.g:948:1: ( 'ForwardSpeed:' )
            {
            // InternalRoverDSL.g:948:1: ( 'ForwardSpeed:' )
            // InternalRoverDSL.g:949:2: 'ForwardSpeed:'
            {
             before(grammarAccess.getMissionAccess().getForwardSpeedKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardSpeedKeyword_7_0()); 

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
    // InternalRoverDSL.g:958:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:962:1: ( rule__Mission__Group_7__1__Impl )
            // InternalRoverDSL.g:963:2: rule__Mission__Group_7__1__Impl
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
    // InternalRoverDSL.g:969:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__ForwardspeedAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:973:1: ( ( ( rule__Mission__ForwardspeedAssignment_7_1 ) ) )
            // InternalRoverDSL.g:974:1: ( ( rule__Mission__ForwardspeedAssignment_7_1 ) )
            {
            // InternalRoverDSL.g:974:1: ( ( rule__Mission__ForwardspeedAssignment_7_1 ) )
            // InternalRoverDSL.g:975:2: ( rule__Mission__ForwardspeedAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_7_1()); 
            // InternalRoverDSL.g:976:2: ( rule__Mission__ForwardspeedAssignment_7_1 )
            // InternalRoverDSL.g:976:3: rule__Mission__ForwardspeedAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ForwardspeedAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getForwardspeedAssignment_7_1()); 

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
    // InternalRoverDSL.g:985:1: rule__Mission__Group_8__0 : rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 ;
    public final void rule__Mission__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:989:1: ( rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 )
            // InternalRoverDSL.g:990:2: rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoverDSL.g:997:1: rule__Mission__Group_8__0__Impl : ( 'ReverseSpeed:' ) ;
    public final void rule__Mission__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1001:1: ( ( 'ReverseSpeed:' ) )
            // InternalRoverDSL.g:1002:1: ( 'ReverseSpeed:' )
            {
            // InternalRoverDSL.g:1002:1: ( 'ReverseSpeed:' )
            // InternalRoverDSL.g:1003:2: 'ReverseSpeed:'
            {
             before(grammarAccess.getMissionAccess().getReverseSpeedKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReverseSpeedKeyword_8_0()); 

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
    // InternalRoverDSL.g:1012:1: rule__Mission__Group_8__1 : rule__Mission__Group_8__1__Impl ;
    public final void rule__Mission__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1016:1: ( rule__Mission__Group_8__1__Impl )
            // InternalRoverDSL.g:1017:2: rule__Mission__Group_8__1__Impl
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
    // InternalRoverDSL.g:1023:1: rule__Mission__Group_8__1__Impl : ( ( rule__Mission__ReversespeedAssignment_8_1 ) ) ;
    public final void rule__Mission__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1027:1: ( ( ( rule__Mission__ReversespeedAssignment_8_1 ) ) )
            // InternalRoverDSL.g:1028:1: ( ( rule__Mission__ReversespeedAssignment_8_1 ) )
            {
            // InternalRoverDSL.g:1028:1: ( ( rule__Mission__ReversespeedAssignment_8_1 ) )
            // InternalRoverDSL.g:1029:2: ( rule__Mission__ReversespeedAssignment_8_1 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_8_1()); 
            // InternalRoverDSL.g:1030:2: ( rule__Mission__ReversespeedAssignment_8_1 )
            // InternalRoverDSL.g:1030:3: rule__Mission__ReversespeedAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ReversespeedAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getReversespeedAssignment_8_1()); 

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
    // InternalRoverDSL.g:1039:1: rule__Mission__Group_9__0 : rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 ;
    public final void rule__Mission__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1043:1: ( rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 )
            // InternalRoverDSL.g:1044:2: rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoverDSL.g:1051:1: rule__Mission__Group_9__0__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1055:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:1056:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:1056:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:1057:2: 'TurnDirection:'
            {
             before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_9_0()); 

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
    // InternalRoverDSL.g:1066:1: rule__Mission__Group_9__1 : rule__Mission__Group_9__1__Impl ;
    public final void rule__Mission__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1070:1: ( rule__Mission__Group_9__1__Impl )
            // InternalRoverDSL.g:1071:2: rule__Mission__Group_9__1__Impl
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
    // InternalRoverDSL.g:1077:1: rule__Mission__Group_9__1__Impl : ( ( rule__Mission__TurndirectionAssignment_9_1 ) ) ;
    public final void rule__Mission__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1081:1: ( ( ( rule__Mission__TurndirectionAssignment_9_1 ) ) )
            // InternalRoverDSL.g:1082:1: ( ( rule__Mission__TurndirectionAssignment_9_1 ) )
            {
            // InternalRoverDSL.g:1082:1: ( ( rule__Mission__TurndirectionAssignment_9_1 ) )
            // InternalRoverDSL.g:1083:2: ( rule__Mission__TurndirectionAssignment_9_1 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_9_1()); 
            // InternalRoverDSL.g:1084:2: ( rule__Mission__TurndirectionAssignment_9_1 )
            // InternalRoverDSL.g:1084:3: rule__Mission__TurndirectionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TurndirectionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTurndirectionAssignment_9_1()); 

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


    // $ANTLR start "rule__Mission__Group_10__0"
    // InternalRoverDSL.g:1093:1: rule__Mission__Group_10__0 : rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 ;
    public final void rule__Mission__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1097:1: ( rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 )
            // InternalRoverDSL.g:1098:2: rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:1105:1: rule__Mission__Group_10__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1109:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:1110:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:1110:1: ( 'Colors:' )
            // InternalRoverDSL.g:1111:2: 'Colors:'
            {
             before(grammarAccess.getMissionAccess().getColorsKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoverDSL.g:1120:1: rule__Mission__Group_10__1 : rule__Mission__Group_10__1__Impl ;
    public final void rule__Mission__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1124:1: ( rule__Mission__Group_10__1__Impl )
            // InternalRoverDSL.g:1125:2: rule__Mission__Group_10__1__Impl
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
    // InternalRoverDSL.g:1131:1: rule__Mission__Group_10__1__Impl : ( ( rule__Mission__ColorlistAssignment_10_1 )* ) ;
    public final void rule__Mission__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1135:1: ( ( ( rule__Mission__ColorlistAssignment_10_1 )* ) )
            // InternalRoverDSL.g:1136:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            {
            // InternalRoverDSL.g:1136:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            // InternalRoverDSL.g:1137:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_10_1()); 
            // InternalRoverDSL.g:1138:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=17)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRoverDSL.g:1138:3: rule__Mission__ColorlistAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Mission__ColorlistAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__Mission__Group_13__0"
    // InternalRoverDSL.g:1147:1: rule__Mission__Group_13__0 : rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 ;
    public final void rule__Mission__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1151:1: ( rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 )
            // InternalRoverDSL.g:1152:2: rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:1159:1: rule__Mission__Group_13__0__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1163:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:1164:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:1164:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:1165:2: 'FlashingColor:'
            {
             before(grammarAccess.getMissionAccess().getFlashingColorKeyword_13_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFlashingColorKeyword_13_0()); 

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
    // InternalRoverDSL.g:1174:1: rule__Mission__Group_13__1 : rule__Mission__Group_13__1__Impl ;
    public final void rule__Mission__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1178:1: ( rule__Mission__Group_13__1__Impl )
            // InternalRoverDSL.g:1179:2: rule__Mission__Group_13__1__Impl
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
    // InternalRoverDSL.g:1185:1: rule__Mission__Group_13__1__Impl : ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) ;
    public final void rule__Mission__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1189:1: ( ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) )
            // InternalRoverDSL.g:1190:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            {
            // InternalRoverDSL.g:1190:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            // InternalRoverDSL.g:1191:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_13_1()); 
            // InternalRoverDSL.g:1192:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            // InternalRoverDSL.g:1192:3: rule__Mission__FlashingcolorAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FlashingcolorAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFlashingcolorAssignment_13_1()); 

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


    // $ANTLR start "rule__Mission__Group_14__0"
    // InternalRoverDSL.g:1201:1: rule__Mission__Group_14__0 : rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 ;
    public final void rule__Mission__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1205:1: ( rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 )
            // InternalRoverDSL.g:1206:2: rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_14__1();

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
    // $ANTLR end "rule__Mission__Group_14__0"


    // $ANTLR start "rule__Mission__Group_14__0__Impl"
    // InternalRoverDSL.g:1213:1: rule__Mission__Group_14__0__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1217:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:1218:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:1218:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:1219:2: 'FinalSentence:'
            {
             before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_14_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalSentenceKeyword_14_0()); 

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
    // $ANTLR end "rule__Mission__Group_14__0__Impl"


    // $ANTLR start "rule__Mission__Group_14__1"
    // InternalRoverDSL.g:1228:1: rule__Mission__Group_14__1 : rule__Mission__Group_14__1__Impl ;
    public final void rule__Mission__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1232:1: ( rule__Mission__Group_14__1__Impl )
            // InternalRoverDSL.g:1233:2: rule__Mission__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_14__1__Impl();

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
    // $ANTLR end "rule__Mission__Group_14__1"


    // $ANTLR start "rule__Mission__Group_14__1__Impl"
    // InternalRoverDSL.g:1239:1: rule__Mission__Group_14__1__Impl : ( ( rule__Mission__FinalsentenceAssignment_14_1 ) ) ;
    public final void rule__Mission__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1243:1: ( ( ( rule__Mission__FinalsentenceAssignment_14_1 ) ) )
            // InternalRoverDSL.g:1244:1: ( ( rule__Mission__FinalsentenceAssignment_14_1 ) )
            {
            // InternalRoverDSL.g:1244:1: ( ( rule__Mission__FinalsentenceAssignment_14_1 ) )
            // InternalRoverDSL.g:1245:2: ( rule__Mission__FinalsentenceAssignment_14_1 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_14_1()); 
            // InternalRoverDSL.g:1246:2: ( rule__Mission__FinalsentenceAssignment_14_1 )
            // InternalRoverDSL.g:1246:3: rule__Mission__FinalsentenceAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FinalsentenceAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFinalsentenceAssignment_14_1()); 

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
    // $ANTLR end "rule__Mission__Group_14__1__Impl"


    // $ANTLR start "rule__Mission__MissiontypeAssignment_1"
    // InternalRoverDSL.g:1255:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1259:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:1260:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:1260:2: ( ruleMissionType )
            // InternalRoverDSL.g:1261:3: ruleMissionType
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
    // InternalRoverDSL.g:1270:1: rule__Mission__SafetypropertyAssignment_2_1 : ( ruleSafety ) ;
    public final void rule__Mission__SafetypropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1274:1: ( ( ruleSafety ) )
            // InternalRoverDSL.g:1275:2: ( ruleSafety )
            {
            // InternalRoverDSL.g:1275:2: ( ruleSafety )
            // InternalRoverDSL.g:1276:3: ruleSafety
            {
             before(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafety();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_2_1_0()); 

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


    // $ANTLR start "rule__Mission__LakelistAssignment_3_1"
    // InternalRoverDSL.g:1285:1: rule__Mission__LakelistAssignment_3_1 : ( ruleColors ) ;
    public final void rule__Mission__LakelistAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1289:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1290:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1290:2: ( ruleColors )
            // InternalRoverDSL.g:1291:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Mission__LakelistAssignment_3_1"


    // $ANTLR start "rule__Mission__ObjectdistanceAssignment_4_1"
    // InternalRoverDSL.g:1300:1: rule__Mission__ObjectdistanceAssignment_4_1 : ( ruleInteger ) ;
    public final void rule__Mission__ObjectdistanceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1304:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1305:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1305:2: ( ruleInteger )
            // InternalRoverDSL.g:1306:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Mission__ObjectdistanceAssignment_4_1"


    // $ANTLR start "rule__Mission__BeginsentenceAssignment_5_1"
    // InternalRoverDSL.g:1315:1: rule__Mission__BeginsentenceAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BeginsentenceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1319:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1320:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1320:2: ( RULE_STRING )
            // InternalRoverDSL.g:1321:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Mission__BeginsentenceAssignment_5_1"


    // $ANTLR start "rule__Mission__BordercolorAssignment_6_1"
    // InternalRoverDSL.g:1330:1: rule__Mission__BordercolorAssignment_6_1 : ( ruleColor ) ;
    public final void rule__Mission__BordercolorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1334:1: ( ( ruleColor ) )
            // InternalRoverDSL.g:1335:2: ( ruleColor )
            {
            // InternalRoverDSL.g:1335:2: ( ruleColor )
            // InternalRoverDSL.g:1336:3: ruleColor
            {
             before(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Mission__BordercolorAssignment_6_1"


    // $ANTLR start "rule__Mission__ForwardspeedAssignment_7_1"
    // InternalRoverDSL.g:1345:1: rule__Mission__ForwardspeedAssignment_7_1 : ( ruleInteger ) ;
    public final void rule__Mission__ForwardspeedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1349:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1350:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1350:2: ( ruleInteger )
            // InternalRoverDSL.g:1351:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Mission__ForwardspeedAssignment_7_1"


    // $ANTLR start "rule__Mission__ReversespeedAssignment_8_1"
    // InternalRoverDSL.g:1360:1: rule__Mission__ReversespeedAssignment_8_1 : ( ruleInteger ) ;
    public final void rule__Mission__ReversespeedAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1364:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1365:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1365:2: ( ruleInteger )
            // InternalRoverDSL.g:1366:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Mission__ReversespeedAssignment_8_1"


    // $ANTLR start "rule__Mission__TurndirectionAssignment_9_1"
    // InternalRoverDSL.g:1375:1: rule__Mission__TurndirectionAssignment_9_1 : ( ruleInteger ) ;
    public final void rule__Mission__TurndirectionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1379:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1380:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1380:2: ( ruleInteger )
            // InternalRoverDSL.g:1381:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Mission__TurndirectionAssignment_9_1"


    // $ANTLR start "rule__Mission__ColorlistAssignment_10_1"
    // InternalRoverDSL.g:1390:1: rule__Mission__ColorlistAssignment_10_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1394:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1395:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1395:2: ( ruleColors )
            // InternalRoverDSL.g:1396:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_10_1_0()); 

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


    // $ANTLR start "rule__Mission__TerminationconditionAssignment_12"
    // InternalRoverDSL.g:1405:1: rule__Mission__TerminationconditionAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Mission__TerminationconditionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1409:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1410:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1410:2: ( RULE_STRING )
            // InternalRoverDSL.g:1411:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Mission__TerminationconditionAssignment_12"


    // $ANTLR start "rule__Mission__FlashingcolorAssignment_13_1"
    // InternalRoverDSL.g:1420:1: rule__Mission__FlashingcolorAssignment_13_1 : ( ruleColor ) ;
    public final void rule__Mission__FlashingcolorAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1424:1: ( ( ruleColor ) )
            // InternalRoverDSL.g:1425:2: ( ruleColor )
            {
            // InternalRoverDSL.g:1425:2: ( ruleColor )
            // InternalRoverDSL.g:1426:3: ruleColor
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorColorParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getFlashingcolorColorParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Mission__FlashingcolorAssignment_13_1"


    // $ANTLR start "rule__Mission__FinalsentenceAssignment_14_1"
    // InternalRoverDSL.g:1435:1: rule__Mission__FinalsentenceAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1439:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1440:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1440:2: ( RULE_STRING )
            // InternalRoverDSL.g:1441:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_14_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Mission__FinalsentenceAssignment_14_1"


    // $ANTLR start "rule__Integer__IntegerAssignment"
    // InternalRoverDSL.g:1450:1: rule__Integer__IntegerAssignment : ( RULE_INT ) ;
    public final void rule__Integer__IntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1454:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1455:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1455:2: ( RULE_INT )
            // InternalRoverDSL.g:1456:3: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getIntegerINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Integer__IntegerAssignment"


    // $ANTLR start "rule__Color__ColorAssignment"
    // InternalRoverDSL.g:1465:1: rule__Color__ColorAssignment : ( ruleColors ) ;
    public final void rule__Color__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1469:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1470:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1470:2: ( ruleColors )
            // InternalRoverDSL.g:1471:3: ruleColors
            {
             before(grammarAccess.getColorAccess().getColorColorsEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getColorAccess().getColorColorsEnumRuleCall_0()); 

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
    // $ANTLR end "rule__Color__ColorAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000007FE00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}