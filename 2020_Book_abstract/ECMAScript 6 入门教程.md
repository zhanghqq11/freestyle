# 阮一峰ES6教程 

## Ⅰ. ECMAScript 和 JavaScript 的关系

ECMAScript 和 JavaScript 的关系是，前者是后者的规格，后者是前者的一种实现（另外的 ECMAScript 方言还有 JScript 和 ActionScript）。

例如，ECMAScript制定规则，let这个语句声明的规则。

而chrome V8通过c++实现了这些规则，所以我们可以利用v8来run 我们写的js code

### Es6转码

1. Babel转码
2. Traceur转码器

## Ⅱ. let 和 const 命令

### 1. let

`let`实际上为 JavaScript 新增了块级作用域。

#### 只在`let`命令所在的代码块内有效。

#### 不存在变量提升

变量提升：`var`命令会发生“变量提升”现象，即变量可以在声明之前使用，值为`undefined`。

个人理解`var`会在模块开始的时候定义所有的变量，也是再开始时先开辟空间存入指针。

#### 暂时性死区

只要块级作用域内存在`let`命令，它所声明的变量就“绑定”（binding）这个区域，不再受外部的影响。

```javascript
var tmp = 123;

if (true) {
  tmp = 'abc'; // ReferenceError
  let tmp;
}
```

理解为只要作用域内有let命令声明这个值，作用域内的所有这个值定义之前的代码是被锁定的，语法上称为“暂时性死区”。

#### 不允许重复声明

`let`不允许在相同作用域内，重复声明同一个变量。



### 2. 块级作用域

ES5 只有全局作用域和函数作用域，没有块级作用域，这带来很多不合理的场景。

第一种不合理场景，内层变量可能会覆盖外层变量。函数作用域内赋值这个变量，可能造成函数作用域外的值变为undefined。

第二种不合理场景，用来计数的循环变量泄露为全局变量。for循环中的i泄露，成为全局。

所以增加了块级作用域，作用域影响新的创建变量操作，新创建的变量只在作用域内有效。

如：

```js
let i=1
{
    i =3
    console.log(i) //3
}
console.log(i) //3
```

```js
let i=1
{
    let i =3 // 定义新变量
    console.log(i) //3
}
console.log(i) //1
```

考虑到环境导致的行为差异太大，应该避免在块级作用域内声明函数。如果确实需要，也应该写成函数表达式，而不是函数声明语句。



### 3. const 命令

`const`声明一个只读的常量。一旦声明，常量的值就不能改变。`const`一旦声明变量，就必须立即初始化，不能留到以后赋值。

如何选择声明时是用`let`还是`const`呢，在有些业务中，变量不像例子中的常数那么容易界定（比如Π的值就是3.1415926535897932384626433...）,到底如何界定何时用`let`何时用`const`呢？

个人看了很多博客，`const`有时候的应用场景并不仅仅是声明一个常量，有时会是“组件”或者对象。大部分作者同意只要在设计理念上不建议修改这个值的时候都使用`const`定义。

从原理上，阮大也说了：`const`实际上保证的，并不是变量的值不得改动，而是变量指向的那个内存地址所保存的数据不得改动。对于简单类型的数据（数值、字符串、布尔值），值就保存在变量指向的那个内存地址，因此等同于常量。**但对于复合类型的数据（主要是对象和数组），变量指向的内存地址，保存的只是一个指向实际数据的指针**，`const`只能保证这个指针是固定的（即总是指向另一个固定的地址），至于它指向的数据结构是不是可变的，就完全不能控制了。因此，将一个对象声明为常量必须非常小心。



## Ⅲ. 变量的解构赋值

ES6 允许按照一定模式，从数组和对象中提取值，对变量进行赋值，这被称为解构（Destructuring）。

基本用法参考阮大（http://es6.ruanyifeng.com/#docs/destructuring）

阮大总结的非常易于理解。



## Ⅳ.字符串的扩展

### 1. 字符串的扩展

ES6 加强了对 Unicode 的支持，允许采用`\uxxxx`形式表示一个字符，其中`xxxx`表示字符的 Unicode 码点。

超出`\u0000`~`\uFFFF`这个范围的字符会解释错误，如`\u20BB7`理解为`\u20BB+7`，得到空格跟着7

es6规定，只要将码点放入大括号，就能正确解读该字符。



### 2. 字符串的遍历器接口

`for...of`可遍历循环字符串，例如

```js
for (let codePoint of 'foo') {
  console.log(codePoint)
}
// "f"
// "o"
// "o"
```

最大的优点，可以**识别大于`0xFFFF`的码点**



### 3. 模板字符串

