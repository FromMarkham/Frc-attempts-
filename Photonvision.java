#https://docs.photonvision.org/en/latest/docs/examples/aimingatatarget.html

@Override
public void teleopPeriodic(){
    double leftx= -nameofcontroller.getleftx * linearspeedconstant
    double lefty= -nameofcontroller.getlefty * alinearspeedconstant
    double rightx= -nameofcontroller.getrightx * anangularspeedconstant

    Boolean isthetargetvisible=false

    double yawofthetarget=0.0;
    var results = camera.getAllUnreadResults();

    if ((!results==empty)){

        var result=
        if ((results.hasTargets())){
            
            
        }
    }
}
