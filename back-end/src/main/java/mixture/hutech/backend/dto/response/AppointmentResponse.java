package mixture.hutech.backend.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mixture.hutech.backend.entity.DoctorSchedule;
import mixture.hutech.backend.entity.User;
import mixture.hutech.backend.enums.AppointmentStatusEnum;
import mixture.hutech.backend.enums.BookingTypeEnum;
import mixture.hutech.backend.enums.ErrorCodeEnum;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentResponse {
    @JsonProperty("error_code")
    private ErrorCodeEnum errorCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("start_time")
    private LocalTime probableStartTime;
    @JsonProperty("end_time")
    private LocalTime actualEndTime;
    @JsonProperty("taken_date")
    private LocalDate appointmentTakenDate;
    @JsonProperty("type")
    private BookingTypeEnum bookingType;
    @JsonProperty("username")
    private String username;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("address")
    private String address;
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("email")
    private String email;
    @JsonProperty("doctor_name")
    private String doctorName;
    @JsonProperty("status")
    private AppointmentStatusEnum status;
}
