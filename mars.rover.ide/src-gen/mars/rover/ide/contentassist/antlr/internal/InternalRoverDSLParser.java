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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FindColors'", "'Measure'", "'Park'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'On'", "'Off'", "'Mission:'", "'End'", "'BeginSentence:'", "'FinalSentence:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Safety:'", "'AvoidObjects:'", "'OuterBorder:'", "'LakeColors:'", "'Colors:'", "'MeasurementColors:'", "'FlashingColor:'", "'Timeout:'"
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



    // $ANTLR start "entryRuleTasks"
    // InternalRoverDSL.g:53:1: entryRuleTasks : ruleTasks EOF ;
    public final void entryRuleTasks() throws RecognitionException {
        try {
            // InternalRoverDSL.g:54:1: ( ruleTasks EOF )
            // InternalRoverDSL.g:55:1: ruleTasks EOF
            {
             before(grammarAccess.getTasksRule()); 
            pushFollow(FOLLOW_1);
            ruleTasks();

            state._fsp--;

             after(grammarAccess.getTasksRule()); 
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
    // $ANTLR end "entryRuleTasks"


    // $ANTLR start "ruleTasks"
    // InternalRoverDSL.g:62:1: ruleTasks : ( ( ( rule__Tasks__MissionlistAssignment ) ) ( ( rule__Tasks__MissionlistAssignment )* ) ) ;
    public final void ruleTasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:66:2: ( ( ( ( rule__Tasks__MissionlistAssignment ) ) ( ( rule__Tasks__MissionlistAssignment )* ) ) )
            // InternalRoverDSL.g:67:2: ( ( ( rule__Tasks__MissionlistAssignment ) ) ( ( rule__Tasks__MissionlistAssignment )* ) )
            {
            // InternalRoverDSL.g:67:2: ( ( ( rule__Tasks__MissionlistAssignment ) ) ( ( rule__Tasks__MissionlistAssignment )* ) )
            // InternalRoverDSL.g:68:3: ( ( rule__Tasks__MissionlistAssignment ) ) ( ( rule__Tasks__MissionlistAssignment )* )
            {
            // InternalRoverDSL.g:68:3: ( ( rule__Tasks__MissionlistAssignment ) )
            // InternalRoverDSL.g:69:4: ( rule__Tasks__MissionlistAssignment )
            {
             before(grammarAccess.getTasksAccess().getMissionlistAssignment()); 
            // InternalRoverDSL.g:70:4: ( rule__Tasks__MissionlistAssignment )
            // InternalRoverDSL.g:70:5: rule__Tasks__MissionlistAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Tasks__MissionlistAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getMissionlistAssignment()); 

            }

            // InternalRoverDSL.g:73:3: ( ( rule__Tasks__MissionlistAssignment )* )
            // InternalRoverDSL.g:74:4: ( rule__Tasks__MissionlistAssignment )*
            {
             before(grammarAccess.getTasksAccess().getMissionlistAssignment()); 
            // InternalRoverDSL.g:75:4: ( rule__Tasks__MissionlistAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoverDSL.g:75:5: rule__Tasks__MissionlistAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Tasks__MissionlistAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTasksAccess().getMissionlistAssignment()); 

            }


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
    // $ANTLR end "ruleTasks"


    // $ANTLR start "entryRuleMission"
    // InternalRoverDSL.g:85:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalRoverDSL.g:86:1: ( ruleMission EOF )
            // InternalRoverDSL.g:87:1: ruleMission EOF
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
    // InternalRoverDSL.g:94:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:98:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalRoverDSL.g:99:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalRoverDSL.g:99:2: ( ( rule__Mission__Group__0 ) )
            // InternalRoverDSL.g:100:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalRoverDSL.g:101:3: ( rule__Mission__Group__0 )
            // InternalRoverDSL.g:101:4: rule__Mission__Group__0
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
    // InternalRoverDSL.g:110:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalRoverDSL.g:111:1: ( ruleInteger EOF )
            // InternalRoverDSL.g:112:1: ruleInteger EOF
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
    // InternalRoverDSL.g:119:1: ruleInteger : ( ( rule__Integer__IntegerAssignment ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:123:2: ( ( ( rule__Integer__IntegerAssignment ) ) )
            // InternalRoverDSL.g:124:2: ( ( rule__Integer__IntegerAssignment ) )
            {
            // InternalRoverDSL.g:124:2: ( ( rule__Integer__IntegerAssignment ) )
            // InternalRoverDSL.g:125:3: ( rule__Integer__IntegerAssignment )
            {
             before(grammarAccess.getIntegerAccess().getIntegerAssignment()); 
            // InternalRoverDSL.g:126:3: ( rule__Integer__IntegerAssignment )
            // InternalRoverDSL.g:126:4: rule__Integer__IntegerAssignment
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
    // InternalRoverDSL.g:135:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalRoverDSL.g:136:1: ( ruleColor EOF )
            // InternalRoverDSL.g:137:1: ruleColor EOF
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
    // InternalRoverDSL.g:144:1: ruleColor : ( ( rule__Color__ColorAssignment ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:148:2: ( ( ( rule__Color__ColorAssignment ) ) )
            // InternalRoverDSL.g:149:2: ( ( rule__Color__ColorAssignment ) )
            {
            // InternalRoverDSL.g:149:2: ( ( rule__Color__ColorAssignment ) )
            // InternalRoverDSL.g:150:3: ( rule__Color__ColorAssignment )
            {
             before(grammarAccess.getColorAccess().getColorAssignment()); 
            // InternalRoverDSL.g:151:3: ( rule__Color__ColorAssignment )
            // InternalRoverDSL.g:151:4: rule__Color__ColorAssignment
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
    // InternalRoverDSL.g:160:1: ruleMissionType : ( ( rule__MissionType__Alternatives ) ) ;
    public final void ruleMissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:164:1: ( ( ( rule__MissionType__Alternatives ) ) )
            // InternalRoverDSL.g:165:2: ( ( rule__MissionType__Alternatives ) )
            {
            // InternalRoverDSL.g:165:2: ( ( rule__MissionType__Alternatives ) )
            // InternalRoverDSL.g:166:3: ( rule__MissionType__Alternatives )
            {
             before(grammarAccess.getMissionTypeAccess().getAlternatives()); 
            // InternalRoverDSL.g:167:3: ( rule__MissionType__Alternatives )
            // InternalRoverDSL.g:167:4: rule__MissionType__Alternatives
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
    // InternalRoverDSL.g:176:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:180:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalRoverDSL.g:181:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalRoverDSL.g:181:2: ( ( rule__Colors__Alternatives ) )
            // InternalRoverDSL.g:182:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalRoverDSL.g:183:3: ( rule__Colors__Alternatives )
            // InternalRoverDSL.g:183:4: rule__Colors__Alternatives
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
    // InternalRoverDSL.g:192:1: ruleSafety : ( ( rule__Safety__Alternatives ) ) ;
    public final void ruleSafety() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:196:1: ( ( ( rule__Safety__Alternatives ) ) )
            // InternalRoverDSL.g:197:2: ( ( rule__Safety__Alternatives ) )
            {
            // InternalRoverDSL.g:197:2: ( ( rule__Safety__Alternatives ) )
            // InternalRoverDSL.g:198:3: ( rule__Safety__Alternatives )
            {
             before(grammarAccess.getSafetyAccess().getAlternatives()); 
            // InternalRoverDSL.g:199:3: ( rule__Safety__Alternatives )
            // InternalRoverDSL.g:199:4: rule__Safety__Alternatives
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
    // InternalRoverDSL.g:207:1: rule__MissionType__Alternatives : ( ( ( 'FindColors' ) ) | ( ( 'Measure' ) ) | ( ( 'Park' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:211:1: ( ( ( 'FindColors' ) ) | ( ( 'Measure' ) ) | ( ( 'Park' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:212:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:212:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:213:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:214:3: ( 'FindColors' )
                    // InternalRoverDSL.g:214:4: 'FindColors'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:218:2: ( ( 'Measure' ) )
                    {
                    // InternalRoverDSL.g:218:2: ( ( 'Measure' ) )
                    // InternalRoverDSL.g:219:3: ( 'Measure' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getMeasureEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:220:3: ( 'Measure' )
                    // InternalRoverDSL.g:220:4: 'Measure'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getMeasureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:224:2: ( ( 'Park' ) )
                    {
                    // InternalRoverDSL.g:224:2: ( ( 'Park' ) )
                    // InternalRoverDSL.g:225:3: ( 'Park' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getParkEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:226:3: ( 'Park' )
                    // InternalRoverDSL.g:226:4: 'Park'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getParkEnumLiteralDeclaration_2()); 

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
    // InternalRoverDSL.g:234:1: rule__Colors__Alternatives : ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:238:1: ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:239:2: ( ( 'White' ) )
                    {
                    // InternalRoverDSL.g:239:2: ( ( 'White' ) )
                    // InternalRoverDSL.g:240:3: ( 'White' )
                    {
                     before(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:241:3: ( 'White' )
                    // InternalRoverDSL.g:241:4: 'White'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:245:2: ( ( 'Red' ) )
                    {
                    // InternalRoverDSL.g:245:2: ( ( 'Red' ) )
                    // InternalRoverDSL.g:246:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:247:3: ( 'Red' )
                    // InternalRoverDSL.g:247:4: 'Red'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:251:2: ( ( 'Blue' ) )
                    {
                    // InternalRoverDSL.g:251:2: ( ( 'Blue' ) )
                    // InternalRoverDSL.g:252:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:253:3: ( 'Blue' )
                    // InternalRoverDSL.g:253:4: 'Blue'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:257:2: ( ( 'Yellow' ) )
                    {
                    // InternalRoverDSL.g:257:2: ( ( 'Yellow' ) )
                    // InternalRoverDSL.g:258:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 
                    // InternalRoverDSL.g:259:3: ( 'Yellow' )
                    // InternalRoverDSL.g:259:4: 'Yellow'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:263:2: ( ( 'Black' ) )
                    {
                    // InternalRoverDSL.g:263:2: ( ( 'Black' ) )
                    // InternalRoverDSL.g:264:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 
                    // InternalRoverDSL.g:265:3: ( 'Black' )
                    // InternalRoverDSL.g:265:4: 'Black'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalRoverDSL.g:273:1: rule__Safety__Alternatives : ( ( ( 'On' ) ) | ( ( 'Off' ) ) );
    public final void rule__Safety__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:277:1: ( ( ( 'On' ) ) | ( ( 'Off' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:278:2: ( ( 'On' ) )
                    {
                    // InternalRoverDSL.g:278:2: ( ( 'On' ) )
                    // InternalRoverDSL.g:279:3: ( 'On' )
                    {
                     before(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:280:3: ( 'On' )
                    // InternalRoverDSL.g:280:4: 'On'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:284:2: ( ( 'Off' ) )
                    {
                    // InternalRoverDSL.g:284:2: ( ( 'Off' ) )
                    // InternalRoverDSL.g:285:3: ( 'Off' )
                    {
                     before(grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:286:3: ( 'Off' )
                    // InternalRoverDSL.g:286:4: 'Off'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalRoverDSL.g:294:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:298:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:299:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRoverDSL.g:306:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:310:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:311:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:311:1: ( 'Mission:' )
            // InternalRoverDSL.g:312:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRoverDSL.g:321:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:325:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:326:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:333:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:337:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:338:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:338:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:339:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:340:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:340:3: rule__Mission__MissiontypeAssignment_1
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
    // InternalRoverDSL.g:348:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:352:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:353:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalRoverDSL.g:360:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__Group_2__0 )? ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:364:1: ( ( ( rule__Mission__Group_2__0 )? ) )
            // InternalRoverDSL.g:365:1: ( ( rule__Mission__Group_2__0 )? )
            {
            // InternalRoverDSL.g:365:1: ( ( rule__Mission__Group_2__0 )? )
            // InternalRoverDSL.g:366:2: ( rule__Mission__Group_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_2()); 
            // InternalRoverDSL.g:367:2: ( rule__Mission__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:367:3: rule__Mission__Group_2__0
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
    // InternalRoverDSL.g:375:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:379:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:380:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:387:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )? ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:391:1: ( ( ( rule__Mission__Group_3__0 )? ) )
            // InternalRoverDSL.g:392:1: ( ( rule__Mission__Group_3__0 )? )
            {
            // InternalRoverDSL.g:392:1: ( ( rule__Mission__Group_3__0 )? )
            // InternalRoverDSL.g:393:2: ( rule__Mission__Group_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalRoverDSL.g:394:2: ( rule__Mission__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:394:3: rule__Mission__Group_3__0
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
    // InternalRoverDSL.g:402:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:406:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:407:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:414:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )? ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:418:1: ( ( ( rule__Mission__Group_4__0 )? ) )
            // InternalRoverDSL.g:419:1: ( ( rule__Mission__Group_4__0 )? )
            {
            // InternalRoverDSL.g:419:1: ( ( rule__Mission__Group_4__0 )? )
            // InternalRoverDSL.g:420:2: ( rule__Mission__Group_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalRoverDSL.g:421:2: ( rule__Mission__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:421:3: rule__Mission__Group_4__0
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
    // InternalRoverDSL.g:429:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:433:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:434:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:441:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:445:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalRoverDSL.g:446:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalRoverDSL.g:446:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalRoverDSL.g:447:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalRoverDSL.g:448:2: ( rule__Mission__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:448:3: rule__Mission__Group_5__0
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
    // InternalRoverDSL.g:456:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:460:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:461:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:468:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:472:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalRoverDSL.g:473:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalRoverDSL.g:473:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalRoverDSL.g:474:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalRoverDSL.g:475:2: ( rule__Mission__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:475:3: rule__Mission__Group_6__0
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
    // InternalRoverDSL.g:483:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:487:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:488:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:495:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )? ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:499:1: ( ( ( rule__Mission__Group_7__0 )? ) )
            // InternalRoverDSL.g:500:1: ( ( rule__Mission__Group_7__0 )? )
            {
            // InternalRoverDSL.g:500:1: ( ( rule__Mission__Group_7__0 )? )
            // InternalRoverDSL.g:501:2: ( rule__Mission__Group_7__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalRoverDSL.g:502:2: ( rule__Mission__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:502:3: rule__Mission__Group_7__0
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
    // InternalRoverDSL.g:510:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:514:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:515:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
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
    // InternalRoverDSL.g:522:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__Group_8__0 )? ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:526:1: ( ( ( rule__Mission__Group_8__0 )? ) )
            // InternalRoverDSL.g:527:1: ( ( rule__Mission__Group_8__0 )? )
            {
            // InternalRoverDSL.g:527:1: ( ( rule__Mission__Group_8__0 )? )
            // InternalRoverDSL.g:528:2: ( rule__Mission__Group_8__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_8()); 
            // InternalRoverDSL.g:529:2: ( rule__Mission__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:529:3: rule__Mission__Group_8__0
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
    // InternalRoverDSL.g:537:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:541:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:542:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:549:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__Group_9__0 )? ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:553:1: ( ( ( rule__Mission__Group_9__0 )? ) )
            // InternalRoverDSL.g:554:1: ( ( rule__Mission__Group_9__0 )? )
            {
            // InternalRoverDSL.g:554:1: ( ( rule__Mission__Group_9__0 )? )
            // InternalRoverDSL.g:555:2: ( rule__Mission__Group_9__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_9()); 
            // InternalRoverDSL.g:556:2: ( rule__Mission__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:556:3: rule__Mission__Group_9__0
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
    // InternalRoverDSL.g:564:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:568:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:569:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
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
    // InternalRoverDSL.g:576:1: rule__Mission__Group__10__Impl : ( ( rule__Mission__Group_10__0 )? ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:580:1: ( ( ( rule__Mission__Group_10__0 )? ) )
            // InternalRoverDSL.g:581:1: ( ( rule__Mission__Group_10__0 )? )
            {
            // InternalRoverDSL.g:581:1: ( ( rule__Mission__Group_10__0 )? )
            // InternalRoverDSL.g:582:2: ( rule__Mission__Group_10__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_10()); 
            // InternalRoverDSL.g:583:2: ( rule__Mission__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:583:3: rule__Mission__Group_10__0
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
    // InternalRoverDSL.g:591:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:595:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:596:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
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
    // InternalRoverDSL.g:603:1: rule__Mission__Group__11__Impl : ( ( rule__Mission__Group_11__0 )? ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:607:1: ( ( ( rule__Mission__Group_11__0 )? ) )
            // InternalRoverDSL.g:608:1: ( ( rule__Mission__Group_11__0 )? )
            {
            // InternalRoverDSL.g:608:1: ( ( rule__Mission__Group_11__0 )? )
            // InternalRoverDSL.g:609:2: ( rule__Mission__Group_11__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_11()); 
            // InternalRoverDSL.g:610:2: ( rule__Mission__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverDSL.g:610:3: rule__Mission__Group_11__0
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
    // InternalRoverDSL.g:618:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:622:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:623:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
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
    // InternalRoverDSL.g:630:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__Group_12__0 )? ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:634:1: ( ( ( rule__Mission__Group_12__0 )? ) )
            // InternalRoverDSL.g:635:1: ( ( rule__Mission__Group_12__0 )? )
            {
            // InternalRoverDSL.g:635:1: ( ( rule__Mission__Group_12__0 )? )
            // InternalRoverDSL.g:636:2: ( rule__Mission__Group_12__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_12()); 
            // InternalRoverDSL.g:637:2: ( rule__Mission__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoverDSL.g:637:3: rule__Mission__Group_12__0
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
    // InternalRoverDSL.g:645:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl rule__Mission__Group__14 ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:649:1: ( rule__Mission__Group__13__Impl rule__Mission__Group__14 )
            // InternalRoverDSL.g:650:2: rule__Mission__Group__13__Impl rule__Mission__Group__14
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoverDSL.g:657:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__Group_13__0 )? ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:661:1: ( ( ( rule__Mission__Group_13__0 )? ) )
            // InternalRoverDSL.g:662:1: ( ( rule__Mission__Group_13__0 )? )
            {
            // InternalRoverDSL.g:662:1: ( ( rule__Mission__Group_13__0 )? )
            // InternalRoverDSL.g:663:2: ( rule__Mission__Group_13__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_13()); 
            // InternalRoverDSL.g:664:2: ( rule__Mission__Group_13__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoverDSL.g:664:3: rule__Mission__Group_13__0
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
    // InternalRoverDSL.g:672:1: rule__Mission__Group__14 : rule__Mission__Group__14__Impl rule__Mission__Group__15 ;
    public final void rule__Mission__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:676:1: ( rule__Mission__Group__14__Impl rule__Mission__Group__15 )
            // InternalRoverDSL.g:677:2: rule__Mission__Group__14__Impl rule__Mission__Group__15
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
    // InternalRoverDSL.g:684:1: rule__Mission__Group__14__Impl : ( ( rule__Mission__Group_14__0 )? ) ;
    public final void rule__Mission__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:688:1: ( ( ( rule__Mission__Group_14__0 )? ) )
            // InternalRoverDSL.g:689:1: ( ( rule__Mission__Group_14__0 )? )
            {
            // InternalRoverDSL.g:689:1: ( ( rule__Mission__Group_14__0 )? )
            // InternalRoverDSL.g:690:2: ( rule__Mission__Group_14__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_14()); 
            // InternalRoverDSL.g:691:2: ( rule__Mission__Group_14__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRoverDSL.g:691:3: rule__Mission__Group_14__0
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


    // $ANTLR start "rule__Mission__Group__15"
    // InternalRoverDSL.g:699:1: rule__Mission__Group__15 : rule__Mission__Group__15__Impl ;
    public final void rule__Mission__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:703:1: ( rule__Mission__Group__15__Impl )
            // InternalRoverDSL.g:704:2: rule__Mission__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__15__Impl();

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
    // InternalRoverDSL.g:710:1: rule__Mission__Group__15__Impl : ( 'End' ) ;
    public final void rule__Mission__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:714:1: ( ( 'End' ) )
            // InternalRoverDSL.g:715:1: ( 'End' )
            {
            // InternalRoverDSL.g:715:1: ( 'End' )
            // InternalRoverDSL.g:716:2: 'End'
            {
             before(grammarAccess.getMissionAccess().getEndKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEndKeyword_15()); 

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


    // $ANTLR start "rule__Mission__Group_2__0"
    // InternalRoverDSL.g:726:1: rule__Mission__Group_2__0 : rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 ;
    public final void rule__Mission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:730:1: ( rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 )
            // InternalRoverDSL.g:731:2: rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRoverDSL.g:738:1: rule__Mission__Group_2__0__Impl : ( 'BeginSentence:' ) ;
    public final void rule__Mission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:742:1: ( ( 'BeginSentence:' ) )
            // InternalRoverDSL.g:743:1: ( 'BeginSentence:' )
            {
            // InternalRoverDSL.g:743:1: ( 'BeginSentence:' )
            // InternalRoverDSL.g:744:2: 'BeginSentence:'
            {
             before(grammarAccess.getMissionAccess().getBeginSentenceKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginSentenceKeyword_2_0()); 

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
    // InternalRoverDSL.g:753:1: rule__Mission__Group_2__1 : rule__Mission__Group_2__1__Impl ;
    public final void rule__Mission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:757:1: ( rule__Mission__Group_2__1__Impl )
            // InternalRoverDSL.g:758:2: rule__Mission__Group_2__1__Impl
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
    // InternalRoverDSL.g:764:1: rule__Mission__Group_2__1__Impl : ( ( rule__Mission__BeginsentenceAssignment_2_1 ) ) ;
    public final void rule__Mission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:768:1: ( ( ( rule__Mission__BeginsentenceAssignment_2_1 ) ) )
            // InternalRoverDSL.g:769:1: ( ( rule__Mission__BeginsentenceAssignment_2_1 ) )
            {
            // InternalRoverDSL.g:769:1: ( ( rule__Mission__BeginsentenceAssignment_2_1 ) )
            // InternalRoverDSL.g:770:2: ( rule__Mission__BeginsentenceAssignment_2_1 )
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_2_1()); 
            // InternalRoverDSL.g:771:2: ( rule__Mission__BeginsentenceAssignment_2_1 )
            // InternalRoverDSL.g:771:3: rule__Mission__BeginsentenceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BeginsentenceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBeginsentenceAssignment_2_1()); 

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
    // InternalRoverDSL.g:780:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:784:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalRoverDSL.g:785:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRoverDSL.g:792:1: rule__Mission__Group_3__0__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:796:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:797:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:797:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:798:2: 'FinalSentence:'
            {
             before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalSentenceKeyword_3_0()); 

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
    // InternalRoverDSL.g:807:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:811:1: ( rule__Mission__Group_3__1__Impl )
            // InternalRoverDSL.g:812:2: rule__Mission__Group_3__1__Impl
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
    // InternalRoverDSL.g:818:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__FinalsentenceAssignment_3_1 ) ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:822:1: ( ( ( rule__Mission__FinalsentenceAssignment_3_1 ) ) )
            // InternalRoverDSL.g:823:1: ( ( rule__Mission__FinalsentenceAssignment_3_1 ) )
            {
            // InternalRoverDSL.g:823:1: ( ( rule__Mission__FinalsentenceAssignment_3_1 ) )
            // InternalRoverDSL.g:824:2: ( rule__Mission__FinalsentenceAssignment_3_1 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_3_1()); 
            // InternalRoverDSL.g:825:2: ( rule__Mission__FinalsentenceAssignment_3_1 )
            // InternalRoverDSL.g:825:3: rule__Mission__FinalsentenceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__FinalsentenceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getFinalsentenceAssignment_3_1()); 

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
    // InternalRoverDSL.g:834:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:838:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalRoverDSL.g:839:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRoverDSL.g:846:1: rule__Mission__Group_4__0__Impl : ( 'ForwardSpeed:' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:850:1: ( ( 'ForwardSpeed:' ) )
            // InternalRoverDSL.g:851:1: ( 'ForwardSpeed:' )
            {
            // InternalRoverDSL.g:851:1: ( 'ForwardSpeed:' )
            // InternalRoverDSL.g:852:2: 'ForwardSpeed:'
            {
             before(grammarAccess.getMissionAccess().getForwardSpeedKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardSpeedKeyword_4_0()); 

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
    // InternalRoverDSL.g:861:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:865:1: ( rule__Mission__Group_4__1__Impl )
            // InternalRoverDSL.g:866:2: rule__Mission__Group_4__1__Impl
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
    // InternalRoverDSL.g:872:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__ForwardspeedAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:876:1: ( ( ( rule__Mission__ForwardspeedAssignment_4_1 ) ) )
            // InternalRoverDSL.g:877:1: ( ( rule__Mission__ForwardspeedAssignment_4_1 ) )
            {
            // InternalRoverDSL.g:877:1: ( ( rule__Mission__ForwardspeedAssignment_4_1 ) )
            // InternalRoverDSL.g:878:2: ( rule__Mission__ForwardspeedAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_4_1()); 
            // InternalRoverDSL.g:879:2: ( rule__Mission__ForwardspeedAssignment_4_1 )
            // InternalRoverDSL.g:879:3: rule__Mission__ForwardspeedAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ForwardspeedAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getForwardspeedAssignment_4_1()); 

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
    // InternalRoverDSL.g:888:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:892:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalRoverDSL.g:893:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
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
    // InternalRoverDSL.g:900:1: rule__Mission__Group_5__0__Impl : ( 'ReverseSpeed:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:904:1: ( ( 'ReverseSpeed:' ) )
            // InternalRoverDSL.g:905:1: ( 'ReverseSpeed:' )
            {
            // InternalRoverDSL.g:905:1: ( 'ReverseSpeed:' )
            // InternalRoverDSL.g:906:2: 'ReverseSpeed:'
            {
             before(grammarAccess.getMissionAccess().getReverseSpeedKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReverseSpeedKeyword_5_0()); 

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
    // InternalRoverDSL.g:915:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:919:1: ( rule__Mission__Group_5__1__Impl )
            // InternalRoverDSL.g:920:2: rule__Mission__Group_5__1__Impl
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
    // InternalRoverDSL.g:926:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__ReversespeedAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:930:1: ( ( ( rule__Mission__ReversespeedAssignment_5_1 ) ) )
            // InternalRoverDSL.g:931:1: ( ( rule__Mission__ReversespeedAssignment_5_1 ) )
            {
            // InternalRoverDSL.g:931:1: ( ( rule__Mission__ReversespeedAssignment_5_1 ) )
            // InternalRoverDSL.g:932:2: ( rule__Mission__ReversespeedAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_5_1()); 
            // InternalRoverDSL.g:933:2: ( rule__Mission__ReversespeedAssignment_5_1 )
            // InternalRoverDSL.g:933:3: rule__Mission__ReversespeedAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ReversespeedAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getReversespeedAssignment_5_1()); 

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
    // InternalRoverDSL.g:942:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:946:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalRoverDSL.g:947:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
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
    // InternalRoverDSL.g:954:1: rule__Mission__Group_6__0__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:958:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:959:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:959:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:960:2: 'TurnDirection:'
            {
             before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_6_0()); 

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
    // InternalRoverDSL.g:969:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:973:1: ( rule__Mission__Group_6__1__Impl )
            // InternalRoverDSL.g:974:2: rule__Mission__Group_6__1__Impl
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
    // InternalRoverDSL.g:980:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__TurndirectionAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:984:1: ( ( ( rule__Mission__TurndirectionAssignment_6_1 ) ) )
            // InternalRoverDSL.g:985:1: ( ( rule__Mission__TurndirectionAssignment_6_1 ) )
            {
            // InternalRoverDSL.g:985:1: ( ( rule__Mission__TurndirectionAssignment_6_1 ) )
            // InternalRoverDSL.g:986:2: ( rule__Mission__TurndirectionAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_6_1()); 
            // InternalRoverDSL.g:987:2: ( rule__Mission__TurndirectionAssignment_6_1 )
            // InternalRoverDSL.g:987:3: rule__Mission__TurndirectionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TurndirectionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTurndirectionAssignment_6_1()); 

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
    // InternalRoverDSL.g:996:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1000:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalRoverDSL.g:1001:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:1008:1: rule__Mission__Group_7__0__Impl : ( 'Safety:' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1012:1: ( ( 'Safety:' ) )
            // InternalRoverDSL.g:1013:1: ( 'Safety:' )
            {
            // InternalRoverDSL.g:1013:1: ( 'Safety:' )
            // InternalRoverDSL.g:1014:2: 'Safety:'
            {
             before(grammarAccess.getMissionAccess().getSafetyKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getSafetyKeyword_7_0()); 

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
    // InternalRoverDSL.g:1023:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1027:1: ( rule__Mission__Group_7__1__Impl )
            // InternalRoverDSL.g:1028:2: rule__Mission__Group_7__1__Impl
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
    // InternalRoverDSL.g:1034:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__SafetypropertyAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1038:1: ( ( ( rule__Mission__SafetypropertyAssignment_7_1 ) ) )
            // InternalRoverDSL.g:1039:1: ( ( rule__Mission__SafetypropertyAssignment_7_1 ) )
            {
            // InternalRoverDSL.g:1039:1: ( ( rule__Mission__SafetypropertyAssignment_7_1 ) )
            // InternalRoverDSL.g:1040:2: ( rule__Mission__SafetypropertyAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_7_1()); 
            // InternalRoverDSL.g:1041:2: ( rule__Mission__SafetypropertyAssignment_7_1 )
            // InternalRoverDSL.g:1041:3: rule__Mission__SafetypropertyAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__SafetypropertyAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getSafetypropertyAssignment_7_1()); 

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
    // InternalRoverDSL.g:1050:1: rule__Mission__Group_8__0 : rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 ;
    public final void rule__Mission__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1054:1: ( rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 )
            // InternalRoverDSL.g:1055:2: rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRoverDSL.g:1062:1: rule__Mission__Group_8__0__Impl : ( 'AvoidObjects:' ) ;
    public final void rule__Mission__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1066:1: ( ( 'AvoidObjects:' ) )
            // InternalRoverDSL.g:1067:1: ( 'AvoidObjects:' )
            {
            // InternalRoverDSL.g:1067:1: ( 'AvoidObjects:' )
            // InternalRoverDSL.g:1068:2: 'AvoidObjects:'
            {
             before(grammarAccess.getMissionAccess().getAvoidObjectsKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getAvoidObjectsKeyword_8_0()); 

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
    // InternalRoverDSL.g:1077:1: rule__Mission__Group_8__1 : rule__Mission__Group_8__1__Impl ;
    public final void rule__Mission__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1081:1: ( rule__Mission__Group_8__1__Impl )
            // InternalRoverDSL.g:1082:2: rule__Mission__Group_8__1__Impl
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
    // InternalRoverDSL.g:1088:1: rule__Mission__Group_8__1__Impl : ( ( rule__Mission__ObjectdistanceAssignment_8_1 ) ) ;
    public final void rule__Mission__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1092:1: ( ( ( rule__Mission__ObjectdistanceAssignment_8_1 ) ) )
            // InternalRoverDSL.g:1093:1: ( ( rule__Mission__ObjectdistanceAssignment_8_1 ) )
            {
            // InternalRoverDSL.g:1093:1: ( ( rule__Mission__ObjectdistanceAssignment_8_1 ) )
            // InternalRoverDSL.g:1094:2: ( rule__Mission__ObjectdistanceAssignment_8_1 )
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceAssignment_8_1()); 
            // InternalRoverDSL.g:1095:2: ( rule__Mission__ObjectdistanceAssignment_8_1 )
            // InternalRoverDSL.g:1095:3: rule__Mission__ObjectdistanceAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ObjectdistanceAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getObjectdistanceAssignment_8_1()); 

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
    // InternalRoverDSL.g:1104:1: rule__Mission__Group_9__0 : rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 ;
    public final void rule__Mission__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1108:1: ( rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 )
            // InternalRoverDSL.g:1109:2: rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRoverDSL.g:1116:1: rule__Mission__Group_9__0__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1120:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:1121:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:1121:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:1122:2: 'OuterBorder:'
            {
             before(grammarAccess.getMissionAccess().getOuterBorderKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getOuterBorderKeyword_9_0()); 

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
    // InternalRoverDSL.g:1131:1: rule__Mission__Group_9__1 : rule__Mission__Group_9__1__Impl ;
    public final void rule__Mission__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1135:1: ( rule__Mission__Group_9__1__Impl )
            // InternalRoverDSL.g:1136:2: rule__Mission__Group_9__1__Impl
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
    // InternalRoverDSL.g:1142:1: rule__Mission__Group_9__1__Impl : ( ( rule__Mission__BordercolorAssignment_9_1 ) ) ;
    public final void rule__Mission__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1146:1: ( ( ( rule__Mission__BordercolorAssignment_9_1 ) ) )
            // InternalRoverDSL.g:1147:1: ( ( rule__Mission__BordercolorAssignment_9_1 ) )
            {
            // InternalRoverDSL.g:1147:1: ( ( rule__Mission__BordercolorAssignment_9_1 ) )
            // InternalRoverDSL.g:1148:2: ( rule__Mission__BordercolorAssignment_9_1 )
            {
             before(grammarAccess.getMissionAccess().getBordercolorAssignment_9_1()); 
            // InternalRoverDSL.g:1149:2: ( rule__Mission__BordercolorAssignment_9_1 )
            // InternalRoverDSL.g:1149:3: rule__Mission__BordercolorAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BordercolorAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBordercolorAssignment_9_1()); 

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
    // InternalRoverDSL.g:1158:1: rule__Mission__Group_10__0 : rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 ;
    public final void rule__Mission__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1162:1: ( rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 )
            // InternalRoverDSL.g:1163:2: rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRoverDSL.g:1170:1: rule__Mission__Group_10__0__Impl : ( 'LakeColors:' ) ;
    public final void rule__Mission__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1174:1: ( ( 'LakeColors:' ) )
            // InternalRoverDSL.g:1175:1: ( 'LakeColors:' )
            {
            // InternalRoverDSL.g:1175:1: ( 'LakeColors:' )
            // InternalRoverDSL.g:1176:2: 'LakeColors:'
            {
             before(grammarAccess.getMissionAccess().getLakeColorsKeyword_10_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLakeColorsKeyword_10_0()); 

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
    // InternalRoverDSL.g:1185:1: rule__Mission__Group_10__1 : rule__Mission__Group_10__1__Impl ;
    public final void rule__Mission__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1189:1: ( rule__Mission__Group_10__1__Impl )
            // InternalRoverDSL.g:1190:2: rule__Mission__Group_10__1__Impl
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
    // InternalRoverDSL.g:1196:1: rule__Mission__Group_10__1__Impl : ( ( rule__Mission__LakelistAssignment_10_1 )* ) ;
    public final void rule__Mission__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1200:1: ( ( ( rule__Mission__LakelistAssignment_10_1 )* ) )
            // InternalRoverDSL.g:1201:1: ( ( rule__Mission__LakelistAssignment_10_1 )* )
            {
            // InternalRoverDSL.g:1201:1: ( ( rule__Mission__LakelistAssignment_10_1 )* )
            // InternalRoverDSL.g:1202:2: ( rule__Mission__LakelistAssignment_10_1 )*
            {
             before(grammarAccess.getMissionAccess().getLakelistAssignment_10_1()); 
            // InternalRoverDSL.g:1203:2: ( rule__Mission__LakelistAssignment_10_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=14 && LA18_0<=18)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRoverDSL.g:1203:3: rule__Mission__LakelistAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mission__LakelistAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getLakelistAssignment_10_1()); 

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
    // InternalRoverDSL.g:1212:1: rule__Mission__Group_11__0 : rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1 ;
    public final void rule__Mission__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1216:1: ( rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1 )
            // InternalRoverDSL.g:1217:2: rule__Mission__Group_11__0__Impl rule__Mission__Group_11__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRoverDSL.g:1224:1: rule__Mission__Group_11__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1228:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:1229:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:1229:1: ( 'Colors:' )
            // InternalRoverDSL.g:1230:2: 'Colors:'
            {
             before(grammarAccess.getMissionAccess().getColorsKeyword_11_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColorsKeyword_11_0()); 

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
    // InternalRoverDSL.g:1239:1: rule__Mission__Group_11__1 : rule__Mission__Group_11__1__Impl ;
    public final void rule__Mission__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1243:1: ( rule__Mission__Group_11__1__Impl )
            // InternalRoverDSL.g:1244:2: rule__Mission__Group_11__1__Impl
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
    // InternalRoverDSL.g:1250:1: rule__Mission__Group_11__1__Impl : ( ( rule__Mission__ColorlistAssignment_11_1 )* ) ;
    public final void rule__Mission__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1254:1: ( ( ( rule__Mission__ColorlistAssignment_11_1 )* ) )
            // InternalRoverDSL.g:1255:1: ( ( rule__Mission__ColorlistAssignment_11_1 )* )
            {
            // InternalRoverDSL.g:1255:1: ( ( rule__Mission__ColorlistAssignment_11_1 )* )
            // InternalRoverDSL.g:1256:2: ( rule__Mission__ColorlistAssignment_11_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_11_1()); 
            // InternalRoverDSL.g:1257:2: ( rule__Mission__ColorlistAssignment_11_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=14 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRoverDSL.g:1257:3: rule__Mission__ColorlistAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mission__ColorlistAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getColorlistAssignment_11_1()); 

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


    // $ANTLR start "rule__Mission__Group_12__0"
    // InternalRoverDSL.g:1266:1: rule__Mission__Group_12__0 : rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 ;
    public final void rule__Mission__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1270:1: ( rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 )
            // InternalRoverDSL.g:1271:2: rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRoverDSL.g:1278:1: rule__Mission__Group_12__0__Impl : ( 'MeasurementColors:' ) ;
    public final void rule__Mission__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1282:1: ( ( 'MeasurementColors:' ) )
            // InternalRoverDSL.g:1283:1: ( 'MeasurementColors:' )
            {
            // InternalRoverDSL.g:1283:1: ( 'MeasurementColors:' )
            // InternalRoverDSL.g:1284:2: 'MeasurementColors:'
            {
             before(grammarAccess.getMissionAccess().getMeasurementColorsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMeasurementColorsKeyword_12_0()); 

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
    // InternalRoverDSL.g:1293:1: rule__Mission__Group_12__1 : rule__Mission__Group_12__1__Impl ;
    public final void rule__Mission__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1297:1: ( rule__Mission__Group_12__1__Impl )
            // InternalRoverDSL.g:1298:2: rule__Mission__Group_12__1__Impl
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
    // InternalRoverDSL.g:1304:1: rule__Mission__Group_12__1__Impl : ( ( rule__Mission__MeasurelistAssignment_12_1 )* ) ;
    public final void rule__Mission__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1308:1: ( ( ( rule__Mission__MeasurelistAssignment_12_1 )* ) )
            // InternalRoverDSL.g:1309:1: ( ( rule__Mission__MeasurelistAssignment_12_1 )* )
            {
            // InternalRoverDSL.g:1309:1: ( ( rule__Mission__MeasurelistAssignment_12_1 )* )
            // InternalRoverDSL.g:1310:2: ( rule__Mission__MeasurelistAssignment_12_1 )*
            {
             before(grammarAccess.getMissionAccess().getMeasurelistAssignment_12_1()); 
            // InternalRoverDSL.g:1311:2: ( rule__Mission__MeasurelistAssignment_12_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=14 && LA20_0<=18)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRoverDSL.g:1311:3: rule__Mission__MeasurelistAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mission__MeasurelistAssignment_12_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getMeasurelistAssignment_12_1()); 

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
    // InternalRoverDSL.g:1320:1: rule__Mission__Group_13__0 : rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 ;
    public final void rule__Mission__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1324:1: ( rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 )
            // InternalRoverDSL.g:1325:2: rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRoverDSL.g:1332:1: rule__Mission__Group_13__0__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1336:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:1337:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:1337:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:1338:2: 'FlashingColor:'
            {
             before(grammarAccess.getMissionAccess().getFlashingColorKeyword_13_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRoverDSL.g:1347:1: rule__Mission__Group_13__1 : rule__Mission__Group_13__1__Impl ;
    public final void rule__Mission__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1351:1: ( rule__Mission__Group_13__1__Impl )
            // InternalRoverDSL.g:1352:2: rule__Mission__Group_13__1__Impl
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
    // InternalRoverDSL.g:1358:1: rule__Mission__Group_13__1__Impl : ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) ;
    public final void rule__Mission__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1362:1: ( ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) )
            // InternalRoverDSL.g:1363:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            {
            // InternalRoverDSL.g:1363:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            // InternalRoverDSL.g:1364:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_13_1()); 
            // InternalRoverDSL.g:1365:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            // InternalRoverDSL.g:1365:3: rule__Mission__FlashingcolorAssignment_13_1
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
    // InternalRoverDSL.g:1374:1: rule__Mission__Group_14__0 : rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 ;
    public final void rule__Mission__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1378:1: ( rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 )
            // InternalRoverDSL.g:1379:2: rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRoverDSL.g:1386:1: rule__Mission__Group_14__0__Impl : ( 'Timeout:' ) ;
    public final void rule__Mission__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1390:1: ( ( 'Timeout:' ) )
            // InternalRoverDSL.g:1391:1: ( 'Timeout:' )
            {
            // InternalRoverDSL.g:1391:1: ( 'Timeout:' )
            // InternalRoverDSL.g:1392:2: 'Timeout:'
            {
             before(grammarAccess.getMissionAccess().getTimeoutKeyword_14_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTimeoutKeyword_14_0()); 

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
    // InternalRoverDSL.g:1401:1: rule__Mission__Group_14__1 : rule__Mission__Group_14__1__Impl ;
    public final void rule__Mission__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1405:1: ( rule__Mission__Group_14__1__Impl )
            // InternalRoverDSL.g:1406:2: rule__Mission__Group_14__1__Impl
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
    // InternalRoverDSL.g:1412:1: rule__Mission__Group_14__1__Impl : ( ( rule__Mission__TimeoutAssignment_14_1 ) ) ;
    public final void rule__Mission__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1416:1: ( ( ( rule__Mission__TimeoutAssignment_14_1 ) ) )
            // InternalRoverDSL.g:1417:1: ( ( rule__Mission__TimeoutAssignment_14_1 ) )
            {
            // InternalRoverDSL.g:1417:1: ( ( rule__Mission__TimeoutAssignment_14_1 ) )
            // InternalRoverDSL.g:1418:2: ( rule__Mission__TimeoutAssignment_14_1 )
            {
             before(grammarAccess.getMissionAccess().getTimeoutAssignment_14_1()); 
            // InternalRoverDSL.g:1419:2: ( rule__Mission__TimeoutAssignment_14_1 )
            // InternalRoverDSL.g:1419:3: rule__Mission__TimeoutAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TimeoutAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTimeoutAssignment_14_1()); 

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


    // $ANTLR start "rule__Tasks__MissionlistAssignment"
    // InternalRoverDSL.g:1428:1: rule__Tasks__MissionlistAssignment : ( ruleMission ) ;
    public final void rule__Tasks__MissionlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1432:1: ( ( ruleMission ) )
            // InternalRoverDSL.g:1433:2: ( ruleMission )
            {
            // InternalRoverDSL.g:1433:2: ( ruleMission )
            // InternalRoverDSL.g:1434:3: ruleMission
            {
             before(grammarAccess.getTasksAccess().getMissionlistMissionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getTasksAccess().getMissionlistMissionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Tasks__MissionlistAssignment"


    // $ANTLR start "rule__Mission__MissiontypeAssignment_1"
    // InternalRoverDSL.g:1443:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1447:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:1448:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:1448:2: ( ruleMissionType )
            // InternalRoverDSL.g:1449:3: ruleMissionType
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


    // $ANTLR start "rule__Mission__BeginsentenceAssignment_2_1"
    // InternalRoverDSL.g:1458:1: rule__Mission__BeginsentenceAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BeginsentenceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1462:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1463:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1463:2: ( RULE_STRING )
            // InternalRoverDSL.g:1464:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Mission__BeginsentenceAssignment_2_1"


    // $ANTLR start "rule__Mission__FinalsentenceAssignment_3_1"
    // InternalRoverDSL.g:1473:1: rule__Mission__FinalsentenceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1477:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1478:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1478:2: ( RULE_STRING )
            // InternalRoverDSL.g:1479:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Mission__FinalsentenceAssignment_3_1"


    // $ANTLR start "rule__Mission__ForwardspeedAssignment_4_1"
    // InternalRoverDSL.g:1488:1: rule__Mission__ForwardspeedAssignment_4_1 : ( ruleInteger ) ;
    public final void rule__Mission__ForwardspeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1492:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1493:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1493:2: ( ruleInteger )
            // InternalRoverDSL.g:1494:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getForwardspeedIntegerParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Mission__ForwardspeedAssignment_4_1"


    // $ANTLR start "rule__Mission__ReversespeedAssignment_5_1"
    // InternalRoverDSL.g:1503:1: rule__Mission__ReversespeedAssignment_5_1 : ( ruleInteger ) ;
    public final void rule__Mission__ReversespeedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1507:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1508:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1508:2: ( ruleInteger )
            // InternalRoverDSL.g:1509:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getReversespeedIntegerParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Mission__ReversespeedAssignment_5_1"


    // $ANTLR start "rule__Mission__TurndirectionAssignment_6_1"
    // InternalRoverDSL.g:1518:1: rule__Mission__TurndirectionAssignment_6_1 : ( ruleInteger ) ;
    public final void rule__Mission__TurndirectionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1522:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1523:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1523:2: ( ruleInteger )
            // InternalRoverDSL.g:1524:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTurndirectionIntegerParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Mission__TurndirectionAssignment_6_1"


    // $ANTLR start "rule__Mission__SafetypropertyAssignment_7_1"
    // InternalRoverDSL.g:1533:1: rule__Mission__SafetypropertyAssignment_7_1 : ( ruleSafety ) ;
    public final void rule__Mission__SafetypropertyAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1537:1: ( ( ruleSafety ) )
            // InternalRoverDSL.g:1538:2: ( ruleSafety )
            {
            // InternalRoverDSL.g:1538:2: ( ruleSafety )
            // InternalRoverDSL.g:1539:3: ruleSafety
            {
             before(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafety();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getSafetypropertySafetyEnumRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Mission__SafetypropertyAssignment_7_1"


    // $ANTLR start "rule__Mission__ObjectdistanceAssignment_8_1"
    // InternalRoverDSL.g:1548:1: rule__Mission__ObjectdistanceAssignment_8_1 : ( ruleInteger ) ;
    public final void rule__Mission__ObjectdistanceAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1552:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1553:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1553:2: ( ruleInteger )
            // InternalRoverDSL.g:1554:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getObjectdistanceIntegerParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Mission__ObjectdistanceAssignment_8_1"


    // $ANTLR start "rule__Mission__BordercolorAssignment_9_1"
    // InternalRoverDSL.g:1563:1: rule__Mission__BordercolorAssignment_9_1 : ( ruleColor ) ;
    public final void rule__Mission__BordercolorAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1567:1: ( ( ruleColor ) )
            // InternalRoverDSL.g:1568:2: ( ruleColor )
            {
            // InternalRoverDSL.g:1568:2: ( ruleColor )
            // InternalRoverDSL.g:1569:3: ruleColor
            {
             before(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBordercolorColorParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Mission__BordercolorAssignment_9_1"


    // $ANTLR start "rule__Mission__LakelistAssignment_10_1"
    // InternalRoverDSL.g:1578:1: rule__Mission__LakelistAssignment_10_1 : ( ruleColors ) ;
    public final void rule__Mission__LakelistAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1582:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1583:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1583:2: ( ruleColors )
            // InternalRoverDSL.g:1584:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getLakelistColorsEnumRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Mission__LakelistAssignment_10_1"


    // $ANTLR start "rule__Mission__ColorlistAssignment_11_1"
    // InternalRoverDSL.g:1593:1: rule__Mission__ColorlistAssignment_11_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1597:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1598:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1598:2: ( ruleColors )
            // InternalRoverDSL.g:1599:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Mission__ColorlistAssignment_11_1"


    // $ANTLR start "rule__Mission__MeasurelistAssignment_12_1"
    // InternalRoverDSL.g:1608:1: rule__Mission__MeasurelistAssignment_12_1 : ( ruleColors ) ;
    public final void rule__Mission__MeasurelistAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1612:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1613:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1613:2: ( ruleColors )
            // InternalRoverDSL.g:1614:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getMeasurelistColorsEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getMeasurelistColorsEnumRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Mission__MeasurelistAssignment_12_1"


    // $ANTLR start "rule__Mission__FlashingcolorAssignment_13_1"
    // InternalRoverDSL.g:1623:1: rule__Mission__FlashingcolorAssignment_13_1 : ( ruleColor ) ;
    public final void rule__Mission__FlashingcolorAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1627:1: ( ( ruleColor ) )
            // InternalRoverDSL.g:1628:2: ( ruleColor )
            {
            // InternalRoverDSL.g:1628:2: ( ruleColor )
            // InternalRoverDSL.g:1629:3: ruleColor
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


    // $ANTLR start "rule__Mission__TimeoutAssignment_14_1"
    // InternalRoverDSL.g:1638:1: rule__Mission__TimeoutAssignment_14_1 : ( ruleInteger ) ;
    public final void rule__Mission__TimeoutAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1642:1: ( ( ruleInteger ) )
            // InternalRoverDSL.g:1643:2: ( ruleInteger )
            {
            // InternalRoverDSL.g:1643:2: ( ruleInteger )
            // InternalRoverDSL.g:1644:3: ruleInteger
            {
             before(grammarAccess.getMissionAccess().getTimeoutIntegerParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTimeoutIntegerParserRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Mission__TimeoutAssignment_14_1"


    // $ANTLR start "rule__Integer__IntegerAssignment"
    // InternalRoverDSL.g:1653:1: rule__Integer__IntegerAssignment : ( RULE_INT ) ;
    public final void rule__Integer__IntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1657:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1658:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1658:2: ( RULE_INT )
            // InternalRoverDSL.g:1659:3: RULE_INT
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
    // InternalRoverDSL.g:1668:1: rule__Color__ColorAssignment : ( ruleColors ) ;
    public final void rule__Color__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1672:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1673:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1673:2: ( ruleColors )
            // InternalRoverDSL.g:1674:3: ruleColors
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FFFC00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007C002L});

}