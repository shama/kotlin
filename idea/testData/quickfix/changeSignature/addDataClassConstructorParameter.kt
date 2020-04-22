// "Add parameter to constructor 'Base'" "true"
// DISABLE-ERRORS

data class Base(var x: Int)

val base = Base(10, <caret>20)