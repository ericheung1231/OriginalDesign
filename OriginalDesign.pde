int scal, scrnW, scrnH; 
float eWidth, eHeight;
public void setup()
{
    frameRate(240);
  scal = 60;
  scrnW = 20*scal;
  scrnH = 16*scal;
  size(scrnW, scrnH);
  background(255);
}

public void draw()
{
  eWidth = mouseX/2;
  eHeight = mouseY/2;
  if ( keyPressed == true && key == 'e' )
  {
    noStroke();
    eWidth = 100+((mouseX+mouseY)/4);
    eHeight = 100+((mouseX+mouseY)/4);
  }
  else
  {
    stroke(0);
    //strokeWeight(10);
    //eWidth = 20+5000*(1/dist(mouseX,mouseY,scrnW/2,scrnH/2));
    eHeight = 20+(mouseX/2);
    eWidth = 20+(mouseY/2);
  }
  //fill(100+abs(mouseY-mouseY)*2,  100+abs(mouseY-mouseX)*2, 100+abs(mouseY)*2);
  ellipse(mouseX, mouseY, eWidth, eHeight);
}