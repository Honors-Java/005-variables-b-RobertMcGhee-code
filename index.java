int blu = 255;
int red = 195;
int grn = 255;
int rectPos = 10;
int rectWide = 200;
int ball = 255;
int ballPos = 110;
int ballWide = 90;
int empty = 0;


void setup() {
  size(500, 500);
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

  background(ball);
  stroke(empty);
  fill(red, grn, blu);
  rect(rectPos, rectPos, rectWide, rectWide);
  //println(mouseX, mouseY)
  fill(empty, empty, ball);
  ellipse(ballPos, ballPos, ballWide, ballWide);
  ballPos = ballPos + 1;

  

}