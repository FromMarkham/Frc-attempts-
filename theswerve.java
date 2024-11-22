package frc.robot.subsystems;
#https://drive.google.com/drive/folders/15jx3ApDzKKLP7ykGx_Ah46IjURASzL8w?usp=drive_link
#https://www.youtube.com/watch?v=0Xi9yb1IMyA
public class theswerve {
    private final CANSparkMax drivingmotor;
    private final CANSparkMax steeringmotor;

    private final CANEncoder drivingencoder;
    private final CANEncoder steeringencoder;

    private final PIDController steeringpidcontroller;
    private final PIDController drivingpidcontroller; 

    private final AnalogInput theabsolutencoderforsteering;

    private final boolean istheabsoluteencoderreversedornot;

    private final double offsetoftheabsoluteencoder;

    public theswerve(int drivemotorid,int turningmotorid,boolean drivemotorreversed,int absoluteencoderid
    ,double offsetoftheabsoluteencoder,boolean istheabsoluteencoderreversedornot){

        this.offsetoftheabsoluteencoder=offsetoftheabsoluteencoder;
        

    }
}
