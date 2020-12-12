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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AvoidColors'", "'FindColors'", "'White'", "'Red'", "'Blue'", "'Yellow'", "'Black'", "'On'", "'Off'", "'Mission:'", "'End:'", "'Safety:'", "'LakeColors:'", "'AvoidObjects:'", "'BeginSentence:'", "'OuterBorder:'", "'ForwardSpeed:'", "'ReverseSpeed:'", "'TurnDirection:'", "'Colors:'", "'FlashingColor:'", "'FinalSentence:'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleColor"
    // InternalRoverDSL.g:78:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalRoverDSL.g:79:1: ( ruleColor EOF )
            // InternalRoverDSL.g:80:1: ruleColor EOF
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
    // InternalRoverDSL.g:87:1: ruleColor : ( ( rule__Color__ColorAssignment ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:91:2: ( ( ( rule__Color__ColorAssignment ) ) )
            // InternalRoverDSL.g:92:2: ( ( rule__Color__ColorAssignment ) )
            {
            // InternalRoverDSL.g:92:2: ( ( rule__Color__ColorAssignment ) )
            // InternalRoverDSL.g:93:3: ( rule__Color__ColorAssignment )
            {
             before(grammarAccess.getColorAccess().getColorAssignment()); 
            // InternalRoverDSL.g:94:3: ( rule__Color__ColorAssignment )
            // InternalRoverDSL.g:94:4: rule__Color__ColorAssignment
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
    // InternalRoverDSL.g:103:1: ruleMissionType : ( ( rule__MissionType__Alternatives ) ) ;
    public final void ruleMissionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:107:1: ( ( ( rule__MissionType__Alternatives ) ) )
            // InternalRoverDSL.g:108:2: ( ( rule__MissionType__Alternatives ) )
            {
            // InternalRoverDSL.g:108:2: ( ( rule__MissionType__Alternatives ) )
            // InternalRoverDSL.g:109:3: ( rule__MissionType__Alternatives )
            {
             before(grammarAccess.getMissionTypeAccess().getAlternatives()); 
            // InternalRoverDSL.g:110:3: ( rule__MissionType__Alternatives )
            // InternalRoverDSL.g:110:4: rule__MissionType__Alternatives
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
    // InternalRoverDSL.g:119:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:123:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalRoverDSL.g:124:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalRoverDSL.g:124:2: ( ( rule__Colors__Alternatives ) )
            // InternalRoverDSL.g:125:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalRoverDSL.g:126:3: ( rule__Colors__Alternatives )
            // InternalRoverDSL.g:126:4: rule__Colors__Alternatives
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
    // InternalRoverDSL.g:135:1: ruleSafety : ( ( rule__Safety__Alternatives ) ) ;
    public final void ruleSafety() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:139:1: ( ( ( rule__Safety__Alternatives ) ) )
            // InternalRoverDSL.g:140:2: ( ( rule__Safety__Alternatives ) )
            {
            // InternalRoverDSL.g:140:2: ( ( rule__Safety__Alternatives ) )
            // InternalRoverDSL.g:141:3: ( rule__Safety__Alternatives )
            {
             before(grammarAccess.getSafetyAccess().getAlternatives()); 
            // InternalRoverDSL.g:142:3: ( rule__Safety__Alternatives )
            // InternalRoverDSL.g:142:4: rule__Safety__Alternatives
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
    // InternalRoverDSL.g:150:1: rule__MissionType__Alternatives : ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) );
    public final void rule__MissionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:154:1: ( ( ( 'AvoidColors' ) ) | ( ( 'FindColors' ) ) )
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
                    // InternalRoverDSL.g:155:2: ( ( 'AvoidColors' ) )
                    {
                    // InternalRoverDSL.g:155:2: ( ( 'AvoidColors' ) )
                    // InternalRoverDSL.g:156:3: ( 'AvoidColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:157:3: ( 'AvoidColors' )
                    // InternalRoverDSL.g:157:4: 'AvoidColors'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:161:2: ( ( 'FindColors' ) )
                    {
                    // InternalRoverDSL.g:161:2: ( ( 'FindColors' ) )
                    // InternalRoverDSL.g:162:3: ( 'FindColors' )
                    {
                     before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:163:3: ( 'FindColors' )
                    // InternalRoverDSL.g:163:4: 'FindColors'
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
    // InternalRoverDSL.g:171:1: rule__Colors__Alternatives : ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:175:1: ( ( ( 'White' ) ) | ( ( 'Red' ) ) | ( ( 'Blue' ) ) | ( ( 'Yellow' ) ) | ( ( 'Black' ) ) )
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
                    // InternalRoverDSL.g:176:2: ( ( 'White' ) )
                    {
                    // InternalRoverDSL.g:176:2: ( ( 'White' ) )
                    // InternalRoverDSL.g:177:3: ( 'White' )
                    {
                     before(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:178:3: ( 'White' )
                    // InternalRoverDSL.g:178:4: 'White'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:182:2: ( ( 'Red' ) )
                    {
                    // InternalRoverDSL.g:182:2: ( ( 'Red' ) )
                    // InternalRoverDSL.g:183:3: ( 'Red' )
                    {
                     before(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:184:3: ( 'Red' )
                    // InternalRoverDSL.g:184:4: 'Red'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverDSL.g:188:2: ( ( 'Blue' ) )
                    {
                    // InternalRoverDSL.g:188:2: ( ( 'Blue' ) )
                    // InternalRoverDSL.g:189:3: ( 'Blue' )
                    {
                     before(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 
                    // InternalRoverDSL.g:190:3: ( 'Blue' )
                    // InternalRoverDSL.g:190:4: 'Blue'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverDSL.g:194:2: ( ( 'Yellow' ) )
                    {
                    // InternalRoverDSL.g:194:2: ( ( 'Yellow' ) )
                    // InternalRoverDSL.g:195:3: ( 'Yellow' )
                    {
                     before(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 
                    // InternalRoverDSL.g:196:3: ( 'Yellow' )
                    // InternalRoverDSL.g:196:4: 'Yellow'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverDSL.g:200:2: ( ( 'Black' ) )
                    {
                    // InternalRoverDSL.g:200:2: ( ( 'Black' ) )
                    // InternalRoverDSL.g:201:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_4()); 
                    // InternalRoverDSL.g:202:3: ( 'Black' )
                    // InternalRoverDSL.g:202:4: 'Black'
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
    // InternalRoverDSL.g:210:1: rule__Safety__Alternatives : ( ( ( 'On' ) ) | ( ( 'Off' ) ) );
    public final void rule__Safety__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:214:1: ( ( ( 'On' ) ) | ( ( 'Off' ) ) )
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
                    // InternalRoverDSL.g:215:2: ( ( 'On' ) )
                    {
                    // InternalRoverDSL.g:215:2: ( ( 'On' ) )
                    // InternalRoverDSL.g:216:3: ( 'On' )
                    {
                     before(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 
                    // InternalRoverDSL.g:217:3: ( 'On' )
                    // InternalRoverDSL.g:217:4: 'On'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSafetyAccess().getOnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverDSL.g:221:2: ( ( 'Off' ) )
                    {
                    // InternalRoverDSL.g:221:2: ( ( 'Off' ) )
                    // InternalRoverDSL.g:222:3: ( 'Off' )
                    {
                     before(grammarAccess.getSafetyAccess().getOffEnumLiteralDeclaration_1()); 
                    // InternalRoverDSL.g:223:3: ( 'Off' )
                    // InternalRoverDSL.g:223:4: 'Off'
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
    // InternalRoverDSL.g:231:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:235:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalRoverDSL.g:236:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalRoverDSL.g:243:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:247:1: ( ( 'Mission:' ) )
            // InternalRoverDSL.g:248:1: ( 'Mission:' )
            {
            // InternalRoverDSL.g:248:1: ( 'Mission:' )
            // InternalRoverDSL.g:249:2: 'Mission:'
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
    // InternalRoverDSL.g:258:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:262:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalRoverDSL.g:263:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalRoverDSL.g:270:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__MissiontypeAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:274:1: ( ( ( rule__Mission__MissiontypeAssignment_1 ) ) )
            // InternalRoverDSL.g:275:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            {
            // InternalRoverDSL.g:275:1: ( ( rule__Mission__MissiontypeAssignment_1 ) )
            // InternalRoverDSL.g:276:2: ( rule__Mission__MissiontypeAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); 
            // InternalRoverDSL.g:277:2: ( rule__Mission__MissiontypeAssignment_1 )
            // InternalRoverDSL.g:277:3: rule__Mission__MissiontypeAssignment_1
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
    // InternalRoverDSL.g:285:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:289:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalRoverDSL.g:290:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalRoverDSL.g:297:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__Group_2__0 )? ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:301:1: ( ( ( rule__Mission__Group_2__0 )? ) )
            // InternalRoverDSL.g:302:1: ( ( rule__Mission__Group_2__0 )? )
            {
            // InternalRoverDSL.g:302:1: ( ( rule__Mission__Group_2__0 )? )
            // InternalRoverDSL.g:303:2: ( rule__Mission__Group_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_2()); 
            // InternalRoverDSL.g:304:2: ( rule__Mission__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoverDSL.g:304:3: rule__Mission__Group_2__0
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
    // InternalRoverDSL.g:312:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:316:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalRoverDSL.g:317:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalRoverDSL.g:324:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__Group_3__0 )? ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:328:1: ( ( ( rule__Mission__Group_3__0 )? ) )
            // InternalRoverDSL.g:329:1: ( ( rule__Mission__Group_3__0 )? )
            {
            // InternalRoverDSL.g:329:1: ( ( rule__Mission__Group_3__0 )? )
            // InternalRoverDSL.g:330:2: ( rule__Mission__Group_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_3()); 
            // InternalRoverDSL.g:331:2: ( rule__Mission__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverDSL.g:331:3: rule__Mission__Group_3__0
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
    // InternalRoverDSL.g:339:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:343:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalRoverDSL.g:344:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
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
    // InternalRoverDSL.g:351:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )? ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:355:1: ( ( ( rule__Mission__Group_4__0 )? ) )
            // InternalRoverDSL.g:356:1: ( ( rule__Mission__Group_4__0 )? )
            {
            // InternalRoverDSL.g:356:1: ( ( rule__Mission__Group_4__0 )? )
            // InternalRoverDSL.g:357:2: ( rule__Mission__Group_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalRoverDSL.g:358:2: ( rule__Mission__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverDSL.g:358:3: rule__Mission__Group_4__0
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
    // InternalRoverDSL.g:366:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:370:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalRoverDSL.g:371:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
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
    // InternalRoverDSL.g:378:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:382:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalRoverDSL.g:383:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalRoverDSL.g:383:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalRoverDSL.g:384:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalRoverDSL.g:385:2: ( rule__Mission__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverDSL.g:385:3: rule__Mission__Group_5__0
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
    // InternalRoverDSL.g:393:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:397:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalRoverDSL.g:398:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
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
    // InternalRoverDSL.g:405:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:409:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalRoverDSL.g:410:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalRoverDSL.g:410:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalRoverDSL.g:411:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalRoverDSL.g:412:2: ( rule__Mission__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverDSL.g:412:3: rule__Mission__Group_6__0
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
    // InternalRoverDSL.g:420:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:424:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalRoverDSL.g:425:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
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
    // InternalRoverDSL.g:432:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )? ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:436:1: ( ( ( rule__Mission__Group_7__0 )? ) )
            // InternalRoverDSL.g:437:1: ( ( rule__Mission__Group_7__0 )? )
            {
            // InternalRoverDSL.g:437:1: ( ( rule__Mission__Group_7__0 )? )
            // InternalRoverDSL.g:438:2: ( rule__Mission__Group_7__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalRoverDSL.g:439:2: ( rule__Mission__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverDSL.g:439:3: rule__Mission__Group_7__0
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
    // InternalRoverDSL.g:447:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl rule__Mission__Group__9 ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:451:1: ( rule__Mission__Group__8__Impl rule__Mission__Group__9 )
            // InternalRoverDSL.g:452:2: rule__Mission__Group__8__Impl rule__Mission__Group__9
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
    // InternalRoverDSL.g:459:1: rule__Mission__Group__8__Impl : ( ( rule__Mission__Group_8__0 )? ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:463:1: ( ( ( rule__Mission__Group_8__0 )? ) )
            // InternalRoverDSL.g:464:1: ( ( rule__Mission__Group_8__0 )? )
            {
            // InternalRoverDSL.g:464:1: ( ( rule__Mission__Group_8__0 )? )
            // InternalRoverDSL.g:465:2: ( rule__Mission__Group_8__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_8()); 
            // InternalRoverDSL.g:466:2: ( rule__Mission__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverDSL.g:466:3: rule__Mission__Group_8__0
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
    // InternalRoverDSL.g:474:1: rule__Mission__Group__9 : rule__Mission__Group__9__Impl rule__Mission__Group__10 ;
    public final void rule__Mission__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:478:1: ( rule__Mission__Group__9__Impl rule__Mission__Group__10 )
            // InternalRoverDSL.g:479:2: rule__Mission__Group__9__Impl rule__Mission__Group__10
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
    // InternalRoverDSL.g:486:1: rule__Mission__Group__9__Impl : ( ( rule__Mission__Group_9__0 )? ) ;
    public final void rule__Mission__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:490:1: ( ( ( rule__Mission__Group_9__0 )? ) )
            // InternalRoverDSL.g:491:1: ( ( rule__Mission__Group_9__0 )? )
            {
            // InternalRoverDSL.g:491:1: ( ( rule__Mission__Group_9__0 )? )
            // InternalRoverDSL.g:492:2: ( rule__Mission__Group_9__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_9()); 
            // InternalRoverDSL.g:493:2: ( rule__Mission__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoverDSL.g:493:3: rule__Mission__Group_9__0
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
    // InternalRoverDSL.g:501:1: rule__Mission__Group__10 : rule__Mission__Group__10__Impl rule__Mission__Group__11 ;
    public final void rule__Mission__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:505:1: ( rule__Mission__Group__10__Impl rule__Mission__Group__11 )
            // InternalRoverDSL.g:506:2: rule__Mission__Group__10__Impl rule__Mission__Group__11
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
    // InternalRoverDSL.g:513:1: rule__Mission__Group__10__Impl : ( ( rule__Mission__Group_10__0 )? ) ;
    public final void rule__Mission__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:517:1: ( ( ( rule__Mission__Group_10__0 )? ) )
            // InternalRoverDSL.g:518:1: ( ( rule__Mission__Group_10__0 )? )
            {
            // InternalRoverDSL.g:518:1: ( ( rule__Mission__Group_10__0 )? )
            // InternalRoverDSL.g:519:2: ( rule__Mission__Group_10__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_10()); 
            // InternalRoverDSL.g:520:2: ( rule__Mission__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoverDSL.g:520:3: rule__Mission__Group_10__0
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
    // InternalRoverDSL.g:528:1: rule__Mission__Group__11 : rule__Mission__Group__11__Impl rule__Mission__Group__12 ;
    public final void rule__Mission__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:532:1: ( rule__Mission__Group__11__Impl rule__Mission__Group__12 )
            // InternalRoverDSL.g:533:2: rule__Mission__Group__11__Impl rule__Mission__Group__12
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
    // InternalRoverDSL.g:540:1: rule__Mission__Group__11__Impl : ( 'End:' ) ;
    public final void rule__Mission__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:544:1: ( ( 'End:' ) )
            // InternalRoverDSL.g:545:1: ( 'End:' )
            {
            // InternalRoverDSL.g:545:1: ( 'End:' )
            // InternalRoverDSL.g:546:2: 'End:'
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
    // InternalRoverDSL.g:555:1: rule__Mission__Group__12 : rule__Mission__Group__12__Impl rule__Mission__Group__13 ;
    public final void rule__Mission__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:559:1: ( rule__Mission__Group__12__Impl rule__Mission__Group__13 )
            // InternalRoverDSL.g:560:2: rule__Mission__Group__12__Impl rule__Mission__Group__13
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
    // InternalRoverDSL.g:567:1: rule__Mission__Group__12__Impl : ( ( rule__Mission__TerminationconditionAssignment_12 ) ) ;
    public final void rule__Mission__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:571:1: ( ( ( rule__Mission__TerminationconditionAssignment_12 ) ) )
            // InternalRoverDSL.g:572:1: ( ( rule__Mission__TerminationconditionAssignment_12 ) )
            {
            // InternalRoverDSL.g:572:1: ( ( rule__Mission__TerminationconditionAssignment_12 ) )
            // InternalRoverDSL.g:573:2: ( rule__Mission__TerminationconditionAssignment_12 )
            {
             before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_12()); 
            // InternalRoverDSL.g:574:2: ( rule__Mission__TerminationconditionAssignment_12 )
            // InternalRoverDSL.g:574:3: rule__Mission__TerminationconditionAssignment_12
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
    // InternalRoverDSL.g:582:1: rule__Mission__Group__13 : rule__Mission__Group__13__Impl rule__Mission__Group__14 ;
    public final void rule__Mission__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:586:1: ( rule__Mission__Group__13__Impl rule__Mission__Group__14 )
            // InternalRoverDSL.g:587:2: rule__Mission__Group__13__Impl rule__Mission__Group__14
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
    // InternalRoverDSL.g:594:1: rule__Mission__Group__13__Impl : ( ( rule__Mission__Group_13__0 )? ) ;
    public final void rule__Mission__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:598:1: ( ( ( rule__Mission__Group_13__0 )? ) )
            // InternalRoverDSL.g:599:1: ( ( rule__Mission__Group_13__0 )? )
            {
            // InternalRoverDSL.g:599:1: ( ( rule__Mission__Group_13__0 )? )
            // InternalRoverDSL.g:600:2: ( rule__Mission__Group_13__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_13()); 
            // InternalRoverDSL.g:601:2: ( rule__Mission__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverDSL.g:601:3: rule__Mission__Group_13__0
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
    // InternalRoverDSL.g:609:1: rule__Mission__Group__14 : rule__Mission__Group__14__Impl ;
    public final void rule__Mission__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:613:1: ( rule__Mission__Group__14__Impl )
            // InternalRoverDSL.g:614:2: rule__Mission__Group__14__Impl
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
    // InternalRoverDSL.g:620:1: rule__Mission__Group__14__Impl : ( ( rule__Mission__Group_14__0 )? ) ;
    public final void rule__Mission__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:624:1: ( ( ( rule__Mission__Group_14__0 )? ) )
            // InternalRoverDSL.g:625:1: ( ( rule__Mission__Group_14__0 )? )
            {
            // InternalRoverDSL.g:625:1: ( ( rule__Mission__Group_14__0 )? )
            // InternalRoverDSL.g:626:2: ( rule__Mission__Group_14__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_14()); 
            // InternalRoverDSL.g:627:2: ( rule__Mission__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverDSL.g:627:3: rule__Mission__Group_14__0
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
    // InternalRoverDSL.g:636:1: rule__Mission__Group_2__0 : rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 ;
    public final void rule__Mission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:640:1: ( rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1 )
            // InternalRoverDSL.g:641:2: rule__Mission__Group_2__0__Impl rule__Mission__Group_2__1
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
    // InternalRoverDSL.g:648:1: rule__Mission__Group_2__0__Impl : ( 'Safety:' ) ;
    public final void rule__Mission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:652:1: ( ( 'Safety:' ) )
            // InternalRoverDSL.g:653:1: ( 'Safety:' )
            {
            // InternalRoverDSL.g:653:1: ( 'Safety:' )
            // InternalRoverDSL.g:654:2: 'Safety:'
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
    // InternalRoverDSL.g:663:1: rule__Mission__Group_2__1 : rule__Mission__Group_2__1__Impl ;
    public final void rule__Mission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:667:1: ( rule__Mission__Group_2__1__Impl )
            // InternalRoverDSL.g:668:2: rule__Mission__Group_2__1__Impl
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
    // InternalRoverDSL.g:674:1: rule__Mission__Group_2__1__Impl : ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) ;
    public final void rule__Mission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:678:1: ( ( ( rule__Mission__SafetypropertyAssignment_2_1 ) ) )
            // InternalRoverDSL.g:679:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            {
            // InternalRoverDSL.g:679:1: ( ( rule__Mission__SafetypropertyAssignment_2_1 ) )
            // InternalRoverDSL.g:680:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            {
             before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); 
            // InternalRoverDSL.g:681:2: ( rule__Mission__SafetypropertyAssignment_2_1 )
            // InternalRoverDSL.g:681:3: rule__Mission__SafetypropertyAssignment_2_1
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
    // InternalRoverDSL.g:690:1: rule__Mission__Group_3__0 : rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 ;
    public final void rule__Mission__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:694:1: ( rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1 )
            // InternalRoverDSL.g:695:2: rule__Mission__Group_3__0__Impl rule__Mission__Group_3__1
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
    // InternalRoverDSL.g:702:1: rule__Mission__Group_3__0__Impl : ( 'LakeColors:' ) ;
    public final void rule__Mission__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:706:1: ( ( 'LakeColors:' ) )
            // InternalRoverDSL.g:707:1: ( 'LakeColors:' )
            {
            // InternalRoverDSL.g:707:1: ( 'LakeColors:' )
            // InternalRoverDSL.g:708:2: 'LakeColors:'
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
    // InternalRoverDSL.g:717:1: rule__Mission__Group_3__1 : rule__Mission__Group_3__1__Impl ;
    public final void rule__Mission__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:721:1: ( rule__Mission__Group_3__1__Impl )
            // InternalRoverDSL.g:722:2: rule__Mission__Group_3__1__Impl
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
    // InternalRoverDSL.g:728:1: rule__Mission__Group_3__1__Impl : ( ( rule__Mission__LakelistAssignment_3_1 )* ) ;
    public final void rule__Mission__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:732:1: ( ( ( rule__Mission__LakelistAssignment_3_1 )* ) )
            // InternalRoverDSL.g:733:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            {
            // InternalRoverDSL.g:733:1: ( ( rule__Mission__LakelistAssignment_3_1 )* )
            // InternalRoverDSL.g:734:2: ( rule__Mission__LakelistAssignment_3_1 )*
            {
             before(grammarAccess.getMissionAccess().getLakelistAssignment_3_1()); 
            // InternalRoverDSL.g:735:2: ( rule__Mission__LakelistAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=17)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRoverDSL.g:735:3: rule__Mission__LakelistAssignment_3_1
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
    // InternalRoverDSL.g:744:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:748:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalRoverDSL.g:749:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
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
    // InternalRoverDSL.g:756:1: rule__Mission__Group_4__0__Impl : ( 'AvoidObjects:' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:760:1: ( ( 'AvoidObjects:' ) )
            // InternalRoverDSL.g:761:1: ( 'AvoidObjects:' )
            {
            // InternalRoverDSL.g:761:1: ( 'AvoidObjects:' )
            // InternalRoverDSL.g:762:2: 'AvoidObjects:'
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
    // InternalRoverDSL.g:771:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:775:1: ( rule__Mission__Group_4__1__Impl )
            // InternalRoverDSL.g:776:2: rule__Mission__Group_4__1__Impl
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
    // InternalRoverDSL.g:782:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:786:1: ( ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) ) )
            // InternalRoverDSL.g:787:1: ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) )
            {
            // InternalRoverDSL.g:787:1: ( ( rule__Mission__ObjectdistanceAssignment_4_1 ) )
            // InternalRoverDSL.g:788:2: ( rule__Mission__ObjectdistanceAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceAssignment_4_1()); 
            // InternalRoverDSL.g:789:2: ( rule__Mission__ObjectdistanceAssignment_4_1 )
            // InternalRoverDSL.g:789:3: rule__Mission__ObjectdistanceAssignment_4_1
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
    // InternalRoverDSL.g:798:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:802:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalRoverDSL.g:803:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
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
    // InternalRoverDSL.g:810:1: rule__Mission__Group_5__0__Impl : ( 'BeginSentence:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:814:1: ( ( 'BeginSentence:' ) )
            // InternalRoverDSL.g:815:1: ( 'BeginSentence:' )
            {
            // InternalRoverDSL.g:815:1: ( 'BeginSentence:' )
            // InternalRoverDSL.g:816:2: 'BeginSentence:'
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
    // InternalRoverDSL.g:825:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:829:1: ( rule__Mission__Group_5__1__Impl )
            // InternalRoverDSL.g:830:2: rule__Mission__Group_5__1__Impl
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
    // InternalRoverDSL.g:836:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__BeginsentenceAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:840:1: ( ( ( rule__Mission__BeginsentenceAssignment_5_1 ) ) )
            // InternalRoverDSL.g:841:1: ( ( rule__Mission__BeginsentenceAssignment_5_1 ) )
            {
            // InternalRoverDSL.g:841:1: ( ( rule__Mission__BeginsentenceAssignment_5_1 ) )
            // InternalRoverDSL.g:842:2: ( rule__Mission__BeginsentenceAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_5_1()); 
            // InternalRoverDSL.g:843:2: ( rule__Mission__BeginsentenceAssignment_5_1 )
            // InternalRoverDSL.g:843:3: rule__Mission__BeginsentenceAssignment_5_1
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
    // InternalRoverDSL.g:852:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:856:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalRoverDSL.g:857:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
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
    // InternalRoverDSL.g:864:1: rule__Mission__Group_6__0__Impl : ( 'OuterBorder:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:868:1: ( ( 'OuterBorder:' ) )
            // InternalRoverDSL.g:869:1: ( 'OuterBorder:' )
            {
            // InternalRoverDSL.g:869:1: ( 'OuterBorder:' )
            // InternalRoverDSL.g:870:2: 'OuterBorder:'
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
    // InternalRoverDSL.g:879:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:883:1: ( rule__Mission__Group_6__1__Impl )
            // InternalRoverDSL.g:884:2: rule__Mission__Group_6__1__Impl
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
    // InternalRoverDSL.g:890:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__BordercolorAssignment_6_1 ) ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:894:1: ( ( ( rule__Mission__BordercolorAssignment_6_1 ) ) )
            // InternalRoverDSL.g:895:1: ( ( rule__Mission__BordercolorAssignment_6_1 ) )
            {
            // InternalRoverDSL.g:895:1: ( ( rule__Mission__BordercolorAssignment_6_1 ) )
            // InternalRoverDSL.g:896:2: ( rule__Mission__BordercolorAssignment_6_1 )
            {
             before(grammarAccess.getMissionAccess().getBordercolorAssignment_6_1()); 
            // InternalRoverDSL.g:897:2: ( rule__Mission__BordercolorAssignment_6_1 )
            // InternalRoverDSL.g:897:3: rule__Mission__BordercolorAssignment_6_1
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
    // InternalRoverDSL.g:906:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:910:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalRoverDSL.g:911:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
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
    // InternalRoverDSL.g:918:1: rule__Mission__Group_7__0__Impl : ( 'ForwardSpeed:' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:922:1: ( ( 'ForwardSpeed:' ) )
            // InternalRoverDSL.g:923:1: ( 'ForwardSpeed:' )
            {
            // InternalRoverDSL.g:923:1: ( 'ForwardSpeed:' )
            // InternalRoverDSL.g:924:2: 'ForwardSpeed:'
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
    // InternalRoverDSL.g:933:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:937:1: ( rule__Mission__Group_7__1__Impl )
            // InternalRoverDSL.g:938:2: rule__Mission__Group_7__1__Impl
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
    // InternalRoverDSL.g:944:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__ForwardspeedAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:948:1: ( ( ( rule__Mission__ForwardspeedAssignment_7_1 ) ) )
            // InternalRoverDSL.g:949:1: ( ( rule__Mission__ForwardspeedAssignment_7_1 ) )
            {
            // InternalRoverDSL.g:949:1: ( ( rule__Mission__ForwardspeedAssignment_7_1 ) )
            // InternalRoverDSL.g:950:2: ( rule__Mission__ForwardspeedAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getForwardspeedAssignment_7_1()); 
            // InternalRoverDSL.g:951:2: ( rule__Mission__ForwardspeedAssignment_7_1 )
            // InternalRoverDSL.g:951:3: rule__Mission__ForwardspeedAssignment_7_1
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
    // InternalRoverDSL.g:960:1: rule__Mission__Group_8__0 : rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 ;
    public final void rule__Mission__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:964:1: ( rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1 )
            // InternalRoverDSL.g:965:2: rule__Mission__Group_8__0__Impl rule__Mission__Group_8__1
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
    // InternalRoverDSL.g:972:1: rule__Mission__Group_8__0__Impl : ( 'ReverseSpeed:' ) ;
    public final void rule__Mission__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:976:1: ( ( 'ReverseSpeed:' ) )
            // InternalRoverDSL.g:977:1: ( 'ReverseSpeed:' )
            {
            // InternalRoverDSL.g:977:1: ( 'ReverseSpeed:' )
            // InternalRoverDSL.g:978:2: 'ReverseSpeed:'
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
    // InternalRoverDSL.g:987:1: rule__Mission__Group_8__1 : rule__Mission__Group_8__1__Impl ;
    public final void rule__Mission__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:991:1: ( rule__Mission__Group_8__1__Impl )
            // InternalRoverDSL.g:992:2: rule__Mission__Group_8__1__Impl
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
    // InternalRoverDSL.g:998:1: rule__Mission__Group_8__1__Impl : ( ( rule__Mission__ReversespeedAssignment_8_1 ) ) ;
    public final void rule__Mission__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1002:1: ( ( ( rule__Mission__ReversespeedAssignment_8_1 ) ) )
            // InternalRoverDSL.g:1003:1: ( ( rule__Mission__ReversespeedAssignment_8_1 ) )
            {
            // InternalRoverDSL.g:1003:1: ( ( rule__Mission__ReversespeedAssignment_8_1 ) )
            // InternalRoverDSL.g:1004:2: ( rule__Mission__ReversespeedAssignment_8_1 )
            {
             before(grammarAccess.getMissionAccess().getReversespeedAssignment_8_1()); 
            // InternalRoverDSL.g:1005:2: ( rule__Mission__ReversespeedAssignment_8_1 )
            // InternalRoverDSL.g:1005:3: rule__Mission__ReversespeedAssignment_8_1
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
    // InternalRoverDSL.g:1014:1: rule__Mission__Group_9__0 : rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 ;
    public final void rule__Mission__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1018:1: ( rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1 )
            // InternalRoverDSL.g:1019:2: rule__Mission__Group_9__0__Impl rule__Mission__Group_9__1
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
    // InternalRoverDSL.g:1026:1: rule__Mission__Group_9__0__Impl : ( 'TurnDirection:' ) ;
    public final void rule__Mission__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1030:1: ( ( 'TurnDirection:' ) )
            // InternalRoverDSL.g:1031:1: ( 'TurnDirection:' )
            {
            // InternalRoverDSL.g:1031:1: ( 'TurnDirection:' )
            // InternalRoverDSL.g:1032:2: 'TurnDirection:'
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
    // InternalRoverDSL.g:1041:1: rule__Mission__Group_9__1 : rule__Mission__Group_9__1__Impl ;
    public final void rule__Mission__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1045:1: ( rule__Mission__Group_9__1__Impl )
            // InternalRoverDSL.g:1046:2: rule__Mission__Group_9__1__Impl
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
    // InternalRoverDSL.g:1052:1: rule__Mission__Group_9__1__Impl : ( ( rule__Mission__TurndirectionAssignment_9_1 ) ) ;
    public final void rule__Mission__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1056:1: ( ( ( rule__Mission__TurndirectionAssignment_9_1 ) ) )
            // InternalRoverDSL.g:1057:1: ( ( rule__Mission__TurndirectionAssignment_9_1 ) )
            {
            // InternalRoverDSL.g:1057:1: ( ( rule__Mission__TurndirectionAssignment_9_1 ) )
            // InternalRoverDSL.g:1058:2: ( rule__Mission__TurndirectionAssignment_9_1 )
            {
             before(grammarAccess.getMissionAccess().getTurndirectionAssignment_9_1()); 
            // InternalRoverDSL.g:1059:2: ( rule__Mission__TurndirectionAssignment_9_1 )
            // InternalRoverDSL.g:1059:3: rule__Mission__TurndirectionAssignment_9_1
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
    // InternalRoverDSL.g:1068:1: rule__Mission__Group_10__0 : rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 ;
    public final void rule__Mission__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1072:1: ( rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1 )
            // InternalRoverDSL.g:1073:2: rule__Mission__Group_10__0__Impl rule__Mission__Group_10__1
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
    // InternalRoverDSL.g:1080:1: rule__Mission__Group_10__0__Impl : ( 'Colors:' ) ;
    public final void rule__Mission__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1084:1: ( ( 'Colors:' ) )
            // InternalRoverDSL.g:1085:1: ( 'Colors:' )
            {
            // InternalRoverDSL.g:1085:1: ( 'Colors:' )
            // InternalRoverDSL.g:1086:2: 'Colors:'
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
    // InternalRoverDSL.g:1095:1: rule__Mission__Group_10__1 : rule__Mission__Group_10__1__Impl ;
    public final void rule__Mission__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1099:1: ( rule__Mission__Group_10__1__Impl )
            // InternalRoverDSL.g:1100:2: rule__Mission__Group_10__1__Impl
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
    // InternalRoverDSL.g:1106:1: rule__Mission__Group_10__1__Impl : ( ( rule__Mission__ColorlistAssignment_10_1 )* ) ;
    public final void rule__Mission__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1110:1: ( ( ( rule__Mission__ColorlistAssignment_10_1 )* ) )
            // InternalRoverDSL.g:1111:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            {
            // InternalRoverDSL.g:1111:1: ( ( rule__Mission__ColorlistAssignment_10_1 )* )
            // InternalRoverDSL.g:1112:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            {
             before(grammarAccess.getMissionAccess().getColorlistAssignment_10_1()); 
            // InternalRoverDSL.g:1113:2: ( rule__Mission__ColorlistAssignment_10_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=17)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRoverDSL.g:1113:3: rule__Mission__ColorlistAssignment_10_1
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
    // InternalRoverDSL.g:1122:1: rule__Mission__Group_13__0 : rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 ;
    public final void rule__Mission__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1126:1: ( rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1 )
            // InternalRoverDSL.g:1127:2: rule__Mission__Group_13__0__Impl rule__Mission__Group_13__1
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
    // InternalRoverDSL.g:1134:1: rule__Mission__Group_13__0__Impl : ( 'FlashingColor:' ) ;
    public final void rule__Mission__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1138:1: ( ( 'FlashingColor:' ) )
            // InternalRoverDSL.g:1139:1: ( 'FlashingColor:' )
            {
            // InternalRoverDSL.g:1139:1: ( 'FlashingColor:' )
            // InternalRoverDSL.g:1140:2: 'FlashingColor:'
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
    // InternalRoverDSL.g:1149:1: rule__Mission__Group_13__1 : rule__Mission__Group_13__1__Impl ;
    public final void rule__Mission__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1153:1: ( rule__Mission__Group_13__1__Impl )
            // InternalRoverDSL.g:1154:2: rule__Mission__Group_13__1__Impl
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
    // InternalRoverDSL.g:1160:1: rule__Mission__Group_13__1__Impl : ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) ;
    public final void rule__Mission__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1164:1: ( ( ( rule__Mission__FlashingcolorAssignment_13_1 ) ) )
            // InternalRoverDSL.g:1165:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            {
            // InternalRoverDSL.g:1165:1: ( ( rule__Mission__FlashingcolorAssignment_13_1 ) )
            // InternalRoverDSL.g:1166:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_13_1()); 
            // InternalRoverDSL.g:1167:2: ( rule__Mission__FlashingcolorAssignment_13_1 )
            // InternalRoverDSL.g:1167:3: rule__Mission__FlashingcolorAssignment_13_1
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
    // InternalRoverDSL.g:1176:1: rule__Mission__Group_14__0 : rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 ;
    public final void rule__Mission__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1180:1: ( rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1 )
            // InternalRoverDSL.g:1181:2: rule__Mission__Group_14__0__Impl rule__Mission__Group_14__1
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
    // InternalRoverDSL.g:1188:1: rule__Mission__Group_14__0__Impl : ( 'FinalSentence:' ) ;
    public final void rule__Mission__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1192:1: ( ( 'FinalSentence:' ) )
            // InternalRoverDSL.g:1193:1: ( 'FinalSentence:' )
            {
            // InternalRoverDSL.g:1193:1: ( 'FinalSentence:' )
            // InternalRoverDSL.g:1194:2: 'FinalSentence:'
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
    // InternalRoverDSL.g:1203:1: rule__Mission__Group_14__1 : rule__Mission__Group_14__1__Impl ;
    public final void rule__Mission__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1207:1: ( rule__Mission__Group_14__1__Impl )
            // InternalRoverDSL.g:1208:2: rule__Mission__Group_14__1__Impl
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
    // InternalRoverDSL.g:1214:1: rule__Mission__Group_14__1__Impl : ( ( rule__Mission__FinalsentenceAssignment_14_1 ) ) ;
    public final void rule__Mission__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1218:1: ( ( ( rule__Mission__FinalsentenceAssignment_14_1 ) ) )
            // InternalRoverDSL.g:1219:1: ( ( rule__Mission__FinalsentenceAssignment_14_1 ) )
            {
            // InternalRoverDSL.g:1219:1: ( ( rule__Mission__FinalsentenceAssignment_14_1 ) )
            // InternalRoverDSL.g:1220:2: ( rule__Mission__FinalsentenceAssignment_14_1 )
            {
             before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_14_1()); 
            // InternalRoverDSL.g:1221:2: ( rule__Mission__FinalsentenceAssignment_14_1 )
            // InternalRoverDSL.g:1221:3: rule__Mission__FinalsentenceAssignment_14_1
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
    // InternalRoverDSL.g:1230:1: rule__Mission__MissiontypeAssignment_1 : ( ruleMissionType ) ;
    public final void rule__Mission__MissiontypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1234:1: ( ( ruleMissionType ) )
            // InternalRoverDSL.g:1235:2: ( ruleMissionType )
            {
            // InternalRoverDSL.g:1235:2: ( ruleMissionType )
            // InternalRoverDSL.g:1236:3: ruleMissionType
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
    // InternalRoverDSL.g:1245:1: rule__Mission__SafetypropertyAssignment_2_1 : ( ruleSafety ) ;
    public final void rule__Mission__SafetypropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1249:1: ( ( ruleSafety ) )
            // InternalRoverDSL.g:1250:2: ( ruleSafety )
            {
            // InternalRoverDSL.g:1250:2: ( ruleSafety )
            // InternalRoverDSL.g:1251:3: ruleSafety
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
    // InternalRoverDSL.g:1260:1: rule__Mission__LakelistAssignment_3_1 : ( ruleColors ) ;
    public final void rule__Mission__LakelistAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1264:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1265:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1265:2: ( ruleColors )
            // InternalRoverDSL.g:1266:3: ruleColors
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
    // InternalRoverDSL.g:1275:1: rule__Mission__ObjectdistanceAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Mission__ObjectdistanceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1279:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1280:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1280:2: ( RULE_INT )
            // InternalRoverDSL.g:1281:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getObjectdistanceINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getObjectdistanceINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalRoverDSL.g:1290:1: rule__Mission__BeginsentenceAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Mission__BeginsentenceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1294:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1295:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1295:2: ( RULE_STRING )
            // InternalRoverDSL.g:1296:3: RULE_STRING
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
    // InternalRoverDSL.g:1305:1: rule__Mission__BordercolorAssignment_6_1 : ( ruleColor ) ;
    public final void rule__Mission__BordercolorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1309:1: ( ( ruleColor ) )
            // InternalRoverDSL.g:1310:2: ( ruleColor )
            {
            // InternalRoverDSL.g:1310:2: ( ruleColor )
            // InternalRoverDSL.g:1311:3: ruleColor
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
    // InternalRoverDSL.g:1320:1: rule__Mission__ForwardspeedAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Mission__ForwardspeedAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1324:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1325:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1325:2: ( RULE_INT )
            // InternalRoverDSL.g:1326:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalRoverDSL.g:1335:1: rule__Mission__ReversespeedAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__Mission__ReversespeedAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1339:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1340:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1340:2: ( RULE_INT )
            // InternalRoverDSL.g:1341:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_8_1_0()); 

            }


            }

        }
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
    // InternalRoverDSL.g:1350:1: rule__Mission__TurndirectionAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Mission__TurndirectionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1354:1: ( ( RULE_INT ) )
            // InternalRoverDSL.g:1355:2: ( RULE_INT )
            {
            // InternalRoverDSL.g:1355:2: ( RULE_INT )
            // InternalRoverDSL.g:1356:3: RULE_INT
            {
             before(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_9_1_0()); 

            }


            }

        }
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
    // InternalRoverDSL.g:1365:1: rule__Mission__ColorlistAssignment_10_1 : ( ruleColors ) ;
    public final void rule__Mission__ColorlistAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1369:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1370:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1370:2: ( ruleColors )
            // InternalRoverDSL.g:1371:3: ruleColors
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
    // InternalRoverDSL.g:1380:1: rule__Mission__TerminationconditionAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Mission__TerminationconditionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1384:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1385:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1385:2: ( RULE_STRING )
            // InternalRoverDSL.g:1386:3: RULE_STRING
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
    // InternalRoverDSL.g:1395:1: rule__Mission__FlashingcolorAssignment_13_1 : ( ruleColors ) ;
    public final void rule__Mission__FlashingcolorAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1399:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1400:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1400:2: ( ruleColors )
            // InternalRoverDSL.g:1401:3: ruleColors
            {
             before(grammarAccess.getMissionAccess().getFlashingcolorColorsEnumRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getFlashingcolorColorsEnumRuleCall_13_1_0()); 

            }


            }

        }
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
    // InternalRoverDSL.g:1410:1: rule__Mission__FinalsentenceAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__Mission__FinalsentenceAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1414:1: ( ( RULE_STRING ) )
            // InternalRoverDSL.g:1415:2: ( RULE_STRING )
            {
            // InternalRoverDSL.g:1415:2: ( RULE_STRING )
            // InternalRoverDSL.g:1416:3: RULE_STRING
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


    // $ANTLR start "rule__Color__ColorAssignment"
    // InternalRoverDSL.g:1425:1: rule__Color__ColorAssignment : ( ruleColors ) ;
    public final void rule__Color__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverDSL.g:1429:1: ( ( ruleColors ) )
            // InternalRoverDSL.g:1430:2: ( ruleColors )
            {
            // InternalRoverDSL.g:1430:2: ( ruleColors )
            // InternalRoverDSL.g:1431:3: ruleColors
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}