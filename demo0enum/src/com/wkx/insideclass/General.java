package com.wkx.insideclass;

/**
 * Created by Administrator on 2019/1/7.
 *一个普通的内部类示例
 */

 class Example01{
    public String name(){
        return "weikaixinag";
    }
}
  class Example02{
    public int age(){
        return 25;
    }
}

public class General {
    private class Test1 extends  Example01{
        public String name() {
            return super.name();
        }
    }
    private class Test2 extends Example02{
        public int age(){
            return super.age();
        }
    }
    public String name(){
        return  new Test1().name();
    }
    public int age(){
        return new Test2().age();
    }

    public static void main(String args[]) {
        General general = new General();
        System.out.println("姓名：" + general.name());
        System.out.println("年龄:"+general.age());
    }

}
