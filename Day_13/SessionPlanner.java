package Day_13;

import java.util.Scanner;

// Practical 2: Trainer Session Planner with Constructor Chaining

class Session {
    String topic;
    String duration;
    String trainer;
    String room;

    Session(String topic) {
        this(topic, "1 hour", "TBD", "TBD");
    }

    Session(String topic, String duration) {
        this(topic, duration, "TBD", "TBD");
    }

    // Main constructor
    Session(String topic, String duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    void display() {
        System.out.println("\nSESSION DETAILS");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration);
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}

public class SessionPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Topic: ");
        String topic = sc.nextLine();

        System.out.print("Duration: ");
        String duration = sc.nextLine();

        System.out.print("Trainer: ");
        String trainer = sc.nextLine();

        System.out.print("Room: ");
        String room = sc.nextLine();

        Session s = new Session(topic, duration, trainer, room);

        s.display();

        sc.close();
    }
}