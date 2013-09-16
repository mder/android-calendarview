package net.simonvt.calendarview.samples;

import android.app.Activity;
import android.os.Bundle;

public class CalendarSamples extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//Get the calendar
		CalendarView calView = (CalendarView) findViewById(R.id.calView);
		
		//Highlight today's date with grey background
        calView.highlightDate(Calendar.getInstance(), 0);
		//Add red line to today's date
		Calendar date1 = Calendar.getInstance();
		calView.highlightDate(date1, 1);

		//Add red line to 3 other dates, two in the future, one in the past
		Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.DATE, -16);
		calView.highlightDate(date2, 1);
		Calendar date3 = Calendar.getInstance();
		date3.add(Calendar.DATE, 8);
		calView.highlightDate(date3, 1);
		Calendar date4 = Calendar.getInstance();
		date4.add(Calendar.DATE, 28);
		calView.highlightDate(date4, 1);
    }
}
