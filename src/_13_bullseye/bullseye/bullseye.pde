
    void setup(){
        size(800,600);  

    }

    void draw()
    {
      for (int i = width; i > 100; i-=100){
        if (number % 200 == 0) {
          fill (#F71111);}
          else {fill (#030202);}
ellipse(400,300,i,i);

    }
    }
