package com.example.seriesFunctions;

import java.util.*;

public class Theatre {

    private final String name;
    private List<Seat> seats = new ArrayList<>( );

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {

                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {

                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;
        seats = new ArrayList<Seat>();
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {

            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if (row < 'D' && seatNum >=4 && seatNum <= 9) {

                    price = 14.00;
                } else if (row >'F' || seatNum <4 || seatNum > 9) {

                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {

        Seat requestSeat = new Seat(seatNumber, 12.00);
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

    public Collection<Seat> getSeats() {

        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String number;
        private double price;
        private boolean reserved = false;

        public Seat(String number, double price) {
            this.number = number;
            this.price = price;
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

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.number.compareToIgnoreCase(seat.getNumber());
        }
    }
}
