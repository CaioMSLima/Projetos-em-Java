package Hotel.SolucaoBoa.entities;

import Hotel.SolucaoBoa.entities.model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation3 {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation3(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getcheckIn() {
        return checkIn;
    }

    public Date getcheckOut() {
        return checkOut;
    }

    public long duration(){
        // uma variavel .getTime(), retorna a quantidade de mili segundos daquela data
        long diff = checkOut.getTime() - checkIn.getTime();

        // TimeUnit.DAYS.convert(variavel ,TimeUnit.MILLISECONDS) converte os milisegundos para dias
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString(){
        return "Room "
                + roomNumber
                +", check-in "
                + sdf.format(checkIn)
                + ", check-out "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";

    }


}

