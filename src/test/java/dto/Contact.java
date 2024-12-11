package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Contact {

    private String phone;
    private String homePhone;
    private String salutation;
    private String firstName;
    private String lastName;
    private String mobile;
    private String title;
    private String otherPhone;
    private String Department;
    private String fax;
    private String email;

}
