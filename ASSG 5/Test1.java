//Question 2
class Outer{
    public void methodOne(){
        System.out.println("Method of Outer Class.");
    }
    class Inner{
        public void methodTwo(){
            System.out.println("Method of Inner Class.");
            methodOne();
        }
    }
}
class Test1{
    public static void main(String[] args){
        new Outer().new Inner().methodTwo();
    }
}