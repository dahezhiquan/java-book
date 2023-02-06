# Hello JAVA🙌

Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程

本百科全书使用6000行示例代码带你走进Java的世界

# 使用者导航🚀

此项目是JavaSE示例代码大全，最全的JavaSE代码示例工程

您可以在此获取JavaSE全阶段的代码练习示例，帮助您高效·方便·快捷的进行JAVA的学习

# 目录结构📕

## base

java基础语法内容

- hello.java 第一个java程序
- Escape.java 转义字符
- Var.java 数据类型
- Operator.java 运算符
- BitOperation.java 位运算
- Input.java 键盘输入
- Condition.java 分支
- Array.java 数组
- Loop.java 循环

## object

java面向对象

- Dog.java 类的创建与基本使用
- Person.java 类的方法，递归使用
- Overload.java 方法重载，可变参数
- This.java this关键字

## intermediateobject

面向对象的三大特性，面向对象中级

- AccessModifier.java 访问修饰符
- Encapsulation.java 封装
- Inherit.java 继承的父类
- Graduate.java/Pupil.java 继承的子类
- SuperSon.java super演示子类
- SuperFather.java super演示父类
- OverrideAnimal.java 重写演示父类
- OverrideDog.java 重写演示子类
- MethodPolymorphic.java 方法多态演示
- ObjectPolymorphicAnimal.java 对象多态的父类
- ObjectPolymorphicCat.java/ObjectPolymorphicDog.java 对象多态的子类

### polymorphicarray

多态数组

### polymorphicparameter

多态参数

## seniorobject

面向对象高级

- Static.java 类变量和类方法
- Main.java 深入理解main方法
- Codeblock.java 代码块
- CodeblockStatic.java 静态代码块
- HungryMan.java 单例 - 饿汉式设计模式
- LazyMan.java 单例 - 懒汉式设计模式
- Final.java final关键字
- Abstract.java 抽象类
- AbstractTemplate.java 抽象模板设计模式

### interface_

接口

- UsbInterface.java 接口
- Phone.java 手机设备
- Camera.java 相机设备
- Computer.java 计算机工作

### interclass

内部类

- InnerClass.java 内部类模板
- LocalInnerClass.java 局部内部类
- AnonymousInnerClass.java 匿名内部类
- AnonymousInnerClassPractice.java 匿名内部类的最佳实践
- MemberInnerClass.java 成员内部类
- StaticInnerClass.java 静态内部类

## advanced

java进阶内容

- Eunm.java 枚举类
- EnumMethod.java 枚举类的方法
- Annotation.java java注解
- Exception.java 异常
- Generics.java java泛型
- AdvancedGenerics.java 泛型的高阶使用
- GenericWildcards.java 泛型继承和通配符
- JunitText.java java单元测试工具Junit使用示例

### draw

java绘图

- DrawCircle.java java绘制简单圆形
- Draw.java java绘图方法演示
- Event.java java事件处理机制

## classes

常用类

- CommonObject.java 常用Object类
- Wrapper.java 八大包装类
- StringTest.java String
- StringBufferTest.java StringBuffer类
- StringBuilderTest.java StringBuilder类
- MathTest.java 数学类
- ArraysText.java 数组类
- SystemTest.java System类
- LargeNumber.java java大数处理方案
- DateTest.java 日期类

### aggregate

集合类

- CollectionTest.java Collection接口演示
- IteratorTest.java 迭代器演示
- ListTest.java List接口演示
- ArrayListTest.java ArrayList演示
- LinkedListTest.java LinkedList演示
- SetTest.java Set接口演示
- HashSetText.java HashSet
- LinkedHashSetText.java LinkedHashSet
- MapText.java Map接口演示
- HashTableText.java HashTable演示
- PropertiesText.java Properties演示
- TreeSetText.java TreeSet
- TreeMapText.java TreeMap
- CollectionsText.java Collections工具类演示

## multithreading

java多线程技术

- Cpu.java 查看当前计算机有几核
- ThreadUse.java 多线程基本使用
- ThreadUseByRunnable.java 通过继承Runnable接口实现多线程
- ChildThreads.java 多个子线程案例
- TicketSalesByThread.java 多线程模拟售票，基于继承Thread
- TicketSalesByRunnable.java 多线程模拟售票，基于实现Runnable接口
- TicketSalesResult.java 使用同步机制解决售票问题的超卖现象
- ThreadExit.java 通知线程中止
- ThreadMethod.java 线程常用方法
- DaemonThread.java 守护线程
- ThreadLock.java 线程锁🔒

## IO

java IO流

- CreateFile.java 创建文件
- FileInformation.java 获取文件信息
- DirectoryOperations.java 目录操作
- FileInputStreamText.java 字节输入流演示
- FileOutputStreamText.java 字节输出流演示
- FileCopy.java 文件拷贝
- FileReaderTest.java 字符输入流
- FileWriteTest.java 字符输出流
- BufferedReaderTest.java BufferedReader演示
- BufferedWriterTest.java BufferedWriter演示
- BufferedByteText.java Buffered字节流处理，拷贝图片
- ObjectStreamTest.java 演示ObjectOutputStream与ObjectInputStream
- TransformStream.java 转换流
- PrintTest.java 打印流
- PropertiesTest.java Properties读取修改示例

## networkprogramming

java网络编程

- InetAddressTest.java InetAddress演示

### tcp

TCP编程

- SocketClient.java 客户端
- SocketServer.java 服务端
- CharacterSocketClient.java 字符流客户端
- CharacterSocketServer.java 字符流服务端
- TCPFileUploadClient.java 文件上传客户端
- TCPFileUploadServer.java 文件上传服务端
- StreamUtils.java 工具类：将输入流转化为byte[]
- TCPFileDownloadClient.java 文件下载客户端
- TCPFileDownloadServer.java 文件下载服务端

## reflection

java反射

- reflectionTest.java 反射入门
- ClassMethod.java 演示Class类的常用方法
- GetClass.java 获取Class对象的六种方式
- ReflectionUtils.java 通过反射获取类的结构信息
- ReflectionBlast.java 反射爆破案例，创建实例
- ReflectionBlastAttributes.java 反射爆破案例，爆破属性
- ReflectionBlastMethod.java 反射爆破案例，爆破方法


# 谨记🎂

宝剑锋从磨砺出,梅花香自苦寒来

Happy Coding Guys!