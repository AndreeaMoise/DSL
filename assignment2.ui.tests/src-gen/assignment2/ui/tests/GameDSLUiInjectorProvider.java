/*
 * generated by Xtext 2.25.0
 */
package assignment2.ui.tests;

import assignment2.ui.internal.Assignment2Activator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GameDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Assignment2Activator.getInstance().getInjector("assignment2.GameDSL");
	}

}
