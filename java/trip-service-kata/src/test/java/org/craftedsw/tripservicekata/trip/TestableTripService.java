package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TestableTripService extends TripService {

    private User user;

    public TestableTripService(User user) {
        this.user = user;
    }


    @Override
    protected User getLoggedUser() {
        return user;
    }
}
