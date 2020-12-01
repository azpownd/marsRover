/*
 * generated by Xtext 2.23.0
 */
package mars.rover.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RoverDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MissionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Mission");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMissionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMissiontypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMissiontypeMissionTypeEnumRuleCall_1_0 = (RuleCall)cMissiontypeAssignment_1.eContents().get(0);
		private final Keyword cOuterBorderKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBorderAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBorderSTRINGTerminalRuleCall_3_0 = (RuleCall)cBorderAssignment_3.eContents().get(0);
		private final Keyword cForwardSpeedPercentageKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cForwardspeedAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cForwardspeedINTTerminalRuleCall_5_0 = (RuleCall)cForwardspeedAssignment_5.eContents().get(0);
		private final Keyword cReverseSpeedPercentageKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cReversespeedAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cReversespeedINTTerminalRuleCall_7_0 = (RuleCall)cReversespeedAssignment_7.eContents().get(0);
		private final Keyword cTurnDirectionKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cTurndirectionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cTurndirectionSTRINGTerminalRuleCall_9_0 = (RuleCall)cTurndirectionAssignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cColorsKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cColorlistAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cColorlistColorsParserRuleCall_10_1_0 = (RuleCall)cColorlistAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cSensorsKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cSensorlistAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cSensorlistSensorsParserRuleCall_11_1_0 = (RuleCall)cSensorlistAssignment_11_1.eContents().get(0);
		private final Keyword cEndKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cTerminationconditionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cTerminationconditionSTRINGTerminalRuleCall_13_0 = (RuleCall)cTerminationconditionAssignment_13.eContents().get(0);
		private final Keyword cFlashingColorKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cFlashingcolorAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cFlashingcolorSTRINGTerminalRuleCall_15_0 = (RuleCall)cFlashingcolorAssignment_15.eContents().get(0);
		private final Keyword cFinalSentenceKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cFinalsentenceAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cFinalsentenceSTRINGTerminalRuleCall_17_0 = (RuleCall)cFinalsentenceAssignment_17.eContents().get(0);
		
		////Model:
		////	greetings+=Greeting*;
		////Greeting:
		////	'Hello' name=ID '!';
		//// test for new commit Jurian
		//Mission:
		//	'Mission:' missiontype=MissionType
		//	//'Safety:' safetyproperty = STRING // only ON and OFF or more specific?
		//	'OuterBorder:' border=STRING // optional? (if not given, make default?)
		//	'ForwardSpeedPercentage:' forwardspeed=INT // optional? (if not given, make default?)
		//	'ReverseSpeedPercentage:' reversespeed=INT // optional? (if not given, make default?)
		//	'TurnDirection:' turndirection=STRING ('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)?
		//	'End:' terminationcondition=STRING // add validation for types of termination values (based on mission)
		//	'FlashingColor:' flashingcolor=STRING // cuz cant reuse color enum right? (when mission is complete)
		//	'FinalSentence:' finalsentence=STRING // For robot to say when mission is done (maybe make optional) Maybe change final sentence to song? (validate options)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Mission:' missiontype=MissionType //'Safety:' safetyproperty = STRING // only ON and OFF or more specific?
		//'OuterBorder:' border=STRING // optional? (if not given, make default?)
		//'ForwardSpeedPercentage:' forwardspeed=INT // optional? (if not given, make default?)
		//'ReverseSpeedPercentage:' reversespeed=INT // optional? (if not given, make default?)
		//'TurnDirection:' turndirection=STRING ('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)? 'End:'
		//terminationcondition=STRING // add validation for types of termination values (based on mission)
		//'FlashingColor:' flashingcolor=STRING // cuz cant reuse color enum right? (when mission is complete)
		//'FinalSentence:' finalsentence=STRING
		public Group getGroup() { return cGroup; }
		
		//'Mission:'
		public Keyword getMissionKeyword_0() { return cMissionKeyword_0; }
		
		//missiontype=MissionType
		public Assignment getMissiontypeAssignment_1() { return cMissiontypeAssignment_1; }
		
		//MissionType
		public RuleCall getMissiontypeMissionTypeEnumRuleCall_1_0() { return cMissiontypeMissionTypeEnumRuleCall_1_0; }
		
		////'Safety:' safetyproperty = STRING // only ON and OFF or more specific?
		//'OuterBorder:'
		public Keyword getOuterBorderKeyword_2() { return cOuterBorderKeyword_2; }
		
		//border=STRING
		public Assignment getBorderAssignment_3() { return cBorderAssignment_3; }
		
		//STRING
		public RuleCall getBorderSTRINGTerminalRuleCall_3_0() { return cBorderSTRINGTerminalRuleCall_3_0; }
		
		//// optional? (if not given, make default?)
		//'ForwardSpeedPercentage:'
		public Keyword getForwardSpeedPercentageKeyword_4() { return cForwardSpeedPercentageKeyword_4; }
		
		//forwardspeed=INT
		public Assignment getForwardspeedAssignment_5() { return cForwardspeedAssignment_5; }
		
		//INT
		public RuleCall getForwardspeedINTTerminalRuleCall_5_0() { return cForwardspeedINTTerminalRuleCall_5_0; }
		
		//// optional? (if not given, make default?)
		//'ReverseSpeedPercentage:'
		public Keyword getReverseSpeedPercentageKeyword_6() { return cReverseSpeedPercentageKeyword_6; }
		
		//reversespeed=INT
		public Assignment getReversespeedAssignment_7() { return cReversespeedAssignment_7; }
		
		//INT
		public RuleCall getReversespeedINTTerminalRuleCall_7_0() { return cReversespeedINTTerminalRuleCall_7_0; }
		
		//// optional? (if not given, make default?)
		//'TurnDirection:'
		public Keyword getTurnDirectionKeyword_8() { return cTurnDirectionKeyword_8; }
		
		//turndirection=STRING
		public Assignment getTurndirectionAssignment_9() { return cTurndirectionAssignment_9; }
		
		//STRING
		public RuleCall getTurndirectionSTRINGTerminalRuleCall_9_0() { return cTurndirectionSTRINGTerminalRuleCall_9_0; }
		
		//('Colors:' colorlist+=Colors*)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'Colors:'
		public Keyword getColorsKeyword_10_0() { return cColorsKeyword_10_0; }
		
		//colorlist+=Colors*
		public Assignment getColorlistAssignment_10_1() { return cColorlistAssignment_10_1; }
		
		//Colors
		public RuleCall getColorlistColorsParserRuleCall_10_1_0() { return cColorlistColorsParserRuleCall_10_1_0; }
		
		//('Sensors:' sensorlist+=Sensors*)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'Sensors:'
		public Keyword getSensorsKeyword_11_0() { return cSensorsKeyword_11_0; }
		
		//sensorlist+=Sensors*
		public Assignment getSensorlistAssignment_11_1() { return cSensorlistAssignment_11_1; }
		
		//Sensors
		public RuleCall getSensorlistSensorsParserRuleCall_11_1_0() { return cSensorlistSensorsParserRuleCall_11_1_0; }
		
		//'End:'
		public Keyword getEndKeyword_12() { return cEndKeyword_12; }
		
		//terminationcondition=STRING
		public Assignment getTerminationconditionAssignment_13() { return cTerminationconditionAssignment_13; }
		
		//STRING
		public RuleCall getTerminationconditionSTRINGTerminalRuleCall_13_0() { return cTerminationconditionSTRINGTerminalRuleCall_13_0; }
		
		//// add validation for types of termination values (based on mission)
		//'FlashingColor:'
		public Keyword getFlashingColorKeyword_14() { return cFlashingColorKeyword_14; }
		
		//flashingcolor=STRING
		public Assignment getFlashingcolorAssignment_15() { return cFlashingcolorAssignment_15; }
		
		//STRING
		public RuleCall getFlashingcolorSTRINGTerminalRuleCall_15_0() { return cFlashingcolorSTRINGTerminalRuleCall_15_0; }
		
		//// cuz cant reuse color enum right? (when mission is complete)
		//'FinalSentence:'
		public Keyword getFinalSentenceKeyword_16() { return cFinalSentenceKeyword_16; }
		
		//finalsentence=STRING
		public Assignment getFinalsentenceAssignment_17() { return cFinalsentenceAssignment_17; }
		
		//STRING
		public RuleCall getFinalsentenceSTRINGTerminalRuleCall_17_0() { return cFinalsentenceSTRINGTerminalRuleCall_17_0; }
	}
	public class ColorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Colors");
		private final Assignment cColorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cColorSTRINGTerminalRuleCall_0 = (RuleCall)cColorAssignment.eContents().get(0);
		
		//Colors:
		//	color=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//color=STRING
		public Assignment getColorAssignment() { return cColorAssignment; }
		
		//STRING
		public RuleCall getColorSTRINGTerminalRuleCall_0() { return cColorSTRINGTerminalRuleCall_0; }
	}
	public class SensorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Sensors");
		private final Assignment cSensorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSensorSTRINGTerminalRuleCall_0 = (RuleCall)cSensorAssignment.eContents().get(0);
		
		//// Keep string or change to enum???
		//Sensors:
		//	sensor=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//sensor=STRING
		public Assignment getSensorAssignment() { return cSensorAssignment; }
		
		//STRING
		public RuleCall getSensorSTRINGTerminalRuleCall_0() { return cSensorSTRINGTerminalRuleCall_0; }
	}
	
	public class MissionTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.MissionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAvoidColorsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAvoidColorsAvoidColorsKeyword_0_0 = (Keyword)cAvoidColorsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDetectBottleEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDetectBottleDetectBottleKeyword_1_0 = (Keyword)cDetectBottleEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFindColorsEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFindColorsFindColorsKeyword_2_0 = (Keyword)cFindColorsEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum MissionType:
		//	AvoidColors | DetectBottle | FindColors;
		public EnumRule getRule() { return rule; }
		
		//AvoidColors | DetectBottle | FindColors
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AvoidColors
		public EnumLiteralDeclaration getAvoidColorsEnumLiteralDeclaration_0() { return cAvoidColorsEnumLiteralDeclaration_0; }
		
		//"AvoidColors"
		public Keyword getAvoidColorsAvoidColorsKeyword_0_0() { return cAvoidColorsAvoidColorsKeyword_0_0; }
		
		//DetectBottle
		public EnumLiteralDeclaration getDetectBottleEnumLiteralDeclaration_1() { return cDetectBottleEnumLiteralDeclaration_1; }
		
		//"DetectBottle"
		public Keyword getDetectBottleDetectBottleKeyword_1_0() { return cDetectBottleDetectBottleKeyword_1_0; }
		
		//FindColors
		public EnumLiteralDeclaration getFindColorsEnumLiteralDeclaration_2() { return cFindColorsEnumLiteralDeclaration_2; }
		
		//"FindColors"
		public Keyword getFindColorsFindColorsKeyword_2_0() { return cFindColorsFindColorsKeyword_2_0; }
	}
	
	private final MissionElements pMission;
	private final MissionTypeElements eMissionType;
	private final ColorsElements pColors;
	private final SensorsElements pSensors;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RoverDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMission = new MissionElements();
		this.eMissionType = new MissionTypeElements();
		this.pColors = new ColorsElements();
		this.pSensors = new SensorsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("mars.rover.RoverDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////Model:
	////	greetings+=Greeting*;
	////Greeting:
	////	'Hello' name=ID '!';
	//// test for new commit Jurian
	//Mission:
	//	'Mission:' missiontype=MissionType
	//	//'Safety:' safetyproperty = STRING // only ON and OFF or more specific?
	//	'OuterBorder:' border=STRING // optional? (if not given, make default?)
	//	'ForwardSpeedPercentage:' forwardspeed=INT // optional? (if not given, make default?)
	//	'ReverseSpeedPercentage:' reversespeed=INT // optional? (if not given, make default?)
	//	'TurnDirection:' turndirection=STRING ('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)?
	//	'End:' terminationcondition=STRING // add validation for types of termination values (based on mission)
	//	'FlashingColor:' flashingcolor=STRING // cuz cant reuse color enum right? (when mission is complete)
	//	'FinalSentence:' finalsentence=STRING // For robot to say when mission is done (maybe make optional) Maybe change final sentence to song? (validate options)
	//;
	public MissionElements getMissionAccess() {
		return pMission;
	}
	
	public ParserRule getMissionRule() {
		return getMissionAccess().getRule();
	}
	
	//enum MissionType:
	//	AvoidColors | DetectBottle | FindColors;
	public MissionTypeElements getMissionTypeAccess() {
		return eMissionType;
	}
	
	public EnumRule getMissionTypeRule() {
		return getMissionTypeAccess().getRule();
	}
	
	//Colors:
	//	color=STRING;
	public ColorsElements getColorsAccess() {
		return pColors;
	}
	
	public ParserRule getColorsRule() {
		return getColorsAccess().getRule();
	}
	
	//// Keep string or change to enum???
	//Sensors:
	//	sensor=STRING;
	public SensorsElements getSensorsAccess() {
		return pSensors;
	}
	
	public ParserRule getSensorsRule() {
		return getSensorsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
