package assignment2.generator

import assignment2.gameDSL.Game

class JavaGenerator {
	def static toJava(Game root)'''
		package GameOfLife;
		
		import java.awt.Point;
		import java.util.ArrayList;
		
		import GameOfLife.GameOfLife.GameBoard;
		
		public class RulesOfLife {
			public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
				
				// Iterate through the array, follow game of life rules
				for (int i=1; i<gameBoard.length-1; i++) {
					for (int j=1; j<gameBoard[0].length-1; j++) {
				        int surrounding = 0;
				        if (gameBoard[i-1][j-1]) { surrounding++; }
				        if (gameBoard[i-1][j])   { surrounding++; }
				        if (gameBoard[i-1][j+1]) { surrounding++; }
				        if (gameBoard[i][j-1])   { surrounding++; }
				        if (gameBoard[i][j+1])   { surrounding++; }
				        if (gameBoard[i+1][j-1]) { surrounding++; }
				        if (gameBoard[i+1][j])   { surrounding++; }
				        if (gameBoard[i+1][j+1]) { surrounding++; }
				        
				        «FOR r: root.rules» 
				        «Auxiliary.getTextRule(r)»
				        «ENDFOR»
			        }
			    }
			}
			
			public static void initializeGameBoard(GameBoard gameBoard) {
				«FOR c: root.grid.state.alives»
				gameBoard.addPoint(«c.coordinates.row»,«c.coordinates.column»);
				«ENDFOR»
			}
		}
		
	'''
	}