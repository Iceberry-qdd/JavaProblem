# com.advanced.day5

### Problem1

1. 异常的Throwable类是所有异常类的根类，Error类和Exception类继承了Throwable类，Exception异常又分为checked异常和runtime异常。
2. Error是严重错误，无法通过纠正代码的方式处理，比如：内存不足，网络中断等等。
3. Exception表示异常，可以通过纠正代码的方式进行处理且必须处理，比如：转型失败，空指针异常等。
4. RuntimeException指运行时异常，这类异常通常不会被编译器检测出来，比如：数学异常。

### Problem2

1. throw用在方法内，作用：抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。
2. throws用在方法声明之上，作用：表示当前方法但不处理异常，提醒该方法的调用者来处理异常。

### Problem3

1. Java中异常处理有5种方式，分别是

      ①try...catch...（分为单catch和多catch）

   ```java
   try{
   //可能出现的异常代码
   }catch(异常类型 e){
   //处理异常的代码
   }catch(异常类型 e){
   //处理异常的代码
   }
   ```

   ②try...catch...finally

   ```java
   try{
   //可能出现的异常代码
   }catch(异常类型 e){
   //处理异常的代码
   }finally{
   //程序必须执行的语句
   }
   ```

   ③自动关闭资源的try语句

   ```java
   try(FileInputStream file =new FileInputStream("文件名")){
   //对文件的操作
   }catch(IOException e){
   	System.out.println((java).getMessage());
   }
   ```

   ④嵌套的try...catch...

   ```java
   try{
   	try{
   	//可能出现的异常代码
   	}catch(异常类型 e){
   	//处理异常的代码
   	}
   }catch(异常类型 e){
   //处理异常的代码
   }
   ```

   ⑤多异常捕获

   ```java
   try{
       // 可能会发生异常的语句
   } catch (异常类型一 | 异常类型二 e) {
       // 调用方法methodA处理
   }
   ```

2. 略

### problem4

​	常见异常如：数组越界、文件不存在、数学错误等。原因略。

### Problem5

1. 空指针异常：java.lang.NullPointerException
2. 数组越界异常：java.lang.ArrayIndexOutOfBoundsException
3. 数学运算异常：java.lang.ArithmeticException
4. 数字格式异常：java.lang.NumberFormatException
5. 解析异常：ParseException

### Problem6

​	并发：指两个或多个事件在同一个时间段内发生。

​	并行：指两个或多个事件在同一时刻发生(同时发生)。

### Problem7

​	进程：指一个内存中运行的程序，也指程序的一次执行过程。

​	线程：进程的一个执行单元，负责当前进程中程序的执行。

​	进程与线程的关系：一个程序运行后至少有一个进程，一个进程中可以包含多个线程。

​	举例略。