package cz.osu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FineManagerTest {

    @BeforeEach
    void setUp() {
        FineManager manager = new FineManager();

    }

    @Test
    void testNoFine() {
        Location loc = new Location("Ostrava");
        Car car = new Car("1234", ActionType.JIZDA, 70);
         TrafficSign prohibitionSign = new ProhibitionSign(ActionType.ODBOCENI_VLEVO);
         TrafficSign speedLimitSign = new SpeedSign(70);
         loc.addSign(speedLimitSign);
         loc.addSign(prohibitionSign);

        FineManager manager = new FineManager();
        ArrayList<Fine> fines = manager.checkViolations(car, loc);

         assertEquals(0, fines.size());

    }

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

        assertEquals(1, fines.size());
    }

    @Test
    void testDirectionViolation() {
        Location loc = new Location("Ostrava");
        loc.addSign(new ProhibitionSign(ActionType.ODBOCENI_VLEVO));
        loc.addSign(new SpeedSign(50));

        Car car = new Car("AAA111", ActionType.ODBOCENI_VLEVO, 30);
        FineManager manager = new FineManager();
        List<Fine> fines = manager.checkViolations(car, loc);

        assertEquals(1, fines.size());
    }





}