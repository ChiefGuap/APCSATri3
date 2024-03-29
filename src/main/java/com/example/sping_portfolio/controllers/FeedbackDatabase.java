package com.example.sping_portfolio.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class FeedbackDatabase implements java.io.Serializable {
    public List<Feedback> feedbacklist = new ArrayList<>();

    public  boolean createFeedback(String name, String content) {
        Feedback e = new Feedback();
        e.name = name;
        e.content = content;
/*
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        e.date = strDate;
        return addFeedback(e);

 */

        final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        e.date =  sdf.format(cal.getTime());
        return addFeedback(e);
    }

    public boolean addFeedback(Feedback u) {
        if(!u.name.isEmpty() && !u.content.isEmpty()) {
            feedbacklist.add(0, u);
            return true;
        } else {
            return false;
        }
    }

}
