public class operator{
    public static void main(String args[]){
        int x,y,z;
        x=y=z=2;
        x+=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        y-=z;
        z/=(x+y);
        System.out.println(x+""+y+""+z);

    }
}