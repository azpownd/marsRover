/*
 * generated by Xtext 2.23.0
 */
grammar InternalRoverDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package mars.rover.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleMission
entryRuleMission
:
{ before(grammarAccess.getMissionRule()); }
	 ruleMission
{ after(grammarAccess.getMissionRule()); } 
	 EOF 
;

// Rule Mission
ruleMission 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMissionAccess().getGroup()); }
		(rule__Mission__Group__0)
		{ after(grammarAccess.getMissionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleColors
entryRuleColors
:
{ before(grammarAccess.getColorsRule()); }
	 ruleColors
{ after(grammarAccess.getColorsRule()); } 
	 EOF 
;

// Rule Colors
ruleColors 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getColorsAccess().getColorAssignment()); }
		(rule__Colors__ColorAssignment)
		{ after(grammarAccess.getColorsAccess().getColorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSensors
entryRuleSensors
:
{ before(grammarAccess.getSensorsRule()); }
	 ruleSensors
{ after(grammarAccess.getSensorsRule()); } 
	 EOF 
;

// Rule Sensors
ruleSensors 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSensorsAccess().getSensorAssignment()); }
		(rule__Sensors__SensorAssignment)
		{ after(grammarAccess.getSensorsAccess().getSensorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule MissionType
ruleMissionType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionTypeAccess().getAlternatives()); }
		(rule__MissionType__Alternatives)
		{ after(grammarAccess.getMissionTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MissionType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); }
		('AvoidColors')
		{ after(grammarAccess.getMissionTypeAccess().getAvoidColorsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); }
		('FindColors')
		{ after(grammarAccess.getMissionTypeAccess().getFindColorsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__0__Impl
	rule__Mission__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getMissionKeyword_0()); }
	'Mission:'
	{ after(grammarAccess.getMissionAccess().getMissionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__1__Impl
	rule__Mission__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); }
	(rule__Mission__MissiontypeAssignment_1)
	{ after(grammarAccess.getMissionAccess().getMissiontypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__2__Impl
	rule__Mission__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_2()); }
	(rule__Mission__Group_2__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__3__Impl
	rule__Mission__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_3()); }
	(rule__Mission__Group_3__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__4__Impl
	rule__Mission__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_4()); }
	(rule__Mission__Group_4__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__5__Impl
	rule__Mission__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_5()); }
	(rule__Mission__Group_5__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__6__Impl
	rule__Mission__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_6()); }
	(rule__Mission__Group_6__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__7__Impl
	rule__Mission__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_7()); }
	(rule__Mission__Group_7__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__8__Impl
	rule__Mission__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_8()); }
	(rule__Mission__Group_8__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__9__Impl
	rule__Mission__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_9()); }
	(rule__Mission__Group_9__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__10__Impl
	rule__Mission__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getEndKeyword_10()); }
	'End:'
	{ after(grammarAccess.getMissionAccess().getEndKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__11__Impl
	rule__Mission__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11()); }
	(rule__Mission__TerminationconditionAssignment_11)
	{ after(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__12__Impl
	rule__Mission__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_12()); }
	(rule__Mission__Group_12__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getGroup_13()); }
	(rule__Mission__Group_13__0)?
	{ after(grammarAccess.getMissionAccess().getGroup_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_2__0__Impl
	rule__Mission__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); }
	'Safety:'
	{ after(grammarAccess.getMissionAccess().getSafetyKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); }
	(rule__Mission__SafetypropertyAssignment_2_1)
	{ after(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__0__Impl
	rule__Mission__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getBeginSentenceKeyword_3_0()); }
	'BeginSentence:'
	{ after(grammarAccess.getMissionAccess().getBeginSentenceKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getBeginsentenceAssignment_3_1()); }
	(rule__Mission__BeginsentenceAssignment_3_1)
	{ after(grammarAccess.getMissionAccess().getBeginsentenceAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_4__0__Impl
	rule__Mission__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getOuterBorderKeyword_4_0()); }
	'OuterBorder:'
	{ after(grammarAccess.getMissionAccess().getOuterBorderKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getBorderAssignment_4_1()); }
	(rule__Mission__BorderAssignment_4_1)
	{ after(grammarAccess.getMissionAccess().getBorderAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_5__0__Impl
	rule__Mission__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getForwardSpeedKeyword_5_0()); }
	'ForwardSpeed:'
	{ after(grammarAccess.getMissionAccess().getForwardSpeedKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getForwardspeedAssignment_5_1()); }
	(rule__Mission__ForwardspeedAssignment_5_1)
	{ after(grammarAccess.getMissionAccess().getForwardspeedAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_6__0__Impl
	rule__Mission__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getReverseSpeedKeyword_6_0()); }
	'ReverseSpeed:'
	{ after(grammarAccess.getMissionAccess().getReverseSpeedKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getReversespeedAssignment_6_1()); }
	(rule__Mission__ReversespeedAssignment_6_1)
	{ after(grammarAccess.getMissionAccess().getReversespeedAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_7__0__Impl
	rule__Mission__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getTurnDirectionKeyword_7_0()); }
	'TurnDirection:'
	{ after(grammarAccess.getMissionAccess().getTurnDirectionKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getTurndirectionAssignment_7_1()); }
	(rule__Mission__TurndirectionAssignment_7_1)
	{ after(grammarAccess.getMissionAccess().getTurndirectionAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_8__0__Impl
	rule__Mission__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getColorsKeyword_8_0()); }
	'Colors:'
	{ after(grammarAccess.getMissionAccess().getColorsKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getColorlistAssignment_8_1()); }
	(rule__Mission__ColorlistAssignment_8_1)*
	{ after(grammarAccess.getMissionAccess().getColorlistAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_9__0__Impl
	rule__Mission__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getSensorsKeyword_9_0()); }
	'Sensors:'
	{ after(grammarAccess.getMissionAccess().getSensorsKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getSensorlistAssignment_9_1()); }
	(rule__Mission__SensorlistAssignment_9_1)*
	{ after(grammarAccess.getMissionAccess().getSensorlistAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_12__0__Impl
	rule__Mission__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0()); }
	'FlashingColor:'
	{ after(grammarAccess.getMissionAccess().getFlashingColorKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1()); }
	(rule__Mission__FlashingcolorAssignment_12_1)
	{ after(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_13__0__Impl
	rule__Mission__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0()); }
	'FinalSentence:'
	{ after(grammarAccess.getMissionAccess().getFinalSentenceKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mission__Group_13__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1()); }
	(rule__Mission__FinalsentenceAssignment_13_1)
	{ after(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mission__MissiontypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0()); }
		ruleMissionType
		{ after(grammarAccess.getMissionAccess().getMissiontypeMissionTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__SafetypropertyAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getSafetypropertySTRINGTerminalRuleCall_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getSafetypropertySTRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__BeginsentenceAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getBeginsentenceSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__BorderAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getBorderSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__ForwardspeedAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMissionAccess().getForwardspeedINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__ReversespeedAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_6_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMissionAccess().getReversespeedINTTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__TurndirectionAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_7_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMissionAccess().getTurndirectionINTTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__ColorlistAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_8_1_0()); }
		ruleColors
		{ after(grammarAccess.getMissionAccess().getColorlistColorsParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__SensorlistAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_9_1_0()); }
		ruleSensors
		{ after(grammarAccess.getMissionAccess().getSensorlistSensorsParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__TerminationconditionAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_11_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getTerminationconditionSTRINGTerminalRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__FlashingcolorAssignment_12_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_12_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getFlashingcolorSTRINGTerminalRuleCall_12_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mission__FinalsentenceAssignment_13_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_13_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMissionAccess().getFinalsentenceSTRINGTerminalRuleCall_13_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Colors__ColorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getColorsAccess().getColorSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getColorsAccess().getColorSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensors__SensorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSensorsAccess().getSensorSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getSensorsAccess().getSensorSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
