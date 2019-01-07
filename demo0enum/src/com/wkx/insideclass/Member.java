package com.wkx.insideclass;

/**
 * Created by Administrator on 2019/1/7.
 * 一个成员内部类示例
 * 在一个类中直接定义的内部类，成员内部类与成员没有什么不同，可以和普通成员一样进行修饰
 * 成员内部类不能含有static的变量和方法
 */
public class Member {
    private static int i = 1;
    private int j = 10;
    private int k = 20;

    public static void Member_f1() {
    }

    public void Member_f2() {
    }

    class Inner {
        //static int inner_i = 100;//内部类中不可以定义静态变量
        int j = 100;
        int inner_i = 1;

        void inner_f1() {
            System.out.println(j);
            System.out.println(this.j);// 在内部类中访问内部类自己的变量也可以用this.变量名
            System.out.println(Member.this.j);// 在内部类中访问外部类中与内部类同名的实例变量用外部类名.this.变量名
            // 如果内部类中没有与外部类同名的变量，则可以直接用变量名访问外部类变量
            System.out.println(k);
            System.out.println(i);
            Member_f1();
            Member_f2();
        }
    }

    //外部类的非静态方法访问内部类
    public void Member_f3() {
        Inner inner = new Inner();
        inner.inner_f1();
    }
    //外部类的静态方法访问内部类，相当于外部类外部访问成员内部类一样
    public static void Member_f4(){
        Member member = new Member();
        Inner inner = member.new Inner();
        inner.inner_f1();
    }
    public static void main(String args[]){
        Member member = new Member();
        Inner outin = member.new Inner();
        outin.inner_f1();
    }
}
