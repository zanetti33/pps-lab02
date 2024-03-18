package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*

class OptionalTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit = {
    val empty = Optional.Empty()
    assertTrue(Optional.isEmpty(empty))
  }

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    assertFalse(Optional.isEmpty(nonEmpty))
  }

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    assertEquals(0, Optional.orElse(nonEmpty, 1))
  }

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit = {
    val empty = Optional.Empty()
    assertEquals(1, Optional.orElse(empty, 1))
  }

  /** Task 5 -- Look the behaviour of map operator */
  @Test def mapShouldReturnEmptyWhenEmpty(): Unit = {
    val empty: Optional[Int] = Optional.Empty()
    val result = Optional.map(empty, _ + 1)
    assertTrue(Optional.isEmpty(result))
  }

  @Test def mapShouldReturnTransformedValueWhenNonEmpty(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    val result = Optional.map(nonEmpty, _ + 1)
    assertEquals(1, Optional.orElse(result, 1))
  }
  
  /** Task 5 -- Look the behaviour of filter operator */
  @Test def filterShouldReturnEmptyWhenEmpty(): Unit = {
    val empty: Optional[Int] = Optional.Empty()
    val result = Optional.filter(empty, _ >= 0)
    assertTrue(Optional.isEmpty(result))
  }

  @Test def filterShouldReturnEmptyWhenFalse(): Unit = {
    val nonEmpty = Optional.Maybe(-1)
    val result = Optional.filter(nonEmpty, _ >= 0)
    assertTrue(Optional.isEmpty(result))
  }

  @Test def filterShouldReturnSameValueWhenTrue(): Unit = {
    val nonEmpty = Optional.Maybe(0)
    val result = Optional.filter(nonEmpty, _ >= 0)
    assertEquals(0, Optional.orElse(result, 1))
  }