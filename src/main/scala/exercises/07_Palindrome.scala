package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = 
    s.filter(_.isLetter).map(_.toLower) match {
      case clean if clean.length <= 1 => true
      case clean if clean.head != clean.last => false
      case clean => isPalindrome(clean.init.tail)
    }

}