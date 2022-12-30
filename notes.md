
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