package com.keyin.manager;

import com.keyin.domain.Database;
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.BloodDonationAppointment;
import com.keyin.domain.donor.BloodDonor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class BloodDonationAppointmentManagerTest {
    @Mock
    private Database mockDatabase;

    @Test
    public void testBloodDonorTooYoung() {
        BloodDonor bloodDonorTooYoung = new BloodDonor();
        bloodDonorTooYoung.setFirstName("John");
        bloodDonorTooYoung.setLastName("Doe");
        bloodDonorTooYoung.setBloodType("AB+");
        bloodDonorTooYoung.setDateOfBirth(LocalDate.of(2004, Month.NOVEMBER, 22));
        bloodDonorTooYoung.setId(1);
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonorTooYoung
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager =
                new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("donor too young"));
            }
        }
}
