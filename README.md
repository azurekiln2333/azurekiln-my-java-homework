# Java 作业示例索引

这是独立的课堂练习合集，不是一个统一运行的程序。下面的编号是建议学习顺序，并非 Git 提交时间。`src` 根目录的零散例子已按主题归档；原有的 `myshopping`、`fourth`、`fifth`、`ep5`、`ep52` 保留作业批次名称，方便与题目对照。

## 建议学习顺序

### 01 基础语法：`src/basics`

- [HelloWorldApp.java](src/basics/HelloWorldApp.java)：最简单的输出程序。
- [WelcomeToJava.java](src/basics/WelcomeToJava.java)：循环输出与字符画；从原 `Main.java` 的注释练习提取。
- [Variable.java](src/basics/Variable.java)、[VariableScope.java](src/basics/VariableScope.java)：对象打印与局部变量作用域。
- [CommandParameter.java](src/basics/CommandParameter.java)：`printf` 数字、日期格式化。

### 02 运算与数学：`src/arithmetic`

- [ArithmaticOp.java](src/arithmetic/ArithmaticOp.java)：基本运算符、自增与取余；保留原文件名。
- [GravityCalculator.java](src/arithmetic/GravityCalculator.java)：自由落体位置计算。
- [DigitExtraction.java](src/arithmetic/DigitExtraction.java)、[DigitSum.java](src/arithmetic/DigitSum.java)：三位数拆位与各位求和。
- [Encode.java](src/arithmetic/Encode.java)：整数公式变换练习，并非安全加密算法。
- [PiApproximation.java](src/arithmetic/PiApproximation.java)：莱布尼茨级数近似圆周率；从原 `Main.java` 的注释练习提取。
- [LinearEquationDemo.java](src/arithmetic/LinearEquationDemo.java)、[QuadraticEquation.java](src/arithmetic/QuadraticEquation.java)：二元一次方程组、一元二次方程及其图像分析。

### 03 条件与选择：`src/conditions`

- [MaxOfFour.java](src/conditions/MaxOfFour.java)、[PalindromeNumber.java](src/conditions/PalindromeNumber.java)：比较四个数与三位数回文判断。
- [RandomMonth.java](src/conditions/RandomMonth.java)、[FutureWeekday.java](src/conditions/FutureWeekday.java)：`switch` 表达式与日期偏移。
- [ScoreLevelCalculator.java](src/conditions/ScoreLevelCalculator.java)、[StudentCodeLookup.java](src/conditions/StudentCodeLookup.java)：成绩分级与专业/年级编码查询。
- [SwitchDemo.java](src/conditions/SwitchDemo.java)：按气温区间输出提示。

### 04 循环：`src/loops`

- [BreakDemo.java](src/loops/BreakDemo.java)：`break` 对循环的影响。
- [DoublingLoop.java](src/loops/DoublingLoop.java)：反复翻倍直到超过阈值。
- [Prime.java](src/loops/Prime.java)：输出 100 以内的素数。

### 05 数组与字符串：`src/arrays_strings`

- [ArrayTest.java](src/arrays_strings/ArrayTest.java)：选择排序及每轮状态。
- [ASCIIQuery.java](src/arrays_strings/ASCIIQuery.java)：查询输入字符的编码值。
- [CharacterStatistics.java](src/arrays_strings/CharacterStatistics.java)：字符分类统计、大小写转换与随机验证码。

### 06 引用与对象：`src/objects`

- [PrimitiveParameterDemo.java](src/objects/PrimitiveParameterDemo.java)、[ReferenceBufferDemo.java](src/objects/ReferenceBufferDemo.java)：基本类型传参、可变对象引用的区别。
- [Card.java](src/objects/Card.java)、[CardSwap.java](src/objects/CardSwap.java)：扑克牌模型，以及交换引用、数组元素和对象字段的差别。

### 07 独立应用练习：`src/applications`

