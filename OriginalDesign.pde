public void setup()
{
    size(400,320);
    background(255);
}

public void draw()
{
    fill(mouseX, mouseY, mouseX);
    ellipse(mouseX, mouseY, mouseX, mouseY);
}