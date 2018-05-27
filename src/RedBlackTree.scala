import scala.annotation.tailrec
import scala.math.Ordering.Implicits._

object RedBlackTree {

    object Color extends Enumeration {
        val Red, Black = Value
    }

    abstract sealed class Tree[T: Ordering] {
        def color: Color.Value
        def value: T
        def left: Tree[T]
        def right: Tree[T]
        def isEmpty: Boolean
    }

    case class Branch[T: Ordering](color: Color.Value, value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
        def isEmpty = false
    }

    case object Leaf extends Tree[Nothing] {
        def color: Color.Value = Color.Black
        def value: Nothing = throw new NoSuchElementException("An empty tree.")
        def left: Tree[Nothing] = throw new NoSuchElementException("An empty tree.")
        def right: Tree[Nothing] = throw new NoSuchElementException("An empty tree.")
        def isEmpty = true
    }


}

object Run extends App {
    println("Red-black tree implementation...")

}
