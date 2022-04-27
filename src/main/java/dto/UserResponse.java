package dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class UserResponse {
    private Long id;
    private String name;
    private String grade;
    private String school_name;
    private String city;
}
