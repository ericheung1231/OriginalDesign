public void setup()
{
    size(2000,1600);
    background(255);
}

public void draw()
{
    fill(mouseX, mouseY, mouseX);
    ellipse(mouseX, mouseY, mouseX, mouseY);
}