import java.sql.Time;

public class TimeCalc {
    public static void main(String[] args) {
        String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int time= Integer.parseInt(args[1]);
        
        int newhours=time/60;
        int newminutes=time%60;
        if(newhours>24)
           { newhours/=24;
            hours+=newhours;
        }else
            hours+=newhours;
        
        int number =Integer.parseInt(minutes)+newminutes;
        
        if(number>=60)
            {hours+=1;
            }
        if(hours>=24)
            hours=hours%24;
        if(number%60<10)
            System.out.println(hours+":0"+number%60);
        else
            System.out.println(hours+":"+number%60);
    
}}
