package edu.miu.cs.cs425.patientsappointmentsbookingapp;

import edu.miu.cs.cs425.patientsappointmentsbookingapp.service.PatientService;
import edu.miu.cs.cs425.patientsappointmentsbookingapp.util.JSONConverterUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientsAppointmentsBookingAppApplication implements CommandLineRunner {
    private final PatientService patientService;

    public PatientsAppointmentsBookingAppApplication(PatientService patientService) {
        this.patientService = patientService;
    }
    public static void main(String[] args) {
        SpringApplication.run(PatientsAppointmentsBookingAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Patients Appointments Booking Application is running..." );
        patientService.printAllPatients();
    }
}
