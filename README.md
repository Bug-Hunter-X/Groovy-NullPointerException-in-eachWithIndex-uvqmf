# Groovy NullPointerException in eachWithIndex

This example demonstrates a common error in Groovy when using `eachWithIndex` to iterate over a list that contains null values.  A `NullPointerException` can occur if you attempt to access a property or method of a `null` element within the list.

The provided code showcases this issue and includes a solution that demonstrates how to handle null elements safely. The solution demonstrates a more robust way to iterate which accounts for the possibility of null elements.