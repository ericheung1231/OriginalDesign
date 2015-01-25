public void setup()
{
    size(400*3,320*3);
    background(255);
}

public void draw()
{
    fill(mouseX, mouseY, mouseX);
    ellipse(mouseX, mouseY, mouseX, mouseY);
}