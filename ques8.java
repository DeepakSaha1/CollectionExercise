// Write a program to format date as example "21-March-2016"

import java.text.SimpleDateFormat;
import java.util.Date;

class FormatDate {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(date.format(new Date()));
    }
}
