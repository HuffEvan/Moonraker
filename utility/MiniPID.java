// TODO : Add Package Class
// package

public class MiniPID {
	private static double P, I, D;
	private static double Porportional, Integral, Derivative, Previous_Error, Setpoint;
	private static double Error;
	private static double Output;
	
	public void update(double actual) {
		Error = Setpoint - actual; // Error = Target - Actual
		Integral += (Error*.02);
		Derivative = (Error - this.Previous_Error) / 0.2;
		Output = P*Error + I*this.Integral + D*this.Derivative;
		Output = Output / 100;
		
		Output = Math.min(Math.max(Output, -0.5), 0.5);
				
		if (-actual > Setpoint*.50) {
			Output = Output*.67;
		} 
		if (-actual > Setpoint*.65) {
			Output = Output*.80;
		} 
		if (-actual > Setpoint*.80 ) {
			Output = 0.0;
		}
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
	public static double getIntegral() {
		return Integral;
	}
	public static double getPrevious_Error() {
		return Previous_Error;
	}
	public static double getSetpoint() {
		return Setpoint;
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
	public static void setIntegral(double integral) {
		Integral = integral;
	}
	public static void setPrevious_Error(double previous_Error) {
		Previous_Error = previous_Error;
	}
	public static void setSetpoint(double setpoint) {
		Setpoint = setpoint;
	}

	public static double getPorportional() {
		return Porportional;
	}

	public static void setPorportional(double porportional) {
		Porportional = porportional;
	}

	public double getOutput() {
		return Output;
	}

	public static void setOutput(double output) {
		Output = output;
	}
	
}