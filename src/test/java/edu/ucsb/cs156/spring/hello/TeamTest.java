package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
        assert (team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertEquals(team, team);
    }

    @Test
    public void equals_returns_false_for_not_team() {
        assertNotEquals(team, new Object());
    }

    @Test
    public void equals_returns_false_for_different_name() {
        Team other = new Team("other-team");
        assertNotEquals(team, other);
    }

    @Test
    public void equals_returns_true_for_same_name() {
        Team other = new Team("test-team");
        assertEquals(team, other);
    }

    @Test
    public void equals_returns_true_for_same_members() {
        Team other = new Team("test-team");
        other.addMember("foo");
        other.addMember("bar");
        Team t = new Team("test-team");
        t.addMember("foo");
        t.addMember("bar");
        assertEquals(t, other);
    }

    @Test
    public void hashCode_returns_correct_hash_code() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_returns_correct_hash_code_for_different_name() {
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
}
