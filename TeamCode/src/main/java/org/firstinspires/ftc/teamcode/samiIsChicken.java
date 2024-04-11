package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;


@TeleOp (name = "samiIsChicken")
public class samiIsChicken extends OpMode {


    DcMotor motor1;
    DcMotor motor2;


    Servo servo1;


    @Override
    public void init() {


        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        telemetry.addData("initialization", "success :)");
    }


    @Override
    public void loop() {


        motor1.setPower(Range.clip(gamepad1.left_stick_y, -1, 1));
        motor2.setPower(Range.clip(gamepad1.left_stick_x, -1, 1));


        if (gamepad1.dpad_right){
            servo1.setPosition(0);
        }


        motor1.setPower(0);
        motor2.setPower(0);
    }
}
