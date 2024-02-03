package lk.ijse.gdse.internshipsenturatask.entity;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class userEntity {
    @Id
    private Long guideId;
    private String id;
    private String display_name;
    private String email;
    private String given_name;
    private String middle_name;
    private String name;
    private String family_name;
    private String nickname;
    private String phoneNumber;
    private String comment;
    private int directory_id;
    private int picture_id;
    private String avatar_url;
    private Object metaData;
    @ElementCollection
    private List<String> tags;
    private String presence;
    private String created_at;
    private String modified_at;
    private boolean is_supported;
    private boolean is_trashed;
}
