// "Add parameter to constructor 'Base'" "false"
// IGNORE_IRRELEVANT_ACTIONS
// DISABLE-ERRORS

inline class Base(val x: Int)

val base = Base(10, <caret>20)