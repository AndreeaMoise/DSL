package assignment2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import assignment2.services.GameDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Rules'", "'Grid'", "'Size'", "'State'", "'('", "','", "')'", "'Rule'", "'dead'", "'alive'", "'dies'", "'survives'", "'forms'", "'>'", "'<'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameDSL.g"; }



     	private GameDSLGrammarAccess grammarAccess;

        public InternalGameDSLParser(TokenStream input, GameDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGameDSL.g:65:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGameDSL.g:65:45: (iv_ruleGame= ruleGame EOF )
            // InternalGameDSL.g:66:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGameDSL.g:72:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_grid_2_0= ruleGrid ) ) otherlv_3= 'Rules' ( (lv_rules_4_0= ruleRule ) )+ ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_grid_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_grid_2_0= ruleGrid ) ) otherlv_3= 'Rules' ( (lv_rules_4_0= ruleRule ) )+ ) )
            // InternalGameDSL.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_grid_2_0= ruleGrid ) ) otherlv_3= 'Rules' ( (lv_rules_4_0= ruleRule ) )+ )
            {
            // InternalGameDSL.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_grid_2_0= ruleGrid ) ) otherlv_3= 'Rules' ( (lv_rules_4_0= ruleRule ) )+ )
            // InternalGameDSL.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_grid_2_0= ruleGrid ) ) otherlv_3= 'Rules' ( (lv_rules_4_0= ruleRule ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalGameDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGameDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGameDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalGameDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGameDSL.g:102:3: ( (lv_grid_2_0= ruleGrid ) )
            // InternalGameDSL.g:103:4: (lv_grid_2_0= ruleGrid )
            {
            // InternalGameDSL.g:103:4: (lv_grid_2_0= ruleGrid )
            // InternalGameDSL.g:104:5: lv_grid_2_0= ruleGrid
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGridGridParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_grid_2_0=ruleGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"grid",
            						lv_grid_2_0,
            						"assignment2.GameDSL.Grid");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getRulesKeyword_3());
            		
            // InternalGameDSL.g:125:3: ( (lv_rules_4_0= ruleRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameDSL.g:126:4: (lv_rules_4_0= ruleRule )
            	    {
            	    // InternalGameDSL.g:126:4: (lv_rules_4_0= ruleRule )
            	    // InternalGameDSL.g:127:5: lv_rules_4_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getRulesRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_4_0,
            	    						"assignment2.GameDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGrid"
    // InternalGameDSL.g:148:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGameDSL.g:148:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGameDSL.g:149:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameDSL.g:155:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Grid' otherlv_1= 'Size' ( (lv_size_2_0= ruleSize ) ) otherlv_3= 'State' ( (lv_state_4_0= ruleState ) ) ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_size_2_0 = null;

        EObject lv_state_4_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:161:2: ( (otherlv_0= 'Grid' otherlv_1= 'Size' ( (lv_size_2_0= ruleSize ) ) otherlv_3= 'State' ( (lv_state_4_0= ruleState ) ) ) )
            // InternalGameDSL.g:162:2: (otherlv_0= 'Grid' otherlv_1= 'Size' ( (lv_size_2_0= ruleSize ) ) otherlv_3= 'State' ( (lv_state_4_0= ruleState ) ) )
            {
            // InternalGameDSL.g:162:2: (otherlv_0= 'Grid' otherlv_1= 'Size' ( (lv_size_2_0= ruleSize ) ) otherlv_3= 'State' ( (lv_state_4_0= ruleState ) ) )
            // InternalGameDSL.g:163:3: otherlv_0= 'Grid' otherlv_1= 'Size' ( (lv_size_2_0= ruleSize ) ) otherlv_3= 'State' ( (lv_state_4_0= ruleState ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGridAccess().getSizeKeyword_1());
            		
            // InternalGameDSL.g:171:3: ( (lv_size_2_0= ruleSize ) )
            // InternalGameDSL.g:172:4: (lv_size_2_0= ruleSize )
            {
            // InternalGameDSL.g:172:4: (lv_size_2_0= ruleSize )
            // InternalGameDSL.g:173:5: lv_size_2_0= ruleSize
            {

            					newCompositeNode(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_size_2_0=ruleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_2_0,
            						"assignment2.GameDSL.Size");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getStateKeyword_3());
            		
            // InternalGameDSL.g:194:3: ( (lv_state_4_0= ruleState ) )
            // InternalGameDSL.g:195:4: (lv_state_4_0= ruleState )
            {
            // InternalGameDSL.g:195:4: (lv_state_4_0= ruleState )
            // InternalGameDSL.g:196:5: lv_state_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGridAccess().getStateStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_4_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_4_0,
            						"assignment2.GameDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleSize"
    // InternalGameDSL.g:217:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalGameDSL.g:217:45: (iv_ruleSize= ruleSize EOF )
            // InternalGameDSL.g:218:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalGameDSL.g:224:1: ruleSize returns [EObject current=null] : (otherlv_0= '(' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rows_1_0=null;
        Token otherlv_2=null;
        Token lv_columns_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGameDSL.g:230:2: ( (otherlv_0= '(' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGameDSL.g:231:2: (otherlv_0= '(' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGameDSL.g:231:2: (otherlv_0= '(' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGameDSL.g:232:3: otherlv_0= '(' ( (lv_rows_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_columns_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGameDSL.g:236:3: ( (lv_rows_1_0= RULE_INT ) )
            // InternalGameDSL.g:237:4: (lv_rows_1_0= RULE_INT )
            {
            // InternalGameDSL.g:237:4: (lv_rows_1_0= RULE_INT )
            // InternalGameDSL.g:238:5: lv_rows_1_0= RULE_INT
            {
            lv_rows_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_rows_1_0, grammarAccess.getSizeAccess().getRowsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rows",
            						lv_rows_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSizeAccess().getCommaKeyword_2());
            		
            // InternalGameDSL.g:258:3: ( (lv_columns_3_0= RULE_INT ) )
            // InternalGameDSL.g:259:4: (lv_columns_3_0= RULE_INT )
            {
            // InternalGameDSL.g:259:4: (lv_columns_3_0= RULE_INT )
            // InternalGameDSL.g:260:5: lv_columns_3_0= RULE_INT
            {
            lv_columns_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_columns_3_0, grammarAccess.getSizeAccess().getColumnsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSizeAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleState"
    // InternalGameDSL.g:284:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGameDSL.g:284:46: (iv_ruleState= ruleState EOF )
            // InternalGameDSL.g:285:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGameDSL.g:291:1: ruleState returns [EObject current=null] : ( (lv_alives_0_0= ruleCell ) )+ ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject lv_alives_0_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:297:2: ( ( (lv_alives_0_0= ruleCell ) )+ )
            // InternalGameDSL.g:298:2: ( (lv_alives_0_0= ruleCell ) )+
            {
            // InternalGameDSL.g:298:2: ( (lv_alives_0_0= ruleCell ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGameDSL.g:299:3: (lv_alives_0_0= ruleCell )
            	    {
            	    // InternalGameDSL.g:299:3: (lv_alives_0_0= ruleCell )
            	    // InternalGameDSL.g:300:4: lv_alives_0_0= ruleCell
            	    {

            	    				newCompositeNode(grammarAccess.getStateAccess().getAlivesCellParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_14);
            	    lv_alives_0_0=ruleCell();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStateRule());
            	    				}
            	    				add(
            	    					current,
            	    					"alives",
            	    					lv_alives_0_0,
            	    					"assignment2.GameDSL.Cell");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleCell"
    // InternalGameDSL.g:320:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGameDSL.g:320:45: (iv_ruleCell= ruleCell EOF )
            // InternalGameDSL.g:321:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameDSL.g:327:1: ruleCell returns [EObject current=null] : ( ( (lv_coordinates_0_0= ruleCoordinates ) ) ( (lv_cellType_1_0= ruleCellType ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        EObject lv_coordinates_0_0 = null;

        Enumerator lv_cellType_1_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:333:2: ( ( ( (lv_coordinates_0_0= ruleCoordinates ) ) ( (lv_cellType_1_0= ruleCellType ) ) ) )
            // InternalGameDSL.g:334:2: ( ( (lv_coordinates_0_0= ruleCoordinates ) ) ( (lv_cellType_1_0= ruleCellType ) ) )
            {
            // InternalGameDSL.g:334:2: ( ( (lv_coordinates_0_0= ruleCoordinates ) ) ( (lv_cellType_1_0= ruleCellType ) ) )
            // InternalGameDSL.g:335:3: ( (lv_coordinates_0_0= ruleCoordinates ) ) ( (lv_cellType_1_0= ruleCellType ) )
            {
            // InternalGameDSL.g:335:3: ( (lv_coordinates_0_0= ruleCoordinates ) )
            // InternalGameDSL.g:336:4: (lv_coordinates_0_0= ruleCoordinates )
            {
            // InternalGameDSL.g:336:4: (lv_coordinates_0_0= ruleCoordinates )
            // InternalGameDSL.g:337:5: lv_coordinates_0_0= ruleCoordinates
            {

            					newCompositeNode(grammarAccess.getCellAccess().getCoordinatesCoordinatesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_coordinates_0_0=ruleCoordinates();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_0_0,
            						"assignment2.GameDSL.Coordinates");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameDSL.g:354:3: ( (lv_cellType_1_0= ruleCellType ) )
            // InternalGameDSL.g:355:4: (lv_cellType_1_0= ruleCellType )
            {
            // InternalGameDSL.g:355:4: (lv_cellType_1_0= ruleCellType )
            // InternalGameDSL.g:356:5: lv_cellType_1_0= ruleCellType
            {

            					newCompositeNode(grammarAccess.getCellAccess().getCellTypeCellTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cellType_1_0=ruleCellType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"cellType",
            						lv_cellType_1_0,
            						"assignment2.GameDSL.CellType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleCoordinates"
    // InternalGameDSL.g:377:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // InternalGameDSL.g:377:52: (iv_ruleCoordinates= ruleCoordinates EOF )
            // InternalGameDSL.g:378:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalGameDSL.g:384:1: ruleCoordinates returns [EObject current=null] : (otherlv_0= '(' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_column_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_row_1_0=null;
        Token otherlv_2=null;
        Token lv_column_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGameDSL.g:390:2: ( (otherlv_0= '(' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_column_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGameDSL.g:391:2: (otherlv_0= '(' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_column_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGameDSL.g:391:2: (otherlv_0= '(' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_column_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGameDSL.g:392:3: otherlv_0= '(' ( (lv_row_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_column_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGameDSL.g:396:3: ( (lv_row_1_0= RULE_INT ) )
            // InternalGameDSL.g:397:4: (lv_row_1_0= RULE_INT )
            {
            // InternalGameDSL.g:397:4: (lv_row_1_0= RULE_INT )
            // InternalGameDSL.g:398:5: lv_row_1_0= RULE_INT
            {
            lv_row_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_row_1_0, grammarAccess.getCoordinatesAccess().getRowINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinatesAccess().getCommaKeyword_2());
            		
            // InternalGameDSL.g:418:3: ( (lv_column_3_0= RULE_INT ) )
            // InternalGameDSL.g:419:4: (lv_column_3_0= RULE_INT )
            {
            // InternalGameDSL.g:419:4: (lv_column_3_0= RULE_INT )
            // InternalGameDSL.g:420:5: lv_column_3_0= RULE_INT
            {
            lv_column_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_column_3_0, grammarAccess.getCoordinatesAccess().getColumnINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleRule"
    // InternalGameDSL.g:444:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGameDSL.g:444:45: (iv_ruleRule= ruleRule EOF )
            // InternalGameDSL.g:445:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGameDSL.g:451:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_amount_2_0= RULE_INT ) ) ( (lv_action_3_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_2_0=null;
        Enumerator lv_condition_1_0 = null;

        Enumerator lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalGameDSL.g:457:2: ( (otherlv_0= 'Rule' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_amount_2_0= RULE_INT ) ) ( (lv_action_3_0= ruleAction ) ) ) )
            // InternalGameDSL.g:458:2: (otherlv_0= 'Rule' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_amount_2_0= RULE_INT ) ) ( (lv_action_3_0= ruleAction ) ) )
            {
            // InternalGameDSL.g:458:2: (otherlv_0= 'Rule' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_amount_2_0= RULE_INT ) ) ( (lv_action_3_0= ruleAction ) ) )
            // InternalGameDSL.g:459:3: otherlv_0= 'Rule' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_amount_2_0= RULE_INT ) ) ( (lv_action_3_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGameDSL.g:463:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalGameDSL.g:464:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalGameDSL.g:464:4: (lv_condition_1_0= ruleCondition )
            // InternalGameDSL.g:465:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"assignment2.GameDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameDSL.g:482:3: ( (lv_amount_2_0= RULE_INT ) )
            // InternalGameDSL.g:483:4: (lv_amount_2_0= RULE_INT )
            {
            // InternalGameDSL.g:483:4: (lv_amount_2_0= RULE_INT )
            // InternalGameDSL.g:484:5: lv_amount_2_0= RULE_INT
            {
            lv_amount_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_amount_2_0, grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGameDSL.g:500:3: ( (lv_action_3_0= ruleAction ) )
            // InternalGameDSL.g:501:4: (lv_action_3_0= ruleAction )
            {
            // InternalGameDSL.g:501:4: (lv_action_3_0= ruleAction )
            // InternalGameDSL.g:502:5: lv_action_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"assignment2.GameDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleCellType"
    // InternalGameDSL.g:523:1: ruleCellType returns [Enumerator current=null] : ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGameDSL.g:529:2: ( ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) ) )
            // InternalGameDSL.g:530:2: ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) )
            {
            // InternalGameDSL.g:530:2: ( (enumLiteral_0= 'dead' ) | (enumLiteral_1= 'alive' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGameDSL.g:531:3: (enumLiteral_0= 'dead' )
                    {
                    // InternalGameDSL.g:531:3: (enumLiteral_0= 'dead' )
                    // InternalGameDSL.g:532:4: enumLiteral_0= 'dead'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:539:3: (enumLiteral_1= 'alive' )
                    {
                    // InternalGameDSL.g:539:3: (enumLiteral_1= 'alive' )
                    // InternalGameDSL.g:540:4: enumLiteral_1= 'alive'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellType"


    // $ANTLR start "ruleAction"
    // InternalGameDSL.g:550:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'dies' ) | (enumLiteral_1= 'survives' ) | (enumLiteral_2= 'forms' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGameDSL.g:556:2: ( ( (enumLiteral_0= 'dies' ) | (enumLiteral_1= 'survives' ) | (enumLiteral_2= 'forms' ) ) )
            // InternalGameDSL.g:557:2: ( (enumLiteral_0= 'dies' ) | (enumLiteral_1= 'survives' ) | (enumLiteral_2= 'forms' ) )
            {
            // InternalGameDSL.g:557:2: ( (enumLiteral_0= 'dies' ) | (enumLiteral_1= 'survives' ) | (enumLiteral_2= 'forms' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGameDSL.g:558:3: (enumLiteral_0= 'dies' )
                    {
                    // InternalGameDSL.g:558:3: (enumLiteral_0= 'dies' )
                    // InternalGameDSL.g:559:4: enumLiteral_0= 'dies'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:566:3: (enumLiteral_1= 'survives' )
                    {
                    // InternalGameDSL.g:566:3: (enumLiteral_1= 'survives' )
                    // InternalGameDSL.g:567:4: enumLiteral_1= 'survives'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:574:3: (enumLiteral_2= 'forms' )
                    {
                    // InternalGameDSL.g:574:3: (enumLiteral_2= 'forms' )
                    // InternalGameDSL.g:575:4: enumLiteral_2= 'forms'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleCondition"
    // InternalGameDSL.g:585:1: ruleCondition returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGameDSL.g:591:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) ) )
            // InternalGameDSL.g:592:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            {
            // InternalGameDSL.g:592:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGameDSL.g:593:3: (enumLiteral_0= '>' )
                    {
                    // InternalGameDSL.g:593:3: (enumLiteral_0= '>' )
                    // InternalGameDSL.g:594:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:601:3: (enumLiteral_1= '<' )
                    {
                    // InternalGameDSL.g:601:3: (enumLiteral_1= '<' )
                    // InternalGameDSL.g:602:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:609:3: (enumLiteral_2= '=' )
                    {
                    // InternalGameDSL.g:609:3: (enumLiteral_2= '=' )
                    // InternalGameDSL.g:610:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});

}