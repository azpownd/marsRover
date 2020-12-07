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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AvoidColors'", "'FindColors'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'Orange'", "'On'", "'Off'", "'Mission:'", "'End:'", "'Safety:'", "'LakeColors:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'FlashingColor:'", "'FinalSentence:'"
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


    // $ANTLR start "ruleMissionType"
    // InternalRoverDSL.g:78:1: ruleMissionType : ( ( rule__MissionType__Alternatives ) ) ;
    public final void ruleMissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:82:1: ( ( ( rule__MissionType__Alternatives ) ) )
            // InternalRoverDSL.g:83:2: ( ( rule__MissionType__Alternatives ) )
            {
            // InternalRoverDSL.g:83:2: ( ( rule__MissionType__Alternatives ) )
            // InternalRoverDSL.g:84:3: ( rule__MissionType__Alternatives )
            {
             before(grammarAccess.getMissionTypeAccess().getAlternatives()); 
            // InternalRoverDSL.g:85:3: ( rule__MissionType__Alternatives )
            // InternalRoverDSL.g:85:4: rule__MissionType__Alternatives
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
    // InternalRoverDSL.g:94:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:98:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalRoverDSL.g:99:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalRoverDSL.g:99:2: ( ( rule__Colors__Alternatives ) )
            // InternalRoverDSL.g:100:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalRoverDSL.g:101:3: ( rule__Colors__Alternatives )
            // InternalRoverDSL.g:101:4: rule__Colors__Alternatives
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
    // InternalRoverDSL.g:110:1: ruleSafety : ( ( rule__Safety__Alternatives ) ) ;
    public final void ruleSafety() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:114:1: ( ( ( rule__Safety__Alternatives ) ) )
            // InternalRoverDSL.g:115:2: ( ( rule__Safety__Alternatives ) )
            {
            // InternalRoverDSL.g:115:2: ( ( rule__Safety__Alternatives ) )
            // InternalRoverDSL.g:116:3: ( rule__Safety__Alternatives )
            {
             before(grammarAccess.getSafetyAccess().getAlternatives()); 
            // InternalRoverDSL.g:117:3: ( rule__Safety__Alternatives )
            // InternalRoverDSL.g:117:4: rule__Safety__Alternatives
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
    // InternalRoverDSL.g:125:1: rule__MissionType__Alternatives : ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:129:1: ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) )
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
                    // InternalRoverDSL.g:130:2: ( ( 'AvoidColors' ) )
                    {
                    // InternalRoverDSL.g:130:2: ( ( 'AvoidColors' ) )
                    // InternalRoverDSL.g:131:3: ( 'AvoidColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:132:3: ( 'AvoidColors' )
                    // InternalRoverDSL.g:132:4: 'AvoidColors'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:136:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:136:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:137:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:138:3: ( 'FindColors' )
                    // InternalRoverDSL.g:138:4: 'FindColors'
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
    // InternalRoverDSL.g:146:1: rule__Colors__Alternatives : ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) | ( ( 'Orange' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:150:1: ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) | ( ( 'Orange' ) ) )
            int alt2=6;
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
            case 18:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoverDSL.g:151:2: ( ( 'White' ) )
                    {
                    // InternalRoverDSL.g:151:2: ( ( 'White' ) )
                    // InternalRoverDSL.g:152:3: ( 'White' )
                    {
                     before(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:153:3: ( 'White' )
                    // InternalRoverDSL.g:153:4: 'White'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:157:2: ( ( 'Red' ) )
                    {
                    // InternalRoverDSL.g:157:2: ( ( 'Red' ) )
                    // InternalRoverDSL.g:158:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:159:3: ( 'Red' )
                    // InternalRoverDSL.g:159:4: 'Red'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:163:2: ( ( 'Blue' ) )
                    {
                    // InternalRoverDSL.g:163:2: ( ( 'Blue' ) )
                    // InternalRoverDSL.g:164:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:165:3: ( 'Blue' )
                    // InternalRoverDSL.g:165:4: 'Blue'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:169:2: ( ( 'Yellow' ) )
                    {
                    // InternalRoverDSL.g:169:2: ( ( 'Yellow' ) )
                    // InternalRoverDSL.g:170:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 
                    // InternalRoverDSL.g:171:3: ( 'Yellow' )
                    // InternalRoverDSL.g:171:4: 'Yellow'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:175:2: ( ( 'Black' ) )
                    {
                    // InternalRoverDSL.g:175:2: ( ( 'Black' ) )
                    // InternalRoverDSL.g:176:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 
                    // InternalRoverDSL.g:177:3: ( 'Black' )
                    // InternalRoverDSL.g:177:4: 'Black'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverDSL.g:181:2: ( ( 'Orange' ) )
                    {
                    // InternalRoverDSL.g:181:2: ( ( 'Orange' ) )
                    // InternalRoverDSL.g:182:3: ( 'Orange' )
                    {
                     before(grammarAccess.getColorsAccess().getOrangeEnumLiteralDeclaration_5()); 
                    // InternalRoverDSL.g:183:3: ( 'Orange' )
                    // InternalRoverDSL.g:183:4: 'Orange'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getOrangeEnumLiteralDeclaration_5()); 

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
    // InternalRoverDSL.g:191:1: rule__Safety__Alternatives : ( ( ( 'On' ) ) | ( ( 'Off' ) ) );
    public final void rule__Safety__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:195:1: ( ( ( 'On' ) ) | ( ( 'Off' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverDSL.g:196:2: ( ( 'On' ) )
                    {
                    // InternalRoverDSL.g:196:2: ( ( 'On' ) )
                    // InternalRoverDSL.g:197:3: ( 'On' )
                    {
                     before(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:198:3: ( 'On' )
                    // InternalRoverDSL.g:198:4: 'On'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:202:2: ( ( 'Off' ) )
                    {
                    // InternalRoverDSL.g:202:2: ( ( 'Off' ) )
                    // InternalRoverDSL.g:203:3: ( 'Off' )
                    {
                     before(grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:204:3: ( 'Off' )
                    // InternalRoverDSL.g:204:4: 'Off'
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
    // InternalRoverDSL.g:212:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:216:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:217:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalRoverDSL.g:224:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:228:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:229:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:229:1: ( 'Mission:' )
            // InternalRoverDSL.g:230:2: 'Mission:'
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
    // InternalRoverDSL.g:239:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:243:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:244:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalRoverDSL.g:251:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:255:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:256:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:256:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:257:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:258:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:258:3: rule__Mission__MissiontypeAssignment_1
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
    // InternalRoverDSL.g:266:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:270:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:271:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalRoverDSL.g:278:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__Group_2__0 )? ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:282:1: ( ( ( rule__Mission__Group_2__0 )? ) )
            // InternalRoverDSL.g:283:1: ( ( rule__Mission__Group_2__0 )? )
            {
            // InternalRoverDSL.g:283:1: ( ( rule__Mission__Group_2__0 )? )
            // InternalRoverDSL.g:284:2: ( rule__Mission__Group_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_2()); 
            // InternalRoverDSL.g:285:2: ( rule__Mission__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:285:3: rule__Mission__Group_2__0
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
    // InternalRoverDSL.g:293:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:297:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:298:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalRoverDSL.g:305:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )? ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:309:1: ( ( ( rule__Mission__Group_3__0 )? ) )
            // InternalRoverDSL.g:310:1: ( ( rule__Mission__Group_3__0 )? )
            {
            // InternalRoverDSL.g:310:1: ( ( rule__Mission__Group_3__0 )? )
            // InternalRoverDSL.g:311:2: ( rule__Mission__Group_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalRoverDSL.g:312:2: ( rule__Mission__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:312:3: rule__Mission__Group_3__0
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
    // InternalRoverDSL.g:320:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:324:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:325:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
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
    // InternalRoverDSL.g:332:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )? ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:336:1: ( ( ( rule__Mission__Group_4__0 )? ) )
            // InternalRoverDSL.g:337:1: ( ( rule__Mission__Group_4__0 )? )
            {
            // InternalRoverDSL.g:337:1: ( ( rule__Mission__Group_4__0 )? )
            // InternalRoverDSL.g:338:2: ( rule__Mission__Group_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalRoverDSL.g:339:2: ( rule__Mission__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:339:3: rule__Mission__Group_4__0
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
    // InternalRoverDSL.g:347:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:351:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:352:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
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
    // InternalRoverDSL.g:359:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:363:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalRoverDSL.g:364:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalRoverDSL.g:364:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalRoverDSL.g:365:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalRoverDSL.g:366:2: ( rule__Mission__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:366:3: rule__Mission__Group_5__0
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
    // InternalRoverDSL.g:374:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:378:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:379:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
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
    // InternalRoverDSL.g:386:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:390:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalRoverDSL.g:391:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalRoverDSL.g:391:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalRoverDSL.g:392:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalRoverDSL.g:393:2: ( rule__Mission__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:393:3: rule__Mission__Group_6__0
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
    // InternalRoverDSL.g:401:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:405:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:406:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
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
    // InternalRoverDSL.g:413:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )? ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:417:1: ( ( ( rule__Mission__Group_7__0 )? ) )
            // InternalRoverDSL.g:418:1: ( ( rule__Mission__Group_7__0 )? )
            {
            // InternalRoverDSL.g:418:1: ( ( rule__Mission__Group_7__0 )? )
            // InternalRoverDSL.g:419:2: ( rule__Mission__Group_7__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalRoverDSL.g:420:2: ( rule__Mission__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:420:3: rule__Mission__Group_7__0
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
    // InternalRoverDSL.g:428:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:432:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:433:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
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
    // InternalRoverDSL.g:440:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__Group_8__0 )? ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:444:1: ( ( ( rule__Mission__Group_8__0 )? ) )
            // InternalRoverDSL.g:445:1: ( ( rule__Mission__Group_8__0 )? )
            {
            // InternalRoverDSL.g:445:1: ( ( rule__Mission__Group_8__0 )? )
            // InternalRoverDSL.g:446:2: ( rule__Mission__Group_8__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_8()); 
            // InternalRoverDSL.g:447:2: ( rule__Mission__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:447:3: rule__Mission__Group_8__0
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
    // InternalRoverDSL.g:455:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:459:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:460:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
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
    // InternalRoverDSL.g:467:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__Group_9__0 )? ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:471:1: ( ( ( rule__Mission__Group_9__0 )? ) )
            // InternalRoverDSL.g:472:1: ( ( rule__Mission__Group_9__0 )? )
            {
            // InternalRoverDSL.g:472:1: ( ( rule__Mission__Group_9__0 )? )
            // InternalRoverDSL.g:473:2: ( rule__Mission__Group_9__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_9()); 
            // InternalRoverDSL.g:474:2: ( rule__Mission__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:474:3: rule__Mission__Group_9__0
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
    // InternalRoverDSL.g:482:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:486:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:487:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
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
    // InternalRoverDSL.g:494:1: rule__Mission__Group__10__Impl : ( 'End:' ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:498:1: ( ( 'End:' ) )
            // InternalRoverDSL.g:499:1: ( 'End:' )
            {
            // InternalRoverDSL.g:499:1: ( 'End:' )
            // InternalRoverDSL.g:500:2: 'End:'
            {
             before(grammarAccess.getMissionAccess().getEndKeyword_10()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRoverDSL.g:509:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:513:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:514:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
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
    // InternalRoverDSL.g:521:1: rule__Mission__Group__11__Impl : ( ( rule__Mission__TerminationconditionAssignment_11 ) ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:525:1: ( ( ( rule__Mission__TerminationconditionAssignment_11 ) ) )
            // InternalRoverDSL.g:526:1: ( ( rule__Mission__TerminationconditionAssignment_11 ) )
            {
            // InternalRoverDSL.g:526:1: ( ( rule__Mission__TerminationconditionAssignment_11 ) )
            // InternalRoverDSL.g:527:2: ( rule__Mission__TerminationconditionAssignment_11 )
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11()); 
            // InternalRoverDSL.g:528:2: ( rule__Mission__TerminationconditionAssignment_11 )
            // InternalRoverDSL.g:528:3: rule__Mission__TerminationconditionAssignment_11
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
    // InternalRoverDSL.g:536:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:540:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:541:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
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
    // InternalRoverDSL.g:548:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__Group_12__0 )? ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:552:1: ( ( ( rule__Mission__Group_12__0 )? ) )
            // InternalRoverDSL.g:553:1: ( ( rule__Mission__Group_12__0 )? )
            {
            // InternalRoverDSL.g:553:1: ( ( rule__Mission__Group_12__0 )? )
            // InternalRoverDSL.g:554:2: ( rule__Mission__Group_12__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_12()); 
            // InternalRoverDSL.g:555:2: ( rule__Mission__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:555:3: rule__Mission__Group_12__0
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
    // InternalRoverDSL.g:563:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:567:1: ( rule__Mission__Group__13__Impl )
            // InternalRoverDSL.g:568:2: rule__Mission__Group__13__Impl
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
    // InternalRoverDSL.g:574:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__Group_13__0 )? ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:578:1: ( ( ( rule__Mission__Group_13__0 )? ) )
            // InternalRoverDSL.g:579:1: ( ( rule__Mission__Group_13__0 )? )
            {
            // InternalRoverDSL.g:579:1: ( ( rule__Mission__Group_13__0 )? )
            // InternalRoverDSL.g:580:2: ( rule__Mission__Group_13__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_13()); 
            // InternalRoverDSL.g:581:2: ( rule__Mission__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:581:3: rule__Mission__Group_13__0
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
    // InternalRoverDSL.g:590:1: rule__Mission__Group_2__0 : rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 ;
    public final void rule__Mission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:594:1: ( rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 )
            // InternalRoverDSL.g:595:2: rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1
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
    // InternalRoverDSL.g:602:1: rule__Mission__Group_2__0__Impl : ( 'Safety:' ) ;
    public final void rule__Mission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:606:1: ( ( 'Safety:' ) )
            // InternalRoverDSL.g:607:1: ( 'Safety:' )
            {
            // InternalRoverDSL.g:607:1: ( 'Safety:' )
            // InternalRoverDSL.g:608:2: 'Safety:'
            {
             before(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRoverDSL.g:617:1: rule__Mission__Group_2__1 : rule__Mission__Group_2__1__Impl ;
    public final void rule__Mission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:621:1: ( rule__Mission__Group_2__1__Impl )
            // InternalRoverDSL.g:622:2: rule__Mission__Group_2__1__Impl
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
    // InternalRoverDSL.g:628:1: rule__Mission__Group_2__1__Impl : ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) ;
    public final void rule__Mission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:632:1: ( ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) )
            // InternalRoverDSL.g:633:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            {
            // InternalRoverDSL.g:633:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            // InternalRoverDSL.g:634:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            {
             before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); 
            // InternalRoverDSL.g:635:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            // InternalRoverDSL.g:635:3: rule__Mission__SafetypropertyAssignment_2_1
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
    // InternalRoverDSL.g:644:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:648:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalRoverDSL.g:649:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
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
    // InternalRoverDSL.g:656:1: rule__Mission__Group_3__0__Impl : ( 'LakeColors:' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:660:1: ( ( 'LakeColors:' ) )
            // InternalRoverDSL.g:661:1: ( 'LakeColors:' )
            {
            // InternalRoverDSL.g:661:1: ( 'LakeColors:' )
            // InternalRoverDSL.g:662:2: 'LakeColors:'
            {
             before(grammarAccess.getMissionAccess().getLakeColorsKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRoverDSL.g:671:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:675:1: ( rule__Mission__Group_3__1__Impl )
            // InternalRoverDSL.g:676:2: rule__Mission__Group_3__1__Impl
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
    // InternalRoverDSL.g:682:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__LakelistAssignment_3_1 )* ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:686:1: ( ( ( rule__Mission__LakelistAssignment_3_1 )* ) )
            // InternalRoverDSL.g:687:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            {
            // InternalRoverDSL.g:687:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            // InternalRoverDSL.g:688:2: ( rule__Mission__LakelistAssignment_3_1 )*
            {
             before(grammarAccess.getMissionAccess().getLakelistAssignment_3_1()); 
            // InternalRoverDSL.g:689:2: ( rule__Mission__LakelistAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=13 && LA14_0<=18)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRoverDSL.g:689:3: rule__Mission__LakelistAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Mission__LakelistAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRoverDSL.g:698:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:702:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalRoverDSL.g:703:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
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
    // InternalRoverDSL.g:710:1: rule__Mission__Group_4__0__Impl : ( 'BeginSentence:' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:714:1: ( ( 'BeginSentence:' ) )
            // InternalRoverDSL.g:715:1: ( 'BeginSentence:' )
            {
            // InternalRoverDSL.g:715:1: ( 'BeginSentence:' )
            // InternalRoverDSL.g:716:2: 'BeginSentence:'
            {
             before(grammarAccess.getMissionAccess().getBeginSentenceKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginSentenceKeyword_4_0()); 

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
    // InternalRoverDSL.g:725:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:729:1: ( rule__Mission__Group_4__1__Impl )
            // InternalRoverDSL.g:730:2: rule__Mission__Group_4__1__Impl
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
    // InternalRoverDSL.g:736:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__BeginsentenceAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:740:1: ( ( ( rule__Mission__BeginsentenceAssignment_4_1 ) ) )
            // InternalRoverDSL.g:741:1: ( ( rule__Mission__BeginsentenceAssignment_4_1 ) )
            {
            // InternalRoverDSL.g:741:1: ( ( rule__Mission__BeginsentenceAssignment_4_1 ) )
            // InternalRoverDSL.g:742:2: ( rule__Mission__BeginsentenceAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_4_1()); 
            // InternalRoverDSL.g:743:2: ( rule__Mission__BeginsentenceAssignment_4_1 )
            // InternalRoverDSL.g:743:3: rule__Mission__BeginsentenceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BeginsentenceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBeginsentenceAssignment_4_1()); 

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
    // InternalRoverDSL.g:752:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:756:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalRoverDSL.g:757:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:764:1: rule__Mission__Group_5__0__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:768:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:769:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:769:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:770:2: 'OuterBorder:'
            {
             before(grammarAccess.getMissionAccess().getOuterBorderKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getOuterBorderKeyword_5_0()); 

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
    // InternalRoverDSL.g:779:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:783:1: ( rule__Mission__Group_5__1__Impl )
            // InternalRoverDSL.g:784:2: rule__Mission__Group_5__1__Impl
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
    // InternalRoverDSL.g:790:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__BorderAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:794:1: ( ( ( rule__Mission__BorderAssignment_5_1 ) ) )
            // InternalRoverDSL.g:795:1: ( ( rule__Mission__BorderAssignment_5_1 ) )
            {
            // InternalRoverDSL.g:795:1: ( ( rule__Mission__BorderAssignment_5_1 ) )
            // InternalRoverDSL.g:796:2: ( rule__Mission__BorderAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getBorderAssignment_5_1()); 
            // InternalRoverDSL.g:797:2: ( rule__Mission__BorderAssignment_5_1 )
            // InternalRoverDSL.g:797:3: rule__Mission__BorderAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BorderAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBorderAssignment_5_1()); 

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
    // InternalRoverDSL.g:806:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:810:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalRoverDSL.g:811:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoverDSL.g:818:1: rule__Mission__Group_6__0__Impl : ( 'ForwardSpeed:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:822:1: ( ( 'ForwardSpeed:' ) )
            // InternalRoverDSL.g:823:1: ( 'ForwardSpeed:' )
            {
            // InternalRoverDSL.g:823:1: ( 'ForwardSpeed:' )
            // InternalRoverDSL.g:824:2: 'ForwardSpeed:'
            {
             before(grammarAccess.getMissionAccess().getForwardSpeedKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardSpeedKeyword_6_0()); 

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
    // InternalRoverDSL.g:833:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:837:1: ( rule__Mission__Group_6__1__Impl )
            // InternalRoverDSL.g:838:2: rule__Mission__Group_6__1__Impl
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
    // InternalRoverDSL.g:844:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__ForwardspeedAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:848:1: ( ( ( rule__Mission__ForwardspeedAssignment_6_1 ) ) )
            // InternalRoverDSL.g:849:1: ( ( rule__Mission__ForwardspeedAssignment_6_1 ) )
            {
            // InternalRoverDSL.g:849:1: ( ( rule__Mission__ForwardspeedAssignment_6_1 ) )
            // InternalRoverDSL.g:850:2: ( rule__Mission__ForwardspeedAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_6_1()); 
            // InternalRoverDSL.g:851:2: ( rule__Mission__ForwardspeedAssignment_6_1 )
            // InternalRoverDSL.g:851:3: rule__Mission__ForwardspeedAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ForwardspeedAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getForwardspeedAssignment_6_1()); 

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
    // InternalRoverDSL.g:860:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:864:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalRoverDSL.g:865:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
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
    // InternalRoverDSL.g:872:1: rule__Mission__Group_7__0__Impl : ( 'ReverseSpeed:' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:876:1: ( ( 'ReverseSpeed:' ) )
            // InternalRoverDSL.g:877:1: ( 'ReverseSpeed:' )
            {
            // InternalRoverDSL.g:877:1: ( 'ReverseSpeed:' )
            // InternalRoverDSL.g:878:2: 'ReverseSpeed:'
            {
             before(grammarAccess.getMissionAccess().getReverseSpeedKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReverseSpeedKeyword_7_0()); 

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
    // InternalRoverDSL.g:887:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:891:1: ( rule__Mission__Group_7__1__Impl )
            // InternalRoverDSL.g:892:2: rule__Mission__Group_7__1__Impl
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
    // InternalRoverDSL.g:898:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__ReversespeedAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:902:1: ( ( ( rule__Mission__ReversespeedAssignment_7_1 ) ) )
            // InternalRoverDSL.g:903:1: ( ( rule__Mission__ReversespeedAssignment_7_1 ) )
            {
            // InternalRoverDSL.g:903:1: ( ( rule__Mission__ReversespeedAssignment_7_1 ) )
            // InternalRoverDSL.g:904:2: ( rule__Mission__ReversespeedAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_7_1()); 
            // InternalRoverDSL.g:905:2: ( rule__Mission__ReversespeedAssignment_7_1 )
            // InternalRoverDSL.g:905:3: rule__Mission__ReversespeedAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ReversespeedAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getReversespeedAssignment_7_1()); 

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
    // InternalRoverDSL.g:914:1: rule__Mission__Group_8__0 : rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 ;
    public final void rule__Mission__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:918:1: ( rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 )
            // InternalRoverDSL.g:919:2: rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1
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
    // InternalRoverDSL.g:926:1: rule__Mission__Group_8__0__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:930:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:931:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:931:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:932:2: 'TurnDirection:'
            {
             before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_8_0()); 

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
    // InternalRoverDSL.g:941:1: rule__Mission__Group_8__1 : rule__Mission__Group_8__1__Impl ;
    public final void rule__Mission__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:945:1: ( rule__Mission__Group_8__1__Impl )
            // InternalRoverDSL.g:946:2: rule__Mission__Group_8__1__Impl
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
    // InternalRoverDSL.g:952:1: rule__Mission__Group_8__1__Impl : ( ( rule__Mission__TurndirectionAssignment_8_1 ) ) ;
    public final void rule__Mission__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:956:1: ( ( ( rule__Mission__TurndirectionAssignment_8_1 ) ) )
            // InternalRoverDSL.g:957:1: ( ( rule__Mission__TurndirectionAssignment_8_1 ) )
            {
            // InternalRoverDSL.g:957:1: ( ( rule__Mission__TurndirectionAssignment_8_1 ) )
            // InternalRoverDSL.g:958:2: ( rule__Mission__TurndirectionAssignment_8_1 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_8_1()); 
            // InternalRoverDSL.g:959:2: ( rule__Mission__TurndirectionAssignment_8_1 )
            // InternalRoverDSL.g:959:3: rule__Mission__TurndirectionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TurndirectionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTurndirectionAssignment_8_1()); 

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
    // InternalRoverDSL.g:968:1: rule__Mission__Group_9__0 : rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 ;
    public final void rule__Mission__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:972:1: ( rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 )
            // InternalRoverDSL.g:973:2: rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:980:1: rule__Mission__Group_9__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:984:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:985:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:985:1: ( 'Colors:' )
            // InternalRoverDSL.g:986:2: 'Colors:'
            {
             before(grammarAccess.getMissionAccess().getColorsKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColorsKeyword_9_0()); 

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
    // InternalRoverDSL.g:995:1: rule__Mission__Group_9__1 : rule__Mission__Group_9__1__Impl ;
    public final void rule__Mission__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:999:1: ( rule__Mission__Group_9__1__Impl )
            // InternalRoverDSL.g:1000:2: rule__Mission__Group_9__1__Impl
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
    // InternalRoverDSL.g:1006:1: rule__Mission__Group_9__1__Impl : ( ( rule__Mission__ColorlistAssignment_9_1 )* ) ;
    public final void rule__Mission__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1010:1: ( ( ( rule__Mission__ColorlistAssignment_9_1 )* ) )
            // InternalRoverDSL.g:1011:1: ( ( rule__Mission__ColorlistAssignment_9_1 )* )
            {
            // InternalRoverDSL.g:1011:1: ( ( rule__Mission__ColorlistAssignment_9_1 )* )
            // InternalRoverDSL.g:1012:2: ( rule__Mission__ColorlistAssignment_9_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_9_1()); 
            // InternalRoverDSL.g:1013:2: ( rule__Mission__ColorlistAssignment_9_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRoverDSL.g:1013:3: rule__Mission__ColorlistAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Mission__ColorlistAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getColorlistAssignment_9_1()); 

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
    // InternalRoverDSL.g:1022:1: rule__Mission__Group_12__0 : rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 ;
    public final void rule__Mission__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1026:1: ( rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1 )
            // InternalRoverDSL.g:1027:2: rule__Mission__Group_12__0__Impl rule__Mission__Group_12__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRoverDSL.g:1034:1: rule__Mission__Group_12__0__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1038:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:1039:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:1039:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:1040:2: 'FlashingColor:'
            {
             before(grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRoverDSL.g:1049:1: rule__Mission__Group_12__1 : rule__Mission__Group_12__1__Impl ;
    public final void rule__Mission__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1053:1: ( rule__Mission__Group_12__1__Impl )
            // InternalRoverDSL.g:1054:2: rule__Mission__Group_12__1__Impl
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
    // InternalRoverDSL.g:1060:1: rule__Mission__Group_12__1__Impl : ( ( rule__Mission__FlashingcolorAssignment_12_1 ) ) ;
    public final void rule__Mission__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1064:1: ( ( ( rule__Mission__FlashingcolorAssignment_12_1 ) ) )
            // InternalRoverDSL.g:1065:1: ( ( rule__Mission__FlashingcolorAssignment_12_1 ) )
            {
            // InternalRoverDSL.g:1065:1: ( ( rule__Mission__FlashingcolorAssignment_12_1 ) )
            // InternalRoverDSL.g:1066:2: ( rule__Mission__FlashingcolorAssignment_12_1 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1()); 
            // InternalRoverDSL.g:1067:2: ( rule__Mission__FlashingcolorAssignment_12_1 )
            // InternalRoverDSL.g:1067:3: rule__Mission__FlashingcolorAssignment_12_1
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
    // InternalRoverDSL.g:1076:1: rule__Mission__Group_13__0 : rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 ;
    public final void rule__Mission__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1080:1: ( rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 )
            // InternalRoverDSL.g:1081:2: rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1
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
    // InternalRoverDSL.g:1088:1: rule__Mission__Group_13__0__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1092:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:1093:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:1093:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:1094:2: 'FinalSentence:'
            {
             before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRoverDSL.g:1103:1: rule__Mission__Group_13__1 : rule__Mission__Group_13__1__Impl ;
    public final void rule__Mission__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1107:1: ( rule__Mission__Group_13__1__Impl )
            // InternalRoverDSL.g:1108:2: rule__Mission__Group_13__1__Impl
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
    // InternalRoverDSL.g:1114:1: rule__Mission__Group_13__1__Impl : ( ( rule__Mission__FinalsentenceAssignment_13_1 ) ) ;
    public final void rule__Mission__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1118:1: ( ( ( rule__Mission__FinalsentenceAssignment_13_1 ) ) )
            // InternalRoverDSL.g:1119:1: ( ( rule__Mission__FinalsentenceAssignment_13_1 ) )
            {
            // InternalRoverDSL.g:1119:1: ( ( rule__Mission__FinalsentenceAssignment_13_1 ) )
            // InternalRoverDSL.g:1120:2: ( rule__Mission__FinalsentenceAssignment_13_1 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1()); 
            // InternalRoverDSL.g:1121:2: ( rule__Mission__FinalsentenceAssignment_13_1 )
            // InternalRoverDSL.g:1121:3: rule__Mission__FinalsentenceAssignment_13_1
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
    // InternalRoverDSL.g:1130:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1134:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:1135:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:1135:2: ( ruleMissionType )
            // InternalRoverDSL.g:1136:3: ruleMissionType
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
    // InternalRoverDSL.g:1145:1: rule__Mission__SafetypropertyAssignment_2_1 : ( ruleSafety ) ;
    public final void rule__Mission__SafetypropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1149:1: ( ( ruleSafety ) )
            // InternalRoverDSL.g:1150:2: ( ruleSafety )
            {
            // InternalRoverDSL.g:1150:2: ( ruleSafety )
            // InternalRoverDSL.g:1151:3: ruleSafety
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
    // InternalRoverDSL.g:1160:1: rule__Mission__LakelistAssignment_3_1 : ( ruleColors ) ;
    public final void rule__Mission__LakelistAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1164:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1165:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1165:2: ( ruleColors )
            // InternalRoverDSL.g:1166:3: ruleColors
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


    // $ANTLR start "rule__Mission__BeginsentenceAssignment_4_1"
    // InternalRoverDSL.g:1175:1: rule__Mission__BeginsentenceAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BeginsentenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1179:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1180:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1180:2: ( RULE_STRING )
            // InternalRoverDSL.g:1181:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Mission__BeginsentenceAssignment_4_1"


    // $ANTLR start "rule__Mission__BorderAssignment_5_1"
    // InternalRoverDSL.g:1190:1: rule__Mission__BorderAssignment_5_1 : ( ruleColors ) ;
    public final void rule__Mission__BorderAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1194:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1195:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1195:2: ( ruleColors )
            // InternalRoverDSL.g:1196:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getBorderColorsEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBorderColorsEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Mission__BorderAssignment_5_1"


    // $ANTLR start "rule__Mission__ForwardspeedAssignment_6_1"
    // InternalRoverDSL.g:1205:1: rule__Mission__ForwardspeedAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Mission__ForwardspeedAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1209:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1210:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1210:2: ( RULE_INT )
            // InternalRoverDSL.g:1211:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Mission__ForwardspeedAssignment_6_1"


    // $ANTLR start "rule__Mission__ReversespeedAssignment_7_1"
    // InternalRoverDSL.g:1220:1: rule__Mission__ReversespeedAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Mission__ReversespeedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1224:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1225:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1225:2: ( RULE_INT )
            // InternalRoverDSL.g:1226:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Mission__ReversespeedAssignment_7_1"


    // $ANTLR start "rule__Mission__TurndirectionAssignment_8_1"
    // InternalRoverDSL.g:1235:1: rule__Mission__TurndirectionAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__Mission__TurndirectionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1239:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1240:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1240:2: ( RULE_INT )
            // InternalRoverDSL.g:1241:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Mission__TurndirectionAssignment_8_1"


    // $ANTLR start "rule__Mission__ColorlistAssignment_9_1"
    // InternalRoverDSL.g:1250:1: rule__Mission__ColorlistAssignment_9_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1254:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1255:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1255:2: ( ruleColors )
            // InternalRoverDSL.g:1256:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getColorlistColorsEnumRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Mission__ColorlistAssignment_9_1"


    // $ANTLR start "rule__Mission__TerminationconditionAssignment_11"
    // InternalRoverDSL.g:1265:1: rule__Mission__TerminationconditionAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Mission__TerminationconditionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1269:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1270:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1270:2: ( RULE_STRING )
            // InternalRoverDSL.g:1271:3: RULE_STRING
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
    // InternalRoverDSL.g:1280:1: rule__Mission__FlashingcolorAssignment_12_1 : ( ruleColors ) ;
    public final void rule__Mission__FlashingcolorAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1284:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1285:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1285:2: ( ruleColors )
            // InternalRoverDSL.g:1286:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorColorsEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getFlashingcolorColorsEnumRuleCall_12_1_0()); 

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
    // InternalRoverDSL.g:1295:1: rule__Mission__FinalsentenceAssignment_13_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1299:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1300:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1300:2: ( RULE_STRING )
            // InternalRoverDSL.g:1301:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}