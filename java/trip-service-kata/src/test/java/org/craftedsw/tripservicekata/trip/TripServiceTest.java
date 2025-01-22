package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TripServiceTest {

    @Test
    public void should_throw_exception_when_user_is_not_logged_in() {
        //GIVEN
        TripService tripService = new TestableTripService(null);
        User user = new User();
        //WHEN
        //THEN
        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(user));
    }

    @Test
    void should_return_empty_list_when_user_logged_in() {
        // GIVEN
        User user = new User();
        TripService tripService = new TestableTripService(user);

        // WHEN
        // THEN
        assertEquals(new ArrayList<Trip>(), tripService.getTripsByUser(user));
    }

    @Test
    public void test(){
        //GIVEN
        User user = new User();
        User loggedUser = new User();

        user.addFriend(loggedUser);
        TripService tripService = new TestableTripService(user);
        //WHEN
        List<Trip> result = tripService.getTripsByUser(user);
        //THEN


        assertEquals(expected, result);
    }
}
