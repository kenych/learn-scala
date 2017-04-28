import java.io.FileInputStream

import scala.util.control.Breaks._

import java.io.FileNotFoundException
import java.io.IOException

object Closures extends App {

  var freeVariable = 2

  val closure = (boundVar: Int) => boundVar + freeVariable

  println(closure(3));
  freeVariable = 55
  println(closure(3));

  /*
   * The function value (the object) thatÕs 
   * created at runtime from this function literal 
   * is called a closure. The name arises
   *  from the act of ÒclosingÓ the func- tion
   *   literal by ÒcapturingÓ the bindings
   *    of its free variables. A function literal
   *     with no free variables,
   *      such as (x: Int) => x + 1,
   *       is called a closed term, where 
   *       a term is a bit of source code.
   *        Thus a function value created at 
   *        run- time from this function literal
   *         is not a closure in the strictest sense,
   *          because (x: Int) => x + 1 is already
   *           closed as written. But any function 
   *           literal with free variables, such
   *            as (x: Int) => x + more, is 
   *            an open term. 
   *            Therefore, any function value created
   *             at runtime from (x: Int) => x + more
   *              will by definition require that a 
   *              binding for its free variable, more, 
   *              be captured. The resulting function 
   *              value, which will contain a reference 
   *              to the captured more variable, is 
   *              called a closure, therefore, because the 
   *              function value is the end product of the
   *               act of closing the open term,
   *                (x: Int) => x + more.
   */

}