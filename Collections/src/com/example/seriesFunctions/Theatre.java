package com.example.seriesFunctions;

import java.util.*;

public class Theatre {

    private final String name;
    public List<Seat> seats = new ArrayList<>( );

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;
        seats = new ArrayList<Seat>();
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {

            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {

                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {

        Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if (foundSeat >= 0) {

            return seats.get(foundSeat).reserve();
        } else {

            System.out.println("There is not seat " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.println(".");
//            if (seat.getNumber().equals(seatNumber)){
//
//                requestSeat = seat;
//                break;
//            }
//        }
//
//        if (requestSeat == null) {
//
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        } else {
//
//            return requestSeat.reserve();
//        }
    }

    public void getSeats() {

        for (Seat seat : seats) {

            System.out.println(seat.getNumber());
        }
    }

    public class Seat implements Comparable<Seat> {
        private final String number;
        private boolean reserved = false;

        public Seat(String number) {
            this.number = number;
        }

        public boolean reserve() {

            if (!this.reserved) {

                this.reserved = true;
                System.out.println("Seat " + number + " reserved");
                return true;
            } else {

                return false;
            }
        }

        public boolean cancel() {

            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + number);
                return true;
            } else {

                return false;
            }
        }

        public String getNumber() {
            return number;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.number.compareToIgnoreCase(seat.getNumber());
        }
    }
}
