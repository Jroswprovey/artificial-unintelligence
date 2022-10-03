public class Event {
    int day;
    int month;
    int year;
    String name;

    public Event(int d,int m,int y,String nm){
        d = day;
        m = month;
        y = year;
        nm = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //The gets, it returns the value its asked for
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    //end of the gets
}
