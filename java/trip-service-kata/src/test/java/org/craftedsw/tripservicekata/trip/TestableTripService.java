package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TestableTripService extends TripService {

    @Override
    protected User getLoggedUser() {
        return new User();
    }
}
