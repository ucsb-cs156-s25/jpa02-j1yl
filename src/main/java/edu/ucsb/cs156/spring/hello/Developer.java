package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {
    }

    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Joe L.";
    }

    /**
     * Get the github id of the developer
     * 
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "j1yl";
    }

    /**
     * Get the developers team
     * 
     * @return developers team as a Java object
     */

    public static Team getTeam() {
        Team team = new Team("s25-04");
        team.addMember("Renbo Z.");
        team.addMember("Montgomery F.");
        team.addMember("Jeremiah W.");
        team.addMember("Joe L.");
        team.addMember("Ethan S.");
        team.addMember("Fahim Z.");
        return team;
    }
}
