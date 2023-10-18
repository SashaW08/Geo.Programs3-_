public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 773; row = row + 1) {
            for (int col = 1; col < 815; col=col+1) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //int avg = (red+green+blue)/3;
                //plane.teleport(350+col, 350+row);
                if(col<=407 && row<=386) {
                    plane.setPixelColor(red/4, green/2, 50);
                }
               else if(col>=407 && row<=386){
                    plane.setPixelColor(red, blue/2, blue/2);
                    if(red<50&&blue<50&&green<50&&red>1&&row>300){
                        plane.setPixelColor(0,255,0);
                    }
                }
                else if(col<=407 && row>=386){
                    plane.setPixelColor(red,red,red);
                    if(red>170&&red<245&&blue<125&&green<135){
                            plane.setPixelColor(0, 0, 255);
                    }
                }
                else if(col>=407&&row>=386){
                    plane.setPixelColor(200,red,blue/2);
                }
            }
        }
        plane.teleport(0,0);
        plane.setColor(255,215,0);
        plane.trailWidth = 10;
        plane.pausetime = 1;
        plane.startingAngle(0);
        plane.isTrail = true;
        for(int x=1; x<=2; x=x+1){
        plane.move(815);
        plane.turn(270);
        plane.move(773);
        plane.turn(270);
        }
    }
}


/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/