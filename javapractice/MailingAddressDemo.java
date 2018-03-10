/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class MailingAddressDemo {

    /**
     * @param args the command line arguments
     */
    static class Address{
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;
        
        Address(String n,String s, String c,String st,String cd){
            this.name=n;
            this.street=s;
            this.state=st;
            this.city = c;
            this.code  =cd;
        }
        
        public String toString(){
            return name+"\n"+street+" "+city+" "+state+" "+code;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Address> ll = new LinkedList();
        ll.add(new Address("Nelson M","keishamthong","imphal","manipur","MN"));
        ll.add(new Address("Nico Xemenes","Warangal","Hyderabad","Telangana","TN"));
        ll.add(new Address("Prem Manu","Baker Street","Westminster","New England","NE"));
        
        for(Address ad : ll)
            System.out.println(ad + "\n");
        System.out.println();
    }
    
}
