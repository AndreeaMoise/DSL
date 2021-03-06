/*
 * generated by Xtext 2.25.0
 */
package assignment2.ide

import assignment2.GameDSLRuntimeModule
import assignment2.GameDSLStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GameDSLIdeSetup extends GameDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GameDSLRuntimeModule, new GameDSLIdeModule))
	}
	
}
