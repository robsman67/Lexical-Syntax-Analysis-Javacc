package fr.utbm.info.da53.lw2.syntaxtree.statementTreeNode;

import fr.utbm.info.da53.lw2.context.ExecutionContext;
import fr.utbm.info.da53.lw2.error.InterpreterException;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractStatementTreeNode;
import fr.utbm.info.da53.lw2.syntaxtree.abstractTreeNode.AbstractValueTreeNode;

public class WhileTreeNode extends AbstractStatementTreeNode {

    public WhileTreeNode(AbstractValueTreeNode condition, AbstractStatementTreeNode body) {
        setChildren(condition, body);
    }

    @Override
    public ExecutionContext run(ExecutionContext context) throws InterpreterException {
        return null;
    }

    @Override
    public String toString() {
        return "while " + getChildAt(0) + " do " + getChildAt(1);
    }
}
