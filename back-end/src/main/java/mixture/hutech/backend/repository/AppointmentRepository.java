package mixture.hutech.backend.repository;

import mixture.hutech.backend.entity.Appointment;
import mixture.hutech.backend.entity.AppointmentStatus;
import mixture.hutech.backend.enums.AppointmentStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {
    Optional<Appointment> findById(String id);

    @Query("SELECT a FROM Appointment a " +
            "WHERE a.appointmentTakenDate = CURRENT_DATE " +
            "AND a.probableStartTime BETWEEN ?1 AND ?2 " +
            "AND a.appointmentStatus = ?3 " +
            "AND (a.reminderSent = false OR a.reminderSent IS NULL)")
    List<Appointment> findUpcomingAppointments(LocalTime start, LocalTime end, AppointmentStatusEnum status);
}
