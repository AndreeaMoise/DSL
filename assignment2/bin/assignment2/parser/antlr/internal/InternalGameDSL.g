/*
 * generated by Xtext 2.25.0
 */
grammar InternalGameDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package assignment2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package assignment2.parser.antlr.internal;

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
import assignment2.services.GameDSLGrammarAccess;

}

@parser::members {

 	private GameDSLGrammarAccess grammarAccess;

    public InternalGameDSLParser(TokenStream input, GameDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Game";
   	}

   	@Override
   	protected GameDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGame
entryRuleGame returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGameRule()); }
	iv_ruleGame=ruleGame
	{ $current=$iv_ruleGame.current; }
	EOF;

// Rule Game
ruleGame returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Game'
		{
			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGameRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getGridGridParserRuleCall_2_0());
				}
				lv_grid_2_0=ruleGrid
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					set(
						$current,
						"grid",
						lv_grid_2_0,
						"assignment2.GameDSL.Grid");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='Rules'
		{
			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getRulesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getRulesRuleParserRuleCall_4_0());
				}
				lv_rules_4_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					add(
						$current,
						"rules",
						lv_rules_4_0,
						"assignment2.GameDSL.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleGrid
entryRuleGrid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGridRule()); }
	iv_ruleGrid=ruleGrid
	{ $current=$iv_ruleGrid.current; }
	EOF;

// Rule Grid
ruleGrid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Grid'
		{
			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
		}
		(
			otherlv_1='Size'
			{
				newLeafNode(otherlv_1, grammarAccess.getGridAccess().getSizeKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_1_0());
					}
					lv_size_2_0=ruleSize
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGridRule());
						}
						set(
							$current,
							"size",
							lv_size_2_0,
							"assignment2.GameDSL.Size");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3='State'
		{
			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getStateKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGridAccess().getStateStateParserRuleCall_3_0());
				}
				lv_state_4_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGridRule());
					}
					set(
						$current,
						"state",
						lv_state_4_0,
						"assignment2.GameDSL.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSize
entryRuleSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeRule()); }
	iv_ruleSize=ruleSize
	{ $current=$iv_ruleSize.current; }
	EOF;

// Rule Size
ruleSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_rows_1_0=RULE_INT
				{
					newLeafNode(lv_rows_1_0, grammarAccess.getSizeAccess().getRowsINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"rows",
						lv_rows_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getSizeAccess().getCommaKeyword_2());
		}
		(
			(
				lv_columns_3_0=RULE_INT
				{
					newLeafNode(lv_columns_3_0, grammarAccess.getSizeAccess().getColumnsINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"columns",
						lv_columns_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getSizeAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStateAccess().getAlivesCellParserRuleCall_0());
			}
			lv_alives_0_0=ruleCell
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStateRule());
				}
				add(
					$current,
					"alives",
					lv_alives_0_0,
					"assignment2.GameDSL.Cell");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleCell
entryRuleCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellRule()); }
	iv_ruleCell=ruleCell
	{ $current=$iv_ruleCell.current; }
	EOF;

// Rule Cell
ruleCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCellAccess().getCoordinatesCoordinatesParserRuleCall_0_0());
				}
				lv_coordinates_0_0=ruleCoordinates
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellRule());
					}
					set(
						$current,
						"coordinates",
						lv_coordinates_0_0,
						"assignment2.GameDSL.Coordinates");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCellAccess().getCellTypeCellTypeEnumRuleCall_1_0());
				}
				lv_cellType_1_0=ruleCellType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellRule());
					}
					set(
						$current,
						"cellType",
						lv_cellType_1_0,
						"assignment2.GameDSL.CellType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCoordinates
entryRuleCoordinates returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinatesRule()); }
	iv_ruleCoordinates=ruleCoordinates
	{ $current=$iv_ruleCoordinates.current; }
	EOF;

// Rule Coordinates
ruleCoordinates returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_row_1_0=RULE_INT
				{
					newLeafNode(lv_row_1_0, grammarAccess.getCoordinatesAccess().getRowINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinatesRule());
					}
					setWithLastConsumed(
						$current,
						"row",
						lv_row_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getCommaKeyword_2());
		}
		(
			(
				lv_column_3_0=RULE_INT
				{
					newLeafNode(lv_column_3_0, grammarAccess.getCoordinatesAccess().getColumnINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinatesRule());
					}
					setWithLastConsumed(
						$current,
						"column",
						lv_column_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Rule'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"assignment2.GameDSL.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_amount_2_0=RULE_INT
				{
					newLeafNode(lv_amount_2_0, grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
					setWithLastConsumed(
						$current,
						"amount",
						lv_amount_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_3_0());
				}
				lv_action_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"action",
						lv_action_3_0,
						"assignment2.GameDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule CellType
ruleCellType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='dead'
			{
				$current = grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='alive'
			{
				$current = grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Action
ruleAction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='dies'
			{
				$current = grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='survives'
			{
				$current = grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='forms'
			{
				$current = grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Condition
ruleCondition returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='>'
			{
				$current = grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<'
			{
				$current = grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='='
			{
				$current = grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
