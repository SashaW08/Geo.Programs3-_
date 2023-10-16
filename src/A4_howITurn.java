

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.isTrail = false;
        plane.move (300);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.turn(90);
        plane.isTrail = false;
        plane.move(300);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);


    }


}
