public interface Seat {
    public String getName();
    public int totalSeats();
}

class RacingCarSeat implements Seat{

    @Override
    public String getName() {
        return "Total Seats : " + this.totalSeats() + " ," ;
    }

    @Override
    public int totalSeats() {
        return 1;
    }
}

class PrivateCarSeat implements Seat{

    @Override
    public String getName() {
        return "Total Seats : " + this.totalSeats() + " ,";
    }

    @Override
    public int totalSeats() {
        return 5;
    }
}

class SUVCarSeat implements Seat{

    @Override
    public String getName() {
        return "Total Seats : " + this.totalSeats() + " ,";
    }

    @Override
    public int totalSeats() {
        return 15;
    }
}

class MilitaryCarSeat implements Seat{

    @Override
    public String getName() {
        return "Total Seats : " + this.totalSeats() + " ,";
    }

    @Override
    public int totalSeats() {
        return 7;
    }
}
