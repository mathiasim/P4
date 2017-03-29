package sourceParser;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
}

abstract class OpNode extends Node {
    public Node left;
    public Node right;
}

abstract class Single extends Node {
    public Node child;
}

class PlusNode extends OpNode {
}

class MinusNode extends OpNode {
}

class TimesNode extends OpNode {
}

class DivideNode extends OpNode {
}

class UnaryMinusNode extends Single {
}

class ProgramNode extends Node {
    public List<Node> leftMain = new ArrayList<>();
    public List<Node> methods = new ArrayList<>();
}

class MethodNode extends Node {
    public Node type;
    public Node id;
    public Node fprmt;
    public List<Node> body = new ArrayList<>();
    public Node returnval;
}

class BodyNode extends Node {
    public Node content;
}

class DclNode extends Node {
    public Node left;
    public Node middle;
    public Node right;
}

class StmtNode extends Single {
}

class AssignNode extends OpNode {
}

class WhileNode extends Node {
    public Node bool;
    public List<Node> body;
}

class ForNode extends Node {
    public Node startNumber;
    public Node endNumber;
    public List<Node> body;
}

class IfNode extends Node {
    public Node bool;
    public List<Node> body;
    public List<Node> elseif;
    public Node el;
}

class ElseNode extends Node {
    public List<Node> body;
}

class ElseIfNode extends Node {
    public Node bool;
    public List<Node> body;
}

class TypesNode extends Node {
    public String type;
}

class ParameterNode extends Node {
    public String Parameter;
    public Node prmt;
}

class FormalParameterNode extends Node {
    public Node id;
    public Node type;
    public Node fprmt;
}

class CallNode extends Node {
    public Node id;
    public Node statId;
    public Node parameter;
}

class NumberNode extends Node {
    public double value;
}

class TermNode extends Single {
}

class ValueNode extends Single {
}

class IdentifierNode extends Node {
    public String name;
}

class ReturnValNode extends Node {
    public Node returnvalue;
}

class InstanceNode extends Node {
    public String instance;
}

class StatIdNode extends Node {
    public Node instance;
}

class StatSensorNode extends Node {
    public String instance;
}

class StatMotorNode extends Node {
    public String instance;
}

class StatListNode extends Node {
    public String instance;
}

class BoolValOpNode extends Node {
    public String boolValOperator;
}

class BoolExprNode extends Node {
    public Node left;
    public Node middle;
    public Node right;
}

class NegatedBoolNode extends Node {
    public Node left;
    public Node middle;
    public Node right;
}

class BoolOpNode extends Node {
    public String child;
}

class RBooleanNode extends Node {
    public Node left;
    public Node middle;
    public Node right;
}

class NotBoolNode extends Single {
}

class BoolNode extends Node{
    public boolean aBoolean;
}