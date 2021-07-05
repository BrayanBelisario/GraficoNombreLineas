import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class figurasBasicas extends PApplet {
  public void setup() {



// dibujando una recta
//b
line(5,50,35,50);
line(5,50,5,120);
line(35,50,35,80);
line(5,120,35,120);
line(35,120,35,90);
line(35,90,20,85);
line(20,85,35,80);
rect(15,60,10,15);
rect(15,95,10,15);
//r
line(40,50,70,50);
line(70,50,70,80);
line(70,80,60,85);
line(60,85,70,90);
line(40,50,40,120);
line(40,120,50,120);
line(50,120,50,95);
line(50,95,60,95);
line(60,95,60,120);
line(60,120,70,120);
line(70,120,70,90);
rect(50,60,10,15);
//a
line(75,50,105,50);
line(105,50,105,120);
line(75,50,75,120);
rect(85,60,10,15);
line(75,120,85,120);
line(85,120,85,95);
line(105,120,95,120);
line(95,120,95,95);
line(95,95,85,95);
//y
line(110,50,120,50);
line(120,50,120,80);
line(120,80,130,80);
line(130,80,130,50);
line(130,50,140,50);
line(140,50,140,90);
line(140,90,130,90);
line(130,90,130,120);
line(130,120,120,120);
line(120,120,120,90);
line(120,90,110,90);
line(110,90,110,50);
//a

line(145,50,175,50);
line(175,50,175,120);
line(145,50,145,120);
rect(155,60,10,15);
line(145,120,155,120);
line(155,120,155,95);
line(175,120,165,120);
line(165,120,165,95);
line(165,95,155,95);
//n
line(180,50,192,50);
line(180,50,180,120);
line(180,120,190,120);
line(190,120,190,80);
line(210,50,210,120);
line(210,50,200,50);
line(210,120,200,120);
line(200,120,190,80);
line(200,50,200,90);
line(200,90,192,50);

    noLoop();
  }

  public void settings() { 
size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "figurasBasicas" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
