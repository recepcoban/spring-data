package com.recepcoban.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e) {
        ModelAndView mav = new ModelAndView("exception");
        mav.addObject("name", e.getClass().getSimpleName());
        mav.addObject("message", e.getMessage());
        return mav;
    }

}
