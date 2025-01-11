package fr.utbm.info.da53.lw2.syntaxtree.statementTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterErrorType;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractComparisonOperatorTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;
import fr.utbm.info.da53.lw2.type.Value;
import fr.utbm.info.da53.lw2.type.VariableType;

public class IfThenTreeNode extends AbstractStatementTreeNode {

    public IfThenTreeNode(AbstractValueTreeNode condition, AbstractStatementTreeNode thenStatement, AbstractStatementTreeNode elseStatement) {
        setChildren(condition, thenStatement, elseStatement);
    }

    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {

        AbstractComparisonOperatorTreeNode condition = (AbstractComparisonOperatorTreeNode) getChildAt(0);
        AbstractStatementTreeNode thenStatement = (AbstractStatementTreeNode) getChildAt(1);
        AbstractStatementTreeNode elseStatement = (AbstractStatementTreeNode) getChildAt(2);

        if(condition == null) {
            warn(context, InterpreterErrorType.EXPECTING_BOOLEAN, "null");
            return context;
        }

        // We evaluate the condition.
        Value evaluate = condition.evaluate(context);
        if (evaluate.getType()== VariableType.BOOLEAN) {
            // If the condition is true, we execute the then statement.
            if(evaluate.getValue(Boolean.class)) {
                if(thenStatement != null) {
                    return thenStatement.run(context);
                }

                // We don't need to have a new elseTreeNode, we check everything here
            }else {
                // If the condition is false, we execute the else statement.
                if(elseStatement != null) {
                    return elseStatement.run(context);
                }
            }
        }else {
            warn(context, InterpreterErrorType.EXPECTING_BOOLEAN, condition.toString());
        }

        // If the "if" or "else" are null, we return the context.
        return context;
    }

    @Override
    public String toString() {
        Object elseStatement = getChildAt(2);
        if (elseStatement == null) {
            return "if " + getChildAt(0) + " then " + getChildAt(1);
        }
        return "if " + getChildAt(0) + " then " + getChildAt(1) + " else " + getChildAt(2);
    }
}
