package mixture.hutech.backend.repository;

import mixture.hutech.backend.entity.DoctorSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, String> {
//    Optional<DoctorSchedule> findById(String userId);

    @Query("SELECT ds FROM DoctorSchedule ds WHERE ds.user.id = :doctorId AND ds.dayOfWeek = :dayOfWeek AND ds.isAvailable = true AND ds.startTime >= :startTime AND ds.endTime <= :endTime AND ds.workingDate = :workingDate")
    Optional<DoctorSchedule> findAvailableSlotByDoctorAndDayAndHours(@Param("doctorId") String doctorId, @Param("dayOfWeek") String dayOfWeek, @Param("workingDate")LocalDate workingDate, @Param("startTime") LocalTime startTime, @Param("endTime") LocalTime endTime);
}
