# chapter 1

bilibili：https://www.bilibili.com/video/av49361421?p=23

### 封底估算

建立时间概念： 

- 1day：10^5 sec
- 50 years: 1.6*10^9
- 1 centry: 3* 10^9
- 三生三世：10^10

### 迭代与递归

To iterate is human,to recure, divine(迭代乃人工，递归方神通)

凡治众如治寡，分数是也

迭代，递归 p20-23

递归+分治 可以优化。

### 动态规划DP

根据google搜索的第一个回答

Dynamic Programming is a method for solving a complex problem by breaking it down into a collection of simpler subproblems, `**solving each of those subproblems just once**, and storing their solutions using a memory-based data structure (array, map,etc).

#### p24-28利用Fibonacci()

讲解了三种算法的**封底估算**。以及为什么单纯递归解法十分耗时的原因。

解决方法1（记忆：memoization。计算过的放表里）

```javascript
//只计算相邻两个的结果（本人感觉找规律的一种算法，较优解）
let f=0;let g =1;
while(0<n--){
    g = g+f
    f = g-f
}
return g
```

#### p29-p32最长公共子序列LCS

```p30 思路讲的非常通俗易懂```但算法**不是最优价**

递归容易找到可行的解，但是如果要优化，往往还需进一步调试，动态规划很重要。

