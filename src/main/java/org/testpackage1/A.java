package org.testpackage1;

public class A  {

    public static void main(String[] args) {
        A atest = new A();
        atest.test1();
        atest.test2();
        atest.test3();
        atest.test4();
    }

    private void test1(){
        System.out.println("class A test 1");
    }

     void test2(){
        System.out.println("class A test 2");
    }
    protected void test3(){
        System.out.println("class A test 3");
    }
    public void test4(){
        System.out.println("class A test 4");
    }


}
