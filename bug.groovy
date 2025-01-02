```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      // Handle null item appropriately
      // For example, remove it from the list:
      list.remove(index)
    }
  }
}

myMethod([1, 2, null, 4, 5])
```