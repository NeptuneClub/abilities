package org.neptuneclub.abilities.api.service;

public interface IService {

    /** Method for initiating all services. */

    void start();

    /** Method to shut down / interrupt all services. */

    void interrupt();
}