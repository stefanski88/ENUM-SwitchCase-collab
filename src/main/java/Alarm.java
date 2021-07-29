public class Alarm {

    public static String getOccupationStatus(int numberOfPeople) {
        if(numberOfPeople > ThreatLevel.YELLOW.getPersonsAllowed()){
            return "Zu viele Personen";
        }else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
    
}
