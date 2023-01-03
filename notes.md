
## Scala
### 1. ValuesVariablesTypes

- val - **immutable** (can't be reassigned)
```scala
  val x : Int = 2
  x = 4 //(not allowed)
```

- var - **mutable**
```scala
  var x : Int = 3
  x = 4 //(allowed)
```

```scala
  val aString: String = "hello"
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14
  // variables
  var aVariable: Int = 4  
  aVariable = 5 // side effects
```

![img_3.png](img.png)

### 2. Expression

```Scala
  val x = 1 + 2 // EXPRESSION
println(x)

println(2 + 3 * 4)
// + - * / & | ^ << >> >>> (right shift with zero extension)

println(1 == x)
// == != > >= < <=

println(!(1 == x))
// ! && ||

var aVariable = 2
aVariable += 3 // also works with -= *= /= ..... side effects
println(aVariable)
```
- if expression
```Scala
// Instructions (DO) vs Expressions (VALUE)
// IF expression
val aCondition = true
val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
println(aConditionedValue)
println(if(aCondition) 5 else 3)
println(1 + 3)

```
![img_2.png](img_1.png)

### 3. Call by value & Call by name

- => (Simple for call by name)
![img_4.png](img_2.png)

### 4. Default and Named arguments
![img_3.png](img_3.png)

### 5. Smart operations on Strings
- intepolators (s, f, raw)
![img_4.png](img_4.png)

### 6. Scala Oops basics
![img_5.png](img_5.png)

### 7. Method Notations 

- infix notation = operator notation (syntactic sugar)
- **operators** in scala are **methods** (ALL OPERATORS)
- prefix notation
  - unary_ prefix only works with - + ~ !
- postfix notation
- apply ()
![img_6.png](img_6.png)

### 8. Scala Object
- Scala doesn't have "static" instead it has "object"
![img_7.png](img_7.png)

### 8. Inheritance and Trait
![img_8.png](img_8.png)

### 9. Generics
![img_9.png](img_9.png)
![img_10.png](img_10.png)

### 10. Anonymous class
![img_11.png](img_11.png)

### 11. Case class
![img_12.png](img_12.png)

### 12. Exception
![img_13.png](img_13.png)

### 13. Packaging and imports
![img_14.png](img_14.png)

===================
## Functional Programming
### 14. What is a Function?
![img_15.png](img_15.png)

### 15. Anonymous Function / lambda
![img_16.png](img_16.png)

### 16. Higher-Order-Functions and Curries
![img_17.png](img_17.png)

### 17. Collections
- Overview
![img_18.png](img_18.png)
- Immutable Collections
![img_19.png](img_19.png)
- Mutable Collections
![img_20.png](img_20.png)
- Traversal
![img_21.png](img_21.png)
- Sequences
![img_22.png](img_22.png)
- List
![img_23.png](img_23.png)
- Array
![img_24.png](img_24.png)
- Vector
![img_25.png](img_25.png)

### 18. Tuples and Maps
![img_26.png](img_26.png)
