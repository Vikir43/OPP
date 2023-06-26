package Homework_2.Market;

import Homework_2.Actor.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
