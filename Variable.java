/** A class that represents a variable function
  * This class extends the abstract class Function, which represents a mathematical function
  * @author Ryan Cesar Irizarry
  */
public class Variable extends Function {
  
  /**
   * Constructs a new Variable object
   * There are no inputs
   */
  public Variable() {
  }
  
  /**
   * Compares the specified object with this Variable for equality
   * @param o The object to compare
   * @return True if the specified object is variable with the same string representation as this Variable; false otherwise
   */
  public boolean equals(Object o) {
    if (o instanceof Variable) {
      Variable v = (Variable) o;
      return this.toString().equals(v.toString());
    }
    return false;
  }
  
  /**
   * Returns a string representation of the variable function
   * @return The string "x"
   */
  public String toString() {
    return "x";
  }
  
  /**
   * Returns the value of this variable function
   * Throws an UnsupportedOperationException, since a Variable function cannot be evaluated without an input 
   * @throws UnsupportedOperationException always
   */
  @Override
  public double value() {
    throw new UnsupportedOperationException("The operation is not supported");
  }
  
  /**
   * Returns the input value as the output of this variable function
   * @param input The input value
   * @return The input value
   */
  @Override
  public double value(double input) {
    return input;
  }
  
  /**Returns the derivative of this variable function, which is always the value 1
    * @return The derivative of this Variable, which is a new Number with value 1
    */
  @Override
  public Function derivative() {
    Number derivative = new Number(1); //creation of a new Number object that expresses the derivative of variable "x", which is always 1
    return derivative;
  }
}