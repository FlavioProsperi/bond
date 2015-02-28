package net.fwbrasil.bond

trait Email
case object Email
  extends Validator[String, Email] {

  private val emailPattern = """(\w+)@([\w\.]+)"""

  def isValid(v: String) =
    v.matches(emailPattern)
}

trait StartsWith[-T]
case object StartsWith
  extends ParameterizedValidator[String, StartsWith] {

  def isValid(v: String, p: String) =
    v.startsWith(p)
}

trait EndsWith[-T]
case object EndsWith
  extends ParameterizedValidator[String, EndsWith] {

  def isValid(v: String, p: String) =
    v.endsWith(p)
}

trait MatchesRegex[-T]
case object MatchesRegex
  extends ParameterizedValidator[String, MatchesRegex] {

  def isValid(v: String, p: String) =
    v.matches(p)
}
