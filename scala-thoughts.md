I really like how functional programming is done in Scala.
I don't have extensive experience using languages for functional programming,
so I don't have the best sense of scale for this, but Scala gives the 
programmer a lot of built-in functions to work with.
As an example, I thought the `Rainfall.scala` exercise would be difficult to 
write using functional programming.
But reading Prof. Ben's solution, I was surprised that there is a very
convenient function for `Rainfall.scala`-type problems.
In retrospect, there are definitely many scenarios that could use `takeWhile`.
I would like to learn more Scala functions by reading others' code as opposed
to trawling through documentation.

A design choice that I did not like, which may be due to Scala's extensive
array of functions, is that `head` is used to get the first item of a sequence
while `last` is used to get the last item of a sequence.
A more intuitive pair could be `head` and `tail` or `first` and `last`.
This naming caused some problems for me when I was trying to implement
`isPalindrome`, which compares the first and last characters of the string.
I thought `tail` would give me the last element of the string and from previous
exercises I knew that `tail` is a function that relates to the end of sequences.
I figured it out after reading the error message.
As mentioned before, the counter-intuitive naming could be due to `tail`
being its own function.
Although I don't know why they didn't name `head`, `first`.

I'm not sure if I like Scala's flexibility, in the sense that many symbols that 
mean the same thing.
For example `|` is the same as `||`.
Which is probably convenient for writing an internal DSL.
But it seems unnecessary to have `isDefined` and then to add `nonEmpty`,which
does the same thing, in version 2.10 of Scala.
This gives programmers more ways to accomplish what they need but it seems
like the programmer can write their own `nonEmpty` function which just calls
`isDefined` if they feel strongly about having the function named `nonEmpty`.

Scala gives the programmer a lot of tools which is nice but it comes with
its drawbacks.
