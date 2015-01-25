int scal, scrnW, scrnH; 
float eWidth, eHeight;
public void setup()
{
  scal = 80;
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
    //eWidth = 20+5000*(1/dist(mouseX,mouseY,scrnW/2,scrnH/2));
    eHeight = mouseX;
    eWidth = mouseY;
  }
  //fill(100+abs(mouseY-mouseY)*2,  100+abs(mouseY-mouseX)*2, 100+abs(mouseY)*2);
  ellipse(mouseX, mouseY, eWidth, eHeight);
}