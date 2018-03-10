/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;
import java.lang.*;
class box{
    double width;
    double depth;
    double height;
   box(double w,double d,double h){
       width=w;
       depth=d;
       height=h;
   }
    @Override
   public String toString(){
       return "dimensions are" + width +"by"+ height +"by"+ depth+".";
     }
   
}

public class NewClass {
    static String arr[]={"Now", "is", "the", "apple", "rama", "shayam"};

    public static void main(String[] args) {
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j].compareToIgnoreCase(arr[i])<0){
                String t= arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
    System.out.println(arr[i]);} 
    }
    
}

