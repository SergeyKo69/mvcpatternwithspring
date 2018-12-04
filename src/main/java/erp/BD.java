package erp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BD {
    public Map<String, String> orders = new HashMap<>();

    public BD() {
        orders.put("1","№1 to " + new Date());
        orders.put("2","№1 to " + new Date());
        orders.put("3","№1 to " + new Date());
        orders.put("4","№1 to " + new Date());
        orders.put("5","№1 to " + new Date());
        orders.put("6","№1 to " + new Date());
        orders.put("7","№1 to " + new Date());
    }

    public String getOrder(String id){
        return orders.get(id);
    }
}
