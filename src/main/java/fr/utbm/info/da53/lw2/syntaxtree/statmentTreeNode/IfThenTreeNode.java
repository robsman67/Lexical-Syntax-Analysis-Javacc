package fr.utbm.info.da53.lw2.syntaxtree.statmentTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;

public class IfThenTreeNode extends AbstractStatementTreeNode {

    public IfThenTreeNode(AbstractValueTreeNode condition, AbstractStatementTreeNode thenStatement, AbstractStatementTreeNode elseStatement) {
        setChildren(condition, thenStatement, elseStatement);
    }

    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        return null;
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