模板字符串（template string）是增强版的字符串，用反引号（`）标识。它可以当作普通字符串使用，也可以用来定义多行字符串，或者在字符串中嵌入变量。

如果使用模板字符串表示多行字符串，所有的空格和缩进都会被保留在输出之中。模板字符串中嵌入变量，需要将变量名写在`${}`之中。大括号内部可以放入任意的 JavaScript 表达式，可以进行运算，以及引用对象属性。（意味着可以放入虚拟dom）

在进行ssr时可以利用模板字符串最为渲染模板。



### 4. 标签模板

模板字符串的功能，不仅仅是上面这些。它可以紧跟在一个函数名后面，该函数将被调用来处理这个模板字符串。这被称为“标签模板”功能（tagged template）。

```javascript
alert`123`
// 等同于
alert(123)
```

标签模板其实不是模板，而是函数调用的一种特殊形式。“标签”指的就是函数，紧跟在后面的模板字符串就是它的参数。

但是，如果模板字符里面有变量，就不是简单的调用了，而是会将模板字符串先处理成多个参数，再调用函数。

```javascript
let a = 5;
let b = 10;

tag`Hello ${ a + b } world ${ a * b }`;
// 等同于
tag(['Hello ', ' world ', ''], 15, 50);
```



## Ⅴ. 字符串的新增方法

详情见阮大的 http://es6.ruanyifeng.com/#docs/string-methods

### 1. String.fromCodePoint()

ES5 提供`String.fromCharCode()`方法，用于从 Unicode 码点返回对应字符，但是这个方法不能识别码点大于`0xFFFF`的字符。



### 2. String.raw()

ES6 还为原生的 String 对象，提供了一个`raw()`方法。该方法返回一个斜杠都被转义（即斜杠前面再加一个斜杠）的字符串，往往用于模板字符串的处理方法。



### 3. 实例方法：codePointAt()

ES6 提供了`codePointAt()`方法，能够正确处理 4 个字节储存的字符，返回一个字符的码点。



### 4. 实例方法：normalize() 

ES6 提供字符串实例的`normalize()`方法，用来将字符的不同表示方法统一为同样的形式，这称为 Unicode 正规化。(解决欧洲重音符号的字符及合成符，比如重音`Ǒ`合成`Ǒ` JavaScript 不能识别的问题)



### 5. 实例方法：includes(), startsWith(), endsWith()

传统上，JavaScript 只有`indexOf`方法，可以用来确定一个字符串是否包含在另一个字符串中。ES6 又提供了三种新方法。

- **includes()**：返回布尔值，表示是否找到了参数字符串。
- **startsWith()**：返回布尔值，表示参数字符串是否在原字符串的头部。
- **endsWith()**：返回布尔值，表示参数字符串是否在原字符串的尾部。



### 6. 实例方法：repeat()

`repeat`方法返回一个新字符串，表示将原字符串重复`n`次。



### 7. 实例方法：padStart()，padEnd()

ES2017 引入了字符串补全长度的功能。如果某个字符串不够指定长度，会在头部或尾部补全。`padStart()`用于头部补全，`padEnd()`用于尾部补全。



### 8. 实例方法：trimStart()，trimEnd()

[ES2019](https://github.com/tc39/proposal-string-left-right-trim) 对字符串实例新增了`trimStart()`和`trimEnd()`这两个方法。它们的行为与`trim()`一致，`trimStart()`消除字符串头部的空格，`trimEnd()`消除尾部的空格。它们返回的都是新字符串，不会修改原始字符串。



### 9. 实例方法：matchAll()

`matchAll()`方法返回一个正则表达式在当前字符串的所有匹配。



## Ⅵ. 正则的扩展

### 1. RegExp 构造函数

在 ES5 中，`RegExp`构造函数的参数有两种情况。

第一种情况是，参数是字符串，这时第二个参数表示正则表达式的修饰符（flag）。

```javascript
var regex = new RegExp('xyz', 'i');
// 等价于
var regex = /xyz/i;
```

第二种情况是，参数是一个正则表示式，这时会返回一个原有正则表达式的拷贝。

```javascript
var regex = new RegExp(/xyz/i);
// 等价于
var regex = /xyz/i;
```



### 2.字符串的正则方法

字符串对象共有 4 个方法，可以使用正则表达式：`match()`、`replace()`、`search()`和`split()`。

ES6 将这 4 个方法，在语言内部全部调用`RegExp`的实例方法，从而做到所有与正则相关的方法，全都定义在`RegExp`对象上。

- `String.prototype.match` 调用 `RegExp.prototype[Symbol.match]`
- `String.prototype.replace` 调用 `RegExp.prototype[Symbol.replace]`
- `String.prototype.search` 调用 `RegExp.prototype[Symbol.search]`
- `String.prototype.split` 调用 `RegExp.prototype[Symbol.split]`