




 class PerimeterOfRectangle{
    int length;
    int width;
    void put (int l, int w){
        length=l;
        width=w;
    }
    void calculation(){
            System.out.println(2*(length+width));
        }
}

public class Perimeter {
    public static void main(String[] args){
        PerimeterOfRectangle s1 = new PerimeterOfRectangle();
        s1.put(10, 20);
        s1.calculation();
    }
}
