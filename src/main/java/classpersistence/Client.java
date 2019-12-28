package classpersistence;

import java.util.HashSet;
import java.util.Set;

public class Client extends User {
    private String phoneNumber,androidVersion;
    private Set<Challenge> rChallenge;

    public Client() {
    }

    public Client(String phoneNumber, String androidVersion) {
        rChallenge=new HashSet<>();
        this.phoneNumber = phoneNumber;
        this.androidVersion = androidVersion;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }
    public void addChallenge(Challenge b){
        if(!getrChallenge().contains(b)) {
            if (b.getrClient() != null) {
            b.removeClient();
            b.setrClient(this);
            getrChallenge().add(b);
            }
        }
    }

    public void removeChallenge(Challenge challenge){
        if(getrChallenge().contains(challenge)){
            challenge.setrClient(null);
            getrChallenge().remove(challenge);
        }
    }
    public Set<Challenge> getrChallenge() {
        return rChallenge;
    }

    public void setrChallenge(Set<Challenge> rChallenge) {
        this.rChallenge = rChallenge;
    }

}
