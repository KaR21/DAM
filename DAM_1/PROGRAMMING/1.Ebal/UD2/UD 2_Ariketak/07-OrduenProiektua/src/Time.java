
public class Time {

      private int hour;
      private int minute;
      private int second;

      public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
      }

      public Time(String time) {
            String hour = time.substring(0, 2);
            String minute = time.substring(3, 5);
            String second = time.substring(6, 8);
            int hourI = Integer.parseInt(hour), minuteI = Integer.parseInt(minute), secondI = Integer.parseInt(second);
            this.hour = hourI;
            this.minute = minuteI;
            this.second = secondI;
      }

      public int getHour() {
            return hour;
      }

      public int getMinute() {
            return minute;
      }

      public int getSecond() {
            return second;
      }

      public void setHour(int hour) {
            this.hour = hour;
      }

      public void setMinute(int minute) {
            this.minute = minute;
      }

      public void setSecond(int second) {
            this.second = second;
      }

      public void setTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
      }

      @Override
      public String toString() {
            return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
      }

      public Time nextSecond() {
            this.second++;
            if (this.second > 59) {
                  this.minute++;
                  this.second = 0;
                  if (this.minute > 59) {
                        this.hour++;
                        this.minute = 0;
                        if (this.hour > 23) {
                              this.hour = 0;
                        }
                  }
            }

            return this;
      }

      public Time previousSecond() {
            this.second--;
            if (this.second < 0) {
                  this.minute--;
                  this.second = 59;
                  if (this.minute < 0) {
                        this.hour--;
                        this.minute = 59;
                        if (this.hour < 0) {
                              this.hour = 23;
                        }
                  }
            }
            
            return this;
      }
}
