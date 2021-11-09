class cylinder
{
    float radius;
    float height;

    cylinder(float x,float y)
    {
      radius=x;
      height=y;
    }

    void Volume()
      {
        float vol=3.14f*radius*radius*height;
        System.out.println("vol="+vol);
      }
    void area()
    {
      float a=(2*3.14f*radius*height)+(2*3.14f*radius*radius);
      System.out.println("Area="+a);
    }
}

class Q2
{
  public static void main(String args[])
  {
    cylinder ob=new cylinder(2.0f,3.0f);
    ob.Volume();
    ob.area();

  }


}
