
public class DateCounter {
public static boolean isLeapYear(int year) {
  if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))){
    return true;
  }
  else {
    return false;
  }
}

public static int daysInMonth(int year, int month){



  if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12)) {
    return 31;
  } else if ((month == 4)||(month == 6)||(month == 9)||(month == 11)){
    return 30;
  } else if ((month == 2)&&(isLeapYear(year))) {
    return 29;
  } else if ((month == 2)&&(!isLeapYear(year))) {
    return 28;
  }
  else {
    return -1;
  }
}

public static boolean isValidDate(int year, int month, int day){
  
  if((year >= 0)&&(day <= daysInMonth(year, month))&&(month >= 1)&&(month <= 12)&&(day >= 1)) {
    return true;
  }
    return false;
}

public static int daysBetween(int year0, int month0, int day0, int year1, int month1, int day1){
  return 42;
}


public static int ageInDays(int birthyear, int birthmonth, int birthday){
  return 10;
}

/*public static void main(String[] args){
  System.out.println(isLeapYear(2019));
  System.out.println(daysInMonth(2016,2));

}*/

}
