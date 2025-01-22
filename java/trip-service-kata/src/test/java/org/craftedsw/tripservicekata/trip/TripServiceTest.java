package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TripServiceTest {
    @Test
    public void test(){
        //GIVEN
        TripService tripService = new TestableTripService();
        User user = new User();
        //WHEN
        //THEN
        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(user));
    }
}
