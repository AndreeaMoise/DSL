/*
 * generated by Xtext 2.25.0
 */
package assignment2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GameDSLStandaloneSetup extends GameDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new GameDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}