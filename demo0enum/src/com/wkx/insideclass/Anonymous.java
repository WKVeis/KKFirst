package com.wkx.insideclass;

/**
 * Created by Administrator on 2019/1/7.
 * 匿名内部：类匿名内部类就是没有名字的内部类
 * 适用匿名内部类的场景:
 1只用到类的一个实例。
 2类在定义后马上用到。
 3类非常小（SUN推荐是在4行代码以下）
 4给类命名并不会导致你的代码更容易被理解。
 原则:
      匿名内部类不能有构造方法。

 　　匿名内部类不能定义任何静态成员、方法和类。

 　　匿名内部类不能是public,protected,private,static。

 　　只能创建匿名内部类的一个实例。

     一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。

 　　因匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。
 */
public class Anonymous {

}

//关于内部类的详细解释：https://www.cnblogs.com/yzssoft/p/7156809.html
