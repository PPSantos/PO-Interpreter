/* $Id: Mul.java,v 1.1 2016/10/14 18:12:43 david Exp $ */
package pex.operators;

import pex.Expression;
import pex.Visitor;
import pex.Value;

/**
 * Class for describing the multiplication ('*') operator
 */
public class Mul extends BinaryExpression {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201608281352L;

  /**
   * @param first
   * @param second
   */
  public Mul(Expression first, Expression second) {
    super(first, second);
  }

  /**
   * @param visitor
   *     The visitor.
   * @return The visitor's type representation of Mul.
   */
  @Override 
  public Value accept(Visitor visitor){
    return visitor.visitMul(this);
  }
}
