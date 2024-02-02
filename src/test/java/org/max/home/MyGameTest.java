package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

    public class MyGameTest {
        static List<Door> doors;

        @BeforeEach
        void setUp() {
            doors = new ArrayList<>();
            doors.add(new Door(true));
            doors.add(new Door(false));
            doors.add(new Door(false));
        }

        @Test
        void checkNotRiskWin() {
            //Given
            Player player = new Player("Player", false);
            Game game = new Game(player, doors);
            //When
            Door door = game.round(0);
            //Then
            Assertions.assertTrue(door.isPrize());

        }

        @Test
        void checkRiskLose() {
            //Given
            Player player = new Player("Player", true);
            Game game = new Game(player, doors);
            //When
            Door door = game.round(0);
            //Then
            Assertions.assertFalse(door.isPrize());

        }

        @Test
        void checkNotRiskLose() {
            //Given
            Player player = new Player("Player", false);
            Game game = new Game(player, doors);
            //When
            Door door = game.round(1);
            //Then
            Assertions.assertFalse(door.isPrize());

        }

        @Test
        void checkRiskWin() {
            //Given
            Player player = new Player("Player", true);
            Game game = new Game(player, doors);
            //When
            Door door = game.round(1);
            //Then
            Assertions.assertTrue(door.isPrize());

        }



    }
