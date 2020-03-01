int x1=100;
int x2 = 500;
int speed = 10;
void setup() {
  size(600, 600);
}

void draw()
{
  
  noFill();
  background(100,100,100);
  ring(x1,300);
  ring(x2,300);
  x1+=speed;
  x2-=speed;
  if (x1>=width) {
    speed*=-1;}
  

if (x1<=0) {
    speed*=-1;}

}
void ring(int x, int y) {
  for (int i = width /4; i > 1; i-=10) {

    ellipse(x, y, i, i);
  }
}
