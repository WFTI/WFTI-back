package com.woori.wfti.api.service;

import com.woori.wfti.db.entity.CalendarEntity;
import com.woori.wfti.db.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {
    @Autowired
    private CalendarRepository calendarRepository;

    public List<CalendarEntity> getCalendars() {
        List<CalendarEntity> calendars = calendarRepository.findAll();

        if(!calendars.isEmpty()) return calendarRepository.findAll();
        else throw new IllegalArgumentException("no such data");
    }

    public CalendarEntity getCalendarById(final Long id) {
        return calendarRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("no such data"));
    }

    public CalendarEntity createCalendar(final CalendarEntity createCalendar) {
        if(createCalendar == null) throw new IllegalArgumentException("CalendarEntity cannot be null");
        return calendarRepository.save(createCalendar);
    }

    // 일정 기간 수정(시작일, 마감일)
    public CalendarEntity updateCalendar(final long id, final CalendarEntity updateCalendar) {
        CalendarEntity calendar = getCalendarById(id);
        calendar.setStDh(updateCalendar.getStDh());
        calendar.setEdDh(updateCalendar.getEdDh());

        return calendarRepository.save(calendar);
    }

    public void deleteCalendarById(final Long id) {
        calendarRepository.deleteById(id);
    }
}
