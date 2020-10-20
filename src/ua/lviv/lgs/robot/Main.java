package ua.lviv.lgs.robot;

public class Main {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.work();
        CoffeRobot cr = new CoffeRobot();
        cr.work();
        RobotDancer rd= new RobotDancer();
        rd.work();
        RobotCoocker rc=new RobotCoocker();
        rc.work();
        Robot [] Arrays = new Robot[]{r,cr,rd,rc};
        for (int i=0; i<Arrays.length; i++){
           Arrays[i].work();
        }
    }
}
