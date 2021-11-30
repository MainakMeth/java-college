//Question 4
interface Pickle{
    void tasteFirstSample();
}
class AnotherPickle{
    public void tasteSecondSample(){
        System.out.println("Sweet.");
    };
}
class Test2{
    public static void main(String[] args){
        AnotherPickle p1 = new AnotherPickle(){
            public void tasteSecondSample(){
                System.out.println("Sour.");
            }
        };
        p1.tasteSecondSample();
        AnotherPickle p2 = new AnotherPickle();
        p2.tasteSecondSample();
        Pickle p = new Pickle(){
            public void tasteFirstSample(){
                System.out.println("Spicy.");
            }
        };
        p.tasteFirstSample();
    }
}