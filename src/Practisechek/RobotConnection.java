package Practisechek;

public interface RobotConnection extends AutoCloseable {
    void  moveRobotTo(int x, int y);
    @Override
    void close() throws Exception;
}

