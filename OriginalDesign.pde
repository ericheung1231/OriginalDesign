public void setup()
{
    size(800,640);
    background(255);
}

public void draw()
{
    fill(mouseX, mouseY, mouseX);
    ellipse(mouseX, mouseY, mouseX, mouseY);
}