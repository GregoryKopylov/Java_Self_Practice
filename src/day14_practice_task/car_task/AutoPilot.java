package day14_practice_task.car_task;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void selfDrive();
}

/*

3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()

 */