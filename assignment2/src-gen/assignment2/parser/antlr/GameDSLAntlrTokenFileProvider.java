/*
 * generated by Xtext 2.25.0
 */
package assignment2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GameDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("assignment2/parser/antlr/internal/InternalGameDSL.tokens");
	}
}
