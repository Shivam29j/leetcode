class Solution {
    public int dayOfYear(String date) {
         int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            day++;
        } 
        while(--month > 0) {
            day += days[month - 1];
        }
        return day;
    }
}