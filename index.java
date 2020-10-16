int rectX = random(0, 500);
int rectY = random(0, 500);
int rectPos = 10;
int rectLong = random(0, 500);
int rectWide = random(0, 500);
int ball = 255;
int ballPos = 110;
int ballWide = 10;
int empty = 0;

int r = random(0, 255);
int g = random(0, 255);
int b = random(0, 255);

void setup() {
  size(500, 500);
  background(ball);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
  
  int ballX = random(mouseX + 20, mouseX - 20);
  int ballY = random(mouseY + 20, mouseY - 20);
  
  stroke(empty);
  //println(mouseX, mouseY)
  int red = random(0, 255);
  int grn = random(0, 255);
  int blu = random(0, 255);
  fill(r, g, b);
  rect(rectX, rectY, rectLong, rectWide);
  fill(red, grn, blu);
  ellipse(ballX, ballY, ballWide, ballWide);
}
  void mousePressed() {
  rectX = random(0, 500);
  rectY = random(0, 500);
  rectWide = random(0, 500);
  rectLong = random(0, 500);
  r = random(0, 255);
  g = random(0, 255);
  b = random(0, 255);
  background(ball);
  }