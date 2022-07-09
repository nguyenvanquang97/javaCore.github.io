import java.time.LocalDate;
import java.util.ArrayList;

public class HistoryTradingService {
    public static ArrayList<HistoryTrading> getAllHistoryTrading(){
        ArrayList<HistoryTrading> historyTradings =new ArrayList<>();
        historyTradings.add(new HistoryTrading("0333333333",0, LocalDate.now(),"null","0123456789",0));
        return historyTradings;
    }
}
