package assignment2.generator;

import assignment2.gameDSL.Cell;
import assignment2.gameDSL.Game;
import assignment2.gameDSL.Rule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaGenerator {
  public static CharSequence toJava(final Game root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import GameOfLife.GameOfLife.GameBoard;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.newLine();
    {
      EList<Rule> _rules = root.getRules();
      for(final Rule r : _rules) {
        _builder.append("\t\t        ");
        String _textRule = Auxiliary.getTextRule(r);
        _builder.append(_textRule, "\t\t        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void initializeGameBoard(GameBoard gameBoard) {");
    _builder.newLine();
    {
      EList<Cell> _alives = root.getGrid().getState().getAlives();
      for(final Cell c : _alives) {
        _builder.append("\t\t");
        _builder.append("gameBoard.addPoint(");
        int _row = c.getCoordinates().getRow();
        _builder.append(_row, "\t\t");
        _builder.append(",");
        int _column = c.getCoordinates().getColumn();
        _builder.append(_column, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
