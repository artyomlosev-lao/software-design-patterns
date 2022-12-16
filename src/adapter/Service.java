package adapter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Service {

    public Long serviceMethod(Date specialDate) {
        long diffInMillies = Math.abs((new Date()).getTime() - specialDate.getTime());
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}
