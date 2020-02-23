int x1=100;
int x2 = 500;
void setup() {
  size(600, 600);
}

void draw()
{
  if (int x1=500){
    x1-=10;}
  
  background(100,100,100);
  ring(x1,300);
  ring(x2,300);
  x1+=10;
  x2-=10;
  
}


void ring(int x, int y) {
  for (int i = width /4; i > 1; i-=1) {

    ellipse(x, y, i, i);
  }
}
