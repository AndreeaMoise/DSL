/*
 * generated by Xtext 2.25.0
 */
package assignment2.parser.antlr;

import assignment2.parser.antlr.internal.InternalGameDSLParser;
import assignment2.services.GameDSLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GameDSLParser extends AbstractAntlrParser {

	@Inject
	private GameDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGameDSLParser createParser(XtextTokenStream stream) {
		return new InternalGameDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Game";
	}

	public GameDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GameDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
