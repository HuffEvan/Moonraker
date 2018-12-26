# Moonraker
Team 7658's team code repository for 2019-2020 frc season.

## Roadmap
This will be the road to success. I will attempt to document all the steps that we took to get to x destination

```
0.0 Clean Slate
Use this for a restart or as a template for test functions or ideas

0.1 Controller Beta 
Connect Driver and CoDriver Controllers to the pc and log controller feed back.
	- Joystick Feedback Routine
	- Buttons Initialized
	
0.2 Controller
Add debounce functionality to the buttons so we can prevent triggering of the buttons. And add add a toggle functionality.
	- Button Feedback Routine
        - Debounce
		- Toggle

0.3 Driver System Beta
Initialize the driver system with mapped out ports and configured motors.
	- List ports on robot map
	- Define Motors
	- Configure CANTalons/Jaguars
	- Configure PID Loop For PID

0.4 Controll System
Develop Multiple Controll Systems to Drivers. 
	- Tank
	- Arcade
	- Arcade (Cheezy Style)
    - Indivisual Actuators

0.5 Motion Profiles
Provide a clean interface for jerk detection to see if we have colided into something and respond to the encounter (Auto Shift Down).
	- NAVX Implementations
	- Motion Profiles
	- Jerk Detection

```

### Contributers
| Name        | Role             |
| :---------: | :--------------- |
| Josh Brown  | Lead Programmer  |
| Evan Huff   | Programmer       |