public void setup()
{
    size(400*3,320*3);
    background(255);
}

public void draw()
{
    fill(abs(mouseX-mouseY), abs(mouseY-mouseX), abs(mouseX-mouseX));
    ellipse(mouseX, mouseY, mouseX, mouseY);
}