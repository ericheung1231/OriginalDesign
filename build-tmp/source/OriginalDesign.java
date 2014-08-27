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

public class OriginalDesign extends PApplet {

public void setup()
{
  size(400,400);
  background (191, 230, 224);
  noLoop();
}
public void draw()
{
//var skin = color(245, 202, 137);
//var cheeks = color (224, 112, 112);

fill(245, 202, 137);
ellipse(200,170, 190,225);

translate(15,0);
fill(245, 202, 137);
stroke(0, 0, 0);
beginShape();
    curveVertex(100,200);
    curveVertex(90,190);
    curveVertex(95,195);
    curveVertex(88,194);
    curveVertex(95,220);
    curveVertex(97,235);
    curveVertex(105,245);
    curveVertex(130,262);
endShape();
translate(-30,0);
beginShape();
    curveVertex(300,200);
    curveVertex(310,190);
    curveVertex(305,195);
    curveVertex(312,194);
    curveVertex(305,220);
    curveVertex(303,235);
    curveVertex(295,245);
    curveVertex(270,262);
endShape();
translate(15,0);

//cheek/chin
beginShape();
    curveVertex(100,180);
    curveVertex(104,180);
    curveVertex(128,270);
    curveVertex(170,317);
    curveVertex(200,324);
    curveVertex(230,317);
    curveVertex(272,270);
    curveVertex (296, 180);
    curveVertex (300,180);
endShape();

//hair
fill(38, 36, 33);
stroke(5, 5, 5);
beginShape();
    curveVertex(108,250);
    curveVertex(108,220);
    curveVertex(103,125);
    curveVertex(140,68);
    curveVertex(200,45);
    curveVertex(260,68);
    curveVertex(297,125);
    curveVertex(292,220);
    curveVertex(292,250);
endShape();

noStroke();
fill(255, 255, 255,20);
ellipse(190,96,110,100);

fill(26, 23, 20);
beginShape();
    curveVertex(108,250);
    curveVertex(108,220);
    curveVertex(103,125);
    curveVertex(150,68);
    curveVertex(230,70);
    curveVertex(270,97);
    curveVertex(293,130);
    curveVertex(292,220);
    curveVertex(292,250);
endShape();

fill(245, 202, 137);
beginShape();
    curveVertex(200,90);
    curveVertex(200,90);
    curveVertex(220,85);
    curveVertex(270,100);
    curveVertex(277,140);
    curveVertex(285,170);
    curveVertex(287,219);
    curveVertex(287,219);
endShape();

beginShape();
    curveVertex(200,90);
    curveVertex(200,90);
    curveVertex(180,85);
    curveVertex(135,103);
    curveVertex(123,140);
    curveVertex(115,170);
    curveVertex(113,219);
    curveVertex(113,219);
endShape();
strokeWeight(2);
stroke(245, 202, 137);
beginShape();
    vertex(200,91);
    vertex(287,219);
    vertex(113,219);
    vertex(200,91);
endShape();

// shading
noStroke();
fill(46, 4, 4,40);
beginShape();
    curveVertex(200,90);
    curveVertex(200,90);
    curveVertex(220,85);
    curveVertex(270,100);
    curveVertex(277,140);
    curveVertex(285,170);
    curveVertex(287,219);
    curveVertex(286,222);
    curveVertex(272,270);
    curveVertex(230,317);
    curveVertex(200,324);
    curveVertex(202,310);
    curveVertex(200,290);
    curveVertex(213,280);
    curveVertex(217,275);
    curveVertex(214,270);
    curveVertex(206,265);
    curveVertex(207,258);
    curveVertex(204,248);
    curveVertex(215,230);
    curveVertex(210,210);
    curveVertex(205,170);
    curveVertex(230,150);
    curveVertex(207,120);
    curveVertex(160,90);
    curveVertex(180,85);
    curveVertex(200,90);
    curveVertex(200,90);
endShape();

fill(247, 236, 207,90);
beginShape();
    curveVertex(130,100);
    curveVertex(142,100);
    curveVertex(135,140);
    curveVertex(115,170);
    curveVertex(113,219);
    curveVertex(114,222);
    curveVertex(133,270);
    curveVertex(160,307);
    curveVertex(164,290);
    curveVertex(170,270);
    curveVertex(170,250);
    curveVertex(145,190);
    curveVertex(145,190);
    curveVertex(155,155);
    curveVertex(180,120);
    curveVertex(170,105);
    curveVertex(155,92);
    curveVertex(140,100);
    curveVertex(150,88);
endShape();

fill(255, 213, 150,100);
ellipse(200,302,40,25);

strokeWeight(1);
translate(0,10);
//guidelines
/*beginShape();
    curveVertex(100,364);
    curveVertex(100,180);
    curveVertex(200,139);
    curveVertex (300, 180);
    curveVertex (300,364);
endShape();
beginShape();
    curveVertex(100,200);
    curveVertex(100,180);
    curveVertex(200,170);
    curveVertex (300, 180);
    curveVertex (300,200);
endShape();
line(200,0,200, 400);
line(225,0,225, 400);
line(175,0,175, 400);
line(150,240, 250,240);*/

//righteye
translate(-3,3);
noStroke();
fill(0, 0, 0,75);
bezier(225,175,230,165,240,160, 265,173);
stroke(0, 0, 0);
fill(247, 244, 193);
bezier(225,175,226,165,240,160, 260,173);
fill(36, 30, 22);
ellipse(239, 170, 13,10);
fill(0, 0, 0);
ellipse(239, 169, 5,5);
fill(247, 244, 193);
noStroke();
fill(245, 202, 137, 75);
bezier(225,175,235,205,275,190,253,175);

//lefteye
translate(6,0);
noStroke();
fill(0, 0, 0,75);
bezier(135,173,155,165,165,160,175,175);

fill(46, 4, 4,15);
beginShape();
    curveVertex(140,200);
    curveVertex(140,205);
    curveVertex(140,195);
    curveVertex(160,170);
    curveVertex(160,152);
    curveVertex(178,164);
    curveVertex(178,177);
    curveVertex(160,190);
    curveVertex(140,205);
    curveVertex(140,205);
endShape();

stroke(0, 0, 0);
fill(247, 244, 193);
bezier(140,173,155,165,169,160,175,175);
fill(36, 30, 22);
ellipse(161, 170, 13,10);
fill(0, 0, 0);
ellipse(161, 169, 5,5);

//nose
translate(-3,-5);
fill(25, 26, 25,50);
float nostrils = 0.9f;
scale(nostrils);
int bob = 22;
translate(bob,bob+3);
bezier(205,240,215,230,219,235,218,239);
bezier(195,240,185,230,181,235,182,239);
translate(-bob,-bob-3);
scale(1/nostrils);
bezier(215,215,226,225,226,235,223,240);
noFill();
bezier(185,215,174,225,175,235,177,240);
noStroke();
fill(5, 5, 5,25);
bezier(177,240,175,225,225,225,223,240);
stroke(255, 255, 255,75);
strokeWeight(4);
line(197,188,195,215);
noStroke();
fill(245, 202, 137);
ellipse(200,227,25,20);
fill(247, 236, 207,100);
ellipse(195,222,13,10);

//mouth
translate(0,-6);
stroke(0, 0, 0);
strokeWeight(1);

//upperlip
fill(184, 114, 132,125);
beginShape();
    curveVertex(170,270);
    curveVertex(170,270);
    curveVertex(175,268);
    curveVertex(190,262);
    curveVertex(200,264);
    curveVertex(210,262);
    curveVertex(225,268);
    curveVertex(230,270);
    curveVertex(230,270);
endShape();

//lowerlip
beginShape();
    curveVertex(170,270);
    curveVertex(170,270);
    curveVertex(178,280);
    curveVertex(188,286);
    curveVertex(200,286);
    curveVertex(212,286);
    curveVertex(222,280);
    curveVertex(230,270);
    curveVertex(230,270);
endShape();

noStroke();
fill(245, 44, 44, 75);
beginShape();
    curveVertex(170,270);
    curveVertex(170,270);
    curveVertex(180,275);
    curveVertex(190,278);
    curveVertex(200,278);
    curveVertex(210,278);
    curveVertex(220,275);
    curveVertex(230,270);
    curveVertex(230,270);
endShape();

strokeWeight(1);
stroke(5, 5, 5);
noFill();
bezier(170,270,180,275,220,275, 230,270);

//eyebrows
translate(0,8);

//rightbrow
fill(38, 36, 35,75);
noStroke();
beginShape();
    curveVertex(270,170);
    curveVertex(270,150);
    curveVertex(240,150);
    curveVertex(215,157);
    curveVertex(218,145);
    curveVertex(245,138);
    curveVertex(270,150);
    curveVertex(294,220);
endShape();

fill(43, 40, 27,125);
beginShape();
    curveVertex(270,170);
    curveVertex(270,150);
    curveVertex(240,150);
    curveVertex(235,150);
    curveVertex(220,142);
    curveVertex(256,136);
    curveVertex(270,150);
    curveVertex(270,150);
endShape();

//leftbrow
fill(38, 36, 35,75);
noStroke();
beginShape();
    curveVertex(130,170);
    curveVertex(130,150);
    curveVertex(160,150);
    curveVertex(185,157);
    curveVertex(182,145);
    curveVertex(155,138);
    curveVertex(130,150);
    curveVertex(106,220);
endShape();

//stroke(3, 3, 3);
fill(43, 40, 27,125);
beginShape();
    curveVertex(130,170);
    curveVertex(130,150);
    curveVertex(160,150);
    curveVertex(165,150);
    curveVertex(180,142);
    curveVertex(144,136);
    curveVertex(130,150);
    curveVertex(130,150);
endShape();
translate(0,-8);

fill(46, 4, 4,30);
ellipse(199,256,5,10);
fill(46, 4, 4,20);
ellipse(200,289,20,5);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
