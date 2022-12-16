package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Adapter implements ClientInterface {

    Service adapter = new Service();

    public Long method(String date) {
        Date specialDate = convertToServiceFormat(date);
        if (specialDate == null) return null;
        return adapter.serviceMethod(specialDate);
    }

    private Date convertToServiceFormat(String date) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            Date parsingDate = ft.parse(date);
            System.out.println(parsingDate);
            return parsingDate;
        } catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
            return null;
        }
    }
}
