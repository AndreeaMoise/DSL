package assignment2.generator;

import assignment2.gameDSL.Action;
import assignment2.gameDSL.Condition;
import assignment2.gameDSL.Rule;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Auxiliary {
  public static String getTextRule(final Rule r) {
    Action _action = r.getAction();
    if (_action != null) {
      switch (_action) {
        case DIES:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (gameBoard[i][j] && (surrounding ");
          String _validCondition = Auxiliary.getValidCondition(r.getCondition());
          _builder.append(_validCondition);
          _builder.append(" ");
          int _amount = r.getAmount();
          _builder.append(_amount);
          _builder.append(")) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("continue;");
          _builder.newLine();
          _builder.append("}\t\t\t\t        ");
          _builder.newLine();
          return _builder.toString();
        case SURVIVES:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if (gameBoard[i][j] && (surrounding ");
          String _validCondition_1 = Auxiliary.getValidCondition(r.getCondition());
          _builder_1.append(_validCondition_1);
          _builder_1.append(" ");
          int _amount_1 = r.getAmount();
          _builder_1.append(_amount_1);
          _builder_1.append(")) {");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("survivingCells.add(new Point(i-1,j-1));");
          _builder_1.newLine();
          _builder_1.append("}\t\t\t\t        ");
          _builder_1.newLine();
          return _builder_1.toString();
        case FORMS:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("if ((!gameBoard[i][j]) && (surrounding ");
          String _validCondition_2 = Auxiliary.getValidCondition(r.getCondition());
          _builder_2.append(_validCondition_2);
          _builder_2.append(" ");
          int _amount_2 = r.getAmount();
          _builder_2.append(_amount_2);
          _builder_2.append(")) {");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("survivingCells.add(new Point(i-1,j-1));");
          _builder_2.newLine();
          _builder_2.append("}\t\t\t\t        ");
          _builder_2.newLine();
          return _builder_2.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  public static String getValidCondition(final Condition c) {
    if (c != null) {
      switch (c) {
        case LOWER:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<");
          return _builder.toString();
        case GREATER:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(">");
          return _builder_1.toString();
        case EQUAL:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("==");
          return _builder_2.toString();
        default:
          break;
      }
    }
    return null;
  }
}
