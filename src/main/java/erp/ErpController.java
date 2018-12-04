package erp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ErpController {

    @GetMapping("/getorder")
    public String getOrder(@RequestParam(name="id", required=false, defaultValue="null") String name, Model model) {
        BD bd = new BD();
        model.addAttribute("order", bd.getOrder(name));
        return "orders";
    }
}
