# ES6 入门教程

## ECMAScript 和 JavaScript 的关系

ECMAScript 和 JavaScript 的关系是，前者是后者的规格，后者是前者的一种实现（另外的 ECMAScript 方言还有 JScript 和 ActionScript）。

例如，ECMAScript制定规则，let这个语句声明的规则。

而chrome V8通过c++实现了这些规则，所以我们可以利用v8来run 我们写的js code

### Es6转码

1. Babel转码
2. Traceur转码器

## let 和 const 命令

### 1.let

`let`实际上为 JavaScript 新增了块级作用域。

#### 只在`let`命令所在的代码块内有效。

#### 不存在变量提升

变量提升：`var`命令会发生“变量提升”现象，即变量可以在声明之前使用，值为`undefined`。

个人理解`var`会在模块开始的时候定义，也是再开始时先开辟空间存入指针。