// TODO : Include Package
// package

public class PID_Manager {
	private static double P, I, D;
	private static double Porportional, Integral, Derivative, Previous_Error, Setpoint, Actual;
	
	private static final boolean DEBUGGING = false;
	private static final String TAG = "PID MANAGER: ";
	
	public void updateInterface(double actual) {
		// Set all Variables
		Actual = -actual;
		Error = Setpoint - Actual;
		Integral += (Error*.02);
		Derivative = (Error - this.Previous_Error) / 0.2;
		Output = P*Error + I*this.Integral + D*this.Derivative;
		
		// This gets the values from 100's or 1000's to 1's and 10's
		Output = Output / 1000;
		
		// Binds The pid output from 1 to 1
		
		if(DEBUGGING) System.out.println(TAG + "SPEED " + Output);
		if(DEBUGGING) System.out.println(TAG + "ERROR " + Error );
		if(DEBUGGING) System.out.println(TAG + "ACTUAL " + Actual);
		
		if(Error < Setpoint*.25) {
			if(DEBUGGING) System.out.println(TAG + "One Quarters Of the Way There");
		} else if(Error < Setpoint*.50) {
			if(DEBUGGING) System.out.println(TAG + "Half Way There");
			Output = Output*.50;
		} else if(Error < Setpoint*.75) {
			if(DEBUGGING) System.out.println(TAG + "Three Quarters Of The Way There");
			Output = Output*.75;
		} else if(Error < Setpoint*.100) {
			if(DEBUGGING) System.out.println(TAG + "Complteted Travel Destination");
			Output = 0.0;
		} else if(Error > Setpoint) { 
			if(DEBUGGING) System.out.println(TAG + "Over Shot Destinatnion, All Values Set To Zero");
			Output = 0.0;
		}
		
		if(DEBUGGING) System.out.println("\n");
	}
	
	// Getters
	public static double getActual() {
		return Actual;
	}
	public static double getP() {
		return P;
	}
	public static double getI() {
		return I;
	}
	public static double getD() {
		return D;
	}
	public static double getPorportional() {
		return Porportional;
	}
	public static double getIntegral() {
		return Integral;
	}
	public static double getDerivative() {
		return Derivative;
	}
	public static double getPrevious_Error() {
		return Previous_Error;
	}
	public static double getSetpoint() {
		return Setpoint;
	}
	public static double getError() {
		return Error;
	}
	public static double getOutput() {
		return Output;
	}
	
	// Setters
	public static void setActual(double actual) {
		Actual = actual;
	}
	public static void setP(double p) {
		P = p;
	}
	public static void setI(double i) {
		I = i;
	}
	public static void setD(double d) {
		D = d;
	}
	public static void setPorportional(double porportional) {
		Porportional = porportional;
	}
	public static void setIntegral(double integral) {
		Integral = integral;
	}
	public static void setDerivative(double derivative) {
		Derivative = derivative;
	}
	public static void setPrevious_Error(double previous_Error) {
		Previous_Error = previous_Error;
	}
	public static void setSetpoint(double setpoint) {
		Setpoint = setpoint;
	}
	public static void setError(double error) {
		Error = error;
	}
	public static void setOutput(double output) {
		Output = output;
	}
	private static double Error;
	private static double Output;
		
}