package org.javaworkshop.day2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class Day2Test {

private static final int DAY1 = 0;
private static final int DAY2 = 2;
private static final int DAY3 = 5;
private static final int DAY4 = 3;
private static final int DAY5 = 7;
private static final int DAY6 = 8;
private static final int TODAY = 4;

private Day2 birdWatcher;
private int lastWeek[] = {DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY};

@BeforeEach
public void setUp() {
    birdWatcher = new Day2(lastWeek);
}

@Test
@Tag("task:1")
@DisplayName("The getLastWeek method correctly returns last week's counts")
public void itTestGetLastWeek() {
    assertArrayEquals(new int[]{DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY}, birdWatcher.getLastWeek());
}

@Test
@Tag("task:2")
@DisplayName("The getToday method correctly returns today's counts")
public void itTestGetToday() {
    assertEquals(TODAY, birdWatcher.getToday());
}

@Test
@Tag("task:3")
@DisplayName("The incrementTodaysCount method correctly increments today's counts")
public void itIncrementTodaysCount() {
    birdWatcher.incrementTodaysCount();
    assertEquals(TODAY + 1, birdWatcher.getToday());
}

@Test
@Tag("task:4")
@DisplayName("The hasDayWithoutBirds method returns true when day had no visits")
public void itHasDayWithoutBirds() {
    assertTrue(birdWatcher.hasDayWithoutBirds());
}

@Test
@Tag("task:4")
@DisplayName("The hasDayWithoutBirds method returns false when no day had zero visits")
public void itShouldNotHaveDaysWithoutBirds() {
    birdWatcher = new Day2(new int[]{1, 2, 5, 3, 7, 8, 4});
    assertFalse(birdWatcher.hasDayWithoutBirds());
}

@Test
@Tag("task:5")
@DisplayName("The getCountForFirstDays method returns correct visits' count for given number of days")
public void itTestGetCountForFirstDays() {
    assertEquals(DAY1 + DAY2 + DAY3 + DAY4, birdWatcher.getCountForFirstDays(4));
}

@Test
@Tag("task:5")
@DisplayName("The getCountForFirstDays method returns overall count when number of days is higher than array size")
public void itTestGetCountForMoreDaysThanTheArraySize() {
    assertEquals(DAY1 + DAY2 + DAY3 + DAY4 + DAY5 + DAY6 + TODAY, birdWatcher.getCountForFirstDays(10));
}

@Test
@Tag("task:6")
@DisplayName("The getBusyDays method returns the correct count of busy days")
public void itTestGetCountForBusyDays() {
    // DAY3, DAY5 and DAY6 are all >= 5 birds
    assertEquals(3, birdWatcher.getBusyDays());
}

@Test
@Tag("task:6")
@DisplayName("The getBusyDays method correctly returns zero in case of no busy days")
public void itShouldNotHaveBusyDays() {
    birdWatcher = new Day2(new int[]{1, 2, 3, 3, 2, 1, 4});
    assertEquals(0, birdWatcher.getBusyDays());
}
}