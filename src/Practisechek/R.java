package Practisechek;

public class R {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.X = 0;
        robot.Y = 0;
        robot.direction = Direction.UP;
        int toX = -7;
        int toY = 4;
        System.out.println("Изначальные координаты: (X=" + robot.X + ", Y=" + robot.Y + "), Направление: " + robot.direction);
        System.out.println("Вижу цель - иду к ней:  (X=" + toX + ", Y=" + toY + ").");
        moveRobot(robot, toX, toY);
        if (robot.X == toX && robot.Y == toY) {
            System.out.println("Цель достигнута");
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();

            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }

    }


    public static class Robot {

        int X;
        int Y;
        Direction direction;

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return X;
        }

        public int getY() {
            return Y;
        }

        public void turnLeft() {
            System.out.println("Поворот налево.");
            if (direction == Direction.LEFT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP;
            } else if (direction == Direction.UP) {
                direction = Direction.LEFT;
            }
        }

        public void turnRight() {
            System.out.println("Поворот направо");
            if (direction == Direction.LEFT) {
                direction = Direction.UP;
            } else if (direction == Direction.DOWN) {
                direction = Direction.LEFT;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.UP) {
                direction = Direction.RIGHT;
            }
        }

        public void stepForward() {
            System.out.print("Движение " + direction + ": (" + X + ", " + Y + ") ");
            if (direction == Direction.LEFT) {
                X--;
            } else if (direction == Direction.DOWN) {
                Y--;
            } else if (direction == Direction.RIGHT) {
                X++;
            } else if (direction == Direction.UP) {
                Y++;
            }
            System.out.println("-> (" + X + ", " + Y + ")");
        }
    }
}
