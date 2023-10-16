public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 1;
        /*plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        house();
        plane.teleport(500,650);
        house();
        plane.teleport(500,400);
        house();
        plane.teleport(500,150);
        house();
        plane.teleport(450,800);
        plane.startingAngle(270);
        road();
        plane.teleport(925,800);
        plane.startingAngle(270);
        road();
        plane.teleport(750,150);
        tree();
        plane.teleport(740, 360);
        tree();
        plane.teleport(755,570);
        tree();
        plane.teleport(750,780);
        tree();
        plane.teleport(100,500);
        flagpole(); */

        /*plane.teleport(30,600);

        for(int x=1; x<=10; x=x+1){
            square();
        }*/

        //i means the length of each of the sides and also the number of times the loop runs.
        // if it was x it would mean the number of times going through the loop

        /*for(int i=2; i<=12; i=i+2){
            System.out.println(i); //this puts the i value in the dos window
            plane.teleport(100, 600);
            plane.startingAngle(0);
            plane.square(i);
        } */

       /* fives();
        countDown();
        drawASquare();
        plane.startingAngle(0);
        plane.isTrail = false;
        plane.move(200);
        plane.isTrail = true; */
        roworbunchofsquares();

    }

    public void roworbunchofsquares(){
      for(int x=1; x<=5; x=x+1) {
          drawASquare();
          //plane.move(100);
          plane.teleport((int)(Math.random()*800),(int)(Math.random()*800));
      }
    }

    public void fives(){
        for(int x=5; x<=35; x=x+5) {
            System.out.println(x);
        }
    }

    public void countDown(){
        for(int i=7; i>=2; i=i-1){
            System.out.println(i);
        }
    }

    public void drawASquare(){
        for(int x=1; x<=4; x=x+1){
            plane.move(100);
            plane.turn(90);
        }

    }

    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);

    }
    public void triangle(){
        plane.setColor(200,0,0);
        plane.turn(240);
        plane.move(111);
        plane.turn(240);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(240);
        plane.setColor(0,200,0);
        plane.move(111);

    }
    public void house(){
        square();
        triangle();
    }
    public void road(){
        plane.move(800);
        plane.turn(90);
        plane.isTrail = false;
        plane.move(50);
        plane.turn(90);
        dottedLine();
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.isTrail = true;
        plane.move(815);
    }
    public void dottedLine(){
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = true;
        plane.move(50);
        plane.isTrail = false;
        plane.move(50);
        plane.isTrail = false;
    }
    public void tree(){
        plane.isTrail = true;
        plane.setColor(0,100,100);
        plane.startingAngle(270);
        plane.move(125);
        plane.turn(180);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.startingAngle(270);
        plane.move(25);
        plane.turn(60);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.startingAngle(270);
        plane.move(25);
        plane.turn(180);
        plane.move(100);
        plane.turn(120);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.turn(60);
        plane.turn(180);
        plane.move(10);
        plane.turn(60);
        plane.move(50);
    }
    public void flagpole(){
        plane.startingAngle(0);
        plane.setColor(100,100,0);
        plane.move(30);
        plane.turn(180);
        plane.move(15);
        plane.startingAngle(270);
        plane.move(115);
        plane.startingAngle(0);
        plane.move(45);
        plane.startingAngle(90);
        plane.move(30);
        plane.startingAngle(180);
        plane.move(45);
    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/