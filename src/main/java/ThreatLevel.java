public enum ThreatLevel {


    RED("red", 0), YELLOW("yellow", 30), GREEN("green", 60);

    private String threatLevel;
    private int personsAllowed;

    ThreatLevel(String threatLevel, int personsAllowed) {
        this.threatLevel = threatLevel;
        this.personsAllowed = personsAllowed;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public int getPersonsAllowed() {
        return personsAllowed;
    }

    public String getOccupationStatus(int numberOfPeople) {

        if (numberOfPeople < personsAllowed) {
            return "Maximale Personenzahl nicht überschritten";
        } else {

            return "Zu viele Personen";
        }
    }
}
