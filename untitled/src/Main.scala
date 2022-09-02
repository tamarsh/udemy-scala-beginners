import scala.io.StdIn.readLine
import scala.util.control.Breaks.break
/**
 * Version: 1.0
 *
 * Purpose: Pre-interview Exercise for Developer Candidates
 *
 * MODIFICATION HISTORY
 * Person      Date        Comments
 * ---------   ----------  ------------------------------------------
 * S.Tamar     28/08/2022  Created
 */

object Main {
  var x: Any => Any = _

  def main(args: Array[String]): Unit = {

    var input: String = ""
    var isAllDone: Boolean = false
    var allItems: List[String] = List("Apple", "Orange")
    var billTotal: Double = 0
    // counter
    var counter = Map("Apple" -> 0, "Orange" -> 0)

    var totalVAT: Double = 0.00
    val appleCost: Double = 0.60
    var orangeCost: Double = 0.25
    var VAT: Double = 20.0
    //

    while (true && !isAllDone) {
      input = readLine("Next Itema? > ")


      input.toUpperCase match {
        case "HELLO" => println("Hi")
        case "EXIT" => isAllDone = true
        case "P" => isAllDone = true
        case "APPLE" => {
          billTotal = billTotal + appleCost
          counter += ("Apple" -> (counter("Apple") + 1))
        }
        case "A" => {
          billTotal = billTotal + appleCost
          counter += ("Apple" -> (counter("Apple") + 1))
        }
        case "ORANGE" => {
          billTotal = billTotal + orangeCost
          counter += ("Orange" -> (counter("Orange") + 1))
        }
        case "O" => {
          billTotal = billTotal + orangeCost
          counter += ("Orange" -> (counter("Orange") + 1))
        }
        case _ => {
          println("Unknown feature, please try again")
          println("Valid options are: Hello, hi, [p]rint bill, [a]pple, [o]range ")
        }
      }
      if (billTotal > 0) {
        counter.foreach { case (x, y) => if (y > 0) println(y + " " + x + (if (y > 1) "s") ) }
        println("Sub Total    :" + f"$billTotal%5.2f")
      }
    }

    totalVAT = (billTotal * VAT / 100)
    println("VAT(" + VAT + "%)   :" + f"$totalVAT%5.2f")
    billTotal = (billTotal + (billTotal * VAT / 100))
    println("Total        :" + f"$billTotal%5.2f")
    println("------------------------------------------")
    println("All down now, thanks for shopping with us!")
    println("<<->>")

  }
}