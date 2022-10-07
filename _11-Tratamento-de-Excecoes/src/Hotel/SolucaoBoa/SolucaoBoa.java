package Hotel.SolucaoBoa;

import Hotel.SolucaoBoa.entities.Reservation3;
import Hotel.SolucaoBoa.entities.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SolucaoBoa {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Room number: ");
            int number = scan.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scan.next());

            Reservation3 reservation = new Reservation3(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }

        catch (ParseException e){
            System.out.println("Invalid date format");

        }

        catch (DomainException e){
            System.out.println("Erro in reservation: " + e.getMessage());
        }

        //RuntimeException tipo de excessao generico para dar mensagem de excessao generico
        catch (RuntimeException e){
            System.out.println("Unexpected erro");
        }


    }



}


