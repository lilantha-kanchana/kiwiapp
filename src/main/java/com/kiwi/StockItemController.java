package com.kiwi;

import com.kiwi.customExceptions.ErrorInfo;
import com.kiwi.customExceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by malithi on 12/25/16.
 */

@Controller
public class StockItemController {
    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();
    private final StockItemRepository repository;
    @Autowired
    public StockItemController(StockItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/stockItems",method = RequestMethod.GET)
    public String listStockItems(Model model){

        model.addAttribute("stockItems",repository.findAll());
        return "stockItemList";
    }

    @RequestMapping(value="/stockItemList", method = RequestMethod.GET,produces="application/json")
    public @ResponseBody Response getAllStock() {
        if (repository.findAll() == null) throw new RecordNotFoundException();

        return new Response(HttpStatus.OK.toString(), "success!", repository.findAll()    );
    }

//    @ExceptionHandler
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    ErrorInfo
//    handleBadRequest(HttpServletRequest req, HttpMessageNotReadableException ex) {
//        return new ErrorInfo(req.getRequestURL().toString(), ex);
//    }
//
//    @ExceptionHandler
//    void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
//        response.sendError(HttpStatus.BAD_REQUEST.value());
//    }

}
