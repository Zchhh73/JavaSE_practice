# Java线程

![thread_01](D:\java\JavaSE_note\java_thread\thread_01.png)



### 1.Thread类和Runnable接口

<img src="D:\java\JavaSE_note\java_thread\thread_02.png" alt="thread_02" style="zoom: 50%;" />

<img src="D:\java\JavaSE_note\java_thread\thread_03.png" alt="thread_03" style="zoom: 50%;" />

**join()抢占资源**



#### Runnable接口：

（1）只有1个方法run()；

（2）Runnable是Java中用以实现线程的接口。

（3）任何实现线程功能的类都必须实现该接口。

<img src="D:\java\JavaSE_note\java_thread\thread_04.png" alt="thread_04" style="zoom: 50%;" />

**使用Runnable接口创建线程**：Runnable接口创建线程的主要工作为声明实现Runnable接口的类，在实现类内实现run（）方法，创建实现类的对象，通过实现类的对象创建线程类的对象，调用start（）方法启动线程。



### 2.线程状态

新建（New）；可运行（Runnable）；正在运行（Running）阻塞（Blocked）；终止（Dead）

<img src="D:\java\JavaSE_note\java_thread\thread_05.png" alt="thread_05" style="zoom: 50%;" />



### 3.线程方法

<img src="D:\java\JavaSE_note\java_thread\thread_06.png" alt="thread_06" style="zoom: 50%;" />



<img src="D:\java\JavaSE_note\java_thread\thread_07.png" alt="thread_07" style="zoom: 50%;" />



<img src="D:\java\JavaSE_note\java_thread\thread_08.png" alt="thread_08" style="zoom: 50%;" />



<img src="D:\java\JavaSE_note\java_thread\thread_09.png" alt="thread_09" style="zoom: 50%;" />



### 4.线程同步

<img src="D:\java\JavaSE_note\java_thread\thread_10.png" alt="thread_10" style="zoom: 50%;" />

<img src="D:\java\JavaSE_note\java_thread\thread_11.png" alt="thread_11" style="zoom: 50%;" />

<img src="D:\java\JavaSE_note\java_thread\thread_12.png" alt="thread_12" style="zoom: 50%;" />

