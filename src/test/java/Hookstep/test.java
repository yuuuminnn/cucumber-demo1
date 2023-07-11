package Hookstep;

class test1{
    public static void main(String[] args){
        test3 new1 = new test3();//调用子类
        new1.name="小胖";
        new1.age=20;
        new1.show();
    }
}

class test2{
    //父类
    String name;
    int age;
    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
class test3 extends test2{
    //子类继承了父类
}
