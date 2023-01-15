package Practisechek;

public class Cringe {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        RobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
            } catch (Exception e) {
                if (i == 2) {
                    throw new RobotConnectionException(e);
                }
            } finally {
                try {
                    robotConnection.close();
                } catch (Exception ignore) {
                }

            }
        }
    }
}
