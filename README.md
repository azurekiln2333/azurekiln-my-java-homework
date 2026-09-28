# Java 作业示例索引

这是独立的课堂练习合集，不是一个统一运行的程序。下面的编号是建议学习顺序，并非 Git 提交时间。源码分为 `src/examples`（按知识点）和 `src/assignments`（按作业批次）；`assignment04`、`assignment05`、`experiment05/part01`、`experiment05/part02` 对应原来的第四、第五批作业及实验 5、5-2。

## 建议学习顺序

### 01 基础语法：`src/examples/basics`

- [HelloWorldApp.java](src/examples/basics/HelloWorldApp.java)：最简单的输出程序。
- [WelcomeToJava.java](src/examples/basics/WelcomeToJava.java)：循环输出与字符画；从原 `Main.java` 的注释练习提取。
- [Variable.java](src/examples/basics/Variable.java)、[VariableScope.java](src/examples/basics/VariableScope.java)：对象打印与局部变量作用域。
- [CommandParameter.java](src/examples/basics/CommandParameter.java)：`printf` 数字、日期格式化。

### 02 运算与数学：`src/examples/arithmetic`

- [ArithmaticOp.java](src/examples/arithmetic/ArithmaticOp.java)：基本运算符、自增与取余；保留原文件名。
- [GravityCalculator.java](src/examples/arithmetic/GravityCalculator.java)：自由落体位置计算。
- [DigitExtraction.java](src/examples/arithmetic/DigitExtraction.java)、[DigitSum.java](src/examples/arithmetic/DigitSum.java)：三位数拆位与各位求和。
- [Encode.java](src/examples/arithmetic/Encode.java)：整数公式变换练习，并非安全加密算法。
- [PiApproximation.java](src/examples/arithmetic/PiApproximation.java)：莱布尼茨级数近似圆周率；从原 `Main.java` 的注释练习提取。
- [LinearEquationDemo.java](src/examples/arithmetic/LinearEquationDemo.java)、[QuadraticEquation.java](src/examples/arithmetic/QuadraticEquation.java)：二元一次方程组、一元二次方程及其图像分析。

### 03 条件与选择：`src/examples/conditionals`

- [MaxOfFour.java](src/examples/conditionals/MaxOfFour.java)、[PalindromeNumber.java](src/examples/conditionals/PalindromeNumber.java)：比较四个数与三位数回文判断。
- [RandomMonth.java](src/examples/conditionals/RandomMonth.java)、[FutureWeekday.java](src/examples/conditionals/FutureWeekday.java)：`switch` 表达式与日期偏移。
- [ScoreLevelCalculator.java](src/examples/conditionals/ScoreLevelCalculator.java)、[StudentCodeLookup.java](src/examples/conditionals/StudentCodeLookup.java)：成绩分级与专业/年级编码查询。
- [SwitchDemo.java](src/examples/conditionals/SwitchDemo.java)：按气温区间输出提示。

### 04 循环：`src/examples/loops`

- [BreakDemo.java](src/examples/loops/BreakDemo.java)：`break` 对循环的影响。
- [DoublingLoop.java](src/examples/loops/DoublingLoop.java)：反复翻倍直到超过阈值。
- [Prime.java](src/examples/loops/Prime.java)：输出 100 以内的素数。

### 05 数组与字符串：`src/examples/arrays`、`src/examples/strings`

- [ArrayTest.java](src/examples/arrays/ArrayTest.java)：选择排序及每轮状态。
- [ASCIIQuery.java](src/examples/strings/ASCIIQuery.java)：查询输入字符的编码值。
- [CharacterStatistics.java](src/examples/strings/CharacterStatistics.java)：字符分类统计、大小写转换与随机验证码。

### 06 引用与对象：`src/examples/objects`

- [PrimitiveParameterDemo.java](src/examples/objects/PrimitiveParameterDemo.java)、[ReferenceBufferDemo.java](src/examples/objects/ReferenceBufferDemo.java)：基本类型传参、可变对象引用的区别。
- [Card.java](src/examples/objects/Card.java)、[CardSwap.java](src/examples/objects/CardSwap.java)：扑克牌模型，以及交换引用、数组元素和对象字段的差别。

### 07 独立应用练习：`src/examples/applications`

- [PriceCalculator.java](src/examples/applications/PriceCalculator.java)、[SalaryCalculator.java](src/examples/applications/SalaryCalculator.java)、[ExpressCalculator.java](src/examples/applications/ExpressCalculator.java)：满减、工资和运费计算。
- [DateDiffCalculator.java](src/examples/applications/DateDiffCalculator.java)：使用 `LocalDate` 计算真实日历天数差。
- [MenuCalculator.java](src/examples/applications/MenuCalculator.java)：循环菜单式计算器。
- [RegistrationLogin.java](src/examples/applications/RegistrationLogin.java)：内存中的注册、登录及三次失败锁定演示，不提供持久化或真实认证。
- [RentalMenuMockup.java](src/examples/applications/RentalMenuMockup.java)：仅打印租房系统菜单，后续功能尚未实现。

