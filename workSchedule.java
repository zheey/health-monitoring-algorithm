import java.util.Arrays;

/**
 * Created by Zainab on 15.9.17.
 *
 * This algorithm divides the workers into two groups:Morning and Afternoon.
 * In each group, there are 25 workers, expected to vaccinate 697 kids per shift, for 60days.
 * Wages are paid according to the number of kids each worker vaccinates.
 */
public class workSchedule {

    int workDays = 60;
    String[] workers = new String[50];
    String[] schedules;

    public String[] workerSchedule(String worker){
        int index = Arrays.asList(workers).indexOf(worker);
        for (int i = 0; i < workDays;  i++){
            //for odd number days
            if(i % 2 != 0){
                if (index < workers.length/2){
                    schedules[i]+="Morning";
                }else if (index > workers.length/2 && index < workers.length){
                    schedules[i]+="Afternoon";
                }else {
                    schedules[i]+="Not eligible for scheduling.";
                }
                //for even number days
            }else {
                if (index < workers.length/2){
                    schedules[i]+="Afternoon";
                }else if (index > workers.length/2 && index < workers.length){
                    schedules[i]+="Morning";
                }else {
                    schedules[i]+="Not eligible for scheduling.";
                }
            }
        }
        return schedules;
    }
    public double wages(int numVaccinated){
        double sumWages = 0;
        sumWages = numVaccinated * 0.59;
        return sumWages;
    }
}
