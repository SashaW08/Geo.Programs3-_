public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.startingAngle(180);
        plane.setColor(200,10,200);
        plane.isTrail = true;
        plane.move(75);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(0);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(75);
        plane.startingAngle(180);
        plane.move(75);
        plane.startingAngle(0);
        plane.isTrail = false;
        plane.move(130);
        plane.isTrail = true;
        plane.startingAngle(282);
        plane.move(160);
        plane.startingAngle(78);
        plane.move(160);
        plane.startingAngle(258);
        plane.move(80);
        plane.startingAngle(180);
        plane.move(33);
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(90);
        plane.startingAngle(90);
        plane.move(82);
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.move(75);
        plane.startingAngle(270);
        plane.move(75);
        plane.startingAngle(180);
        plane.move(75);
        plane.startingAngle(270);
        plane.move(75);
        plane.startingAngle(0);
        plane.move(75);
        plane.isTrail = false;
        plane.move(60);
        plane.isTrail = true;
        plane.startingAngle(90);
        plane.move(150);
        plane.startingAngle(270);
        plane.move(75);
        plane.startingAngle(0);
        plane.move(65);
        plane.isTrail = false;
        plane.startingAngle(270);
        plane.move(75);
        plane.isTrail = true;
        plane.startingAngle(90);
        plane.move(150);
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(60);
        plane.isTrail = true;
        plane.startingAngle(282);
        plane.move(160);
        plane.startingAngle(78);
        plane.move(160);
        plane.startingAngle(258);
        plane.move(80);
        plane.startingAngle(180);
        plane.move(33);
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(150);

    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/