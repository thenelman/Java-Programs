
package applets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.util.ArrayList;

public class canonball extends JComponent {
  private final double gravity = 9.81;
  private final double deltaT = 0.01;

  private double angle;
  private double vel;
  private double vx;
  private double vy;
  private double sx;
  private double sy;
  private double sxMax;
  private double syMax;

  ArrayList<Point2D.Double> positions = 
    new ArrayList<Point2D.Double>(100);
  
  public canonball(double a, double v){
    vel = v;
    angle = a;
    vx = vel*Math.cos(Math.toRadians(angle));
    vy = vel*Math.sin(Math.toRadians(angle));
    sx = 0.0;
    sy = 0.0;
  }
  
  public void simulateRide() {
    double t = 0.0;
    do {
      int intT = (int)(t*100);
      if (intT % 100 == 0) { 
        System.out.println("time="+t+" sx="+sx+" sy="+sy);
        positions.add(new Point2D.Double(sx,sy)); 
      }
      t += deltaT;
      vy -= gravity*deltaT;
		if (vy < 0) {
		  syMax = sy;
		}
      sx += vx*deltaT;
      sy += vy*deltaT;
    } while (sy > 0.0);
  }

  public void drawAxes(Graphics2D g2){
    Line2D.Double xAxis = 
      new Line2D.Double(50.0,getHeight()-50,getWidth(),getHeight()-50);
    g2.draw(xAxis);
    Line2D.Double yAxis =
      new Line2D.Double(50.0,0,50.0,getHeight()-50);
    g2.draw(yAxis);
  }
    
  public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    drawAxes(g2);
	 sxMax = 0.0;
	 syMax = 0.0;
	 for (int i=0; i<positions.size(); i++) {
	   Point2D.Double p = positions.get(i);
	 	if(syMax < p.getY())
		  syMax = p.getY();
		if(sxMax < p.getX())
		  sxMax = p.getX();
	 }
    for (int i=0; i<positions.size(); i++) {
      Point2D.Double p = positions.get(i);
      double sx = p.getX();
      double sy = p.getY();
		Ellipse2D.Double ball;
	   if((syMax < (getHeight()-55.0)) && (sxMax < (getWidth()-55.0))) // no scaling
        ball = 
          new Ellipse2D.Double(sx+45.0,getHeight()-55.0-sy,10,10);
		else if(!(syMax < (getHeight()-55.0)) && (sxMax < (getWidth()-55.0))) // scale y
		  ball = 
          new Ellipse2D.Double(sx+45.0,
			                        getHeight()-55.0-((sy/syMax)*(getHeight()-100)),10,10);
		else if((syMax < (getHeight()-55.0)) && !(sxMax < (getWidth()-55.0))) // scale x
		  ball = 
          new Ellipse2D.Double(((sx/sxMax)*(getWidth()-100))+45.0,
			                        getHeight()-55.0-sy,10,10);
		else // scale x and y
		  ball = 
          new Ellipse2D.Double(((sx/sxMax)*(getWidth()-100))+45.0,
			                        getHeight()-55.0-((sy/syMax)*(getHeight()-100)),10,10);
      g2.draw(ball);
      g2.fill(ball);
    }
	 g2.drawString("Initial Velocity: "+(int)vel+" m/s",70,20);
	 g2.drawString("Launch Angle:     "+(int)angle+" deg",70,40);
	 g2.drawString("Sx Max:           "+(int)sxMax+" m",70,60);
	 g2.drawString("Sy Max:           "+(int)syMax+" m",70,80);
	 System.out.println("sxmax: "+sxMax);
	 System.out.println("symax: "+syMax);
  }
 public static void main(String[] args){
     canonball A= new canonball(45.0,25);
 } 
      
 
}

