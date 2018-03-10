/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;
import java.lang.*;
class TwoD{
    int x,y;
    TwoD(int a,int b){
        x=a;
        y=b;
    }
}
class ThreeD extends TwoD{
    int z;
    ThreeD(int a,int b,int c){
        super(a,b);
        z=c;
    }
}
class FourD extends ThreeD{
    int t;
    FourD(int a, int b, int c, int d){
        super(a,b,c);
        t=d;
    }
}

class Coords<T extends TwoD>{
    T[] coords;
    Coords(T[] o){
        coords = o;
    }
}
class Boundwildcard{
    
}
public class GenericClass {

    static void showXY(Coords<?> c){
        System.out.println("X Y coordinates : ");
        for(int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+
                    c.coords[i].y);
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c ) {
        System.out.println("X Y Z coordinates : ");
        for(int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+
                    c.coords[i].y+" "+c.coords[i].z);
        System.out.println();
        
    }
    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z T coordinates : ");
        for(int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+
                    c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
        System.out.println();
    }
    public static void main(String[] args) {
        TwoD td[]={
            new TwoD(0,0),
            new TwoD(7,9),
            new TwoD(18,4),
            new TwoD(-1,-23)
        };
        
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println(" Contents of tdlocs");
        showXY(tdlocs);
        //showXYZ(tdlocs);
        //showAll(tdlocs);
        FourD fd[]={
            new FourD(1,2,3,4),
            new FourD(6,8,14,8),
            new FourD(22,9,4,9),
            new FourD(3,-2,-23,17)
        };
        Coords<FourD> fdlocs;
        fdlocs = new Coords<>(fd);
        System.out.println(" Contents of fdlocs");
        showXY(fdlocs);
       showXYZ(fdlocs);
       showAll(fdlocs);
       
}
    
}
