package assignment2.generator

import assignment2.gameDSL.Condition
import assignment2.gameDSL.Action
import assignment2.gameDSL.Rule

class Auxiliary {
	def static String getTextRule(Rule r) {
		switch(r.action) {
			case Action::DIES:
				return '''
				if (gameBoard[i][j] && (surrounding «Auxiliary.getValidCondition(r.condition)» «r.amount»)) {
					survivingCells.remove(new Point(i-1,j-1));
				}				        
				'''
			case Action::SURVIVES:
				return '''
				if (gameBoard[i][j] && (surrounding «Auxiliary.getValidCondition(r.condition)» «r.amount»)) {
					continue;
				}				        
				'''
			case Action::FORMS:
				return '''
				if ((!gameBoard[i][j]) && (surrounding «Auxiliary.getValidCondition(r.condition)» «r.amount»)) {
					survivingCells.add(new Point(i-1,j-1));
				}				        
				'''	
		}
	}
	
	def static String getValidCondition (Condition c) { 
		switch(c) { 
		 case Condition::LOWER: return '''<''' 
		 case Condition::GREATER: return '''>''' 
		 case Condition::EQUAL: return '''==''' 
	   } 
  	} 
}