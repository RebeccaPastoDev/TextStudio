/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semtexteditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rebec
 */
public class CurrentTimeDate {
    public static String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }
}
