package org.firstinspires.ftc.teamcode.io

import com.qualcomm.robotcore.hardware.ColorSensor
import com.qualcomm.robotcore.hardware.Servo
import org.firstinspires.ftc.teamcode.TeamColor

/**
 * The knocker of jewels, implemented for use in Autonomous.
 * Includes all functions necessary to control the knocker.
 *
 * @author Michael Peng
 * For team: 4410 (Lightning)
 *
 * FIRST - Gracious Professionalism
 */
interface IJewelKnocker {

    // I/O requirements
    val color: ColorSensor
    val arm: Servo

    /**
     * Lowers the knocker arm on which the color sensor is mounted.
     */
    fun lowerArm()

    /**
     * Reads from the ColorSensor and returns the TeamColor to which the values are closest.
     * @return The team color at which the color sensor seems to be looking, or null if the data is confusing.
     */
    fun detect(): TeamColor?

    /**
     * Moves or turns the robot in a way that knocks off a jewel, in the direction specified by the
     * parameter.
     *
     * @param towardDetectedJewel True if the jewel that the color sensor is looking at shall be knocked off
     */
    fun removeJewel(towardDetectedJewel: Boolean)

    /**
     * Raises the knocker arm on which the color sensor is mounted.
     */
    fun raiseArm()
}