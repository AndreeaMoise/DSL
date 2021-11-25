package assignment2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import assignment2.services.GameDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dead'", "'alive'", "'dies'", "'survives'", "'forms'", "'>'", "'<'", "'='", "'Game'", "'Rules'", "'Grid'", "'Size'", "'State'", "'('", "','", "')'", "'Rule'"
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

    	public void setGrammarAccess(GameDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalGameDSL.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalGameDSL.g:54:1: ( ruleGame EOF )
            // InternalGameDSL.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGameDSL.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalGameDSL.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalGameDSL.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalGameDSL.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalGameDSL.g:69:3: ( rule__Game__Group__0 )
            // InternalGameDSL.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGrid"
    // InternalGameDSL.g:78:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGameDSL.g:79:1: ( ruleGrid EOF )
            // InternalGameDSL.g:80:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameDSL.g:87:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:91:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGameDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGameDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            // InternalGameDSL.g:93:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGameDSL.g:94:3: ( rule__Grid__Group__0 )
            // InternalGameDSL.g:94:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleSize"
    // InternalGameDSL.g:103:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalGameDSL.g:104:1: ( ruleSize EOF )
            // InternalGameDSL.g:105:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalGameDSL.g:112:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:116:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalGameDSL.g:117:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalGameDSL.g:117:2: ( ( rule__Size__Group__0 ) )
            // InternalGameDSL.g:118:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalGameDSL.g:119:3: ( rule__Size__Group__0 )
            // InternalGameDSL.g:119:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleState"
    // InternalGameDSL.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalGameDSL.g:129:1: ( ruleState EOF )
            // InternalGameDSL.g:130:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGameDSL.g:137:1: ruleState : ( ( ( rule__State__AlivesAssignment ) ) ( ( rule__State__AlivesAssignment )* ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:141:2: ( ( ( ( rule__State__AlivesAssignment ) ) ( ( rule__State__AlivesAssignment )* ) ) )
            // InternalGameDSL.g:142:2: ( ( ( rule__State__AlivesAssignment ) ) ( ( rule__State__AlivesAssignment )* ) )
            {
            // InternalGameDSL.g:142:2: ( ( ( rule__State__AlivesAssignment ) ) ( ( rule__State__AlivesAssignment )* ) )
            // InternalGameDSL.g:143:3: ( ( rule__State__AlivesAssignment ) ) ( ( rule__State__AlivesAssignment )* )
            {
            // InternalGameDSL.g:143:3: ( ( rule__State__AlivesAssignment ) )
            // InternalGameDSL.g:144:4: ( rule__State__AlivesAssignment )
            {
             before(grammarAccess.getStateAccess().getAlivesAssignment()); 
            // InternalGameDSL.g:145:4: ( rule__State__AlivesAssignment )
            // InternalGameDSL.g:145:5: rule__State__AlivesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__State__AlivesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlivesAssignment()); 

            }

            // InternalGameDSL.g:148:3: ( ( rule__State__AlivesAssignment )* )
            // InternalGameDSL.g:149:4: ( rule__State__AlivesAssignment )*
            {
             before(grammarAccess.getStateAccess().getAlivesAssignment()); 
            // InternalGameDSL.g:150:4: ( rule__State__AlivesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameDSL.g:150:5: rule__State__AlivesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__State__AlivesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getAlivesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleCell"
    // InternalGameDSL.g:160:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalGameDSL.g:161:1: ( ruleCell EOF )
            // InternalGameDSL.g:162:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameDSL.g:169:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:173:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalGameDSL.g:174:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalGameDSL.g:174:2: ( ( rule__Cell__Group__0 ) )
            // InternalGameDSL.g:175:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalGameDSL.g:176:3: ( rule__Cell__Group__0 )
            // InternalGameDSL.g:176:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleCoordinates"
    // InternalGameDSL.g:185:1: entryRuleCoordinates : ruleCoordinates EOF ;
    public final void entryRuleCoordinates() throws RecognitionException {
        try {
            // InternalGameDSL.g:186:1: ( ruleCoordinates EOF )
            // InternalGameDSL.g:187:1: ruleCoordinates EOF
            {
             before(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getCoordinatesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // InternalGameDSL.g:194:1: ruleCoordinates : ( ( rule__Coordinates__Group__0 ) ) ;
    public final void ruleCoordinates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:198:2: ( ( ( rule__Coordinates__Group__0 ) ) )
            // InternalGameDSL.g:199:2: ( ( rule__Coordinates__Group__0 ) )
            {
            // InternalGameDSL.g:199:2: ( ( rule__Coordinates__Group__0 ) )
            // InternalGameDSL.g:200:3: ( rule__Coordinates__Group__0 )
            {
             before(grammarAccess.getCoordinatesAccess().getGroup()); 
            // InternalGameDSL.g:201:3: ( rule__Coordinates__Group__0 )
            // InternalGameDSL.g:201:4: rule__Coordinates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleRule"
    // InternalGameDSL.g:210:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGameDSL.g:211:1: ( ruleRule EOF )
            // InternalGameDSL.g:212:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGameDSL.g:219:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:223:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGameDSL.g:224:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGameDSL.g:224:2: ( ( rule__Rule__Group__0 ) )
            // InternalGameDSL.g:225:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGameDSL.g:226:3: ( rule__Rule__Group__0 )
            // InternalGameDSL.g:226:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleCellType"
    // InternalGameDSL.g:235:1: ruleCellType : ( ( rule__CellType__Alternatives ) ) ;
    public final void ruleCellType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:239:1: ( ( ( rule__CellType__Alternatives ) ) )
            // InternalGameDSL.g:240:2: ( ( rule__CellType__Alternatives ) )
            {
            // InternalGameDSL.g:240:2: ( ( rule__CellType__Alternatives ) )
            // InternalGameDSL.g:241:3: ( rule__CellType__Alternatives )
            {
             before(grammarAccess.getCellTypeAccess().getAlternatives()); 
            // InternalGameDSL.g:242:3: ( rule__CellType__Alternatives )
            // InternalGameDSL.g:242:4: rule__CellType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CellType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellType"


    // $ANTLR start "ruleAction"
    // InternalGameDSL.g:251:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:255:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGameDSL.g:256:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGameDSL.g:256:2: ( ( rule__Action__Alternatives ) )
            // InternalGameDSL.g:257:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalGameDSL.g:258:3: ( rule__Action__Alternatives )
            // InternalGameDSL.g:258:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleCondition"
    // InternalGameDSL.g:267:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:271:1: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalGameDSL.g:272:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalGameDSL.g:272:2: ( ( rule__Condition__Alternatives ) )
            // InternalGameDSL.g:273:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalGameDSL.g:274:3: ( rule__Condition__Alternatives )
            // InternalGameDSL.g:274:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "rule__CellType__Alternatives"
    // InternalGameDSL.g:282:1: rule__CellType__Alternatives : ( ( ( 'dead' ) ) | ( ( 'alive' ) ) );
    public final void rule__CellType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:286:1: ( ( ( 'dead' ) ) | ( ( 'alive' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGameDSL.g:287:2: ( ( 'dead' ) )
                    {
                    // InternalGameDSL.g:287:2: ( ( 'dead' ) )
                    // InternalGameDSL.g:288:3: ( 'dead' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0()); 
                    // InternalGameDSL.g:289:3: ( 'dead' )
                    // InternalGameDSL.g:289:4: 'dead'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDEADEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:293:2: ( ( 'alive' ) )
                    {
                    // InternalGameDSL.g:293:2: ( ( 'alive' ) )
                    // InternalGameDSL.g:294:3: ( 'alive' )
                    {
                     before(grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1()); 
                    // InternalGameDSL.g:295:3: ( 'alive' )
                    // InternalGameDSL.g:295:4: 'alive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCellTypeAccess().getALIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellType__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGameDSL.g:303:1: rule__Action__Alternatives : ( ( ( 'dies' ) ) | ( ( 'survives' ) ) | ( ( 'forms' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:307:1: ( ( ( 'dies' ) ) | ( ( 'survives' ) ) | ( ( 'forms' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGameDSL.g:308:2: ( ( 'dies' ) )
                    {
                    // InternalGameDSL.g:308:2: ( ( 'dies' ) )
                    // InternalGameDSL.g:309:3: ( 'dies' )
                    {
                     before(grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0()); 
                    // InternalGameDSL.g:310:3: ( 'dies' )
                    // InternalGameDSL.g:310:4: 'dies'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getDIESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:314:2: ( ( 'survives' ) )
                    {
                    // InternalGameDSL.g:314:2: ( ( 'survives' ) )
                    // InternalGameDSL.g:315:3: ( 'survives' )
                    {
                     before(grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1()); 
                    // InternalGameDSL.g:316:3: ( 'survives' )
                    // InternalGameDSL.g:316:4: 'survives'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getSURVIVESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:320:2: ( ( 'forms' ) )
                    {
                    // InternalGameDSL.g:320:2: ( ( 'forms' ) )
                    // InternalGameDSL.g:321:3: ( 'forms' )
                    {
                     before(grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2()); 
                    // InternalGameDSL.g:322:3: ( 'forms' )
                    // InternalGameDSL.g:322:4: 'forms'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getFORMSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalGameDSL.g:330:1: rule__Condition__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:334:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
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
                    // InternalGameDSL.g:335:2: ( ( '>' ) )
                    {
                    // InternalGameDSL.g:335:2: ( ( '>' ) )
                    // InternalGameDSL.g:336:3: ( '>' )
                    {
                     before(grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalGameDSL.g:337:3: ( '>' )
                    // InternalGameDSL.g:337:4: '>'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameDSL.g:341:2: ( ( '<' ) )
                    {
                    // InternalGameDSL.g:341:2: ( ( '<' ) )
                    // InternalGameDSL.g:342:3: ( '<' )
                    {
                     before(grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalGameDSL.g:343:3: ( '<' )
                    // InternalGameDSL.g:343:4: '<'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameDSL.g:347:2: ( ( '=' ) )
                    {
                    // InternalGameDSL.g:347:2: ( ( '=' ) )
                    // InternalGameDSL.g:348:3: ( '=' )
                    {
                     before(grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalGameDSL.g:349:3: ( '=' )
                    // InternalGameDSL.g:349:4: '='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalGameDSL.g:357:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:361:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGameDSL.g:362:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalGameDSL.g:369:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:373:1: ( ( 'Game' ) )
            // InternalGameDSL.g:374:1: ( 'Game' )
            {
            // InternalGameDSL.g:374:1: ( 'Game' )
            // InternalGameDSL.g:375:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalGameDSL.g:384:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:388:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGameDSL.g:389:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalGameDSL.g:396:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:400:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalGameDSL.g:401:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalGameDSL.g:401:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalGameDSL.g:402:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalGameDSL.g:403:2: ( rule__Game__NameAssignment_1 )
            // InternalGameDSL.g:403:3: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalGameDSL.g:411:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:415:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGameDSL.g:416:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalGameDSL.g:423:1: rule__Game__Group__2__Impl : ( ( rule__Game__GridAssignment_2 ) ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:427:1: ( ( ( rule__Game__GridAssignment_2 ) ) )
            // InternalGameDSL.g:428:1: ( ( rule__Game__GridAssignment_2 ) )
            {
            // InternalGameDSL.g:428:1: ( ( rule__Game__GridAssignment_2 ) )
            // InternalGameDSL.g:429:2: ( rule__Game__GridAssignment_2 )
            {
             before(grammarAccess.getGameAccess().getGridAssignment_2()); 
            // InternalGameDSL.g:430:2: ( rule__Game__GridAssignment_2 )
            // InternalGameDSL.g:430:3: rule__Game__GridAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__GridAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGridAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalGameDSL.g:438:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:442:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalGameDSL.g:443:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalGameDSL.g:450:1: rule__Game__Group__3__Impl : ( 'Rules' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:454:1: ( ( 'Rules' ) )
            // InternalGameDSL.g:455:1: ( 'Rules' )
            {
            // InternalGameDSL.g:455:1: ( 'Rules' )
            // InternalGameDSL.g:456:2: 'Rules'
            {
             before(grammarAccess.getGameAccess().getRulesKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRulesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalGameDSL.g:465:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:469:1: ( rule__Game__Group__4__Impl )
            // InternalGameDSL.g:470:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalGameDSL.g:476:1: rule__Game__Group__4__Impl : ( ( ( rule__Game__RulesAssignment_4 ) ) ( ( rule__Game__RulesAssignment_4 )* ) ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:480:1: ( ( ( ( rule__Game__RulesAssignment_4 ) ) ( ( rule__Game__RulesAssignment_4 )* ) ) )
            // InternalGameDSL.g:481:1: ( ( ( rule__Game__RulesAssignment_4 ) ) ( ( rule__Game__RulesAssignment_4 )* ) )
            {
            // InternalGameDSL.g:481:1: ( ( ( rule__Game__RulesAssignment_4 ) ) ( ( rule__Game__RulesAssignment_4 )* ) )
            // InternalGameDSL.g:482:2: ( ( rule__Game__RulesAssignment_4 ) ) ( ( rule__Game__RulesAssignment_4 )* )
            {
            // InternalGameDSL.g:482:2: ( ( rule__Game__RulesAssignment_4 ) )
            // InternalGameDSL.g:483:3: ( rule__Game__RulesAssignment_4 )
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_4()); 
            // InternalGameDSL.g:484:3: ( rule__Game__RulesAssignment_4 )
            // InternalGameDSL.g:484:4: rule__Game__RulesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Game__RulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getRulesAssignment_4()); 

            }

            // InternalGameDSL.g:487:2: ( ( rule__Game__RulesAssignment_4 )* )
            // InternalGameDSL.g:488:3: ( rule__Game__RulesAssignment_4 )*
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_4()); 
            // InternalGameDSL.g:489:3: ( rule__Game__RulesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGameDSL.g:489:4: rule__Game__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Game__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getRulesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGameDSL.g:499:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:503:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGameDSL.g:504:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGameDSL.g:511:1: rule__Grid__Group__0__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:515:1: ( ( 'Grid' ) )
            // InternalGameDSL.g:516:1: ( 'Grid' )
            {
            // InternalGameDSL.g:516:1: ( 'Grid' )
            // InternalGameDSL.g:517:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGameDSL.g:526:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:530:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGameDSL.g:531:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGameDSL.g:538:1: rule__Grid__Group__1__Impl : ( 'Size' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:542:1: ( ( 'Size' ) )
            // InternalGameDSL.g:543:1: ( 'Size' )
            {
            // InternalGameDSL.g:543:1: ( 'Size' )
            // InternalGameDSL.g:544:2: 'Size'
            {
             before(grammarAccess.getGridAccess().getSizeKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGameDSL.g:553:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:557:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGameDSL.g:558:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGameDSL.g:565:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__SizeAssignment_2 ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:569:1: ( ( ( rule__Grid__SizeAssignment_2 ) ) )
            // InternalGameDSL.g:570:1: ( ( rule__Grid__SizeAssignment_2 ) )
            {
            // InternalGameDSL.g:570:1: ( ( rule__Grid__SizeAssignment_2 ) )
            // InternalGameDSL.g:571:2: ( rule__Grid__SizeAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_2()); 
            // InternalGameDSL.g:572:2: ( rule__Grid__SizeAssignment_2 )
            // InternalGameDSL.g:572:3: rule__Grid__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Grid__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGameDSL.g:580:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl rule__Grid__Group__4 ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:584:1: ( rule__Grid__Group__3__Impl rule__Grid__Group__4 )
            // InternalGameDSL.g:585:2: rule__Grid__Group__3__Impl rule__Grid__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Grid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGameDSL.g:592:1: rule__Grid__Group__3__Impl : ( 'State' ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:596:1: ( ( 'State' ) )
            // InternalGameDSL.g:597:1: ( 'State' )
            {
            // InternalGameDSL.g:597:1: ( 'State' )
            // InternalGameDSL.g:598:2: 'State'
            {
             before(grammarAccess.getGridAccess().getStateKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getStateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Grid__Group__4"
    // InternalGameDSL.g:607:1: rule__Grid__Group__4 : rule__Grid__Group__4__Impl ;
    public final void rule__Grid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:611:1: ( rule__Grid__Group__4__Impl )
            // InternalGameDSL.g:612:2: rule__Grid__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4"


    // $ANTLR start "rule__Grid__Group__4__Impl"
    // InternalGameDSL.g:618:1: rule__Grid__Group__4__Impl : ( ( rule__Grid__StateAssignment_4 ) ) ;
    public final void rule__Grid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:622:1: ( ( ( rule__Grid__StateAssignment_4 ) ) )
            // InternalGameDSL.g:623:1: ( ( rule__Grid__StateAssignment_4 ) )
            {
            // InternalGameDSL.g:623:1: ( ( rule__Grid__StateAssignment_4 ) )
            // InternalGameDSL.g:624:2: ( rule__Grid__StateAssignment_4 )
            {
             before(grammarAccess.getGridAccess().getStateAssignment_4()); 
            // InternalGameDSL.g:625:2: ( rule__Grid__StateAssignment_4 )
            // InternalGameDSL.g:625:3: rule__Grid__StateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Grid__StateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalGameDSL.g:634:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:638:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalGameDSL.g:639:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalGameDSL.g:646:1: rule__Size__Group__0__Impl : ( '(' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:650:1: ( ( '(' ) )
            // InternalGameDSL.g:651:1: ( '(' )
            {
            // InternalGameDSL.g:651:1: ( '(' )
            // InternalGameDSL.g:652:2: '('
            {
             before(grammarAccess.getSizeAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalGameDSL.g:661:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:665:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalGameDSL.g:666:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalGameDSL.g:673:1: rule__Size__Group__1__Impl : ( ( rule__Size__RowsAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:677:1: ( ( ( rule__Size__RowsAssignment_1 ) ) )
            // InternalGameDSL.g:678:1: ( ( rule__Size__RowsAssignment_1 ) )
            {
            // InternalGameDSL.g:678:1: ( ( rule__Size__RowsAssignment_1 ) )
            // InternalGameDSL.g:679:2: ( rule__Size__RowsAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getRowsAssignment_1()); 
            // InternalGameDSL.g:680:2: ( rule__Size__RowsAssignment_1 )
            // InternalGameDSL.g:680:3: rule__Size__RowsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__RowsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getRowsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalGameDSL.g:688:1: rule__Size__Group__2 : rule__Size__Group__2__Impl rule__Size__Group__3 ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:692:1: ( rule__Size__Group__2__Impl rule__Size__Group__3 )
            // InternalGameDSL.g:693:2: rule__Size__Group__2__Impl rule__Size__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Size__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalGameDSL.g:700:1: rule__Size__Group__2__Impl : ( ',' ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:704:1: ( ( ',' ) )
            // InternalGameDSL.g:705:1: ( ',' )
            {
            // InternalGameDSL.g:705:1: ( ',' )
            // InternalGameDSL.g:706:2: ','
            {
             before(grammarAccess.getSizeAccess().getCommaKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__3"
    // InternalGameDSL.g:715:1: rule__Size__Group__3 : rule__Size__Group__3__Impl rule__Size__Group__4 ;
    public final void rule__Size__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:719:1: ( rule__Size__Group__3__Impl rule__Size__Group__4 )
            // InternalGameDSL.g:720:2: rule__Size__Group__3__Impl rule__Size__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Size__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__3"


    // $ANTLR start "rule__Size__Group__3__Impl"
    // InternalGameDSL.g:727:1: rule__Size__Group__3__Impl : ( ( rule__Size__ColumnsAssignment_3 ) ) ;
    public final void rule__Size__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:731:1: ( ( ( rule__Size__ColumnsAssignment_3 ) ) )
            // InternalGameDSL.g:732:1: ( ( rule__Size__ColumnsAssignment_3 ) )
            {
            // InternalGameDSL.g:732:1: ( ( rule__Size__ColumnsAssignment_3 ) )
            // InternalGameDSL.g:733:2: ( rule__Size__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSizeAccess().getColumnsAssignment_3()); 
            // InternalGameDSL.g:734:2: ( rule__Size__ColumnsAssignment_3 )
            // InternalGameDSL.g:734:3: rule__Size__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Size__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__3__Impl"


    // $ANTLR start "rule__Size__Group__4"
    // InternalGameDSL.g:742:1: rule__Size__Group__4 : rule__Size__Group__4__Impl ;
    public final void rule__Size__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:746:1: ( rule__Size__Group__4__Impl )
            // InternalGameDSL.g:747:2: rule__Size__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__4"


    // $ANTLR start "rule__Size__Group__4__Impl"
    // InternalGameDSL.g:753:1: rule__Size__Group__4__Impl : ( ')' ) ;
    public final void rule__Size__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:757:1: ( ( ')' ) )
            // InternalGameDSL.g:758:1: ( ')' )
            {
            // InternalGameDSL.g:758:1: ( ')' )
            // InternalGameDSL.g:759:2: ')'
            {
             before(grammarAccess.getSizeAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__4__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalGameDSL.g:769:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:773:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGameDSL.g:774:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalGameDSL.g:781:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__CoordinatesAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:785:1: ( ( ( rule__Cell__CoordinatesAssignment_0 ) ) )
            // InternalGameDSL.g:786:1: ( ( rule__Cell__CoordinatesAssignment_0 ) )
            {
            // InternalGameDSL.g:786:1: ( ( rule__Cell__CoordinatesAssignment_0 ) )
            // InternalGameDSL.g:787:2: ( rule__Cell__CoordinatesAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getCoordinatesAssignment_0()); 
            // InternalGameDSL.g:788:2: ( rule__Cell__CoordinatesAssignment_0 )
            // InternalGameDSL.g:788:3: rule__Cell__CoordinatesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__CoordinatesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getCoordinatesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalGameDSL.g:796:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:800:1: ( rule__Cell__Group__1__Impl )
            // InternalGameDSL.g:801:2: rule__Cell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalGameDSL.g:807:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__CellTypeAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:811:1: ( ( ( rule__Cell__CellTypeAssignment_1 ) ) )
            // InternalGameDSL.g:812:1: ( ( rule__Cell__CellTypeAssignment_1 ) )
            {
            // InternalGameDSL.g:812:1: ( ( rule__Cell__CellTypeAssignment_1 ) )
            // InternalGameDSL.g:813:2: ( rule__Cell__CellTypeAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getCellTypeAssignment_1()); 
            // InternalGameDSL.g:814:2: ( rule__Cell__CellTypeAssignment_1 )
            // InternalGameDSL.g:814:3: rule__Cell__CellTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__CellTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getCellTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Coordinates__Group__0"
    // InternalGameDSL.g:823:1: rule__Coordinates__Group__0 : rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 ;
    public final void rule__Coordinates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:827:1: ( rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1 )
            // InternalGameDSL.g:828:2: rule__Coordinates__Group__0__Impl rule__Coordinates__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Coordinates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0"


    // $ANTLR start "rule__Coordinates__Group__0__Impl"
    // InternalGameDSL.g:835:1: rule__Coordinates__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:839:1: ( ( '(' ) )
            // InternalGameDSL.g:840:1: ( '(' )
            {
            // InternalGameDSL.g:840:1: ( '(' )
            // InternalGameDSL.g:841:2: '('
            {
             before(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__0__Impl"


    // $ANTLR start "rule__Coordinates__Group__1"
    // InternalGameDSL.g:850:1: rule__Coordinates__Group__1 : rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 ;
    public final void rule__Coordinates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:854:1: ( rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2 )
            // InternalGameDSL.g:855:2: rule__Coordinates__Group__1__Impl rule__Coordinates__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Coordinates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1"


    // $ANTLR start "rule__Coordinates__Group__1__Impl"
    // InternalGameDSL.g:862:1: rule__Coordinates__Group__1__Impl : ( ( rule__Coordinates__RowAssignment_1 ) ) ;
    public final void rule__Coordinates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:866:1: ( ( ( rule__Coordinates__RowAssignment_1 ) ) )
            // InternalGameDSL.g:867:1: ( ( rule__Coordinates__RowAssignment_1 ) )
            {
            // InternalGameDSL.g:867:1: ( ( rule__Coordinates__RowAssignment_1 ) )
            // InternalGameDSL.g:868:2: ( rule__Coordinates__RowAssignment_1 )
            {
             before(grammarAccess.getCoordinatesAccess().getRowAssignment_1()); 
            // InternalGameDSL.g:869:2: ( rule__Coordinates__RowAssignment_1 )
            // InternalGameDSL.g:869:3: rule__Coordinates__RowAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__RowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getRowAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__1__Impl"


    // $ANTLR start "rule__Coordinates__Group__2"
    // InternalGameDSL.g:877:1: rule__Coordinates__Group__2 : rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 ;
    public final void rule__Coordinates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:881:1: ( rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3 )
            // InternalGameDSL.g:882:2: rule__Coordinates__Group__2__Impl rule__Coordinates__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Coordinates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2"


    // $ANTLR start "rule__Coordinates__Group__2__Impl"
    // InternalGameDSL.g:889:1: rule__Coordinates__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:893:1: ( ( ',' ) )
            // InternalGameDSL.g:894:1: ( ',' )
            {
            // InternalGameDSL.g:894:1: ( ',' )
            // InternalGameDSL.g:895:2: ','
            {
             before(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__2__Impl"


    // $ANTLR start "rule__Coordinates__Group__3"
    // InternalGameDSL.g:904:1: rule__Coordinates__Group__3 : rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 ;
    public final void rule__Coordinates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:908:1: ( rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4 )
            // InternalGameDSL.g:909:2: rule__Coordinates__Group__3__Impl rule__Coordinates__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Coordinates__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3"


    // $ANTLR start "rule__Coordinates__Group__3__Impl"
    // InternalGameDSL.g:916:1: rule__Coordinates__Group__3__Impl : ( ( rule__Coordinates__ColumnAssignment_3 ) ) ;
    public final void rule__Coordinates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:920:1: ( ( ( rule__Coordinates__ColumnAssignment_3 ) ) )
            // InternalGameDSL.g:921:1: ( ( rule__Coordinates__ColumnAssignment_3 ) )
            {
            // InternalGameDSL.g:921:1: ( ( rule__Coordinates__ColumnAssignment_3 ) )
            // InternalGameDSL.g:922:2: ( rule__Coordinates__ColumnAssignment_3 )
            {
             before(grammarAccess.getCoordinatesAccess().getColumnAssignment_3()); 
            // InternalGameDSL.g:923:2: ( rule__Coordinates__ColumnAssignment_3 )
            // InternalGameDSL.g:923:3: rule__Coordinates__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinatesAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__3__Impl"


    // $ANTLR start "rule__Coordinates__Group__4"
    // InternalGameDSL.g:931:1: rule__Coordinates__Group__4 : rule__Coordinates__Group__4__Impl ;
    public final void rule__Coordinates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:935:1: ( rule__Coordinates__Group__4__Impl )
            // InternalGameDSL.g:936:2: rule__Coordinates__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinates__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4"


    // $ANTLR start "rule__Coordinates__Group__4__Impl"
    // InternalGameDSL.g:942:1: rule__Coordinates__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:946:1: ( ( ')' ) )
            // InternalGameDSL.g:947:1: ( ')' )
            {
            // InternalGameDSL.g:947:1: ( ')' )
            // InternalGameDSL.g:948:2: ')'
            {
             before(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGameDSL.g:958:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:962:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGameDSL.g:963:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGameDSL.g:970:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:974:1: ( ( 'Rule' ) )
            // InternalGameDSL.g:975:1: ( 'Rule' )
            {
            // InternalGameDSL.g:975:1: ( 'Rule' )
            // InternalGameDSL.g:976:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGameDSL.g:985:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:989:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGameDSL.g:990:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGameDSL.g:997:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1001:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalGameDSL.g:1002:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalGameDSL.g:1002:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalGameDSL.g:1003:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalGameDSL.g:1004:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalGameDSL.g:1004:3: rule__Rule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGameDSL.g:1012:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1016:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGameDSL.g:1017:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGameDSL.g:1024:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AmountAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1028:1: ( ( ( rule__Rule__AmountAssignment_2 ) ) )
            // InternalGameDSL.g:1029:1: ( ( rule__Rule__AmountAssignment_2 ) )
            {
            // InternalGameDSL.g:1029:1: ( ( rule__Rule__AmountAssignment_2 ) )
            // InternalGameDSL.g:1030:2: ( rule__Rule__AmountAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAmountAssignment_2()); 
            // InternalGameDSL.g:1031:2: ( rule__Rule__AmountAssignment_2 )
            // InternalGameDSL.g:1031:3: rule__Rule__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAmountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGameDSL.g:1039:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1043:1: ( rule__Rule__Group__3__Impl )
            // InternalGameDSL.g:1044:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGameDSL.g:1050:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ActionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1054:1: ( ( ( rule__Rule__ActionAssignment_3 ) ) )
            // InternalGameDSL.g:1055:1: ( ( rule__Rule__ActionAssignment_3 ) )
            {
            // InternalGameDSL.g:1055:1: ( ( rule__Rule__ActionAssignment_3 ) )
            // InternalGameDSL.g:1056:2: ( rule__Rule__ActionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_3()); 
            // InternalGameDSL.g:1057:2: ( rule__Rule__ActionAssignment_3 )
            // InternalGameDSL.g:1057:3: rule__Rule__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalGameDSL.g:1066:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1070:1: ( ( RULE_ID ) )
            // InternalGameDSL.g:1071:2: ( RULE_ID )
            {
            // InternalGameDSL.g:1071:2: ( RULE_ID )
            // InternalGameDSL.g:1072:3: RULE_ID
            {
             before(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__GridAssignment_2"
    // InternalGameDSL.g:1081:1: rule__Game__GridAssignment_2 : ( ruleGrid ) ;
    public final void rule__Game__GridAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1085:1: ( ( ruleGrid ) )
            // InternalGameDSL.g:1086:2: ( ruleGrid )
            {
            // InternalGameDSL.g:1086:2: ( ruleGrid )
            // InternalGameDSL.g:1087:3: ruleGrid
            {
             before(grammarAccess.getGameAccess().getGridGridParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGridGridParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GridAssignment_2"


    // $ANTLR start "rule__Game__RulesAssignment_4"
    // InternalGameDSL.g:1096:1: rule__Game__RulesAssignment_4 : ( ruleRule ) ;
    public final void rule__Game__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1100:1: ( ( ruleRule ) )
            // InternalGameDSL.g:1101:2: ( ruleRule )
            {
            // InternalGameDSL.g:1101:2: ( ruleRule )
            // InternalGameDSL.g:1102:3: ruleRule
            {
             before(grammarAccess.getGameAccess().getRulesRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getGameAccess().getRulesRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__RulesAssignment_4"


    // $ANTLR start "rule__Grid__SizeAssignment_2"
    // InternalGameDSL.g:1111:1: rule__Grid__SizeAssignment_2 : ( ruleSize ) ;
    public final void rule__Grid__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1115:1: ( ( ruleSize ) )
            // InternalGameDSL.g:1116:2: ( ruleSize )
            {
            // InternalGameDSL.g:1116:2: ( ruleSize )
            // InternalGameDSL.g:1117:3: ruleSize
            {
             before(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__SizeAssignment_2"


    // $ANTLR start "rule__Grid__StateAssignment_4"
    // InternalGameDSL.g:1126:1: rule__Grid__StateAssignment_4 : ( ruleState ) ;
    public final void rule__Grid__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1130:1: ( ( ruleState ) )
            // InternalGameDSL.g:1131:2: ( ruleState )
            {
            // InternalGameDSL.g:1131:2: ( ruleState )
            // InternalGameDSL.g:1132:3: ruleState
            {
             before(grammarAccess.getGridAccess().getStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getGridAccess().getStateStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__StateAssignment_4"


    // $ANTLR start "rule__Size__RowsAssignment_1"
    // InternalGameDSL.g:1141:1: rule__Size__RowsAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__RowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1145:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:1146:2: ( RULE_INT )
            {
            // InternalGameDSL.g:1146:2: ( RULE_INT )
            // InternalGameDSL.g:1147:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getRowsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getRowsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__RowsAssignment_1"


    // $ANTLR start "rule__Size__ColumnsAssignment_3"
    // InternalGameDSL.g:1156:1: rule__Size__ColumnsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Size__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1160:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:1161:2: ( RULE_INT )
            {
            // InternalGameDSL.g:1161:2: ( RULE_INT )
            // InternalGameDSL.g:1162:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getColumnsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getColumnsINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__ColumnsAssignment_3"


    // $ANTLR start "rule__State__AlivesAssignment"
    // InternalGameDSL.g:1171:1: rule__State__AlivesAssignment : ( ruleCell ) ;
    public final void rule__State__AlivesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1175:1: ( ( ruleCell ) )
            // InternalGameDSL.g:1176:2: ( ruleCell )
            {
            // InternalGameDSL.g:1176:2: ( ruleCell )
            // InternalGameDSL.g:1177:3: ruleCell
            {
             before(grammarAccess.getStateAccess().getAlivesCellParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getStateAccess().getAlivesCellParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__AlivesAssignment"


    // $ANTLR start "rule__Cell__CoordinatesAssignment_0"
    // InternalGameDSL.g:1186:1: rule__Cell__CoordinatesAssignment_0 : ( ruleCoordinates ) ;
    public final void rule__Cell__CoordinatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1190:1: ( ( ruleCoordinates ) )
            // InternalGameDSL.g:1191:2: ( ruleCoordinates )
            {
            // InternalGameDSL.g:1191:2: ( ruleCoordinates )
            // InternalGameDSL.g:1192:3: ruleCoordinates
            {
             before(grammarAccess.getCellAccess().getCoordinatesCoordinatesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinates();

            state._fsp--;

             after(grammarAccess.getCellAccess().getCoordinatesCoordinatesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__CoordinatesAssignment_0"


    // $ANTLR start "rule__Cell__CellTypeAssignment_1"
    // InternalGameDSL.g:1201:1: rule__Cell__CellTypeAssignment_1 : ( ruleCellType ) ;
    public final void rule__Cell__CellTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1205:1: ( ( ruleCellType ) )
            // InternalGameDSL.g:1206:2: ( ruleCellType )
            {
            // InternalGameDSL.g:1206:2: ( ruleCellType )
            // InternalGameDSL.g:1207:3: ruleCellType
            {
             before(grammarAccess.getCellAccess().getCellTypeCellTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellType();

            state._fsp--;

             after(grammarAccess.getCellAccess().getCellTypeCellTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__CellTypeAssignment_1"


    // $ANTLR start "rule__Coordinates__RowAssignment_1"
    // InternalGameDSL.g:1216:1: rule__Coordinates__RowAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinates__RowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1220:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:1221:2: ( RULE_INT )
            {
            // InternalGameDSL.g:1221:2: ( RULE_INT )
            // InternalGameDSL.g:1222:3: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getRowINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getRowINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__RowAssignment_1"


    // $ANTLR start "rule__Coordinates__ColumnAssignment_3"
    // InternalGameDSL.g:1231:1: rule__Coordinates__ColumnAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinates__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1235:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:1236:2: ( RULE_INT )
            {
            // InternalGameDSL.g:1236:2: ( RULE_INT )
            // InternalGameDSL.g:1237:3: RULE_INT
            {
             before(grammarAccess.getCoordinatesAccess().getColumnINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinatesAccess().getColumnINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinates__ColumnAssignment_3"


    // $ANTLR start "rule__Rule__ConditionAssignment_1"
    // InternalGameDSL.g:1246:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1250:1: ( ( ruleCondition ) )
            // InternalGameDSL.g:1251:2: ( ruleCondition )
            {
            // InternalGameDSL.g:1251:2: ( ruleCondition )
            // InternalGameDSL.g:1252:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_1"


    // $ANTLR start "rule__Rule__AmountAssignment_2"
    // InternalGameDSL.g:1261:1: rule__Rule__AmountAssignment_2 : ( RULE_INT ) ;
    public final void rule__Rule__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1265:1: ( ( RULE_INT ) )
            // InternalGameDSL.g:1266:2: ( RULE_INT )
            {
            // InternalGameDSL.g:1266:2: ( RULE_INT )
            // InternalGameDSL.g:1267:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AmountAssignment_2"


    // $ANTLR start "rule__Rule__ActionAssignment_3"
    // InternalGameDSL.g:1276:1: rule__Rule__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameDSL.g:1280:1: ( ( ruleAction ) )
            // InternalGameDSL.g:1281:2: ( ruleAction )
            {
            // InternalGameDSL.g:1281:2: ( ruleAction )
            // InternalGameDSL.g:1282:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000E000L});

}