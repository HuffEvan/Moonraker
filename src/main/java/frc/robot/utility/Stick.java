package frc.robot.utility;

public class Stick {

    // 0 = No output
    // 1 = Output
    public void print(String TAG, String MESSAGE, int LEVEL ) {
        switch (LEVEL) {
            case 0:
                break;
            case 1: 
                System.out.println(TAG + ": " + MESSAGE);
                break;
            default:
                break;
        }
    }

    public void print(String TAG, double MESSAGE, int LEVEL ) {
        switch (LEVEL) {
            case 0:
                break;
            case 1: 
                System.out.println(TAG + ": " + MESSAGE);
                break;
            default:
                break;
        }
    }

    public void print(String TAG, int MESSAGE, int LEVEL ) {
        switch (LEVEL) {
            case 0:
                break;
            case 1: 
                System.out.println(TAG + ": " + MESSAGE);
                break;
            default:
                break;
        }
    }

    public void print(String TAG, boolean MESSAGE, int LEVEL ) {
        switch (LEVEL) {
            case 0:
                break;
            case 1: 
                System.out.println(TAG + ": " + MESSAGE);
                break;
            default:
                break;
        }
    }

}