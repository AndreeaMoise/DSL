/*
 * generated by Xtext 2.25.0
 */
package assignment2.serializer;

import assignment2.gameDSL.Cell;
import assignment2.gameDSL.Coordinates;
import assignment2.gameDSL.Game;
import assignment2.gameDSL.GameDSLPackage;
import assignment2.gameDSL.Grid;
import assignment2.gameDSL.Rule;
import assignment2.gameDSL.Size;
import assignment2.gameDSL.State;
import assignment2.services.GameDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GameDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GameDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GameDSLPackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case GameDSLPackage.COORDINATES:
				sequence_Coordinates(context, (Coordinates) semanticObject); 
				return; 
			case GameDSLPackage.GAME:
				sequence_Game(context, (Game) semanticObject); 
				return; 
			case GameDSLPackage.GRID:
				sequence_Grid(context, (Grid) semanticObject); 
				return; 
			case GameDSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case GameDSLPackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			case GameDSLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     (coordinates=Coordinates cellType=CellType)
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.CELL__COORDINATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.CELL__COORDINATES));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.CELL__CELL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.CELL__CELL_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getCoordinatesCoordinatesParserRuleCall_0_0(), semanticObject.getCoordinates());
		feeder.accept(grammarAccess.getCellAccess().getCellTypeCellTypeEnumRuleCall_1_0(), semanticObject.getCellType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Coordinates returns Coordinates
	 *
	 * Constraint:
	 *     (row=INT column=INT)
	 */
	protected void sequence_Coordinates(ISerializationContext context, Coordinates semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.COORDINATES__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.COORDINATES__ROW));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.COORDINATES__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.COORDINATES__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinatesAccess().getRowINTTerminalRuleCall_1_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getCoordinatesAccess().getColumnINTTerminalRuleCall_3_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Game returns Game
	 *
	 * Constraint:
	 *     (name=ID grid=Grid rules+=Rule+)
	 */
	protected void sequence_Game(ISerializationContext context, Game semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Grid returns Grid
	 *
	 * Constraint:
	 *     (size=Size state=State)
	 */
	protected void sequence_Grid(ISerializationContext context, Grid semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.GRID__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.GRID__SIZE));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.GRID__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.GRID__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_2_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getGridAccess().getStateStateParserRuleCall_4_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (condition=Condition amount=INT action=Action)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.RULE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.RULE__AMOUNT));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.RULE__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.RULE__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_2_0(), semanticObject.getAmount());
		feeder.accept(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_3_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (rows=INT columns=INT)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.SIZE__ROWS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.SIZE__ROWS));
			if (transientValues.isValueTransient(semanticObject, GameDSLPackage.Literals.SIZE__COLUMNS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GameDSLPackage.Literals.SIZE__COLUMNS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAccess().getRowsINTTerminalRuleCall_1_0(), semanticObject.getRows());
		feeder.accept(grammarAccess.getSizeAccess().getColumnsINTTerminalRuleCall_3_0(), semanticObject.getColumns());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     alives+=Cell+
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
