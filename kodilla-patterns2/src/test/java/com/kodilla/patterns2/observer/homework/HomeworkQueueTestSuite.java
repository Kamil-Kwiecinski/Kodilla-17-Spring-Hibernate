package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    private HomeworkQueue kamil, janek, michal, rafal, bartek;
    private Mentor adrian, olaf;

    @BeforeEach
    void setup() {
        kamil = new Student("Kamil");
        janek = new Student("Janek");
        michal = new Student("Michal");
        rafal = new Student("Rafal");
        bartek = new Student("Bartek");

        adrian = new Mentor("Adrian", "Nowak");
        olaf = new Mentor("Olaf", "Kowalski");
    }

    @Test
    void testHomeworkQueuePattern() {
        //Given
        kamil.registerObserver(adrian);
        janek.registerObserver(adrian);
        michal.registerObserver(olaf);
        rafal.registerObserver(olaf);
        bartek.registerObserver(olaf);

        //When
        kamil.addHomework("task1");
        kamil.addHomework("task2");
        kamil.addHomework("task3");
        janek.addHomework("task2");
        janek.addHomework("task4");
        michal.addHomework("task6");
        rafal.addHomework("task5");
        rafal.addHomework("task7");
        bartek.addHomework("task8");

        //Then
        assertEquals(4, olaf.getHomeWorkCounter());
        assertEquals(5, adrian.getHomeWorkCounter());

    }
}
