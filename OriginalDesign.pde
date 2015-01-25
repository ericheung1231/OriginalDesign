public void setup()
{
    size(1600,2000);
    background(255);
}

public void draw()
{
    fill(mouseX, mouseY, mouseX);
    ellipse(mouseX, mouseY, mouseX, mouseY);
}