### 08 早期购物练习：`src/assignments/shopping`

- [DiscountPrice.java](src/assignments/shopping/DiscountPrice.java)、[GoodLuck.java](src/assignments/shopping/GoodLuck.java)：折扣比较与会员卡号幸运判定。
- [LuckDraw.java](src/assignments/shopping/LuckDraw.java)、[Pay.java](src/assignments/shopping/Pay.java)：抽奖和消费单演示。四个文件是独立程序，不共享数据。

### 09 第四批作业：`src/assignments/assignment04`

- [CharsTools.java](src/assignments/assignment04/CharsTools.java)、[DisplayNumber.java](src/assignments/assignment04/DisplayNumber.java)：按列输出字符、排序三个数。
- [`shopping`](src/assignments/assignment04/shopping)：七个独立的购物/会员练习，包括客户录入、折扣、储蓄计划、抽奖、登录菜单和修改资料；`LoginMenu` 只是其中一个入口，并非完整系统。

### 10 第五批作业：`src/assignments/assignment05`

- [CaesarCipher.java](src/assignments/assignment05/CaesarCipher.java)、[WordCount.java](src/assignments/assignment05/WordCount.java)、[StringFilterSystem.java](src/assignments/assignment05/StringFilterSystem.java)：文本加解密、词频和敏感词过滤。
- [PolynomialCalculator.java](src/assignments/assignment05/PolynomialCalculator.java)：多项式加法、乘法、求值、求导与积分演示。
- [StudentBarChart.java](src/assignments/assignment05/StudentBarChart.java)、[ScoreManager.java](src/assignments/assignment05/ScoreManager.java)：成绩图表和两次考试成绩分析。
- [StudentManager.java](src/assignments/assignment05/StudentManager.java)、[VotingSystem.java](src/assignments/assignment05/VotingSystem.java)：内存数组学生管理和多轮投票统计。

### 11 面向对象练习：`src/assignments/experiment05/part01`

- [Account.java](src/assignments/experiment05/part01/Account.java)、[Rectangle.java](src/assignments/experiment05/part01/Rectangle.java)：账户和矩形类，主要供阅读或自行编写调用代码。
- [Card.java](src/assignments/experiment05/part01/Card.java)、[Fan.java](src/assignments/experiment05/part01/Fan.java)：带 `main` 的扑克牌和风扇状态演示。
- [Stock.java](src/assignments/experiment05/part01/Stock.java) + [TestStock.java](src/assignments/experiment05/part01/TestStock.java)：股票涨跌幅，运行 `TestStock`。
- [StopWatch.java](src/assignments/experiment05/part01/StopWatch.java) + [TestStopWatch.java](src/assignments/experiment05/part01/TestStopWatch.java)：排序计时，运行 `TestStopWatch`；此例会分配约一千万个整数。

### 12 面向对象综合题：`src/assignments/experiment05/part02`

- [`task01`](src/assignments/experiment05/part02/task01)：学生属性、构造器、校验；运行 `assignments.experiment05.part02.task01.TestStudent`。
- [`task02`](src/assignments/experiment05/part02/task02)：不可变坐标点、距离与对象比较；运行 `assignments.experiment05.part02.task02.TestImmutablePoint`。
- [`task03`](src/assignments/experiment05/part02/task03)：员工属性、静态成员与收入；运行 `assignments.experiment05.part02.task03.TestEmployee`。
- [`task04`](src/assignments/experiment05/part02/task04)：图书、馆藏、借还和查询；运行 `assignments.experiment05.part02.task04.TestLibrary`。
- 每题的 `.plantuml` 是对应的类图源文件。

## 运行方式

项目使用 Java 17 或更高版本。可在 IntelliJ IDEA 中打开仓库根目录，直接运行带 `main(String[] args)` 的类；也可在 PowerShell 中从仓库根目录编译并运行：

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out (Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
java -cp out examples.basics.HelloWorldApp
java -cp out assignments.experiment05.part02.task04.TestLibrary
```

需要输入的练习请在终端按提示操作。`out/` 和 `*.class` 均属于编译产物，不纳入版本控制。

整理时将原来的 `Main*`、`M2ain*` 等泛名改为对应题目的类名；原 `Main.java` 混合的输出、圆周率、方程组和拆位练习已拆开。空占位类、重复的 `ExpressCalculator2.java` 和误提交的 `.class` 文件已移除，原始版本仍可通过 Git 历史查看。
