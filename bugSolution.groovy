```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item != null) {
      println "Item at index $index: $item"
    } else {
      println "Null item found at index: $index"
      // Handle null values appropriately
      // Example: You can remove the null value from the list:
      // list.remove(index) 
    }
  }
}

myMethod([1, 2, null, 4, 5])

//Alternative solution using for loop for better control

def myMethod2(list) {
    for (int i = 0; i < list.size(); i++) {
        def item = list.get(i)
        if (item == null) {
            println "Null item found at index: $i"
        } else {
            println "Item at index $i: $item"
        }
    }
}
myMethod2([1,2, null, 4,5])
```