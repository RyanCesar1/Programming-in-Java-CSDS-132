/**
 * A class that represents a sine function
 * This class extends the abstract class Function, which represents a mathematical function
 * @author Ryan Cesar Irizarry
 */
public class Sin extends Function {
  
  /**
   * stores the operand of the sine function
   */
  private Function operand;
  
  /**
   * Constructs a new Sin object with the specified operand
   * @param operand The operand of the sine function
   */
  public Sin(Function operand) {
    this.operand = operand;
  }
  
  /**
   * Returns the operand of the sine function
   * @return The operand of the sine function
   */
  public Function getOperand() {
    return operand;
  }
  
  /**
   * Compares this sine function to the specified object for equality
   * @param o the object to compare to 
   * @return True if the objects are equal, false otherwise
   */
  public boolean equals(Object o) {
    if (o instanceof Sin) {
      Sin s = (Sin) o;
      return this.getOperand().equals(s.getOperand());
    }
    return false;
  }
  
  /**
   * Returns a string representation of the sine function
   * @return a string representation of the sine function
   */
  public String toString() {
    return "Sin[" + getOperand() + "]";
  }
  
  /**
   * Calculates the value of this sine function
   * @return the value of the sine function
   * @throws UnsupportedOperationException if the operation is not supported
   */
  @Override
  public double value() {
    return Math.sin(getOperand().value());
  }
  
  /**
   * returns the value of the sine function for the specified input
   * @param input The input to the sine function
   * @return The value of the sine function for the specified input
   */
  @Override
  public double value(double input) {
    return Math.sin(getOperand().value(input));
  }
  
  /**
   * Returns the derivative of the sine function
   * @return The derivative of the sine function
   */
  @Override
  public Function derivative() {
    return new BinaryOp(BinaryOp.Op.MULT, new Cos(getOperand()), getOperand().derivative()); //creation of a new BinaryOp object that expresses the derivative of a sine function
  }
}