- [PriceCalculator.java](src/applications/PriceCalculator.java)、[SalaryCalculator.java](src/applications/SalaryCalculator.java)、[ExpressCalculator.java](src/applications/ExpressCalculator.java)：满减、工资和运费计算。
- [DateDiffCalculator.java](src/applications/DateDiffCalculator.java)：使用 `LocalDate` 计算真实日历天数差。
- [MenuCalculator.java](src/applications/MenuCalculator.java)：循环菜单式计算器。
- [RegistrationLogin.java](src/applications/RegistrationLogin.java)：内存中的注册、登录及三次失败锁定演示，不提供持久化或真实认证。
- [RentalMenuMockup.java](src/applications/RentalMenuMockup.java)：仅打印租房系统菜单，后续功能尚未实现。

### 08 早期购物练习：`src/myshopping`

- [DiscountPrice.java](src/myshopping/DiscountPrice.java)、[GoodLuck.java](src/myshopping/GoodLuck.java)：折扣比较与会员卡号幸运判定。
- [LuckDraw.java](src/myshopping/LuckDraw.java)、[Pay.java](src/myshopping/Pay.java)：抽奖和消费单演示。四个文件是独立程序，不共享数据。

### 09 第四批作业：`src/fourth`

- [CharsTools.java](src/fourth/CharsTools.java)、[DisplayNumber.java](src/fourth/DisplayNumber.java)：按列输出字符、排序三个数。
- [`goshopping`](src/fourth/goshopping)：七个独立的购物/会员练习，包括客户录入、折扣、储蓄计划、抽奖、登录菜单和修改资料；`LoginMenu` 只是其中一个入口，并非完整系统。

### 10 第五批作业：`src/fifth`

- [CaesarCipher.java](src/fifth/CaesarCipher.java)、[WordCount.java](src/fifth/WordCount.java)、[StringFilterSystem.java](src/fifth/StringFilterSystem.java)：文本加解密、词频和敏感词过滤。
- [PolynomialCalculator.java](src/fifth/PolynomialCalculator.java)：多项式加法、乘法、求值、求导与积分演示。
- [StudentBarChart.java](src/fifth/StudentBarChart.java)、[ScoreManager.java](src/fifth/ScoreManager.java)：成绩图表和两次考试成绩分析。
- [StudentManager.java](src/fifth/StudentManager.java)、[VotingSystem.java](src/fifth/VotingSystem.java)：内存数组学生管理和多轮投票统计。

### 11 面向对象练习：`src/ep5`

- [Account.java](src/ep5/Account.java)、[Rectangle.java](src/ep5/Rectangle.java)：账户和矩形类，主要供阅读或自行编写调用代码。
- [Card.java](src/ep5/Card.java)、[Fan.java](src/ep5/Fan.java)：带 `main` 的扑克牌和风扇状态演示。
- [Stock.java](src/ep5/Stock.java) + [TestStock.java](src/ep5/TestStock.java)：股票涨跌幅，运行 `TestStock`。
- [StopWatch.java](src/ep5/StopWatch.java) + [TestStopWatch.java](src/ep5/TestStopWatch.java)：排序计时，运行 `TestStopWatch`；此例会分配约一千万个整数。

### 12 面向对象综合题：`src/ep52`

- [`task1`](src/ep52/task1)：学生属性、构造器、校验；运行 `ep52.task1.TestStudent`。
- [`task2`](src/ep52/task2)：不可变坐标点、距离与对象比较；运行 `ep52.task2.TestImmutablePoint`。
- [`task3`](src/ep52/task3)：员工属性、静态成员与收入；运行 `ep52.task3.TestEmployee`。
- [`task4`](src/ep52/task4)：图书、馆藏、借还和查询；运行 `ep52.task4.TestLibrary`。
- 每题的 `.plantuml` 是对应的类图源文件。

## 运行方式

项目使用 Java 17 或更高版本。可在 IntelliJ IDEA 中打开仓库根目录，直接运行带 `main(String[] args)` 的类；也可在 PowerShell 中从仓库根目录编译并运行：

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out (Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
java -cp out basics.HelloWorldApp
java -cp out ep52.task4.TestLibrary
```

需要输入的练习请在终端按提示操作。`out/` 和 `*.class` 均属于编译产物，不纳入版本控制。

整理时将原来的 `Main*`、`M2ain*` 等泛名改为对应题目的类名；原 `Main.java` 混合的输出、圆周率、方程组和拆位练习已拆开。空占位类、重复的 `ExpressCalculator2.java` 和误提交的 `.class` 文件已移除，原始版本仍可通过 Git 历史查看。
