package cz.osu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FineManagerTest {

        @Test
        void testSpeedViolation() {
            Location loc = new Location("Ostrava");
            loc.addSign(new SpeedSign(50));

            Car car = new Car("1234", ActionType.JIZDA, 70);

            FineManager manager = new FineManager();
            ArrayList<Fine> fines = manager.checkViolations(car, loc);

            assertEquals(1, fines.size());
        }

    @Test
    void testParkingViolation() {
        Location loc = new Location("Ostrava");
        loc.addSign(new ProhibitionSign(ActionType.PARKOVANI));

        Car car = new Car("AAA111", ActionType.PARKOVANI, 0);

        FineManager manager = new FineManager();
        List<Fine> fines = manager.checkViolations(car, loc);

        assertFalse(fines.isEmpty());
    }





}