/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicString;
import java.util.*;
import java.lang.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class MagicString {

    /**
     * @param args the command line arguments
     */
    static HashMap<Character,List<String>> setRules(Character[] s){
        HashMap<Character,List<String>> rules = new HashMap<>();
        List<String> l;
        for(Character a : s)
        {
            switch(a){
                case 'a':
                    l = new LinkedList<>();
                    l.add("e");
                    rules.put(a,l);
                    
                    break;
                    
                case'e':
                    l = new LinkedList<>();
                    l.add("a");
                    l.add("i");
                    rules.put(a,l);
                    
                    break;
                    
                case'i':
                    l = new LinkedList<>();
                    l.add("a");
                    l.add("e");
                    l.add("o");
                    l.add("u");
                    rules.put(a,l);
                    
                    break;
                            
                case'o':
                    l = new LinkedList<>();
                    l.add("i");
                    l.add("u");
                    rules.put(a,l);
                    
                    break;
                                
                case'u':
                    l = new LinkedList<>();
                    l.add("a");
                    rules.put(a,l);
                    
                    break;
            }
            
            
        }
        return rules;
    }
    
    static int magicStringCount(int n)
    {
        Character[] single= new Character[]{'a','e','i','o','u'};
        HashSet<String> set = new HashSet<String>(); // set for storing the magic strings;
        HashMap<Character,List<String>> rules = setRules(single); // the rules of magic string
       
        
        for(Character ch : single)
        {
            String str = ""+ch;
            set.add(str);
        }
        
        int size =1;
        if(n == 1)
            return set.size();
        
        while(size < n){
            HashSet<String> newSet = new HashSet<String>();
            for(String str : set)
            {
                char lastChar = str.charAt(size-1);
                //System.out.println(lastChar);
                List<String> l = rules.get(lastChar);
                //System.out.println(l);
                for(String s : l)
                {
                    String newStr = new StringBuilder(str+s).toString();
                    //System.out.println(newStr);
                    newSet.add(newStr);
                }
                
                
            }
            
            set = newSet;
            size++;
        }
        System.out.println(set);
        return set.size();
            
   }
        
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(magicStringCount(N));
        scan.close();
    }
    
}
