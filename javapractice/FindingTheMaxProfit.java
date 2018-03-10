/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.sql.Timestamp;
import java.util.*;
import java.time.LocalTime;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class FindingTheMaxProfit {

    /**
     * @param args the command line arguments
     */
    static class PriceNode{
        private LocalTime time;
        private double price;
        
        void setTime(String T){
            this.time = LocalTime.parse(T);
        }
        
        void setPrice(double D){
            this.price = D;
        }
        
        PriceNode(String T,double D){
            this.time = LocalTime.parse(T);
            this.price = D;
        }
        
        LocalTime getTime(){
            return time;
        }
        
        double getPrice(){
            return price;
        }
        
    }
    
    static void solve(ArrayList<PriceNode> P){
        PriceNode min_price_node = P.get(0);
        double max_profit = 0;
        LocalTime buy_time = P.get(0).getTime();
        LocalTime sell_time = P.get(0).getTime();
        for(int i = 0; i < P.size()-1 ; i++){
            PriceNode current = P.get(i+1);
            
            double current_price = current.getPrice();
            
            double profit = current_price - min_price_node.getPrice();
            
            if(profit > max_profit)
            {    
                max_profit = profit;
                sell_time = current.getTime();
                buy_time = min_price_node.getTime();
            }
            if(current_price < min_price_node.getPrice())
            {
                min_price_node = current;
            }
        }
        if(max_profit == 0 && buy_time == sell_time)
            System.out.println("There would be no profit since all the prices are in descending order.");
        else
            System.out.println("Buy at "+buy_time+" and Sell at "+sell_time+", profit would have been "+max_profit);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<PriceNode> P = new ArrayList<>(n);
        while(n-- > 0){
            double price = scan.nextDouble();
            String time = scan.next();
            PriceNode p_node = new PriceNode(time,price);
            P.add(p_node);
        }
            solve(P);
    }
    
}
