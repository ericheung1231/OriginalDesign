int scal, scrnW, scrnH; 
float eWidth, eHeight;
public void setup()
{
    frameRate(240);
  scal = 50;
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
    eHeight = 20+(mouseX/2);
    eWidth = 20+(mouseY/2);
  }
  ellipse(mouseX, mouseY, eWidth, eHeight);
}