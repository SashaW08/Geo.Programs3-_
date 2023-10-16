public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 4;
        plane.pausetime = 1;

       // otherrowofsquares();
       // plane.teleport(100,100);
        // bunchorrowofsquares();

        //rowOfSmallSquares();
        //plane.teleport(400,400);
        //columnOfSmallSquares();
        //plane.teleport(500,500);
        //gridOfSmallSquares();

        secondGridOfSmallSquares();

    }
    public void bunchorrowofsquares(){
        for(int x=1; x<=5; x=x+1) {
            drawASquare();
            //plane.move(100);
            plane.teleport((int)(Math.random()*800),(int)(Math.random()*800));
            }
        }

    public void drawASquare(){
        for(int x=1; x<=4; x=x+1){
            plane.move(10);
            plane.turn(90);
        }

    }

    public void otherrowofsquares(){
        for(int x=0;x<=500;x=x+100){
            System.out.println(x);
            plane.teleport(x+10,300);
            plane.square(100);
        }

    }
    public void rowOfSmallSquares(){
        for(int x=1;x<=10;x=x+1) {
            plane.startingAngle(0);
            plane.trailWidth = 5;
            drawASquare();
            plane.move(10);
        }

    }
    public void columnOfSmallSquares(){
        for(int x=1;x<=10;x=x+1){
            plane.startingAngle(90);
            plane.trailWidth=5;
            drawASquare();
            plane.move(10);
        }

    }
    public void gridOfSmallSquares(){
        for(int y=0;y<200;y=y+20) {
            plane.setColor(100, y, 100);
            columnOfSmallSquares();
            plane.startingAngle(0);
            plane.move(10);
            plane.startingAngle(270);
            plane.move(109);
        }
    }
    public void secondGridOfSmallSquares(){
        for(int x=0; x<100; x=x+10){
            for(int y=0; y<100; y=y+10){
                System.out.println("x: "+x+", y: "+y);
                plane.setColor(2*x,2*y,100);
                plane.teleport(x, y);
                drawASquare();
            }
        }

    }

}