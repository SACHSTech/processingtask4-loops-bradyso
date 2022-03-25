import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
  * Description: A program Sketch.java that draws 4 quadrants of different drawings
  * Author: Brady So
  */
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Drawing Quadrant 1
    stroke(0);
    for(int intLineX = 15; intLineX <= 175; intLineX += 17){
      line(intLineX, 0, intLineX, 170);
    }

    for(int intLineY = 16; intLineY <= 175; intLineY += 17){
      line(0, intLineY, 175, intLineY);
    }

    // Drawing Quadrant 2
    for(int intCircleY = 30; intCircleY <= 150; intCircleY += 30) {
      for (int intCircleX = 220; intCircleX <= 360; intCircleX += 35){
        fill(0, 0, 255);
        ellipse(intCircleX, intCircleY, 30, 30);
        }
      }

    // Drawing Quadrant 3
    strokeWeight((float) 0.0015 * height);

    for(int intI = 0; intI <= height; intI++){
      stroke(intI, intI, intI);
      line(intI, height/(float) 2.2, intI, height);
    }
    
    // Drawing Quadrant 4

    // Drawing petals
      for(int intAngle = 0; intAngle < 360; intAngle += 45){
        fill(255, 0, 0);
        stroke(0, 0, 0);
        strokeWeight((float) 0.004 * height);

        // spacing out the petals
        pushMatrix();
        translate((width/2) + width/4, (height/2) + height/4);
        rotate(radians(intAngle));
        ellipse(0, 0, height / (float) 19.5, height / (float)3.5);
        popMatrix();
        }  
        // Center of the Flower
        fill(255, 204, 51);
        noStroke();
        ellipse((width/2) + width / 4, (height/2) + height / 4, 45, 45);
    }
}