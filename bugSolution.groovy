```groovy
def myMethod(List<String> list) {
  list.each { element ->
    if (element != null) {
      println element.toUpperCase()
    } else {
      println "Null element encountered"
    }
  }
}

myMethod(['a', 'b', null, 'd']) 
```