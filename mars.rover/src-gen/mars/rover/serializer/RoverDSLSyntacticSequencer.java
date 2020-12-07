/*
 * generated by Xtext 2.23.0
 */
package mars.rover.serializer;

import com.google.inject.Inject;
import java.util.List;
import mars.rover.services.RoverDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RoverDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RoverDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Mission_ColorsKeyword_9_0_q;
	protected AbstractElementAlias match_Mission_LakeColorsKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RoverDSLGrammarAccess) access;
		match_Mission_ColorsKeyword_9_0_q = new TokenAlias(false, true, grammarAccess.getMissionAccess().getColorsKeyword_9_0());
		match_Mission_LakeColorsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getMissionAccess().getLakeColorsKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Mission_ColorsKeyword_9_0_q.equals(syntax))
				emit_Mission_ColorsKeyword_9_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Mission_LakeColorsKeyword_3_0_q.equals(syntax))
				emit_Mission_LakeColorsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Colors:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     beginsentence=STRING (ambiguity) 'End:' terminationcondition=STRING
	 *     border=Colors (ambiguity) 'End:' terminationcondition=STRING
	 *     forwardspeed=INT (ambiguity) 'End:' terminationcondition=STRING
	 *     lakelist+=Colors (ambiguity) 'End:' terminationcondition=STRING
	 *     missiontype=MissionType 'LakeColors:'? (ambiguity) 'End:' terminationcondition=STRING
	 *     reversespeed=INT (ambiguity) 'End:' terminationcondition=STRING
	 *     safetyproperty=Safety 'LakeColors:'? (ambiguity) 'End:' terminationcondition=STRING
	 *     turndirection=INT (ambiguity) 'End:' terminationcondition=STRING
	 */
	protected void emit_Mission_ColorsKeyword_9_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'LakeColors:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     missiontype=MissionType (ambiguity) 'BeginSentence:' beginsentence=STRING
	 *     missiontype=MissionType (ambiguity) 'Colors:' colorlist+=Colors
	 *     missiontype=MissionType (ambiguity) 'Colors:'? 'End:' terminationcondition=STRING
	 *     missiontype=MissionType (ambiguity) 'ForwardSpeed:' forwardspeed=INT
	 *     missiontype=MissionType (ambiguity) 'OuterBorder:' border=Colors
	 *     missiontype=MissionType (ambiguity) 'ReverseSpeed:' reversespeed=INT
	 *     missiontype=MissionType (ambiguity) 'TurnDirection:' turndirection=INT
	 *     safetyproperty=Safety (ambiguity) 'BeginSentence:' beginsentence=STRING
	 *     safetyproperty=Safety (ambiguity) 'Colors:' colorlist+=Colors
	 *     safetyproperty=Safety (ambiguity) 'Colors:'? 'End:' terminationcondition=STRING
	 *     safetyproperty=Safety (ambiguity) 'ForwardSpeed:' forwardspeed=INT
	 *     safetyproperty=Safety (ambiguity) 'OuterBorder:' border=Colors
	 *     safetyproperty=Safety (ambiguity) 'ReverseSpeed:' reversespeed=INT
	 *     safetyproperty=Safety (ambiguity) 'TurnDirection:' turndirection=INT
	 */
	protected void emit_Mission_LakeColorsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
