package lk.ijse.gdse.internshipsenturatask.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRepo {
    private int code;
    private String massage;
    private Object data;
}
